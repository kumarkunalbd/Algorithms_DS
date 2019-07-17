package com.kunal.linkedlist;

import sun.tools.tree.ForStatement;

public class LinkedListSingly {
	
	SinglyLinkedListNode head;
	
	public LinkedListSingly() {
		this.head = null;
	}
	
	public LinkedListSingly(SinglyLinkedListNode aHeadNode) {
		this.head = aHeadNode;
	}
	
	public LinkedListSingly(int headValue) {
		SinglyLinkedListNode aHeadNode = new SinglyLinkedListNode(headValue);
		this.head = aHeadNode;
	}
	
	public int getValAtIndex(int index) {
		
		
		
		if(index < 0) {
			return -1;
		}
		if(this.head != null) {
			SinglyLinkedListNode currNode = this.head;
			int indexCounter = 0;
			while(currNode != null && indexCounter != index) {
				currNode = currNode.next;
				indexCounter++;
			}
			
			if(currNode != null) {
				return currNode.val;
			}else {
				return -1;
			}
		}else {
			return -1;
		}	
		
	}
	
	public SinglyLinkedListNode getNodeAtIndex(int index) {
		
		if(index == 0) {
			return this.head;
		}
		
		SinglyLinkedListNode curNode = this.head.next;
		int indexcounter = 1;
		
		
		while(curNode != null && indexcounter != index) {
			curNode = curNode.next;
			indexcounter++;
		}
		
		return curNode;
	}
	
	public void addAtHead(int val) {
		SinglyLinkedListNode curNode = new SinglyLinkedListNode(val);
		
		if(this.head != null) {
			curNode.next = this.head;
			this.head = curNode;
		}else {
			this.head = curNode;
		}
	}
	
	//@SuppressWarnings("null")
	public void addAtTail(int val) {
		SinglyLinkedListNode curNode = new SinglyLinkedListNode(val);
		if(this.head != null) {
			SinglyLinkedListNode prevNode = this.head;
			
			while(prevNode.next != null ) {
				prevNode = prevNode.next;
			}
			
			if(prevNode == this.head) {
				this.head.next = curNode;
			}else {
				prevNode.next = curNode;
			}
		}else {
			this.head = curNode;
		}
		
	}
	
	public void addAtIndex(int index, int val) {
		SinglyLinkedListNode curNode = new SinglyLinkedListNode(val);
		
		if(this.head != null) {
			if(index <= 0) {
				this.addAtHead(val);
			}else if(index > 0){
				SinglyLinkedListNode prevNode = this.head;
				int indexCounter = 0;
				while (prevNode != null && indexCounter != index) {
					indexCounter++;
					if(indexCounter != index) {
						prevNode = prevNode.next;
					}else {
						break;
					}
				}
				
				if(prevNode == head) {
					curNode.next = this.head.next;
					this.head.next = curNode;
				}else if(prevNode != null) {
					curNode.next = prevNode.next;
					prevNode.next = curNode;
				}
			}
			
		}else if(this.head == null && index <= 0){
			this.head = curNode;
		}
				
	}
	
	public void deleteAtIndex(int indexNo) {
		
		SinglyLinkedListNode currNode = this.head;
		SinglyLinkedListNode prevNode = null;
		int indexCounter = 0;
		
		while (currNode != null && indexCounter != indexNo) {
			prevNode = currNode;
			currNode = currNode.next;
			indexCounter ++;
		}
		
		if(currNode == this.head && currNode != null) {
			this.head = this.head.next;
		}else if(currNode != null) {
			prevNode.next = currNode.next;
		}
		
	}
	
	public void printLinkedList() {
		
		if(this.head != null) {
			SinglyLinkedListNode curNocde = this.head;
			while(curNocde != null) {
				System.out.print(curNocde.val+":");
				curNocde = curNocde.next;
			}
			System.out.println("END");
		}else {
			System.out.println("Linked list is empty");
		}	
		
	}
	

	
	public boolean hasCycle(SinglyLinkedListNode head) {
		boolean isCyclic = false;
		SinglyLinkedListNode slowPointer = head;
		SinglyLinkedListNode fastPointer = head;
		
		if(head != null) {
			while (fastPointer.next != null && fastPointer.next.next != null && slowPointer.next != null) {
				slowPointer = slowPointer.next;
				fastPointer = fastPointer.next.next;
				
				if(slowPointer == fastPointer) {
					isCyclic = true;
					break;
				}
			}
			return isCyclic;
		}else {
			return isCyclic;
		}
    }
	

	public SinglyLinkedListNode detectCycle(SinglyLinkedListNode head) {
		
		if(head == null) {
			return null;
		}
		
		SinglyLinkedListNode overrunNode = null;
		SinglyLinkedListNode slowPointer = head;
		SinglyLinkedListNode fastPointer = head;
		
		while (fastPointer !=null &&  fastPointer.next != null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
			
			if(slowPointer == fastPointer) {
				overrunNode = fastPointer;
				break;
			}	
		}
		
		if(overrunNode != null) {
			if(overrunNode == head) {
				return overrunNode;
			}else if(overrunNode == overrunNode.next) {
				return overrunNode;
			}else {
				SinglyLinkedListNode firstNodeAfterOverrun = overrunNode.next;
				SinglyLinkedListNode secondNodeAfterOverrun = overrunNode.next.next;
				
				SinglyLinkedListNode curNode = head;
				int iterationCount = 0;
				
				while (curNode!= overrunNode && curNode.next != overrunNode) {
					curNode = curNode.next;
					overrunNode = overrunNode.next;
					iterationCount++;
				}
				return curNode;
			}
		}
		
		return overrunNode;
    }
	
	
	 public SinglyLinkedListNode getIntersectionNode(SinglyLinkedListNode headA, SinglyLinkedListNode headB) {
		 
		 if(headA == null || headB == null) {
			 return null;
		 }
		 
		 SinglyLinkedListNode intersectionNode = null;
		 
		 SinglyLinkedListNode curNodeA = headA;
		 SinglyLinkedListNode curNodeB = headB;
		 
		 int iterationA = 0;
		 int iterationB = 0;
		 
		 while (curNodeA != null) {
			 curNodeA = curNodeA.next;
			 iterationA++;
		 }
		 
		 while (curNodeB != null) {
			curNodeB = curNodeB.next;
			iterationB++;
		 }
		 
		 int differenceAB = iterationA-iterationB;
		 
		 SinglyLinkedListNode tempStartNode = null;
		 SinglyLinkedListNode tempStartNodeSecond = null;
		 if(differenceAB < 0) {
			 tempStartNode = headB;
			 
			 while (tempStartNode != null && differenceAB != 0) {
				tempStartNode = tempStartNode.next;
				differenceAB++;
			}
			 
			 tempStartNodeSecond = headA;
			 
		 }else if(differenceAB == 0) {
			 tempStartNode = headA;
			 tempStartNodeSecond = headB;
			 
			 
		 }else if(differenceAB > 0) {
			 tempStartNode = headA;
			 
			 while (tempStartNode != null && differenceAB !=0) {
				tempStartNode = tempStartNode.next;
				differenceAB--;
			}
			 
			 tempStartNodeSecond = headB;
			 
		 }
		 
		 while (tempStartNode != null && tempStartNodeSecond != null) {
			 
			if(tempStartNode == tempStartNodeSecond) {
					intersectionNode = tempStartNode;
					break;
			}
			tempStartNode = tempStartNode.next;
			tempStartNodeSecond = tempStartNodeSecond.next;	
		}
		 
		 return intersectionNode;
	 }
	 
	 public SinglyLinkedListNode getIntersectionNodeCyclicWay(SinglyLinkedListNode headA, SinglyLinkedListNode headB) {
		 
		 if(headA == null || headB == null) {
			 return null;
		 }else if(headA == headB) {
			 return headA;
		 }
		 
		 SinglyLinkedListNode intersectionNode = null;
		 
		 SinglyLinkedListNode curNode = headA;
		 
		 while (curNode != null) {
			curNode = curNode.next;
		}
		 
		 curNode.next = headA;
		 
		 intersectionNode = this.detectCycle(headB);
		 return intersectionNode;
		 
	 }
	 
	 public SinglyLinkedListNode removeNthFromEnd(SinglyLinkedListNode head, int n) {
		 if(n < 0 || head == null) {
			 return head;
		 }
		 
		 //this.head = head;
		 
		 SinglyLinkedListNode firstPointer = head;
		 SinglyLinkedListNode secondPointer = null;
		 int iteration = 0;
		 
		 while (firstPointer.next!=null) {
			 firstPointer = firstPointer.next;
			 iteration++;
			 if(iteration == n) {
				 secondPointer = head;
			 }else if(iteration > n) {
				 secondPointer = secondPointer.next;
			 }
			 
		}
		 
		 if(secondPointer != null && secondPointer.next != null) {
			 secondPointer.next = secondPointer.next.next;
			 //return head;
		 }else if(secondPointer == null && iteration == n-1) {
			 //secondPointer = head;
			 head = head.next;
		 }
		 
		 return head;
	 }
	 
	 
	 
	 public void printLinkedList(SinglyLinkedListNode head) {
			
			if(head != null) {
				SinglyLinkedListNode curNocde = head;
				while(curNocde != null) {
					System.out.print(curNocde.val+":");
					curNocde = curNocde.next;
				}
				System.out.println("END");
			}else {
				System.out.println("Linked list is empty");
			}	
			
		}
	 
	 public SinglyLinkedListNode reverseList(SinglyLinkedListNode head) {
		 
		 if(head != null){
			 SinglyLinkedListNode firstPointer = head.next;
			 SinglyLinkedListNode secondPointer = null;
			 if(firstPointer != null) {
				 secondPointer = firstPointer.next;
			 }
			 head.next = null;
			 
			 while (firstPointer != null) {
				firstPointer.next = head;
				head = firstPointer;
				firstPointer = secondPointer;
				if(firstPointer != null) {
					secondPointer = secondPointer.next;
				}
			}
			 
			 return head;
			 
		 }else {
			 return null;
		 }
		 	 
	 }
	 
	 
	 public SinglyLinkedListNode removeElements(SinglyLinkedListNode head, int val) {
		 
		 if(head != null) {
			 SinglyLinkedListNode curNode = head;
			 SinglyLinkedListNode prevNode = null;
			 
			 while (curNode != null) {
				 
				 if(curNode == head && curNode.val == val) {
					 head = head.next;
					 curNode = curNode.next;
				 }else if(curNode.val != val) {
					 prevNode = curNode;
					 curNode = curNode.next;
				 }else if(curNode.val == val) {
					 prevNode.next = curNode.next;
					 curNode = curNode.next;
				 }
			}
			 
			 return head;
			 
		 }else {
			 return null;
		 }
		 
	 }
	 
	 
	 public SinglyLinkedListNode oddEvenList(SinglyLinkedListNode head) {
		 
		 if(head != null) {
			 SinglyLinkedListNode curNode = head;
			 SinglyLinkedListNode evenHead = head.next;
			 SinglyLinkedListNode prevFirst = null;
			 SinglyLinkedListNode prevSecond = null;
			 
			 int counterNo=0;
			 while (curNode != null) {
				 if(curNode == head) {
					 prevFirst = curNode;
					 curNode = curNode.next;
					 if(curNode != null) {
						 head.next = curNode.next;
					 }
				 }else if(curNode == evenHead) {
					 prevSecond = prevFirst;
					 prevFirst = curNode;
					 curNode = curNode.next;
					 if(curNode != null) {
						 evenHead.next = curNode.next;
					 } 
				 }else {
					 prevSecond = prevFirst;
					 prevFirst = curNode;
					 curNode = curNode.next;
					 if(curNode != null) {
						 prevFirst.next = curNode.next;
					 }
				 }
				 counterNo++;
			}
			 
			 if(counterNo%2 == 0) {
				 prevSecond.next = evenHead;
				 
			 }else if(counterNo%2 == 1) {
				 prevFirst.next = evenHead;
			 }
			 
			 return head;
		 }else
			 return null;
		 
	 }
	 
	 public SinglyLinkedListNode reverseList(SinglyLinkedListNode startNode, SinglyLinkedListNode postEndNode) {
		 if(startNode != null && startNode != postEndNode) {
			 SinglyLinkedListNode curNode = startNode.next;
			 SinglyLinkedListNode prevHead = startNode;
			 SinglyLinkedListNode newHead = startNode;
			 //startNode.next = null;
			 
			 while (curNode != postEndNode) {
				 if(curNode == startNode.next) {
					 newHead = curNode;
					 curNode = curNode.next;
					 
					 newHead.next = startNode;
				 }else {
					 prevHead = newHead;
					 newHead = curNode;
					 curNode = curNode.next;
					 newHead.next = prevHead;
				 }
			}
			 
			 startNode.next = null;
			 return newHead;
		 }else {
			 return null;
		 }
	 }
	 
	 
	 public boolean isPalindrome(SinglyLinkedListNode head) {
		 
		 boolean isPalindrome = false;
		 
		 if(head != null && head.next != null) {
			 SinglyLinkedListNode slowPointer = head;
			 SinglyLinkedListNode fastPointer = head.next;
			 SinglyLinkedListNode halfReverseHead = null;
			 
			 while (fastPointer != null && fastPointer.next != null) {
				slowPointer = slowPointer.next;
				fastPointer = fastPointer.next.next;
			}
			 SinglyLinkedListNode nonReversedStartNode = slowPointer.next;
			 
			 if(fastPointer != null) {
				 halfReverseHead = this.reverseList(head, slowPointer.next);
			 }else {
				 halfReverseHead = this.reverseList(head, slowPointer);
			 }
			 
			 this.printLinkedList(halfReverseHead);
			 
			 SinglyLinkedListNode curNodeReversed = halfReverseHead;
			 SinglyLinkedListNode curNodeHalfAfterSlowPointer = nonReversedStartNode;
			 
			 while (curNodeReversed != null && curNodeHalfAfterSlowPointer != null) {
				 if(curNodeHalfAfterSlowPointer.val != curNodeReversed.val) {
					 isPalindrome = false;
					 break;
				 }else {
					 isPalindrome = true;
				 }
				 
				 curNodeHalfAfterSlowPointer = curNodeHalfAfterSlowPointer.next;
				 curNodeReversed = curNodeReversed.next;
			} 
		 }else if(head != null && head.next == null){
			 isPalindrome = true;
		 }else {
			 isPalindrome = true;
		 }
		 
		 return isPalindrome;
	 }
	 
	 public SinglyLinkedListNode mergeTwoLists(SinglyLinkedListNode l1, SinglyLinkedListNode l2) {
		 
		 if(l1 == null && l2 == null) {
			 return null;
		 }else if(l1 == null && l2 != null) {
			 return l2;
		 }else if(l1!=null && l2 == null) {
			 return l1;
		 }else {
			 
			 SinglyLinkedListNode prevNode = null;
			 SinglyLinkedListNode curNode1= l1;
			 SinglyLinkedListNode curNode2 = l2;
			 SinglyLinkedListNode returnigNode = null;
			 
			 while(curNode1 != null && curNode2 != null) {
				 
				 if(curNode1==l1 && curNode2 == l2) {
					 if(curNode1.val > curNode2.val) {
						 prevNode = curNode2;
						 curNode2 = curNode2.next;
						 returnigNode = l2;
						 
					 }else if(curNode1.val < curNode2.val) {
						 prevNode = curNode1;
						 curNode1 = curNode1.next;
						 returnigNode = l1;
					 }else {
						 prevNode = curNode1;
						 curNode1 = curNode1.next;
						 returnigNode = l1;
					 }
					 
				 }else {
					 
					 if(curNode1.val > curNode2.val) {
						prevNode.next = curNode2;
						prevNode = curNode2;
						curNode2 = curNode2.next;
						 
					 }else if(curNode1.val < curNode2.val) {
						 prevNode.next = curNode1;
						 prevNode = curNode1;
						 curNode1 = curNode1.next;
						
					 }else {
						 if(prevNode.next == curNode2) {
							 prevNode = curNode2;
							 curNode2 = curNode2.next;
							 
						 }else {
							 prevNode = curNode1;
							 curNode1 = curNode1.next;
						 }
					 }	 
				 }
			 }
			 
			 if(curNode1 == null) {
				 prevNode.next = curNode2;
			 }else if(curNode2 == null){
				 prevNode.next = curNode1;
			 }
			 
			 return returnigNode;
		 } 
		 
	 }
	 
	 public SinglyLinkedListNode addTwoNumbers(SinglyLinkedListNode l1, SinglyLinkedListNode l2) {
		 
		 SinglyLinkedListNode curNode1 = l1;
		 SinglyLinkedListNode curNode2 = l2;
		 SinglyLinkedListNode prevNode = null;
		 int carryOver = 0;
		 int sumOfNodesCarryOver = 0;
		 int leftOver = 0;
		 
		 while (curNode1 != null && curNode2 != null) {
			 sumOfNodesCarryOver = curNode1.val+curNode2.val+carryOver;
			 if(curNode1.next == null && curNode2.next == null) {
				 carryOver = sumOfNodesCarryOver/10;
				 leftOver = sumOfNodesCarryOver%10;
				 if(carryOver == 0) {
					 curNode2.val = leftOver;
				 }else {
					 curNode2.val = leftOver;
					 SinglyLinkedListNode aNode = new SinglyLinkedListNode(carryOver);
					 curNode2.next = aNode;
					 curNode2 = aNode;
				 }
				 
			 }else {
				 carryOver = sumOfNodesCarryOver/10;
				 leftOver = sumOfNodesCarryOver%10;
				 curNode2.val = leftOver;
			 }
			 
			 prevNode = curNode2;
			 curNode2 = curNode2.next;
			 curNode1 = curNode1.next;
		}
		 
		if(curNode1 == null && curNode2 != null) {
			 
			 while (curNode2 != null) {
				 sumOfNodesCarryOver = curNode2.val+carryOver;
				if(curNode2.next != null) {
					carryOver = sumOfNodesCarryOver/10;
					leftOver = sumOfNodesCarryOver%10;	
					curNode2.val = leftOver;
				}else {
					carryOver =sumOfNodesCarryOver/10;
					leftOver = sumOfNodesCarryOver%10;	
					if(carryOver == 0) {
						curNode2.val = leftOver;
					}else {
						curNode2.val = leftOver;
						SinglyLinkedListNode aNode = new SinglyLinkedListNode(carryOver);
						curNode2.next = aNode;
						curNode2 = aNode;
					}
				}				
				prevNode = curNode2;
				curNode2 = curNode2.next;				
			}
			 
		 }else if(curNode1 != null && curNode2 == null) {
			 
			 //int iterationAfterCurNodeNull =0;
			 while (curNode1 != null) {
				sumOfNodesCarryOver = curNode1.val+carryOver;
				prevNode.next = curNode1;
				if(curNode1.next != null) {
					carryOver = sumOfNodesCarryOver/10;
					leftOver = sumOfNodesCarryOver%10;
					curNode1.val = leftOver;
					
				}else {
					carryOver = sumOfNodesCarryOver/10;
					leftOver = sumOfNodesCarryOver%10;
					if(carryOver == 0) {
						curNode1.val = leftOver;
					}else {
						curNode1.val = leftOver;
						SinglyLinkedListNode aNode = new SinglyLinkedListNode(carryOver);
						curNode1.next = aNode;
						curNode1 = aNode;
					}
				}
				prevNode = curNode1;
				curNode1 = curNode1.next;
			} 
			 
		 }
		
		return l2;		  
	 }	          
}
