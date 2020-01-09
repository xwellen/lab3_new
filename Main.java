public class Main {
    public static void main(String[] args) throws Exception {
        Korotyshka klops = new Korotyshka("Клопс", true);
        Korotyshka neznayka = new Korotyshka("Незнайка");
        Korotyshka fix = new Korotyshka("Фикс",true);
        Korotyshka fex = new Korotyshka("Фекс", true);
        Korotyshka milordik = new Korotyshka("Милордик", true);
        Korotyshka cezarino = new Korotyshka("Цезарино", true);
        Dog sobaka1 = new Dog("Собака1");
        Dog sobaka2 = new Dog("Собака2");   //выше создаём всех чертей
        Trap trap = new Trap();
        Garden.Plants[] klubnika = new Garden.Plants[15];
        for (int i = 0; i < klubnika.length; i++) {
            klubnika[i] = Garden.Plants.Stawberry;
        }
        Garden gardenWithStrawberry = new Garden(klubnika, "Огород с клубникой");
        Garden.Plants[] ogurtsiIPomidory = new Garden.Plants[15];
        for (int i = 0; i < ogurtsiIPomidory.length; i++) {
            if (i<ogurtsiIPomidory.length/2) ogurtsiIPomidory[i] = Garden.Plants.Cucumber;
            else ogurtsiIPomidory[i] = Garden.Plants.Tomato;
        }
        Garden gardenWithogurtsiIPomidory = new Garden(ogurtsiIPomidory, "Огород с огурцами помидорами");  //выше создаём и заполняем

        trap.setPosition(1,2);  //поставили коорды ловушки
        gardenWithStrawberry.setPosition(-1, -1); //поставили коорды грядки с Клубничкой ;)
        gardenWithogurtsiIPomidory.setPosition(-3, -3); //поставили коорды грядки с овощами

        neznayka.see(milordik);  //Увидев, что к Милордику, Незнайка
        sobaka1.come(milordik);  //что к Милордику прибыло подкрепление
        sobaka2.come(milordik);  //что к Милордику прибыло подкрепление
        neznayka.come(gardenWithStrawberry); //Незнайка бросился с холма вниз, с клубникой
        neznayka.toptat(gardenWithStrawberry); //и запрыгал по грядкам с клубникой.

        sobaka1.come(neznayka); //Оба пса носились за ним
        sobaka2.come(neznayka); //Оба пса носились за ним
        sobaka1.toptat(gardenWithStrawberry); //и безжалостно топтали клубнику.
        sobaka2.toptat(gardenWithStrawberry); //и безжалостно топтали клубнику.


        klops.stopWork(); //коротышки закончили работу
        fix.stopWork(); //коротышки закончили работу
        fex.stopWork(); //коротышки закончили работу
        milordik.stopWork(); //коротышки закончили работу
        cezarino.stopWork(); //коротышки закончили работу

        klops.stop(); //Коротышки остановились.
        neznayka.stop(); //Коротышки остановились.
        fix.stop(); //Коротышки остановились.
        fex.stop(); //Коротышки остановились.
        milordik.stop(); //Коротышки остановились.
        cezarino.stop();

        klops.see(gardenWithStrawberry); //Клопс тут же увидел, для клубники
        System.out.println(gardenWithStrawberry); //ничего хорошего

        klops.go(sobaka1); //и принялись бегать за собаками по грядкам.
        klops.go(sobaka2); //принялись
        neznayka.go(sobaka1); //бегать
        neznayka.go(sobaka2); //за
        fix.go(sobaka1); //собаками
        fix.go(sobaka2); //по
        fex.go(sobaka1); //Г
        fex.go(sobaka2);  //Р
        milordik.go(sobaka1); //Я
        milordik.go(sobaka2); //Д
        cezarino.go(sobaka1); //К
        cezarino.go(sobaka2); //Ам.


        klops.go(neznayka);  //Клопс самолично бросился догонять Незнайку
        trap.checkAndCatch(klops.); //и попал ногою в капкан.

        neznayka.come(gardenWithStrawberry); //В это время Незнайка,
        milordik.come(gardenWithStrawberry); //Милордик и Цезарино перенесли поле
        cezarino.come(gardenWithStrawberry); //своей деятельности с клубники (Тут они добежали сначала до клубники)

        fix.come(klops); //Фикс и Фекс подбежали к нему
        fex.come(klops); //Фикс и Фекс подбежали к нему
        fix.release(klops); //и принялись освобождать его ногу из капкана.
        fex.release(klops); //и принялись освобождать его ногу из капкана.

        neznayka.come(gardenWithogurtsiIPomidory); //перенесли поле своей
        milordik.come(gardenWithogurtsiIPomidory); //деятельности с клубники на
        cezarino.come(gardenWithogurtsiIPomidory); //грядки с огурцами и помидорами.

        gardenWithogurtsiIPomidory.mess(); //В одну минуту там все было перепутано, и уже трудно было разобрать, где росли огурцы и где помидоры.

        Gun gun1 = new Gun(null);

        //test.shoot(gun1, neznayka);
        //todo Фикс и Фекс моментально исчезли и через минуту возвратились с ружьем.
        //Фикс, в руках у которого было ружье, прицелился и выпалил.
        //Пуля просвистела в двух шагах от Незнайки.
    }
}
