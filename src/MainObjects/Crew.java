package MainObjects;

import javax.swing.* ;
public class Crew {

	static String crewMemberspec;
//	String Engeenierspec;
//	String scientistspec;
//	String medicspec;



   
    public static void showCrewMember(Spec spec, String putHereAName) {
        System.out.println("Выбрана запись из бортового журнала: " + Spec.spec + ".");
        System.out.println("Запись по имени: " + putHereAName + "." + " " + "Со специальностью: " + Spec.spec + ".");
        System.out.println("Очки силы "  + Spec.strength + ".");
        System.out.println("Очки ловкости: " + Spec.agility + ".");
        System.out.println("Коэффициент интеллекта: " + Spec.intelligence + ".");
        System.out.println("Очки первой помощи: " + Spec.healScore + ".");
        System.out.println("Способности ремонта: " + Spec.repair + ".");
        System.out.println("Очки лидерства: " + Spec.successLevel + ".");

    }

    public static String getSpec(String s) {
        Spec.spec = s;
        return Spec.spec;
    }

    public static String setName (){
        String someName = JOptionPane.showInputDialog("Введите имя");
	while (someName == null || someName.equals("")){
	    JOptionPane.showMessageDialog(null,"Значение отсутствует или передано некорректное значение!", "Пожалуйста, повторите", 1);
	    someName = JOptionPane.showInputDialog("Значение принято");
	}
	JOptionPane.showMessageDialog(null,"Имя: "+ someName+ " Записано в бортовой журнал!" ,"Спасибо",1);
        return someName;
    }


}
