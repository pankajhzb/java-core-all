package com.pk.test.algo;

public class CustomLinkedList {
	private Node head;
	private Node tail;
	
	public CustomLinkedList() {
		this.head = new Node("head");
		this.tail = head;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

}
