public class Trap extends Entity {
    private String name;



    public boolean checkAndCatch(MovingEntity o) {
        if (positionX == o.positionX && positionY == o.positionY) {

            o.setCatched(true);
            return true;
        } else {
            return false;
        }
    }
}
