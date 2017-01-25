package scripts;

public class Judgement{
	//return the result of janken. the result is to hand1
	public static Result judge(Hand hand1, Hand hand2){
		if (hand1 == hand2){
			return Result.DRAW;
		}

		if ((hand1 == Hand.ROCK && hand2 == Hand.SCISSORS) || 
			(hand1 == Hand.SCISSORS && hand2 == Hand.PAPER) ||
			(hand1 == Hand.PAPER && hand2 == Hand.ROCK)){
			return Result.WIN;
		}

		return Result.LOSE;
	}
}
