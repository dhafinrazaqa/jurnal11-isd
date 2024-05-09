public class BinaryTree<E> {
    BTNode<E> root;

    public BinaryTree() {
        this.root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(E data) {
        root = insert(root, data);
    }
    public BTNode<E> insert(BTNode<E> node, E data) {
        if (node == null) {
            node = new BTNode<E>(data);
        } else {
            if (node.getLeft() == null) {
                node.left = insert(node.left, data);
            } else {
                node.right = insert(node.right, data);
            }
        }
        return node;
    }

    public int countNodes() {
        return countNodes(root);
    }
    public int countNodes(BTNode<E> root) {
        if (root == null) {
            return 0;
        } else {
            int i = 1;
            i += countNodes(root.getLeft());
            i += countNodes(root.getRight());
            return i;
        }
    }

    public boolean search(E data) {
        return search(root, data);
    }
    public boolean search(BTNode<E> root, E data) {
        if (root.getData() == data) {
            return true;
        }
        if (root.getLeft() != null) {
            if (search(root.getLeft(), data)) {
                return true;
            }
        }
        if (root.getRight() != null) {
            if (search(root.getRight(), data)) {
                return true;
            }
        }
        return false;
    }

    public void preorder() {
        preorder(root);
    }
    public void preorder(BTNode<E> root) {
        if (root != null) {
            System.out.print(root.getData() + " ");
            preorder(root.getLeft());
            preorder(root.getRight());
        }
    }

    public void inorder() {
        inorder(root);
    }
    public void inorder(BTNode<E> root) {
        if (root != null) {
            inorder(root.getLeft());
            System.out.print(root.getData() + " ");
            inorder(root.getRight());
        }
    }

    public void postorder() {
        postorder(root);
    }
    public void postorder(BTNode<E> root) {
        if (root != null) {
            postorder(root.getLeft());
            postorder(root.getRight());
            System.out.print(root.getData() + " ");
        }
    }
}
