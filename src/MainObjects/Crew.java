package MainObjects;
import javafx.scene.control.ComboBox;

import javax.swing.* ;
public class Crew {

	static String crewMemberspec;
//	String Engeenierspec;
//	String scientistspec;
//	String medicspec;



   
    public static void showCrewMember(Spec spec, String putHereAName) {
        System.out.println("�������������� ����� �������: " + Spec.spec + ".");
        System.out.println("���,���������� � �������� ������: " + putHereAName + "." + " " + "������������� �� ��������� �������: " + Spec.spec + ".");
        System.out.println("������� ����������: "  + Spec.strength + ".");
        System.out.println("���������� ��������: " + Spec.agility + ".");
        System.out.println("����������� ����������: " + Spec.intelligence + ".");
        System.out.println("������ ������ ������: " + Spec.healScore + ".");
        System.out.println("������ �������: " + Spec.repair + ".");
        System.out.println("������� ����������� � �������� ������ �������: " + Spec.successLevel + ".");

    }

    public static String getSpec(String s) {
        Spec.spec = s;
        return Spec.spec;
    }

    public static String setName (){
        String someName = JOptionPane.showInputDialog("������� ���");
	while (someName == null || someName.equals("")){
	    JOptionPane.showMessageDialog(null,"���������, ��� �� �������!", "���������, ����������", 1);
	    someName = JOptionPane.showInputDialog("������� ���");
	}
	JOptionPane.showMessageDialog(null,"���: "+ someName+ " �������� � �������� ������!" ,"�������",1);
        return someName;
    }


}
