import java.util.Random;
import java.util.Random.*;

public abstract class MovingEntity extends Entity implements Catchable{
    boolean catched;
    boolean isRunning = false;
    public abstract void stop();
    public abstract void run(int x, int y);
    public abstract void go(Entity o);


    public void toptat(Garden garden){
        for (int i = 0; i < garden.plants.length; i++) {
            Random random = new Random();
            if (random.nextBoolean()) garden.plants[i] = Plants.Dead;
        }
        System.out.println(garden.name + " растоптал " + this.name);
    }

    public void see(Entity o){
        System.out.println(name + " увидел " + o.name);
    }

    public void setCatched(boolean catched){
        this.catched = catched;
        System.out.println(name + " catched is " + catched);
    }

    public void come(Entity entity) {
        this.positionX = entity.positionX;
        this.positionY = entity.positionY;
        System.out.println(name + " подбежал к " + entity.name + getCoordinates());
    }



}
