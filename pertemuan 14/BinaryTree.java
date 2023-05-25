public class BinaryTree {
    node root;
    public BinaryTree (){
        node root;
    }
    boolean isEmpty(){
        return root == null;
    }
    void add(int data){
        if(isEmpty()){
            root = new node(data);
        }
        else{
            node current = root;
            while (true) {
                if (data<current.data) {
                    if (current.left != null) {
                        current = current.left;
                    }
                    else{
                        current.left = new node(data);
                        break;
                    }
                }
                else if (data>current.data) {
                    if (current.right!=null) {
                        current = current.right;
                    }
                    else{
                        current.right = new node(data);
                        break;
                    }
                }
                else{ 
                    break;
                }
            }
        }
    }
    boolean find(int data){
        boolean hasil = false;
        node current = root;
        while (current!=null) {
            if (current.data==data) {
                hasil = true;
                break;
            }
            else if (data<current.data) {
                current = current.left;
            }
            else{
                current = current.right;
            }
        }
        return hasil;
    }
    void traversePreOrder(node Node){
        if (Node != null) {
            System.out.println("" + Node.data);
            traversePreOrder(Node.left);
            traversePreOrder(Node.right);
        }
    }
    void traversePostOrder(node Node){
        if (Node != null) {
            traversePreOrder(Node.left);
            traversePreOrder(Node.right);
            System.out.println("" + Node.data);
        }
    }
    void traverseInOrder(node Node){
        if (Node != null) {
            traversePreOrder(Node.left);
            System.out.println("" + Node.data);
            traversePreOrder(Node.right);
        }
    }
    node getSuccessor(node del){
        node successor = del.right;
        node successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor!=del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }
    void delete(int data){
        if (isEmpty()) {
            System.out.println("Tree is empty");
            return;
        }
        node parent = root;
        node current = root;
        boolean isLeftChild = false;
        while (current!=null) {
            if (current.data==data) {
                break;
            }
            else if (data<current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            }
            else if (data>current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if(current==null){
            System.out.println("Couldn't find data!");
            return;
        }else{
            //if there is no child, simply delete it
            if(current.left==null &&current.right==null){
                if(current==root){
                    root = null;
                }else{
                    if(isLeftChild){
                        parent.left = null;
                    }else{
                        parent.right = null;
                    }
                }
            }else if(current.left == null){//if there is 1 child(right)
                if(current==root){
                    root = current.right;
                }else{
                    if(isLeftChild){
                        parent.left = current.right;
                    }else{
                        parent.right = current.right;
                    }
                }
            }else if(current.right == null){//if there is 1 child(left)
                if(current==root){
                    root = current.left;
                }else{
                    if(isLeftChild){
                        parent.left = current.left;
                    }else{
                        parent.right = current.left;
                    }
                }
            }else{//if there is 2 childs
                node successor = getSuccessor(current);
                if(current==root){
                    root = successor;
                }else{
                    if(isLeftChild){
                        parent.left = successor;
                    }else{
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }
   
    //SOAL NO 1
    public node addNodeR(node current, int data){
        if (current == null){
            return new node(data);
        }
        if (data < current.data){
            current.left = addNodeR(current.left, data);
        }else if(data > current.data){
            current.right = addNodeR(current.right, data);
        }else{
            return current;
        }
        return current;
    }
    //SOAL NO 2
    public void Maximum(){
        node current = root;
        while(current.right != null){
            current = current.right;
        }
        System.out.println(current.data);
    }
    void Minimum(){
        node current = root;
        while(current.left != null){
            current = current.left;
        }
        System.out.println(current.data);
    }
    //Soal NO 3
    void PrintLeft(node root){
        if(root == null){
        return;            
        }
        if(root.left == null && root.right == null){
            System.out.print(" "+ root.data);
            return;
        }if(root.left != null){
            PrintLeft(root.left);
        }if(root.right != null){
            PrintLeft(root.right);
        }
    }
    //Soal NO 4
    int TotalLeft(){
        return TotalLeft(root);
    }
    int TotalLeft(node node){
        if(node == null){
            return 0;
        }
        if(node.left == null && node.right == null){
            return 1;
        }else{
            return TotalLeft(node.left)+TotalLeft(node.right);
        }
    }

}
