
public class Sword extends Weapon{

	
	public Sword(double price, double weight, double damage){
		super(price,weight,damage);
		
	}
	public boolean useItem(){
		System.out.println("sword su kadar etki yaptý:"+damageAmount);
		return true;
	}
	@Override
	public String toString(){
		
		return "sword";
		
	}
}
