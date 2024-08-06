package Day3_Constructors;

public class Student {
	private int sid;
	private String sname;
	private String course;
	
	
	public Student() {
		this.sid=100;
		this.sname="Ragul";
		this.course="JAVA";
		System.out.println("Default constructors has been called");
		// TODO Auto-generated constructor stub
	}
	
	public Student(int sid,String snmae,String course) {
		this();
		this.sid=sid;
		this.sname=sname;
		this.course=course;
		}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCourse() {
		return course;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", course=" + course + "]";
	}
	public void setCourse(String course) {
		this.course = course;
	}

}
