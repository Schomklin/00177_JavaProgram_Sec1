import java.util.*;

public class BookDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input author name :");
		String name = scan.nextLine();
		System.out.print("Input author e-mail :");
		String email = scan.next();
		
		Author1 worapat = new Author1(name,email);
		System.out.println(worapat);
		
		System.out.print("Input book title:");
		scan.nextLine();
		String title = scan.nextLine();
		System.out.print("Input book page : ");
		int page = scan.nextInt();
		
		System.out.println();
		Book1 book = new Book1(title,worapat,page);
		System.out.println(book);
	}
}
