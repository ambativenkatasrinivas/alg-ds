package com.srinivas.practice.revision1.trees;

public class MirrorImage {
    private static class Node {
        int data, depth;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

//    private static Node insert(Node root, int data) {
//        if (root == null) {
//            return new Node(data);
//        }
//        if (data < root.data) {
//            root.left = insert(root.left, data);
//        } else {
//            root.right = insert(root.right, data);
//        }
//        return root;
//    }

    private static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (root.data > data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    private static Node create(int[] arr) {
        Node root = null;
        root = insert(root, arr[0]);
        for (int i = 1; i < arr.length; i++) {
            insert(root, arr[i]);
        }
        return root;
    }

    private static void preOrderWithDepth(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(" data= " +root.data + " Depth= " +root.depth );
        preOrder(root.left);
        preOrder(root.right);
    }

    private static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    private static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    private static class Queue {

        int front = -1, rear = -1;
        Node arr[] = new Node[100];

        public void enqueue(Node data) {
            arr[++front] = data;
        }

        public Node dequeue() {
            return arr[++rear];
        }

        public boolean isEmpty() {
            return front == rear;
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 2, 3, 1, 15, 7, 17};
        Node root = create(arr);
//        preOrder(root);
//        System.out.println();
//        postOrder(root);
//        System.out.println();
//        inorder(root);

//        levelOrder(root);
//        System.out.println("Mirror image");
//        mirror(root);
        levelOrder(root);
//        System.out.println(countAtDist(root.left, 1));
//        System.out.println(height(root));
//        fillDepth(root, 1);
//        preOrderWithDepth(root);
    }

    private static void fillDepth(Node root, int d) {
        if (root == null) {
            return;
        } else {
            root.depth = d;
            fillDepth(root.left,d+1);
            fillDepth(root.right,d+1);
        }
    }

    private static int height(Node root) {
        if (root == null) {
            return -1;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    private static int maxNode(Node root) {
        if (root == null) {
            return 0;
        }

        return Math.max(Math.max(root.data, maxNode(root.left)), Math.max(root.data, maxNode(root.right)));
    }

    private static int sum(Node root) {
        if (root == null) {
            return 0;
        }
        return root.data + sum(root.left) + sum(root.right);
    }

    private static int count(Node root) {
        if (root == null) {
            return 0;
        }

        return 1 + count(root.left) + count(root.right);
    }

    private static int countAtDist(Node root, int k) {
        if (root == null) {
            return 0;
        }
        if (k == 0) {
            return 1;
        }
        return countAtDist(root.left, k - 1) + countAtDist(root.right, k - 1);
    }

    private static void mirror(Node root) {

        if (root == null) {
            return;
        }

        swap(root, root.left, root.right);
        mirror(root.left);
        mirror(root.right);
    }

    private static void swap(Node root, Node left, Node right) {
        Node temp = left;
        root.left = right;
        root.right = temp;
    }

    private static void levelOrder(Node root) {
        Queue queue = new Queue();
        queue.enqueue(root);
        queue.enqueue(null);
        while (!queue.isEmpty()) {
            Node temp = queue.dequeue();
            if (temp == null) {
                System.out.println();
                if (!queue.isEmpty()) {
                    queue.enqueue(null);
                }
            } else {
                System.out.print(temp.data + " ");
                if (temp.left != null) {
                    queue.enqueue(temp.left);
                }
                if (temp.right != null) {
                    queue.enqueue(temp.right);
                }
            }
        }

    }

}
