class Tree{


    int value;
    Tree leftchild;
    Tree rightchild;
    public Tree(){
        this.value = value;
    }

    /*public String toString() {
        return "The value is "+value;
    }
*/
    public int display(){

        return value;
    }

}

class TreeNode{
    Tree root;

    public void insertNode(int id){
        Tree newNode = new Tree();
        newNode.value = id;


        if(root == null){
            root = newNode;
        }
        else{
            Tree current = root;
            Tree parent;
            while(true){

                parent = current;
                if(id < current.value){
                    current = current.leftchild;
                    if(current == null){
                        parent.leftchild = newNode;
                        return;
                    }
                    //System.out.println("values successfully inserted at the left side");
                }

                else {
                    current = current.rightchild;
                    if(current == null){
                        parent.rightchild = newNode;
                        return;
                    }
                    //System.out.println("values successfully inserted at the right side");

                }
            }
        }


    }
    public void preorder(Tree root){

        if(root == null) return;
        System.out.println("preorder traversal: "+root.display());
        preorder(root.leftchild);
        preorder(root.rightchild);

    }
    public void inorder(Tree root){

        if(root == null) return;

        inorder(root.leftchild);
        System.out.println("inorder traversal: "+root.display());
        inorder(root.rightchild);

    }
    public void postorder(Tree root){

        if(root == null) return;

        postorder(root.leftchild);
        postorder(root.rightchild);
        System.out.println("postorder traversal: "+root.display());

    }



}

public class BinaryTree2 {

    public static void main(String[] args){


        TreeNode treeNode = new TreeNode();

        treeNode.insertNode(23);
        treeNode.insertNode(32);
        treeNode.insertNode(19);
        treeNode.insertNode(33);
        treeNode.insertNode(35);
        treeNode.insertNode(18);
        treeNode.insertNode(16);
        treeNode.insertNode(17);
        treeNode.insertNode(36);
        treeNode.insertNode(12);



        treeNode.preorder(treeNode.root);
        System.out.println();
        System.out.println();
        treeNode.inorder(treeNode.root);
        System.out.println();
        System.out.println();
        treeNode.postorder(treeNode.root);




    }
}
