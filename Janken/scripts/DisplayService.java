package scripts;

/*logic to display things on console*/
public class DisplayService{
	public static void showHand(Player player, Hand hand){
		System.out.println("Hand->" + player.getName() + ":" + hand.toString());
	}

	public static void showResult(Player player, Result result){
		System.out.println("Result of Janken:" + player.getName() + ":" + result.toString());
	}
}