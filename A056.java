package day6_13;

import java.util.Scanner;

import day6_13.A055.Node;

public class A056 {
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
    public int length() {
        int length = 0;
        Node tmp = head;
        while (tmp != null) {
            length++;
            tmp = tmp.next;
        }
        return length;
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
    public void printsplit() {
        Node tmp = head;
        System.out.print("0->");
        while (tmp != null) {
            System.out.print(tmp.data+"->");
            tmp = tmp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    
    public static void main(String[] args) {
    	A056 list = new A056();
    	Scanner br=new Scanner(System.in);
    	int[]a=new int[7];
    	for(int i=0;i<a.length;i++) {
    		a[i]=br.nextInt();
    		list.addNode(a[i]);
    	}
    	br.close();
    	list.printList();
    	A056 list1 = new A056();
    	A056 list2 = new A056();
    	for(int i=0;i<list.length();i+=2) {
    		Node temp=head;
    		for(int j=0;j<=i;j++) {
    			temp=temp.next;
    		}
    		list1.addNode(temp.data);
    	}
    	for(int i=1;i<list.length();i+=2) {
    		Node temp=head;
    		for(int j=0;j<=i;j++) {
    			temp=temp.next;
    		}
    		list2.addNode(temp.data);
    	}
    	list.printList();
        list1.printsplit();
        list2.printsplit();
    	
    }
}
