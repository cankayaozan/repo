
public abstract class Weapon extends Item{

	double damageAmount;
	public Weapon(double price, double weight, double damage){
		super(price,weight);
		this.damageAmount=damage;
		if(damageAmount<0)
			damageAmount=0;
	}
	public double getDamageAmount() {
		return damageAmount;
	}
	@Override
	public String toString(){
		
		return itemPrice +""+ itemWeight +"" +damageAmount;
		/** @author Asus ozan ya ne asusu*/
	
}
}
