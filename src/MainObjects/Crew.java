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
        System.out.println("Имя по бортовому журналу: " + putHereAName + "." + " " + "Специальность по бортовому журналу: " + Spec.spec + ".");
        System.out.println("Силовые способности: "  + Spec.strength + ".");
        System.out.println("Степень ловкости по специальности: " + Spec.agility + ".");
        System.out.println("Коэффициент интиллекта: " + Spec.intelligence + ".");
        System.out.println("Навыки первой помощи: " + Spec.healScore + ".");
        System.out.println("Навыки ремонта: " + Spec.repair + ".");
        System.out.println("Коэффициент удачи и успеха в решениях: " + Spec.successLevel + ".");

    }

    public static String getSpec(String s) {
        Spec.spec = s;
        return Spec.spec;
    }

    public static String setName (){
        String someName;

             someName = JOptionPane.showInputDialog("Введите имя");

            if (someName == null || someName.equals("")) {
                do {
                    JOptionPane.showMessageDialog(null,"Имя не введено, попробуйте еще раз!", "Предупреждение!", 1);
                     someName = JOptionPane.showInputDialog("Введите имя");
                }
                while (someName == null || someName.equals(""));
            } else {
                JOptionPane.showMessageDialog(null,"Имя: "+ someName+ " занесено в бортовой журнал!" ,"Успешно",1);
            }

        return someName;
    }


}
