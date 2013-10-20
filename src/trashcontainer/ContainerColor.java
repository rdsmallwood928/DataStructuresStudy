package trashcontainer;

public enum ContainerColor {

    brown, yellow, green;

    public static ContainerColor color(TrashContainers containers) {
        ContainerColor color  = null;
        switch (containers) {
            case GARBAGE:
                color = ContainerColor.brown;
                break;
            case RECYCLE:
                color = ContainerColor.yellow;
                break;
            case GARDEN:
                color = ContainerColor.green;
                break;
        }
        return color;
    }
}
