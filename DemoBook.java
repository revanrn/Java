package libraryManagement;

import java.util.*;

public class DemoBook {
	public static void main(String atgs[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Books> list = new ArrayList<Books>();
		while (true) {
			System.out.println("1.Add New Book.");
			System.out.println("2.Display Book Details.");
			System.out.println("3.Exit.");
			System.out.println("Please Enter your choice : ");
			String choice = sc.next();
			BooksImpl objmpl = new BooksImpl();
			switch (Integer.parseInt(choice)) {
			case 1:
				System.out.println("Enter Book Name: ");
				String name = sc.next();
				System.out.println("Enter the Price of the Book : ");
				Float price = Float.parseFloat(sc.next());
				Books books = objmpl.createBooks(name, price);
				list.add(books);
				break;

			case 2:
				for (Books obj : list) {
					System.out.println(obj);
				}
				break;

			case 3:
				System.exit(0);
				break;
			}

		}
	}
}
