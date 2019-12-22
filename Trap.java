public class Trap implements Positionable{
    private MovingEntity prey;
    private String name;
    public void catchEntity(MovingEntity movingEntity){

    }
    public void release(){

    }

    @Override
    public int getPosition() {
        return 0;
    }

    @Override
    public void setPosition(int position) {

    }

    @Override
    public boolean isNear(Object o, int radius) {
        return false;
    }
}
