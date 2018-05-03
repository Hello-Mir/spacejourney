package MainObjects;

public class Rocket {
	
	String name;
	
	Rocket (String name) {
		
		this.name = name;
	}
	
 public static void launch (String command) {
	 String s = command;
	 if (s.equals("К взлету готов") || s.equals("Подтверждаю готовность")) {
		 System.out.print("Начинаем обратный отсчет до старта маршевых двигателей: ");
		 for (int i = 10; i>0; i--) {
			 System.out.print(i + ",");
		 }
		 System.out.print(".");
		System.out.print("Внимание! Старт маршевых. Желаем экипажу счастливого пути!");		 
		
	 } else {
		 System.out.println("Командир, уточните команду. Команда не принята.");
	 }
	 
	 
 }
}
