package scripts;

import java.io.*;

public class Human implements Player{
	private String name;


	public Human(String name){
		this.name = name;
	}	

	//accessor of name
	public String getName(){
		return name;
	}

	@Override
	public Hand giveHand(){
		//initialize return value
		Hand hand = null;
		try{
			//as a Human, user has to select hand by press a button
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		    while(true){
		    	System.out.print("Press the button -> R,S,P:");
		    	String handStr = br.readLine();

		    	switch(handStr){
		    		case "R":
		    			hand = Hand.ROCK;
		    		break;
		    		case "S":
		    			hand = Hand.SCISSORS;
		    		break;
		    		case "P":
		    			hand = Hand.PAPER;
		    		break;
		    		default:
		    		//nothing to do
		    		break;
		    	}

		    	if (hand != null){
		    		break;
		    	}
		    	System.out.println("That button is unexpected. Try again.");
		    }
		} catch(IOException e) {
			//ignore
		}

	    return hand;
			
	    

	}	
}