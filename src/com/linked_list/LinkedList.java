package com.linked_list;

// 定义一个单向链表类
public class LinkedList {

    // 根节点（链表开始的节点）
    private Node rootNode;

    // 当前位置，用于插入操作时定位
    private int currentPosition = 0;

    // 构造方法
    public LinkedList () {
    }

    // 在链表尾部添加一个新节点
    public void add (int number) {
        // 如果根节点为空，直接在根节点上创建新节点
        if (rootNode == null) {
            rootNode = new Node(number);
        } else {
            // 如果根节点不为空，则递归地添加到链表的尾部
            rootNode.addNode(number);
        }
    }

    // 从链表中删除指定的节点
    public boolean remove (int number) {
        if (rootNode != null) {
            // 如果根节点的数值和指定数值相同，则删除根节点
            if (rootNode.getNumber() == number) {
                rootNode = rootNode.nextNode;
                return true;
            }

            // 否则递归地从链表中删除指定数值的节点
            return rootNode.removeNode(number);
        }

        return false;
    }

    // 查找指定数值的节点是否存在
    public boolean find (int number) {
        if (rootNode == null) return false;
        if (rootNode.getNumber() == number) return true;
        return rootNode.findNode(number);
    }

    // 更新链表中指定数值的节点
    public boolean update (int targetNumber, int newNumber) {
        if (rootNode == null) return false;
        if (rootNode.getNumber() == targetNumber) {
            rootNode.setNumber(newNumber);
            return true;
        }

        return rootNode.updateNode(targetNumber, newNumber);
    }

    // 在指定位置插入一个新节点
    public boolean insert (int position, int number) {
        currentPosition = 0;
        if (rootNode == null) return false;
        if (position < 0) return false;
        if (position == currentPosition) {
            Node newNode = new Node(number);
            newNode.nextNode = rootNode;
            rootNode = newNode;
            return true;
        }

        return rootNode.insertNode(position, number);
    }

    // 打印链表所有节点的数值
    public void print () {
        if (rootNode != null) {
            System.out.print(rootNode.getNumber() + "=>");
            rootNode.printNode();
            System.out.println();
        }
    }

    // 定义链表中的节点类
    private class Node {
        private int number; // 节点保存的数值
        private Node nextNode; // 下一个节点

        // 构造方法
        public Node (int number) {
            this.number = number;
        }

        // 获取节点的数值
        public int getNumber () {
            return number;
        }

        // 设置节点的数值
        public void setNumber (int number) {
            this.number = number;
        }

        // 在当前节点后添加一个新节点
        public void addNode (int number) {
            if (nextNode == null) {
                nextNode = new Node(number);
            } else {
                nextNode.addNode(number);
            }
        }

        // 递归地从链表中删除指定数值的节点
        public boolean removeNode (int number) {
            if (nextNode != null) {
                if (nextNode.getNumber() == number) {
                    nextNode = nextNode.nextNode;
                    return true;
                }

                return nextNode.removeNode(number);
            }

            return false;
        }

        // 递归地更新链表中指定数值的节点
        public boolean updateNode (int targetNumber, int newNumber) {
            if (nextNode == null) return false;
            if (nextNode.getNumber() == targetNumber) {
                nextNode.setNumber(newNumber);
                return true;
            }

            return nextNode.updateNode(targetNumber, newNumber);
        }

        // 递归地查找指定数值的节点是否存在
        public boolean findNode (int number) {
            if (nextNode == null) return false;
            if (nextNode.getNumber() == number) return true;
            return nextNode.findNode(number);
        }

        // 递归地在指定位置插入一个新节点
        public boolean insertNode (int position, int number) {
            if (nextNode == null) return false;
            currentPosition++;

            if (position == currentPosition) {
                Node newNode = new Node(number);
                newNode.nextNode = nextNode;
                nextNode = newNode;
                return true;
            }

            return nextNode.insertNode(position, number);
        }

        // 打印节点后所有的数值
        public void printNode () {
            if (nextNode != null) {
                System.out.print(nextNode.getNumber() + "=>");
                nextNode.printNode();
            }
        }
    }
}
