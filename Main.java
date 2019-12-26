public class Main {
    public static void main(String[] args) {
        Korotyshka klops = new Korotyshka("Klops");
        Korotyshka neznayka = new Korotyshka("Neznayka");
        Korotyshka fix = new Korotyshka("Fix");
        Korotyshka fex = new Korotyshka("Fex");
        Korotyshka milordik = new Korotyshka("Milordik");
        Korotyshka cezarino = new Korotyshka("Cezarino");
        Dog sobaka1 = new Dog("Sobaka1");
        Dog sobaka2 = new Dog("Sobaka2");   //выше создаём всех чертей
        Trap trap = new Trap();
        Plants[] klubnika = new Plants[1];
        klubnika[0] = Plants.Stawberry;
        Garden gardenWithStrawberry = new Garden(klubnika, "Strowberry garden");
        Plants[] ogurtsiIPomidory = new Plants[2];
        ogurtsiIPomidory[0] = Plants.Cucumber;
        ogurtsiIPomidory[1] = Plants.Tomato;
        Garden gardenWithogurtsiIPomidory = new Garden(ogurtsiIPomidory, "Cucucmber tomato garden");  //выше создаём и заполняем

        trap.setPosition(1,2);  //поставили коорды ловушки
        gardenWithStrawberry.setPosition(-1, -1); //поставили коорды грядки с Клубничкой ;)
        gardenWithogurtsiIPomidory.setPosition(-3, -3); //поставили коорды грядки с овощами

        neznayka.see(klops);  //Увидев, что к Милордику, Незнайка
        sobaka1.come(klops);  //что к Милордику прибыло подкрепление
        sobaka2.come(klops);  //что к Милордику прибыло подкрепление
        neznayka.come(gardenWithStrawberry); //Незнайка бросился с холма вниз, с клубникой
        neznayka.toptat(gardenWithStrawberry); //и запрыгал по грядкам с клубникой.

        sobaka1.come(neznayka); //Оба пса носились за ним
        sobaka2.come(neznayka); //Оба пса носились за ним
        //todo ??не разбирая дороги?? (можно добавить метод неразборчивого бега, где координаты будут рандомными(или ещё лучше уменьшать координаты того, за кем бегут на рандом)
        sobaka1.toptat(gardenWithStrawberry); //и безжалостно топтали клубнику.
        sobaka2.toptat(gardenWithStrawberry); //и безжалостно топтали клубнику.

        //todo ??Коротышки бросили работу??
        klops.stop(); //Коротышки остановились.
        neznayka.stop(); //Коротышки остановились.
        fix.stop(); //Коротышки остановились.
        fex.stop(); //Коротышки остановились.
        milordik.stop(); //Коротышки остановились.
        cezarino.stop();

        klops.see(gardenWithStrawberry); //Клопс тут же увидел, для клубники
        //System.out.println(gardenWithStrawberry); (Некоректно работает вывод, можно просто показать что она true)   //todo ??ничего хорошего для клубники не получается.??

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
        cezarino.go(sobaka2); //Ам. //todo если придумаешь можно сделать краше всё эт


        klops.go(neznayka);  //Клопс самолично бросился догонять Незнайку
        trap.checkAndCatch(klops); //и попал ногою в капкан. //todo сделать метод ТОЛЬКО для трапы

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

        //todo Фикс и Фекс моментально исчезли и через минуту возвратились с ружьем.
        //Фикс, в руках у которого было ружье, прицелился и выпалил.
        //Пуля просвистела в двух шагах от Незнайки.
    }
}
