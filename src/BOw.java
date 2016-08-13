
public class BOw extends Weapon implements Upgradable{

	
	int numArrows;
	public BOw(double price, double weight,double damage, int numArrows){
		super(price, weight, damage);
		this.numArrows=numArrows;
	}
	public int getNumArrows() {
		return numArrows;
	}
	public boolean useItem(){
		if(numArrows>0){
			numArrows=-1;
			System.out.println("bow kullanuldý su kadar etki yaptý"+damageAmount);
			return true;
		}
		else return false;
	}
	
	public void upgrade(){
		numArrows+=10;
	}
	@Override
	public String toString(){
		
		return "bow"+numArrows +itemPrice+ itemWeight  +damageAmount;
	}
}
