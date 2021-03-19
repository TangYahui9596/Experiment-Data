
package BookstoreExample;

public class Bookstore {

	public void searchBook(Catalog catalog, BookSeller bookseller) 
	{
		//get offer of searched books
		bookseller.getOffers(catalog);
	}
	
	public void forwardOrder()
	{
		//nothing to do here
	}
}
