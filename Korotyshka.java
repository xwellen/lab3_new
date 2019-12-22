public class Korotyshka extends MovingEntity{
    boolean CanReleaseItself;
    boolean isWorking;
    Gun Armed;
    int Accuracy;

    @Override
    public void go(Object o) {

    }

    @Override
    public void messGarden(Garden garden1, Garden garden2) {

    }

    @Override
    public void toptat(Garden garden) {

    }

    @Override
    public boolean isCatched() {
        return false;
    }

    @Override
    public void release() {
        //освободить себя
    }

    public void release(MovingEntity movingEntity){
        //освободить кого-нибудь
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

    @Override
    public void see(Object o) {

    }

    public void stopWork(){

    }

    public boolean shoot(Gun gun, Object o){
        //стреляем с помощью gun в o, если попали(смотрим accuracy>100) то возвращаем true
        return false;
    }

}
