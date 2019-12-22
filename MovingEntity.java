public abstract class MovingEntity extends Entity implements Catchable{
    boolean catched;
    public abstract void go(Object o);
    public abstract void messGarden(Garden garden1, Garden garden2);
    public abstract void toptat(Garden garden);
    public abstract void see(Object o);

}
