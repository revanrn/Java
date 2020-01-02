package libraryManagement;

public class BooksImpl implements BooksInterface {

	@Override
	public Books createBooks(String name1, float price) {
		// TODO Auto-generated method stub
		Books obj = new Books();
		obj.setBookName(name1);
		obj.setBookPrice(price);
		obj.setBookId();
		return obj;
	}

}
