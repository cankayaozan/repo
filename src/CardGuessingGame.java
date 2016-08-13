import java.util.ArrayList;
import java.util.Scanner; 

public class CardGuessingGame {

	
	 
	 
	 
	 
	 
	 // 
	 //In this question, your task is implementing a card guessing game. There are four card type 
	 //such as “spade”, “heart”, “diamond” and “club”. Each card can have value 1 to 13. The 
	 //program chooses a card from deck and asks player card type and value. The program informs 
	 //player about whether his/her guess is correct or wrong. Program runs until player guess is 
	 //correct. 
	 	public static void main(String args[]){ 
	 		//your code starts here 
	 		Scanner input = new Scanner(System.in);
	 		//generates a card deck and picks a random card from the deck.		 
	 		String type=" ";
	 		int value=0;
	 		System.out.println("Welcome to the card guessing game!\n"); 
	 		int rand1=0;
	 		 rand1= (int)(Math.random()*52);
		 	 
		 	 Card randomCard=generateCardDeck().get(rand1);
		 //	 System.out.println(randomCard.getCardType()+randomCard.getValue());
		 

		 	 
	 		//Takes cardType and value inputs from the user and creates a card from inputs then checks if user has guessed the card correct or wrong.		 
	 		//Program asks new inputs from the user until the user guesses correct. 
	 		
	 		while(true){ 
	 			//... 
	 	 type= input.next();
	 	 value = input.nextInt();
	 	 
	 	if(type.equals(randomCard.getCardType())){
	 		if(value==randomCard.getValue()){
	 		System.out.println("true");
	 		}
	 		else 
		 		System.out.println("try again");

	 	}
	 	else {
	 		System.out.println("try again");

	 	}
	 		} 
	 		//Your code ends here 
 		 
	 	} 
	 	 
	 	/* 
	 	 * Generates card deck which is an arrayList that holds all cards with all types and values. 
	 	 * there must be 52 cards in deck with types "spade", "club", "diamond", "heart" and values between 1-13 
	 	 * */ 
 	public static ArrayList<Card> generateCardDeck(){ 
 		
 		ArrayList<Card> deck= new ArrayList<Card>();
 		String[] kart = new String []{"spade","club", "diamond","heart"};
 		for(int i=0;i<4;i++){
 			for(int j=1;j<14;j++){
 				Card newKart= new Card(kart[i],j);
 				deck.add(newKart);				
 				} 
 			
 				}
 			
 				
 		
 		
	         return deck;
	 		
	 	} 
	}

