public class Gun extends Entity{
    Bullet ammo;

    public Gun(Bullet ammo) {
        this.ammo = new Bullet();
    }

    public void launchAmmo(Entity entity, int accuracy) throws Exception{
        if (accuracy >=100){
            ammo.flyTo(entity);
        }
        else{
            ammo.flyTo(entity.positionX+1,entity.positionY+1);
        }

        this.ammo = null;
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
        return "Ружье " + this.positionX + " : " + this.positionY;
    }
}
