package MainObjects;
import javafx.scene.control.ComboBox;

import javax.swing.* ;
public class Crew {

	static String crewMemberspec;
//	String Engeenierspec;
//	String scientistspec;
//	String medicspec;



   
    public static void showCrewMember(Spec spec, String putHereAName) {
        System.out.println("Õàðàêòåðèñòèêè ÷ëåíà ýêèïàæà: " + Spec.spec + ".");
        System.out.println("Èìÿ ïî áîðòîâîìó æóðíàëó: " + putHereAName + "." + " " + "Ñïåöèàëüíîñòü ïî áîðòîâîìó æóðíàëó: " + Spec.spec + ".");
        System.out.println("Ñèëîâûå ñïîñîáíîñòè: "  + Spec.strength + ".");
        System.out.println("Ñòåïåíü ëîâêîñòè ïî ñïåöèàëüíîñòè: " + Spec.agility + ".");
        System.out.println("Êîýôôèöèåíò èíòèëëåêòà: " + Spec.intelligence + ".");
        System.out.println("Íàâûêè ïåðâîé ïîìîùè: " + Spec.healScore + ".");
        System.out.println("Íàâûêè ðåìîíòà: " + Spec.repair + ".");
        System.out.println("Êîýôôèöèåíò óäà÷è è óñïåõà â ðåøåíèÿõ: " + Spec.successLevel + ".");

    }

    public static String getSpec(String s) {
        Spec.spec = s;
        return Spec.spec;
    }

    public static String setName (){
        String someName = JOptionPane.showInputDialog("Ââåäèòå èìÿ");
	while (someName == null || someName.equals("")){
	    JOptionPane.showMessageDialog(null,"Èìÿ íå ââåäåíî, ïîïðîáóéòå åùå ðàç!", "Ïðåäóïðåæäåíèå!", 1);
	    someName = JOptionPane.showInputDialog("Ââåäèòå èìÿ");
	}
	JOptionPane.showMessageDialog(null,"Èìÿ: "+ someName+ " çàíåñåíî â áîðòîâîé æóðíàë!" ,"Óñïåøíî",1);
        return someName;
    }


}
