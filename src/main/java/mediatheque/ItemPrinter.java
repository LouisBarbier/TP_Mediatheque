package mediatheque;

public class ItemPrinter implements ItemVisitor{

    public void visit(CD c) {
        System.out.println(c);
    }

    public void visit(Book b) {
        System.out.println(b);
    }
}
