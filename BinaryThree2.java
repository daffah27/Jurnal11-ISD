class BinaryTree2<E> {
    private BTNode2 root;

    public BinaryTree2() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(E data) {
        root = insert(root, data);
    }

    private BTNode2 insert(BTNode2 node, E data) {
        if (node == null)
            node = new BTNode2((Comparable) data);
        else {
            if (node.getData().compareTo(data) > 0) {
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

    private int countNodes(BTNode2 r) {
        if (r == null)
            return 0;
        else {
            int l = 1;
            l += countNodes(r.getLeft());
            l += countNodes(r.getRight());
            return l;
        }
    }

    public boolean search(E val) {
        return search(root, val);
    }

    private boolean search(BTNode2 r, E val) {
        if (r == null) {
            return false;
        }
        if (r.getData() == val) {
            return true;
        }
        return search(r.getLeft(), val) || search(r.getRight(), val);
    }
    
    public void inorder() {
        inorder(root);
    }

    private void inorder(BTNode2 r) {
        if (r != null) {
            inorder(r.getLeft());
            System.out.print(r.getData() + " ");
            inorder(r.getRight());
        }
    }

    public void preorder() {
        preorder(root);
    }

    private void preorder(BTNode2 r) {
        if (r != null) {
            System.out.print(r.getData() + " ");
            preorder(r.getLeft());
            preorder(r.getRight());
        }
    }

    public void postorder() {
        postorder(root);
    }

    private void postorder(BTNode2 r) {
        if (r != null) {
            postorder(r.getLeft());
            postorder(r.getRight());
            System.out.print(r.getData() + " ");
        }
    }
}