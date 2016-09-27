import java.util.Date;

public class Employee {
		//declare your variables
	public String name;
	public int social;
	public double salary;
	public Date hireDate;
	
	public Employee (String n,int s, double sal, Date hire){
		name = n;
		social = s;
		salary = sal;
		hireDate = hire;
					
}
	public String getName(){
		return name;
	}
	public void setName(String n){
		name = n;
	}
	public int getSocial(){
		return social;
	}
	public void setSocial(int s){
		social = s;
	}
	public double getSalary(){
		return salary;
	}
	public void setSalary(double sal){
		salary=sal;
	}
	public Date getHire(){
		return hireDate;
	}
	public void sethireDate(Date hire){
		hireDate = hire;
	}
}

