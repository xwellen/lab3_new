public class Gun extends Entity {
    Bullet ammo;


    public Gun(Bullet ammo) {
        this.ammo = ammo;
    }


    @Override
    public boolean checkAndCatch(MovingEntity o) {
        return false;
    }


}
