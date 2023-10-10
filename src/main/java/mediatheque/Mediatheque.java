package mediatheque;

import java.util.LinkedList;
import java.util.List;


public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		ItemPrinter v = new ItemPrinter();

		for (Item i : items)
			i.accept(v);
	}
	
	public void printOnlyBooks() {
		BookPrinter v = new BookPrinter();

		for (Item i : items)
			i.accept(v);
	}

	public void printOnlyCDs() {
		CDPrinter v = new CDPrinter();

		for (Item i : items)
			i.accept(v);
	}

}
