import java.util.Date;


public class MyEmployee {

	public static void main(String[] args) {
		Date armaniDate = new Date(10/26/1990);
		Employee Armani = new Employee ("Armani", 374222222, 60000.00, armaniDate);{
			System.out.println(Armani.getName());
			System.out.println(Armani.getSalary());
			System.out.println(Armani.getSocial());
			Armani.setName("Kim");
			System.out.println(Armani.getName());
		}
			
		
		
	}//Endo of main method
	
}//End of class
