package problem.solving.trees;public class NodesWithoutSibling {    public static void main(String[] args) {        Node root = new Node(1);        root.left = new Node(2);        root.right = new Node(3);        root.left.right = new Node(4);        root.right.left = new Node(5);        root.right.left.right = new Node(6);        printSingles(root);    }    public static void printSingles(Node node) {        if (node == null)            return;        if (node.left != null && node.right != null) {            printSingles(node.left);            printSingles(node.right);        } else if (node.left != null) {            System.out.println(node.left);            printSingles(node.left);        } else if (node.right != null) {            System.out.println(node.right);            printSingles(node.right);        }    }}