public class Trap extends Entity {
    private MovingEntity prey;
    private String name;

    public void catchEntity(MovingEntity movingEntity) {

    }

    public void release() {

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
