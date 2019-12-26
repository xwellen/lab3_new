public abstract class MovingEntity extends Entity implements Catchable{
    boolean catched;
    public abstract void go(Entity o);
    public abstract void stop();
    public abstract void run(int x, int y);
    public abstract void messGarden(Garden garden1, Garden garden2);

    public void toptat(Garden garden){
        garden.setTramled(true);
        System.out.println(garden.name + " is tramled by " + this.name);
    }

    public void see(Entity o){
        System.out.println(name + " uvidel " + o.name);
    }

    public void setCatched(boolean catched){
        this.catched = catched;
        System.out.println(name + " catched is " + catched);
    }



}
