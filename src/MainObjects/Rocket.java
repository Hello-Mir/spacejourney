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

    public static void launch() {
        command = JOptionPane.showInputDialog("Введите команду для взлета.");

        if ("Экипаж к запуску готов".equalsIgnoreCase(command) || "Все в норме".equalsIgnoreCase(command) && command != null && !"".equals(command)) {
            System.out.println("Внимание: системы в норме. Ключ на старт. Начинаю обратный отсчет!");
            for (int i = 10; i > 1; i--) {
                System.out.print(i + ",");
            }
            System.out.println("1.");
            System.out.println("Зажигание! Ключ на дренаж. Пуск!");
        }

//TODO добавить условие на отмену старт


        while ((!"Экипаж к запуску готов".equalsIgnoreCase(command) || !"Все в норме".equalsIgnoreCase(command)) || (command == null || !"".equals(command))) {
            command = JOptionPane.showInputDialog("Команда не введена. Или введена неверно.Повторите для старта!");

            if ("Экипаж к запуску готов".equalsIgnoreCase(command) || "Все в норме".equalsIgnoreCase(command) || command != null & !"".equals(command)) {
                System.out.println("Внимание: системы в норме. Ключ на старт. Начинаю обратный отсчет!");
                for (int i = 10; i > 1; i--) {
                    System.out.print(i + ",");
                }
                System.out.println("1.");
                System.out.println("Зажигание! Ключ на дренаж. Пуск!");
            }


        }


    }
}

