public interface Positionable {
    int getPosition();
    void setPosition(int position);
    boolean isNear(Object o, int radius);

}
