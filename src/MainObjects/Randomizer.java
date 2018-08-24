package MainObjects;

import java.util.Random;

public class Randomizer {
    static int random = new Random().nextInt(40) + 0;
    static String x = "";
    //надо допилить еще условие на вывод

    //ясная погода
    //штормовая погода (повреждение корпуса, нужна починка, механик устает = понижение доступных очков ремонта)
    //пасмурно (приводит к ошибкам в навигации)
    //облачно (хз что, надо придумать)


    public static String weatherGenerate(int random) {

        if (random >= 0 && random <= 10) {
            return x = "штормовая погода";
        }

        if (random > 10 && random <= 20) {
            return x = "пасмурно";
        }
        if (random > 20 && random <= 30) {
            return x = "облачно";
        } else {
            return x = "ясно";

        }

    }
}



