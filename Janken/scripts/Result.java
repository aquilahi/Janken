package scripts;
enum Result{
	WIN("Win"),
	LOSE("Lose"),
	DRAW("Draw"),;

	private String name;

	private Result(String name){
		this.name = name;
	}	

	@Override
	public String toString(){
		return name;
	}
}