
public class EnumTest {

	
	Day day;
	public EnumTest(Day day){
		this.day=day;
	}
	
	public void tellItLikeItIs(){
		
		switch(day){
		
		case MONDAY:
			System.out.println("pazartesi cok güzel");
			break;
		case FRIDAY:
			System.out.println("asasasasdsaf4");
			break;
		case SUNDAY:
			System.out.println("not so good bro");
			break;
			
			default:
				System.out.println("haftasonu bekleniyor");
				break;
				
				
		}
	}
	public static void main(String args[]){
		
		EnumTest firstDay = new EnumTest(Day.MONDAY);
		
		firstDay.tellItLikeItIs();
		
EnumTest secondDay = new EnumTest(Day.SUNDAY);
		
		secondDay.tellItLikeItIs();
		
	}
}
