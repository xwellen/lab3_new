public class Korotyshka extends MovingEntity {
    public boolean CanReleaseItself;
    private boolean isWorking;
    Gun weapon;
    int Accuracy;


    public Korotyshka(String name) {
        this.name = name;
        this.isWorking = false;
        this.Accuracy = 100;
    }

    public Korotyshka(String name, boolean workStatus){
        this.name = name;
        this.isWorking = workStatus;
        this.Accuracy = 100;
    }

    public Korotyshka(String name, boolean workStatus, int accuracy){
        this.name = name;
        this.isWorking = workStatus;
        this.Accuracy = accuracy;
    }

    @Override
    public void go(Entity o) {
        positionX = o.positionX - 1;
        positionY = o.positionY - 1;
        System.out.println(name + " побежал за " + o.getName() + getCoordinates());
    }

    @Override
    public void stop() {
        this.isRunning = false;
        System.out.println(name + " остановился в" + getCoordinates());
    }

    @Override
    public void run(int x, int y) {
        this.isRunning = true;
        positionX = positionX + x;
        positionY = positionY + y;
        System.out.println(name + " бежит в " + getCoordinates());
    }

    @Override
    public boolean isCatched() {
        return catched;
    }

    @Override
    public void release() throws Error{
        if (CanReleaseItself == false) throw new Error("Нельзя освободть себя из ловушки");

        try{
            setCatched(false);
        }
        catch (Error error){
            System.out.println(error.getMessage());
        }
    }

    public void release(MovingEntity movingEntity) {
        movingEntity.setCatched(false);
    }



    public void stopWork() {
        this.isWorking = false;
        System.out.println(this.name + " закончил работу");
    }

    public void startWork() {
        this.isWorking = true;
        System.out.println(this.name + " начал работу");
    }

    public void shoot(Entity entity) throws Exception {
        this.weapon.launchAmmo(entity);
        System.out.println();
    }

    public void takeGun(Gun gun) throws Exception {
        weapon = gun;
    }

}
