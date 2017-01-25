package scripts;
import scripts.*;

public class Game{
	/*the method to execute Janken Game*/
	//main player is player1. it means that if result is win, player1 is the winner
	public void execute(Player player1, Player player2){
		//get the hands by each player
		Hand hand1 = player1.giveHand();
		Hand hand2 = player2.giveHand();
		
		//dislay hands
		showHands(player1, hand1, player2, hand2);

		//judge result
		Result result = Judgement.judge(hand1, hand2);

		//display the result
		showResult(player1,result);
		//if it was even, game should continue
		if (result == Result.DRAW){
			System.out.println("-----------------------again------------------------------");
			execute(player1, player2);
		}
	}

	private void showHands(Player player1, Hand hand1,Player player2, Hand hand2){
		System.out.println("-----------------------");
		DisplayService.showHand(player1, hand1);
		DisplayService.showHand(player2, hand2);
		System.out.println("-----------------------");
	}

	private void showResult(Player player, Result result){
		System.out.println("-----------------------");
		DisplayService.showResult(player, 	result);
		System.out.println("-----------------------");
	}
}
