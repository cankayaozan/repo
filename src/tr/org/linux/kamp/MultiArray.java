package tr.org.linux.kamp;

public class MultiArray {
	
	public static void main(String[]  args){
		
		int[][] board= new int[4][3];
		
		int counter =0;
		for(int j=0;j<board.length;j++){
			for(int i=0;i<board[j].length;i++){
				board[j][i]=counter;
				counter++;
			}
		}
		for(int j=0;j<board.length;j++){
			for(int i=0;i<board[j].length;i++){
				System.out.print(board[j][i]+"  ");
			}
			
			System.out.println();

	}
	
	}
}
