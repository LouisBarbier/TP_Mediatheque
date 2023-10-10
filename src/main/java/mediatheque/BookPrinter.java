package mediatheque;

public class BookPrinter implements ItemVisitor {

    public void visit(Book b) {
        System.out.println(b);
    }
}
