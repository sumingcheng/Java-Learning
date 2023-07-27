package com.linked_list;

/**
 * {
 *   number: 5,
 *   nextNode: {
 *     number: 4,
 *     nextNode: {
 *       number: 3,
 *       nextNode: {
 *         number: 2,
 *         nextNode: {
 *           number: 1:
 *           nextNode: null
 *         }
 *       }
 *     }
 *   }
 * }
 */

public class LinkedList {
    // 根节点
    private Node rootNode; // null
    private int currentPosition = 0;

    public LinkedList () {}

    public void add (int number) {
       if (rootNode == null) {
           rootNode = new Node(number);
       } else {
           rootNode.addNode(number);
       }
    }

    public boolean remove (int number) {
        if (rootNode != null) {
            if (rootNode.getNumber() == number) {
                rootNode = rootNode.nextNode;
                return true;
            }

            return rootNode.removeNode(number);
        }

        return false;
    }

    public boolean find (int number) {
        if (rootNode == null) return false;
        if (rootNode.getNumber() == number) return true;
        return rootNode.findNode(number);
    }

    public boolean update (int targetNumber, int newNumber) {
        if (rootNode == null) return false;
        if (rootNode.getNumber() == targetNumber) {
            rootNode.setNumber(newNumber);
            return true;
        }

        return rootNode.updateNode(targetNumber, newNumber);
    }

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

    public void print () {
        if (rootNode != null) {
            System.out.print(rootNode.getNumber() + "=>");
            rootNode.printNode();
            System.out.println();
        }
    }

    private class Node {
        // 节点数据
        private int number;

        // 本节点的下一个节点
        private Node nextNode;

        public Node () {}

        public Node (int number) {
            this.number = number;
        }

        // 获取数据
        public int getNumber () {
            return number;
        }

        // 设置数据
        public void setNumber (int number) {
            this.number = number;
        }

        // 添加节点
        public void addNode (int number) {
            if (nextNode == null) {
                nextNode = new Node(number);
            } else {
                nextNode.addNode(number);
            }
        }

        // 删除节点
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

        // 更新节点
        public boolean updateNode (int targetNumber, int newNumber) {
            if (nextNode == null) return false;
            if (nextNode.getNumber() == targetNumber) {
                nextNode.setNumber(newNumber);
                return true;
            }

            return nextNode.updateNode(targetNumber, newNumber);
        }

        // 查询节点
        public boolean findNode (int number) {
            if (nextNode == null) return false;
            if (nextNode.getNumber() == number) return true;
            return nextNode.findNode(number);
        }

        // 插入节点
        public boolean insertNode (int position, int number) {
            if (nextNode == null) return false;
            currentPosition ++;

            if (position == currentPosition) {
                Node newNode = new Node(number);
                newNode.nextNode = nextNode;
                nextNode = newNode;
                return true;
            }

            return nextNode.insertNode(position, number);
        }

        // 打印节点
        public void printNode () {
            if (nextNode != null) {
                System.out.print(nextNode.getNumber() + "=>");
                nextNode.printNode();
            }
        }
    }
}
