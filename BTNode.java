public class BTNode<E> {
    BTNode<E> left, right;
    E data;

    public BTNode(E item) {
        data = item;
        left = null;
        right = null;
    }

    public BTNode<E> getLeft() {
        return left;
    }

    public void setLeft(BTNode<E> left) {
        this.left = left;
    }

    public BTNode<E> getRight() {
        return right;
    }

    public void setRight(BTNode<E> right) {
        this.right = right;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
}