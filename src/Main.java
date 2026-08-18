
public class Main {
	public static void main(String[] args) {
		Library library = new Library();

		User user1 = new User("user1");
		User user2 = new User("user2");

		Book book1 = new Book("Book1", "author1");
		Book book2 = new Book("Book1", "authoe2");

		user1.info();
		user2.info();

		book1.info();
		book2.info();

		library.addUser(user1);
		library.addBook(book1);

		library.borrowBook(user1, book1);

		user1.info();

		library.returnBook(user1, book1);
	}

}
