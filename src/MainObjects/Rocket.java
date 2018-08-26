package MainObjects;

import javax.swing.*;

public class Rocket {
	/*
	Этот класс необходим при каждом взлете корабля.
	Его можно усложнить, например, в плане необходимых действий/ проверок систем командиром корабля до команды "Экипаж к пуску готов".

	Также, просто необходимо выводить обращение к пользователю через фреймы!
	 */

    // TODO: 23.08.2018 выводить сообщение пользователя и принимать команды во фреймах.


    String name;
  static String command;

    Rocket(String name) {

        this.name = name;

    }

    public static void launch() throws Exception {
        try {
            do
                command = JOptionPane.showInputDialog("Введите команду для взлета.");

            while (!"Экипаж к запуску готов".equals(command) && "Все в норме".equals(command) && command == null);


            System.out.println("Внимание: системы в норме. Ключ на старт. Начинаю обратный отсчет!");
            for (int i = 10; i > 1; i--) {
                System.out.print(i + ",");
            }
            System.out.println("1.");
            System.out.println("Зажигание! Ключ на дренаж. Пуск!");
        }
        catch (Exception e) {
            System.out.println("Возникла ошибка: " + e);
            System.out.println("Команда будет перезапрошена!");
        }
    }

}

