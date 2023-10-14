package ques5;


public class BST {
        public class Node {
            int value;
            Node left;
            Node right;

            public Node(int value) {
                this.value = value;
            }

        }
        private Node root;
        public void insert(int value) {
            root = insert(value, root);
        }

        private Node insert(int value, Node node) {
            if (node == null) {
                node = new Node(value);
                return node;
            }

            if (value < node.value) {
                node.left = insert(value, node.left);
            }

            if (value > node.value) {
                node.right = insert(value, node.right);
            }
            return node;
        }

        public void populate(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                this.insert(nums[i]);
            }
        }
        public void display() {
            display(this.root, "Root Node: ");
        }

        private void display(Node node, String details) {
            if (node == null) {
                return;
            }
            System.out.println(details + node.value);
            display(node.left, "Left child of " + node.value + " : ");
            display(node.right, "Right child of " + node.value + " : ");
        }

    }
