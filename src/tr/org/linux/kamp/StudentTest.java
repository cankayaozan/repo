package tr.org.linux.kamp;

public class StudentTest {
	
	public static void main(String args[]){
		
	
	
	Student student1 = new Student("ali",93);
    Student student2 = new Student("veli", 77);
    System.out.println(student1.getName()+"nin notu:"+student1.getLetterGrade());
	
	System.out.println(student2.getName()+"nin notu:"+student2.getLetterGrade());
	
	student1.setName("hasan kara");
	student1.setAverage(33.0);
	System.out.println(student1.getName()+"nin notu:"+student1.getLetterGrade());
	
	
	}

}
