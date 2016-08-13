package tr.org.linux.kamp;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionArrayList {

	
	
	public static void main(String args[]){
		
		ArrayList<Integer> arrayList= new ArrayList<Integer>();
		
		arrayList.add(0);
		arrayList.add(1);

		arrayList.add(2);

		arrayList.add(3);
		arrayList.add(4);
		System.out.println("foward"+arrayList.toString());
		
		Collections.reverse(arrayList);
		System.out.println("reverse"+ arrayList.toString());
		
		System.out.println(Collections.max(arrayList));
		
		System.out.println("min" + Collections.min(arrayList));

		ArrayList<Integer>  arrayList2=new ArrayList<Integer>();
		arrayList2.add(2);
		arrayList2.add(3);
		arrayList2.add(4);
		arrayList2.add(1);
		arrayList2.add(0);
		System.out.println("unordered"+ arrayList2.toString());
		
		Collections.sort(arrayList2);
		System.out.println("ordered"+arrayList2);
		
		

		
		
	}
}
