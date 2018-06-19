package MainObjects;

import javax.swing.*;

public class ForRunOnly {



	public static void main(String[] args) {


//		Rocket myRocket = new Rocket ("Vulture");
//		System.out.println (myRocket.name);
		
//		Rocket.launch("не та команда");
		JOptionPane myPane = new JOptionPane ();

//		Spec medicDefault = new Spec ();
//		medicDefault.spec = "медик";
//		medicDefault.strength = 2;
//		medicDefault.agility = 2;
//		medicDefault.intelligence = 4;
//		medicDefault.healScore = 5;
//		medicDefault.repair = 2;
//		medicDefault.successLevel = 2;
//		medicDefault.medicDefaults();






		String nameMedic = myPane.showInputDialog("Введите имя медика экипажа");
		myPane.showMessageDialog (null,"Имя введено. Есть запись в бортовом журнале!","Успешно",1);
		medicDefault.memberName = nameMedic;

		Crew.showCrewMember(medicDefault,nameMedic);

//		System.out.println(Crew.setName());
//		Spec mechanickDefault = new Spec();
//		mechanickDefault.mechanickDefaults();

//		String nameMechanick = myPane.showInputDialog("Введите имя механика экипажа");
//		myPane.showMessageDialog (null,"Имя введено. Есть запись в бортовом журнале","Успешно!",1);
//		mechanickDefault.memberName = nameMechanick;
//		Crew.showCrewMember(mechanickDefault,nameMechanick);
	}


	}
	

