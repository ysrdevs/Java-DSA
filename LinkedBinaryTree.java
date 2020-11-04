public class LinkedBinaryTree<E> implements BinaryTree, Position {

    protected Node<E> root = null;
    private final boolean isRoot = false;
    private int size = 0;

    protected Node<E> validate(Position<E> p) {
        if (!(p instanceof Node))
            return null;
        return (Node<E>) p;
    }

    @Override
    public Position left(Position p) throws IllegalArgumentException {
        Node<E> node = validate(p);
        return node.getLeft();
    }

    @Override
    public Position right(Position p) throws IllegalArgumentException {
        Node<E> node = validate(p);
        return node.getRight();
    }

    @Override
    public Position sibling(Position p) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Position root() {
        return root;
    }

    @Override
    public Position parent(Position p) throws IllegalArgumentException {
        Node<E> node = validate(p);
        return node.getParent();
    }


    @Override
    public Iterable<Position> children(Position p) throws IllegalArgumentException {
        return null;
    }

    @Override
    public int numChildren(Position p) throws IllegalArgumentException {
        return 0;
    }

    @Override
    public boolean isInternal(Position p) throws IllegalArgumentException {
        return false;
    }

    @Override
    public boolean isExternal(Position p) throws IllegalArgumentException {
        return false;
    }

    @Override
    public boolean isRoot(Position p) throws IllegalArgumentException {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }


    public Position addRoot(E e) {
        root = createNode(e, null, null, null);
        size = 1;
        return root;
    }

    public Position<E> addLeft(Position p, E e) {
        Node<E> parent = validate(p);
        Node<E> child = createNode(e, parent, null, null);
        parent.setLeft(child);
        size++;
        return child;
    }

    public Position<E> addRight(Position p, E e) {
        Node<E> parent = validate(p);
        Node<E> child = createNode(e, parent, null, null);
        parent.setRight(child);
        size++;
        return child;
    }

    @Override
    public Object getElement() throws IllegalStateException {
        return root.element;
    }

    protected Node<E> createNode(E e, Node<E> parent, Node<E> left, Node<E> right) {
        return new Node<>(e, parent, left, right);
    }

    protected static class Node<E> implements Position<E> {

        private E element;
        private Node<E> parent;
        private Node<E> left;
        private Node<E> right;

        public Node(E e, Node<E> above, Node<E> leftChild, Node<E> RightChild) {
            element = e;
            parent = above;
            left = leftChild;
            right = RightChild;
        }

        public E getElement() throws IllegalStateException {
            return element;
        }

        public void setElement(E e) {
            element = e;
        }

        public Node<E> getParent() {
            return parent;
        }

        public void setParent(Node<E> parentNode) {
            parent = parentNode;
        }

        public Node<E> getLeft() {
            return left;
        }

        public void setLeft(Node<E> leftChild) {
            left = leftChild;
        }

        public Node<E> getRight() {
            return right;
        }

        public void setRight(Node<E> rightChild) {
            right = rightChild;
        }

    }
}
