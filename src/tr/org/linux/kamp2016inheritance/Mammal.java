package tr.org.linux.kamp2016inheritance;

public abstract class Mammal extends Animal {

public Mammal(String name){
	
	super(name);
}
	
	
		//bir s�n�f birden fazla interfaceyi miras alabilir.ama sadece 1 s�n�f� miras alabilir.
		// abstract s�n�flar veya interfaceler d�s�nda abstract method yap�lamaz.
		// interface i�inde yazarken tekrardan public abstract yazmaa gerek yok. �rne�in int compare(asdas,asdasd); i�i g�r�r.
		//asbstarct s�n�f�n i�inde method yaparken public abstract void ... yazmak gerekir.
		//abstarct lar nesne olmad��� i�in new denmez.
		// instanceof ile hierarchy de herhangibir de�i�kene ula�abililirz.
		
		
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
