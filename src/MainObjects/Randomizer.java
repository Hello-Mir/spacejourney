package MainObjects;

import java.util.Random;

public class Randomizer {
    static int random = new Random().nextInt(40) + 0;
    private String x = "ясно";
    //надо допилить еще условие на вывод

    //ясная погода
    //штормовая погода
    //пасмурно,ошибки в навигации
    //облачно


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



    public static void main(String[] args) {
        System.out.println(random);



    }
}
