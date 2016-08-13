
public class Armor extends Item {

	double defencePoints;
	boolean isWorn;
	
	public Armor(double price, double weight, double defencePoints){
		super(price,weight);
		if(defencePoints>=0)
			this.defencePoints= defencePoints;
			else
				defencePoints =0;
		isWorn= false;
		
		
	}

	public double getDefencePoints() {
		return defencePoints;
	}

	

	public boolean isWorn() {
		return isWorn;
	}

	public boolean useItem(){
		isWorn= true;
		return true;

	}
	@Override
	public String toString(){
		
		return itemPrice +""+ itemWeight +"" +defencePoints;
		
		
	}
	public double getHit(double damagePoints){
		
		if(isWorn){
			if(defencePoints>=damagePoints){
				defencePoints-=damagePoints;
				return 0;
			}
			else if(defencePoints<damagePoints){
				defencePoints=0;
				return damagePoints-defencePoints;
			}
			
			return defencePoints;
		}
		else
			return defencePoints;
		//***************hata olablilir*************************
	
	}
	public void upgrade(){
		defencePoints+=100;
	}

}