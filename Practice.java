class Employee{
	String name="Robert";
	int y=1994;
	String addr="64C-WallsStreet";
	String name1="Sam";
	int y1=2000;
	String addr1="68D-WallsStreet";
	String name2="John";
	int y2=1999;
	String addr2="26B-WallsStreet";
}
public class Practice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee a=new Employee();
	    System.out.println("Name \tYear of Joining \tAddress");
	    System.out.println(a.name+ "\t"+ a.y+"\t\t\t" + a.addr);
	    System.out.println(a.name1+ "\t"+ a.y1+"\t\t\t" + a.addr1);
	    System.out.println(a.name2+ "\t"+ a.y2+"\t\t\t" + a.addr2);
	}

}
