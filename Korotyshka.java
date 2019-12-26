public class Korotyshka extends MovingEntity {
    boolean CanReleaseItself;
    boolean isWorking;
    Gun Armed;
    int Accuracy;

    public Korotyshka(String name) {
        this.name = name;
    }

    @Override
    public void go(Entity o) {
        positionX = o.positionX - 1;
        positionY = o.positionY - 1;
        System.out.println(name + "pobejal za" + o.getName() + getCoordinates());
    }

    @Override
    public void stop() {
        System.out.println(name + " has stopped in" + getCoordinates());
    }

    @Override
    public void run(int x, int y) {
        positionX = positionX + x;
        positionY = positionY + y;
        System.out.println(name + " run " + getCoordinates());
    }

    @Override
    public void messGarden(Garden garden1, Garden garden2) {

    }

    @Override
    public void toptat(Garden garden) {

    }

    @Override
    public boolean isCatched() {
        return catched;
    }

    @Override
    public void release() {
        //освободить себя
    }

    public void release(MovingEntity movingEntity) {
        movingEntity.setCatched(false);
    }

    @Override
    public int getPosition() {
        return 0;
    }


    @Override
    public boolean checkAndCatch(MovingEntity o) {
        return false;
    }

    @Override
    public void see(Object o) {

    }

    public void stopWork() {

    }

    public boolean shoot(Gun gun, Object o) {
        //стреляем с помощью gun в o, если попали(смотрим accuracy>100) то возвращаем true
        return false;
    }

    public void come(MovingEntity entity) {
        this.positionX = entity.positionX;
        this.positionY = entity.positionY;
        System.out.println(name + "podbejal k" + entity.name + getCoordinates());
    }
}
