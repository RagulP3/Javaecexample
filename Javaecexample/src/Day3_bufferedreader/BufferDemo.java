package Day3_bufferedreader;

import java.io.*;
public class BufferDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int eid;
		String ename;
		double salary;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the employee deatils:");
		eid=Integer.parseInt(br.readLine());
		ename=br.readLine();
		salary=Double.parseDouble(br.readLine());
		
		System.out.println("Employee Id:"+eid);
		System.out.println("Employee Name:"+ename);
		System.out.println("Employee Salary:"+salary);
	}

}
