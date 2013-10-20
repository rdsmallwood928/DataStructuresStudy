package trashcontainer;

/**
 * Created with IntelliJ IDEA.
 * User: bigwood928
 * Date: 10/12/13
 * Time: 12:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class OutPutTrash {

    public static void main(String[] args) {
        for(TrashContainers containers : TrashContainers.values()) {
            System.out.println(containers + ":\t Size " + containers.getContainerSize() + " gal. \tColor " + ContainerColor.color(containers));
        }
    }
}
