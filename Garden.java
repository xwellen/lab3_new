public class Garden implements Positionable{
    private Plants[] plants;
    private Korotyshka[] workers;
    public void mess(Garden garden){

    }

    public boolean isMessed(){
        return true;
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
