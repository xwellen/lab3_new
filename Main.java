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
        klubnika[0] = Plants.Stawberry
        Garden gardenWithStrawberry = new Garden(gardenWithStrawberry);
        Plants[]

        trap.setPosition(1,2);  //поставили коорды ловушки



        klops.stop();
        neznayka.stop();
        fix.stop();
        fex.stop();
        milordik.stop();
        cezarino.stop(); //остановились

        neznayka.run(2, 3); //Побежал в 2;3
        klops.go(neznayka);  //Клопс побежал за Незнайкой (координаты меньше на 1)

        trap.checkAndCatch(klops); //попал Клопс в капкан
        fix.come(klops);
        fex.come(klops);
        fix.release(klops); //освобождает
        fex.release(klops); //тоже освобождает
    }
}
