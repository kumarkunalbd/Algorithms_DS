package com.kunal.linkedlist;

public class LinkedListDoubly {
	DoublyLinkedListNode head;
	DoublyLinkedListNode tail;
	
	public LinkedListDoubly() {
		System.out.println("Costructor with no args called");
		this.head = null;
	}
	
	private DoublyLinkedListNode getNodeAtIndex(int index) {
		
		if(index < 0) {
			return null;
		}
		
		DoublyLinkedListNode curNode = this.head;
		int indexCounter =0;
		
		while(curNode != null && indexCounter != index) {
			curNode = curNode.next;
			indexCounter ++;
		}
		
		return curNode;
	}
	
	public int get(int index) {
		DoublyLinkedListNode aNode = this.getNodeAtIndex(index);
		if(aNode != null) {
			return aNode.val;
		}else {
			return -1;
		}
	}
	
	public void addAtHead(int val) {
		DoublyLinkedListNode curNode = new DoublyLinkedListNode(val);
		
		if(this.head != null) {
			curNode.next = this.head;
			//this.head.prev = curNode;
			this.head = curNode;
			//this.head.prev = curNode;
			this.head.next.prev = curNode;
		}else {
			this.head = curNode;
			//this.tail = curNode;
		}	
	}
	
	public void addAtTail(int val) {
		DoublyLinkedListNode curNode = new DoublyLinkedListNode(val);
		
		if(this.head != null) {
			DoublyLinkedListNode formerNode = this.head;
			while(formerNode.next != null) {
				formerNode = formerNode.next;
			}
			formerNode.next = curNode;
			curNode.prev = formerNode;
		}else {
			this.head = curNode;
			this.tail = curNode;
		}
	}
	
	public void addAtIndex(int index, int val) {
		DoublyLinkedListNode curNode = new DoublyLinkedListNode(val);
		
		if(index<= 0) {
			this.addAtHead(val);
		}else {
			DoublyLinkedListNode formerNode = this.getNodeAtIndex(index);
			DoublyLinkedListNode formerFormerNode = this.getNodeAtIndex(index-1);
			
			if(formerNode == null && formerFormerNode == null) {
				System.out.println("Invalid index");
			}else if(formerNode == null && formerFormerNode != null) {
				this.addAtTail(val);
			}else if(formerNode != null && formerFormerNode != null) {
				curNode.next = formerNode;
				curNode.prev = formerFormerNode;
				
				formerFormerNode.next = curNode;
				formerNode.prev = curNode;
				
			}
		}
	}
	
	public void deleteAtIndex(int index) {
		DoublyLinkedListNode formerNode = this.getNodeAtIndex(index);
		
		if(formerNode != null) {
			if(formerNode == this.head) {
				if(formerNode.next != null) {
					this.head = formerNode.next;
				}
				//formerNode = null;
			}else {
				DoublyLinkedListNode formerFormerNode = this.getNodeAtIndex(index-1);
				formerNode.prev.next = formerNode.next;
				if(formerNode.next != null) {
					formerNode.next.prev = formerNode;
				}
				//formerNode = null;
			}
		}
	}
	
	public void printLinkedList() {
		DoublyLinkedListNode curNode = this.head;
		int indexCounter=0;
		while (curNode != null) {
			System.out.print("("+indexCounter+")"+curNode.val+":");
			curNode = curNode.next;
			indexCounter++;
		}
		System.out.print("END");
		System.out.println();
	}
	
}
