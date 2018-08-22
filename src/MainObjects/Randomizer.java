package MainObjects;

import java.util.Random;

public class Randomizer {
    static int random = new Random().nextInt(40) + 0;
    private String x;
    //надо допилить еще условие на вывод

    //ясная погода
    //штормовая погода (повреждение корпуса, нужна починка, механик устает = понижение доступных очков ремонта)
    //пасмурно (приводит к ошибкам в навигации)
    //облачно (хз что, надо придумать)


    public static String weatherGenerate(int random) {
        String x;
        if (random >= 0 && random <= 10)
            x = "штормовая погода";


        if (random > 10 && random < 20) {
            x = "пасмурно";

            if (random > 20 && random <= 30)
                x = "облачно";
        } else {
            x = "ясно";
        }
        return x;
    }


}
