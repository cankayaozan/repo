package tr.org.linux.kamp;

public class Dice {

	private String player;
	private int value=1;
	
	public Dice(String player, int value){
		
		
		this.player= player;
		if(value>0)
		this.value= value;
		
	}

	public String getPlayer() {
		return face;
	}

	
	public int getValue() {
		return value;
	}

	public int roll(){
		value=(int)(1+Math.random()*6);
	}
}
