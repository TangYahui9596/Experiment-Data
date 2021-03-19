/***************************************************************************
 ***modified by C.liu
 ***************************************************************************/

package BookstoreExample;
import java.util.ArrayList;

public final class BookstoreStarter {

	//initialize the application
	public static void main(final String[] args) 
	{	
		// create a bookstore object
		ArrayList<Bookstore> bsList = new ArrayList<Bookstore>();

		// generate [1,5) int, a random number of book to be ordered
		int bookNum = new java.util.Random().nextInt(5)+1;
		for (int i = 0; i < bookNum; i++) {
			Catalog catalog = new Catalog();
			BookSeller bookseller = new BookSeller();
			Bookstore bookstore = new Bookstore();
			bookstore.searchBook(catalog, bookseller);
			bsList.add(bookstore);
		}
		
		// create order
		Order order = new Order();
		order.generateOrder(bsList);
		
		//Delivery, currently we have one delivery
		Delivery delivery = new Delivery();
		delivery.deliver(order);
	}
}
