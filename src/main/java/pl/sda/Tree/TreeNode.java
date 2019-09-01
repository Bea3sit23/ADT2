package pl.sda.Tree;

public class TreeNode {

    private int value;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setLeft(TreeNode newNode) {
    }

    public TreeNode getRight() {
        return right;
    }

    public TreeNode getLeft() {
        return left;
    }
}