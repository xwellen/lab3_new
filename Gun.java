public class Gun extends Entity{
    Bullet ammo;

    public Gun(Bullet ammo) {
        this.ammo = new Bullet();
    }

    public void launchAmmo(Entity entity) throws Exception{
            ammo.flyTo(entity);
            this.ammo = null;
    }
}
