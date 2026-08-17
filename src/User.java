import java.util.ArrayList;
import java.util.List;

public class User {
	private static int id = 1;
	private int userId;
	private String userName;
	private List<Book> borrowedBooks = new ArrayList<>();

	public User(String name) {
		this.userId = id++;
		this.userName = name;
	}

	public void info() {
		System.out.println("I D：" + getUserId());
		System.out.println("名前：" + getUserName());
		System.out.println("借りてる本リスト");
		System.out.println(getBorrowedBooks());
		System.out.println();
	}

	public int getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public List<Book> getBorrowedBooks() {
		return borrowedBooks;
	}

	public void borrowBook(Book book) {
		borrowedBooks.add(book);
	}

	public boolean hasBorrowes(Book book) {
		return borrowedBooks.contains(book);
	}

	public void returnBook(Book book) {
		borrowedBooks.remove(book);
	}
}
