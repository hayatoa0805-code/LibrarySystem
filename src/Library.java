
import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Book> books;
	private List<User> users;

	public Library() {
		books = new ArrayList<Book>();
		users = new ArrayList<User>();
	}

	public void addUser(User user) {
		users.add(user);
	}

	public void searchUser(String name) {
		boolean found = false;

		System.out.println("検索結果");
		System.out.println("----------------");

		for (User user : users) {
			if (user.getUserName().equals(name)) {
				user.info();
				found = true;
			}
		}

		if (!found) {
			System.out.println("検索したユーザーはいません");
		}
	}

	public void addBook(Book book) {
		books.add(book);
	}

	public void deleteBook(Book book) {
		books.remove(book);
	}

	public void searchBook(String title) {
		boolean found = false;

		System.out.println("検索結果");
		System.out.println("----------------");

		for (Book book : books) {
			if (book.getTitle().equals(title)) {
				book.info();
			}
		}

		if (!found) {
			System.out.println("検索されたタイトルの本は存在しません");
		}
	}

	public void borrowBook(User user, Book book) {
		if (!users.contains(user)) {
			throw new IllegalStateException("このユーザーは登録されていません");
		}
		if (!books.contains(book)) {
			throw new IllegalStateException("この本は登録されていません");
		}

		book.borrowBook();
		user.borrowBook(book);

		System.out.println(user.getUserName() + "が" + book.getTitle() + "を借りました");
		System.out.println();
	}

	public void returnBook(User user, Book book) {
		if (!user.hasBorrowes(book)) {
			throw new IllegalStateException("このユーザーはこの本を借りていません");
		}

		book.returnBook();
		user.returnBook(book);

		System.out.println(user.getUserName() + "が" + book.getTitle() + "を返しました");
		System.out.println();

	}

}
