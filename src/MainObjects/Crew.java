package MainObjects;
import javafx.scene.control.ComboBox;

import javax.swing.* ;
public class Crew {

	static String crewMemberspec;
//	String Engeenierspec;
//	String scientistspec;
//	String medicspec;



   
    public static void showCrewMember(Spec spec, String putHereAName) {
        System.out.println("Характеристики члена экипажа: " + Spec.spec + ".");
        System.out.println("Имя,записанное в бортовой журнал: " + putHereAName + "." + " " + "Специальность по бортовому журналу: " + Spec.spec + ".");
        System.out.println("Силовые показатели: "  + Spec.strength + ".");
        System.out.println("Показатели ловкости: " + Spec.agility + ".");
        System.out.println("Коэффициент интеллекта: " + Spec.intelligence + ".");
        System.out.println("Навыки первой помощи: " + Spec.healScore + ".");
        System.out.println("Навыки ремонта: " + Spec.repair + ".");
        System.out.println("Степень удачливости и принятия верных решений: " + Spec.successLevel + ".");

    }

    public static String getSpec(String s) {
        Spec.spec = s;
        return Spec.spec;
    }

    public static String setName (){
        String someName = JOptionPane.showInputDialog("Введите имя");
	while (someName == null || someName.equals("")){
	    JOptionPane.showMessageDialog(null,"Неуспешно, имя не введено!", "Повторите, пожалуйста", 1);
	    someName = JOptionPane.showInputDialog("Введите имя");
	}
	JOptionPane.showMessageDialog(null,"Имя: "+ someName+ " записано в бортовой журнал!" ,"Успешно",1);
        return someName;
    }


}
