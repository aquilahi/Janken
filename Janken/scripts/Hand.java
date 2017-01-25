package scripts;
import scripts.*;

enum Hand{
	ROCK("Rock"),
	SCISSORS("Scissors"),
	PAPER("Paper"),
	;

	private String name;

	private Hand(String name){
		this.name = name;
	}

	@Override
	public String toString(){
		return name;
	}
}