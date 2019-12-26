public interface Positionable {
    int getPosition();
    void setPosition(int positionX, int positionY);
    boolean checkAndCatch(MovingEntity o);

}
