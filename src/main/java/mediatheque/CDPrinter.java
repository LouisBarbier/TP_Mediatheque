package mediatheque;

public class CDPrinter implements ItemVisitor {

    public void visit(CD c) {
        System.out.println(c);
    }
}
