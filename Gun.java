public class Gun extends Entity{
    Bullet ammo;

    public Gun(Bullet ammo) {
        this.ammo = new Bullet();
    }

    public boolean launchAmmo(Entity entity) throws Exception{
        if (ammo == null){
            throw new Exception("В ружье нет пуль!");
        }

        try{
            ammo.flyTo(entity);
            this.ammo = null;
            return true;
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
