import java.util.Arrays;
import java.util.Random;

public class Garden extends Entity{
    private Plants[] plants;
    private boolean tramled;



    public Garden(Plants[] plants, String name) {
        this.plants = plants;
        this.name = name;
    }

    public void setTramled(boolean tramled) {
        this.tramled = tramled;
    }

    public void mess() {
        System.out.println("Перемешалось и стало:");
        for (int i = 0; i < plants.length; i++)
        {
            int index = new Random().nextInt(plants.length);
            Plants temp = plants[index];
            plants[index] = plants[i];
            plants[i] = temp;
        }
        System.out.println(Arrays.toString(plants));
    }

    public int getPosition() {
        return 0;
    }

    public boolean checkAndCatch(MovingEntity o) {
        return false;
    }
}
