public class Dog extends MovingEntity {
    boolean isRunning;

    public Dog(String name) {
        this.name = name;
        isRunning = false;
    }


    @Override
    public void stop() {
        isRunning = false;
    }

    @Override
    public void run(int x, int y) {
        setPosition(x,y);
        isRunning = true;
    }

    @Override
    public void go(Entity o) {
        setPosition(o.positionX,o.positionY);
    }

    @Override
    public boolean isCatched() {
        return catched;
    }

    @Override
    public void release() {
        catched = false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return this.name + " в " + this.positionX + " : " + positionY;
    }
}
