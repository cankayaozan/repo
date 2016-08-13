package tr.org.linux.kamp2016inheritance;

public abstract class Mammal extends Animal {

public Mammal(String name){
	
	super(name);
}
	
	
		//bir sýnýf birden fazla interfaceyi miras alabilir.ama sadece 1 sýnýfý miras alabilir.
		// abstract sýnýflar veya interfaceler dýsýnda abstract method yapýlamaz.
		// interface içinde yazarken tekrardan public abstract yazmaa gerek yok. örneðin int compare(asdas,asdasd); iþi görür.
		//asbstarct sýnýfýn içinde method yaparken public abstract void ... yazmak gerekir.
		//abstarct lar nesne olmadýðý için new denmez.
		// instanceof ile hierarchy de herhangibir deðiþkene ulaþabililirz.
		
		
//	
//	public abstract void breath();
//	
//	public abstract void gjhgk();
//	
//	public abstract void sleep();
//	
	
	
//	interface herbivor{
//		void investigatePlant();
//		
//		
//	}
//	
//	interface Omnivor{
//		void hunt();
//		
//		
//	}
}
