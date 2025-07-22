package PracticePrograms;

class person{
	 private String name;
	 
	 public void setName(String name) {
		 this.name=name;
		 }
	 public String getName() {
		 return name;
	 }
}
class passport{
	private int passportNum;
	public void setPassportNum(int passportNum) {
		this.passportNum=passportNum;
	}
	public int passportNum() {
		return passportNum;
	}
	public int getPassportNum() {
		
		return passportNum;
	}
	
	
}


  public class OneToOneTest {    //one-to-one association in interface

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person person=new person();
		person.setName("Meghana");
		System.out.println(person.getName());
		
		
		passport passport=new passport();
		passport.setPassportNum(786543);
		System.out.println(passport.getPassportNum());
		
		
		

	}

}
