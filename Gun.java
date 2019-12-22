public class Gun extends Entity {
    Bullet ammo;

    public Gun(Bullet ammo) {
        this.ammo = ammo;
    }

    @Override
    public int getPosition() {
        return 0;
    }

    @Override
    public void setPosition(int position) {

    }

    @Override
    public boolean isNear(Object o, int radius) {
        return false;
    }


}
