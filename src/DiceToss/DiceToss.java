package DiceToss;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * User: bigwood928
 * Date: 10/12/13
 * Time: 2:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class DiceToss extends JFrame {

    private JTextArea totalArea;
    private JButton tossButton;
    private JLabel totalLabel;
    private JTextField totalField;
    private Dice dice;

    private ImageIcon[] diePict =  {new ImageIcon("./resources/die1.gif"),
        new ImageIcon("./resources/die2.gif"),
        new ImageIcon("./resourecs/die3.gif"),
        new ImageIcon("./resources/die4.gif"),
        new ImageIcon("./resources/die5.gif"),
        new ImageIcon("./resources/die6.gif")};

    public static void main(String[] args) {
       DiceToss toss = new DiceToss();
        toss.setVisible(true);
        toss.setPreferredSize(new Dimension(400, 600));
        toss.setMinimumSize(new Dimension(400, 600));
    }

    public DiceToss() {
        dice = Dice.getDice();
        setTitle("Dice Toss");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container content = getContentPane();
        content.setLayout(new BorderLayout());

        JPanel panelA = new JPanel(new FlowLayout(FlowLayout.LEFT));
        final JLabel dieLabel1 = new JLabel();
        final JLabel dieLabel2 = new JLabel();
        panelA.add(dieLabel1);
        panelA.add(dieLabel2);

        totalArea = new JTextArea(10, 15);

        JPanel panelB = new JPanel();
        tossButton = new JButton("Toss");
        tossButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dice.toss();
                dieLabel1.setIcon(diePict[dice.getDice1()]);
                dieLabel2.setIcon(diePict[dice.getDice2()]);
                totalField.setText(String.valueOf(dice.getTotal()));
                totalArea.setText(totalArea.getText() + "\nDice 1: " + dice.getDice1() + " Dice 2: " + dice.getDice2() + " Total: " + dice.getTotal());
            }
        });

        totalLabel = new JLabel("Total");
        totalField = new JTextField(4);

        panelB.add(tossButton);
        panelB.add(totalLabel);
        panelB.add(totalField);

        content.add(panelA, BorderLayout.NORTH);
        content.add(new JScrollPane(totalArea),
                BorderLayout.CENTER);
        content.add(panelB, BorderLayout.SOUTH);
    }
}
