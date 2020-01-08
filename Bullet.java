public class Bullet extends FlyingEntity{
    public void flyTo(Entity entity){
        setPosition(entity.positionX, entity.positionY);
    }
}