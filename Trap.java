public class Trap implements Positionable {
    private MovingEntity prey;
    private String name;
    private int positionX;
    private int positionY;

    public void catchEntity(MovingEntity movingEntity) {

    }

    public void release() {

    }

    @Override
    public int getPosition() {
        return 0;
    }

    @Override
    public void setPosition(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    @Override
    public boolean checkAndCatch(MovingEntity o) {
        if (positionX == o.positionX && positionY == o.positionY) {

            o.setCatched(true);
            return true;
        } else {
            return false;
        }
    }
}
