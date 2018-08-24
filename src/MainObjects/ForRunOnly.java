package MainObjects;

import javax.swing.*;


/*
Этот класс - главный для запуска. То есть, вся работа и вызовы, обращения в другие классы будут в нем и из него.
По-хорошему, из безопасности, надо все переменные сделать "private", создать на них геттеры и сеттеры, но не хотел излишне загромождать код.
 */
public class ForRunOnly {
    static String nameMedic;
    static String nameComander;
    static String nameMechanic;
    static String nameScientist;


    public static void main(String[] args) {


//        JOptionPane myPane = new JOptionPane();//создание фрейма - окна
//        Spec specOne = new Spec(); //создание объекта типа специальность


/*
 тут будет выпадающий список,в котором можно будет выбрать специальность члена экипажа.
 А пока просто передача строки со специальностями.
  */
//        specOne.spec = "медик";
//
//
//
//        if (specOne.spec.startsWith("мед")) {
//            nameMedic = myPane.showInputDialog("Введите имя медика экипажа.");
//            // ниже уведомление об успехе и занесение в журнал
//            myPane.showMessageDialog(null, "Имя введено. Запись передана в бортовой журнал!", "Успешно", 1);
//            specOne.memberName = nameMedic;
//            specOne.medicDefaults();
//            Crew.showCrewMember(specOne.spec, nameMedic);
//
//
//            if (nameMedic == null && nameMedic == "") {
//                nameMedic = myPane.showInputDialog("Имя не указано. Введите имя медика экипажа.");
//                myPane.showMessageDialog(null, "Имя введено. Запись передана в бортовой журнал!", "Успешно", 1);
//                specOne.medicDefaults();
//                Crew.showCrewMember(specOne.spec, nameMedic);
//            }
//
//
//        }
//
//
//        specOne.spec = "командир экипажа";
//        if (specOne.spec.startsWith("коман")) {
//            nameComander = myPane.showInputDialog("Введите имя командира экипажа.");
//
//            myPane.showMessageDialog(null, "Имя введено. Запись передана в бортовой журнал!", "Успешно", 1);
//            specOne.memberName = nameComander;
//            specOne.commanderDefaults();
//            Crew.showCrewMember(specOne.spec, nameComander);
//        }
//
//
//        specOne.spec = "научный работник";
//        if (specOne.spec.startsWith("борт")) {
//            nameScientist = myPane.showInputDialog("Введите имя научного работника.");
//
//            myPane.showMessageDialog(null, "Имя введено. Запись передана в бортовой журнал!", "Успешно", 1);
//            specOne.memberName = nameScientist;
//            specOne.scientistDefaults();
//            Crew.showCrewMember(specOne.spec, nameScientist);
//        }

        /*
        Здесь закончен этап получения имен и определения их базовых навыков.
        На данный момент навыки выводятся просто в консоль. Это некрасиво. В последствии будет отображении в отдельном окне.
         */
// TODO: 23.08.2018 1) добавить запуск ракеты - класс Rocket (после того,как определились с экипажем, пора взлетать).
// TODO: 23.08.2018 2) добавить генератор погоды - класс Randomizer (в зависмости от погоды корабль упадет или летит дальше. Вариантов погоды несколько, можно по-разному)
// TODO: 23.08.2018 в зависимости от погоды,можно добавить повреждения, ранения экипажа (у них падает допустим HP). HP переменную не добавлял.

        // TODO: 23.08.2018  В планах:
       // - вывести ракету на орбиту
       // - соединить ее с космической станцией, где научный сотрудник будет делать опыты (может сделать какой-то мини-квест).
        // - нырнуть в черную дыру, испытывая корабль и экипаж на прочность
        // - сесть на ближайшую планету в той системе
        // - провести опыты/ отразить нападение/ пережить эпидемию
        // - долетеь домой


        System.out.println (Randomizer.random);
        System.out.println (Randomizer.weatherGenerate(Randomizer.random));

        Rocket.launch("Поехали");
    }
}

