package BookstoreExample;

import java.util.ArrayList;

public class Order 
{
	public void generateOrder(ArrayList<Bookstore> bookList)
	{
		for (Bookstore bs:bookList)
		{
			bs.forwardOrder();
		}
	}
	
	public void getOrder()
	{
		// nothing to do here
	}
}
