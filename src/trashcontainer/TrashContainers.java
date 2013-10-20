package trashcontainer;

/**
 * Created with IntelliJ IDEA.
 * User: bigwood928
 * Date: 10/12/13
 * Time: 12:02 PM
 * To change this template use File | Settings | File Templates.
 */
public enum TrashContainers {
    GARBAGE(30), RECYCLE(60), GARDEN(90);

    private int containerSize;

    private TrashContainers(int containerSize) {
        this.containerSize = containerSize;
    }

    public int getContainerSize() {
        return containerSize;
    }
}

