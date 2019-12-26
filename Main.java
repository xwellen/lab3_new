public class Main {
    public static void main(String[] args) {
        Korotyshka klops = new Korotyshka("Klops");
        Korotyshka neznayka = new Korotyshka("Neznayka");
        Korotyshka fix = new Korotyshka("Fix");
        Korotyshka fex = new Korotyshka("Fex");
        Korotyshka milordik = new Korotyshka("Milordik");
        Korotyshka cezarino = new Korotyshka("Cezarino");
        Trap trap = new Trap();
        Plants[] klubnika = new Plants[1];
        klubnika[0] = Plants.Stawberry;
        Garden gardenWithStrawberry = new Garden(klubnika, "Strowberry garden");
        Plants[] ogurtsiIPomidory = new Plants[2];
        ogurtsiIPomidory[0] = Plants.Cucumber;
        ogurtsiIPomidory[1] = Plants.Tomato;
        Garden gardenWithogurtsiIPomidory = new Garden(ogurtsiIPomidory, "Cucucmber tomato garden");
        Dog sobaka1 = new Dog("Sobaka1");
        Dog sobaka2 = new Dog("Sobaka2");



        trap.setPosition(1,2);  //поставили коорды ловушки
        gardenWithStrawberry.setPosition(-1, -1);
        gardenWithogurtsiIPomidory.setPosition(-3, -3);


        klops.stop();
        neznayka.stop();
        fix.stop();
        fex.stop();
        milordik.stop();
        cezarino.stop(); //остановились

        neznayka.come(gardenWithStrawberry);
        milordik.come(gardenWithStrawberry);
        cezarino.come(gardenWithStrawberry);
        klops.go(neznayka);  //Клопс побежал за Незнайкой (координаты меньше на 1)

        trap.checkAndCatch(klops); //попал Клопс в капкан
        fix.come(klops);
        fex.come(klops);
        fix.release(klops); //освобождает
        fex.release(klops); //тоже освобождает
        neznayka.come(gardenWithogurtsiIPomidory);
        milordik.come(gardenWithogurtsiIPomidory);
        cezarino.come(gardenWithogurtsiIPomidory);
        gardenWithogurtsiIPomidory.mess();
        neznayka.see(klops);
        neznayka.toptat(gardenWithStrawberry);
    }
}
