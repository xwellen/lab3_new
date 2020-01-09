public class Bullet extends FlyingEntity{
    public void flyTo(Entity entity){
        setPosition(entity.positionX, entity.positionY);
        System.out.println("Пуля прилетела в цель: " + entity);
    }
    public void flyTo(int posX, int posY){
        setPosition(posX, posY);
        System.out.println("Пуля прилетела в ("+ posX + ":" + posY + ")");
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
        return "Пуля в " + positionX + " : " + positionY;
    }
}