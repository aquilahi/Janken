import scripts.*;

public class LaunchJanken{
	public static void main(String[] args){
		//main methos just call executer
		//### in this module, players are fixed to com1 and hum1. it can be more flexsible.

		Player hum1 = new Human("Human");
		Player com1 = new Computer("computer");

		new Game().execute(hum1, com1);

		System.out.println("---------------------Finish the game. Bye.---------------------");
	}
}