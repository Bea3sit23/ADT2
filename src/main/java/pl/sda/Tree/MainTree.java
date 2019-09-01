package pl.sda.Tree;

public class MainTree {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(3);
        tree.add(2);
        tree.add(1);

        System.out.println(tree.search(2));
        System.out.println(tree.search(11));
    }
}
