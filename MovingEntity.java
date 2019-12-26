public abstract class MovingEntity extends Entity implements Catchable{
    boolean catched;
    public abstract void go(Entity o);
    public abstract void stop();
    public abstract void run(int x, int y);
    public abstract void messGarden(Garden garden1, Garden garden2);
    public abstract void toptat(Garden garden);
    public abstract void see(Object o);
    public void setCatched(boolean catched){
        this.catched = catched;
        System.out.println(name + " catched is " + catched);
    }

}
