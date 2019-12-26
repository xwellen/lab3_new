public abstract class Entity implements Positionable {
    int positionX;
    int positionY;
    String name;

    public String getName() {
        return name;
    }

    public String getCoordinates() {
        return "(" + positionX + ":" + positionY + ")";
    }
    //todo ынести в этого родителя метот setcoord...
    public void setPosition(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

}
