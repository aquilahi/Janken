package scripts;
import scripts.*;

public class Computer implements Player{

	private String name;

	public Computer(String name){
		this.name = name;
	}	

	//accessor of name
	public String getName(){
		return name;
	}

	@Override
	public Hand giveHand(){
		//as a computer, decide hand to give by using random integer
		int rand = (int)(Math.random()*3);

		if(rand == 0){
		    return Hand.ROCK;
		}
		if (rand == 1){
			return Hand.SCISSORS;
		}
		return Hand.PAPER;
	}
}