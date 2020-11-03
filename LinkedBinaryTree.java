public class LinkedBinaryTree implements BinaryTree, Position {
    @Override
    public Position left(Position p) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Position right(Position p) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Position sibling(Position p) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Position root() {
        return null;
    }

    @Override
    public Position parent(Position p) throws IllegalArgumentException {
        return null;
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
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Object getElement() throws IllegalStateException {
        return null;
    }
}
