package recursion;

public class HeightOfATree {
    private static class Tree{
        int val;
        Tree left;
        Tree right;
        Tree(int n){
            this.val=n;
        }
    }
    public static void main(String[] args) {
        Tree root = new Tree(2);
        root.left = new Tree(3);
        root.right = new Tree(4);
        root.right.right = new Tree(5);
        root.right.left= new Tree(6);

        System.out.println(findHeight(root));

    }
    private static int findHeight(Tree root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(findHeight(root.left),findHeight(root.right));
    }
}
