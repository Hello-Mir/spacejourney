package MainObjects;

public class Rocket {
	
	String name;
	
	Rocket (String name) {
		
		this.name = name;
	}
	
 public static void launch (String command) {
	 String s = command;
	 if (s.equals("Экипаж к запуску готов") || s.equals("Все в норме")) {
		 System.out.print("Внимание: системы в норме. Ключ на старт. Начинаю обратный отсчет!");
		 for (int i = 10; i>0; i--) {
			 System.out.print(i + ",");
		 }
		 System.out.print(".");
		System.out.print("Зажигание! Ключ на дренаж. Пуск!");
		
	 } else {
		 System.out.println("Команда не распознана. Ожидание корректной команды.");
	 }
	 
	 
 }
}
