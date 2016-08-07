package tr.org.linux.kamp;

public class DiceTest {


		public static void main(String args[]) {
			
			
		Dice dice1= new Dice("first ply",(int)(1+Math.random()*6) );
			int value1= dice1.getValue();
			Dice dice2= new Dice("second ply",(int)(1+Math.random()*6) );
				int value2= dice2.getValue();	
				String winner;
				if(value1>value2)
				System.out.println("first player has" +value1+ "   second player has "+value2+" first won by "+value1);
	
				else if(value1<value2)
			     System.out.println("first player has" +value1+ "   second player has "+value2+" second won by "+value2);
				else
				     System.out.println("Tie... both have"+ value1);

		
		}

}
