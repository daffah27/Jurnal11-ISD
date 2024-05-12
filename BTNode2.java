class BTNode2<E extends Comparable<E>> implements Comparable<BTNode2<E>> {
    BTNode2 left, right;
    E data;

    public BTNode2() {
        left = null;
        right = null;
        data = null;
    }
    
    public BTNode2(E item) {
        left = null;
        right = null;
        data = item;
    }

    public void setLeft(BTNode2 n) {
        left = n;
    }

    public void setRight(BTNode2 n) {
        right = n;
    }

    public BTNode2 getLeft() {
        return left;
    }

    public BTNode2 getRight() {
        return right;
    }

    public void setData(E d) {
        data = d;
    }

    public E getData() {
        return data;
    }

    @Override
    public int compareTo(BTNode2<E> o) {
        return this.data.compareTo(o.data);
    }
}
