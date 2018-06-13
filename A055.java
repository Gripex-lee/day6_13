package day6_13;

import java.util.Scanner;

public class A055 {
    static Node head = null; // 头节点
    class Node {
        Node next = null;// 节点的引用，指向下一个节点
        int data;// 节点的对象，即内容
        public Node(int data) {
            this.data = data;
        }
    }
    public void addNode(int d) {
        Node newNode = new Node(d);// 实例化一个节点
        if (head == null) {
            head = newNode;
            return;
        }
        Node tmp = head;
        while (tmp.next != null) {
        		tmp = tmp.next;
        }
        tmp.next = newNode;
    }
    
    public Node orderList() {
        Node nextNode = null;
        int tmp = 0;
        Node curNode = head;
        while (curNode.next != null) {
            nextNode = curNode.next;
            while (nextNode != null) {
                if (curNode.data > nextNode.data) {
                    tmp = curNode.data;
                    curNode.data = nextNode.data;
                    nextNode.data = tmp;
                }
                nextNode = nextNode.next;
            }
            curNode = curNode.next;
        }
        return head;
    }
    
    public void printList() {
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data+"->");
            tmp = tmp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static void main(String[] args) {
    	A055 list = new A055();
    	Scanner br=new Scanner(System.in);
    	int[]a=new int[6];
    	for(int i=0;i<a.length;i++) {
    		a[i]=br.nextInt();
    		list.addNode(a[i]);
    	}
    	br.close();
        list.printList();
        list.orderList();
        list.printList();
    }
}
