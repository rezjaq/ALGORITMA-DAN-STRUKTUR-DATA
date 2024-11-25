public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);

        System.out.println();
        bt.traversePreOrder(bt.root);
        System.out.println("");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find "+bt.find(5));
        bt.delete(8);
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.print("The Bigger NUmber is : ");
        bt.Maximum();
        System.out.print("The Smallest number is : ");
        bt.Minimum();
        System.out.print("the data that is in the leaf is : ");
        bt.PrintLeft(bt.root);
        System.out.println();
        System.out.print("the data in the leaf totals : "+bt.TotalLeft());


   }
}
