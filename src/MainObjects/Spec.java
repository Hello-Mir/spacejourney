package MainObjects;

public class Spec {
	
	static String spec;
    static int agility;
    static int strength;
    static int intelligence;
    static int healScore;
    static int repair;
    static int successLevel;
    static String memberName;

    public static void medicDefaults (){
        spec = "медик";
        agility = 2;
        strength =2;
        intelligence = 4;
        healScore=5;
        repair = 2;
        successLevel=2;
    }

    public static void commanderDefaults() {
        spec = "командир экипажа";
        agility = 2;
        strength = 2 ;
        intelligence  = 5;
        healScore = 2;
        repair = 3;
        successLevel = 3;
    }
    public static void mechanickDefaults () {
        spec = "бортмеханик";
        agility = 2;
        strength = 4;
        intelligence = 2;
        healScore= 1;
        repair = 5;
        successLevel = 2;
    }
    public static void scientistDefaults () {
        spec = "научный сотрудник";
        agility = 1;
        strength = 1;
        intelligence = 5;
        healScore= 3;
        repair = 2;
        successLevel = 2;
    }
}
