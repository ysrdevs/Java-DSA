public class TreeDriver {
    public static void main(String[] args) {
        LinkedBinaryTree<String> tree = new LinkedBinaryTree<>();
        Position root = tree.addRoot("Alphabet");
        Position<String> zero = tree.addLeft(root, "Google");
        Position<String> one = tree.addRight(root, "DeepMind");
        Position<String> two = tree.addRight(one, "Hark Health Solutions Limited");
        Position<String> three = tree.addLeft(zero, "Firebase");
        Position<String> four = tree.addRight(zero, "YouTube");
        Position<String> five = tree.addRight(four, "FameBit");
        displayFamily(tree, root);
        pathToRoot(tree, five);
        System.out.println();
        System.out.println("Height of Tree : " + findHeight(root));
    }

    public static void displayFamily(LinkedBinaryTree<String> lbt, Position<String> p) {
        System.out.println("Parent: " + p.getElement()); // Get Parent Element
        System.out.println("Children of " + p.getElement() + ": " + lbt.left(p).getElement() + " and " + lbt.right(p).getElement());
    }

    /**
     * Public method to obtain path to root from a specific node
     */

    public static void pathToRoot(LinkedBinaryTree<String> lbt, Position<String> p) {
        System.out.print("Path to Root: " + p.getElement());
        while (true) {

            p = lbt.parent(p);
            if (p == null) {
                System.out.print(" <- This is Root ");
                break;
            } else System.out.print(" -> ");
            System.out.print(p.getElement());

        }
    }

    /**
     * Public method to find height of the tree
     */

    public static int findHeight(Position<String> node) {
        LinkedBinaryTree.Node<String> aNode = (LinkedBinaryTree.Node<String>) node;
        if (aNode == null) {
            return -1;
        }

        int lefth = findHeight(aNode.getLeft());
        int righth = findHeight(aNode.getRight());

        if (lefth > righth) {
            return lefth + 1;
        } else {
            return righth + 1;
        }
    }
}
