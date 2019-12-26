public class Bullet extends FlyingEntity {
    @Override
    public void flyTo(Object o) {

    }

    @Override
    public int getPosition() {
        return 0;
    }



    @Override
    public boolean checkAndCatch(MovingEntity o) {
        return false;
    }
}
