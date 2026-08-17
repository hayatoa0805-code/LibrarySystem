
public class Book {
	private String title;
	private String author;
	private boolean isBorrowed;

	@Override
	public String toString() {
		return "タイトル：" + title + "、　著者：" + author;
	}

	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isBorrowed = false;
	}

	public void info() {
		System.out.println("タイトル：" + getTitle());
		System.out.println("著　　者：" + getAuthor());
		if (getIsBorrowed()) {
			System.out.println("貸出中");
		} else {
			System.out.println("貸し出されていません");
		}
		System.out.println();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public boolean getIsBorrowed() {
		return isBorrowed;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isBorrowed() {
		return isBorrowed;
	}

	public void borrowBook() {
		if (isBorrowed) {
			throw new IllegalStateException("この本はすでに貸出中です");
		}

		isBorrowed = true;
	}

	public void returnBook() {
		if (!isBorrowed) {
			throw new IllegalStateException("この本は貸出されていません");
		}

		isBorrowed = false;
	}

}