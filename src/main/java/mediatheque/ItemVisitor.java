package mediatheque;

public interface ItemVisitor {
    default void visit(Book b) {}

    default void visit(CD c) {}
}
