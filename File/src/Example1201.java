import java.io.*;
import java.util.*;

public class Example1201 {
	public static void main(String[] args) throws IOException {
		// use Scanner class for read data from file

		Scanner read = new Scanner(new File("MemberLogin.txt"));
		while (read.hasNext()) {
			String fname = read.next(); // read data1 from file to fname
			// String lname = read.next(); //read data2 from file to lname
			read.next(); // read data2 from file
			read.next(); // read data3 from file
			String email = read.next().toUpperCase(); // read data4 from file to email
			System.out.println(fname + " (" + email + ")");
		}
		read.close();
	}
}
