public class Garden extends Entity{
    private Plants[] plants;
    private Korotyshka[] workers;
    public void mess(Garden garden){

    }

    public Garden(Plants[] plants) {
        this.plants = plants;
    }

    public boolean isMessed(){
        return true;
    }

    public int getPosition() {
        return 0;
    }

    public boolean checkAndCatch(MovingEntity o) {
        return false;
    }
}
