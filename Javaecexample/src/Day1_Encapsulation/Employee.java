package Day1_Encapsulation;

public class Employee {
    private int eid;
    private String ename;
    private double Salary;
    private String city;
    
    public int getEid() {
    	return eid;
    }
    public void setEid(int eid) {
    	this.eid = eid; 
    }
    public String getEname() {
    	return ename;
    }
    public void setEname(String ename) {
    	this.ename = ename;
    }
    public double getSalary() {
    	return Salary;
    }
    public void setSalary(double salary) {
    	this.Salary = salary;
    }
    public String getCity() {
    	return city;
    }
    public void setCity(String city) {
    	this.city = city;
    }
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", Salary=" + Salary + ", city=" + city + "]";
	}
}
