package ChapterEightExcercises;

import datastuctures.Bag;

import javax.swing.plaf.synth.SynthTextAreaUI;

/**
 * Created with IntelliJ IDEA.
 * User: bigwood928
 * Date: 10/17/13
 * Time: 7:19 AM
 * To change this template use File | Settings | File Templates.
 */
public class SieveOfEratosthenes {

    public static void main(String[] args) {
        final int primeLimit = 500;
        Bag<Integer>  bag =  sieve(primeLimit);

        StringBuffer buffer = new StringBuffer().append("[ ");
        Object[] arr = bag.toArray();
        for(int i = 0; i<arr.length;i++) {
            buffer.append(" ").append(arr[i].toString()).append(",");
            if(i%10 == 0 && i != 0) {
                buffer.append("\n");
            }
        }
        buffer.append("]");
        System.out.println(buffer.toString());
    }

    public static Bag<Integer> sieve(int n) {
        Bag<Integer> bag =  new Bag<Integer>(n);
        for(int i = 2; i<=n; i++) {
            bag.add(i);
        }

        for(int i=2; i*i<n; i++) {
            if(bag.contains(i)) {
                for(int j = 2*i; j<=n; j+=i) {
                    bag.remove(new Integer(j));
                }
            }
        }
        return bag;
    }
}
