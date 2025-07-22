package PracticePrograms;

public class ArrayExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//approach 1
		String[]S1=new String[3];
		S1[0]="MEGHANA";
		S1[1]="ANITHA";
		S1[2]="RAMYA";
		
		
		//APPROACH 2
        String[]names= {"meghana","anitha","ramya"};
        for(int i=0;i<names.length;i++) {
        	System.out.println(names[i]);
        }

	}

}
