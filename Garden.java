import java.util.Arrays;
import java.util.Random;

public class Garden extends Entity{
    public Plants[] plants;




    public Garden(Plants[] plants, String name) {
        this.plants = plants;
        this.name = name;
    }



    public void mess() {
        System.out.println("Было:");
        System.out.println(Arrays.toString(plants));
        for (int i = 0; i < plants.length; i++)
        {
            int index = new Random().nextInt(plants.length);
            Plants temp = plants[index];
            plants[index] = plants[i];
            plants[i] = temp;
        }
        System.out.println("Перемешалось и стало:");
        System.out.println(Arrays.toString(plants));
    }

    @Override
    public String toString() {
        String s = "Garden(" + super.name + "): [";
        for (int i = 0; i < plants.length; i++) {
            s += (plants[i]+" ");
        }
        s+="]";
        return s;
    }

}
