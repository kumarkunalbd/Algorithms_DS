package com.kunal.linkedlist;

import java.lang.reflect.*;

public class LinkedListOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			LinkedListOperations.dynamicMethodCalling(args);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		//LinkedListSingly singlyLinkedList = new LinkedListSingly();
		
		//LinkedListDoubly doublyLinkedList = new LinkedListDoubly();
		
		
		/*singlyLinkedList.addAtIndex(-1, 0);
		singlyLinkedList.printLinkedList();
		int valueAtIndexInitial = singlyLinkedList.getValAtIndex(0);
		System.out.println("Value at requested index:"+valueAtIndexInitial);
		singlyLinkedList.addAtIndex(0, 20);
		singlyLinkedList.printLinkedList();
		singlyLinkedList.addAtIndex(1, 30);
		singlyLinkedList.printLinkedList();
		
		singlyLinkedList.addAtHead(1);
		singlyLinkedList.printLinkedList();
		singlyLinkedList.addAtTail(3);
		singlyLinkedList.printLinkedList();
		singlyLinkedList.addAtIndex(1, 2);
		singlyLinkedList.printLinkedList();
		int valueAtIndex = singlyLinkedList.getValAtIndex(1);
		System.out.println("Value at requested index:"+valueAtIndex);
		singlyLinkedList.deleteAtIndex(1);
		singlyLinkedList.printLinkedList();
		valueAtIndex = singlyLinkedList.getValAtIndex(1);
		System.out.println("Value at requested index:"+valueAtIndex);*/
		
		/*
		 * 
		 * 
		 * 
		 */
		
		/*doublyLinkedList.addAtHead(56);
		
		int valueAtIndex = doublyLinkedList.get(1);
		System.out.println("Value at requested index:"+valueAtIndex);
		doublyLinkedList.addAtHead(41);
		doublyLinkedList.addAtTail(98);
		valueAtIndex = doublyLinkedList.get(3);
		System.out.println("Value at requested index:"+valueAtIndex);
		doublyLinkedList.addAtIndex(1, 33);
		doublyLinkedList.addAtHead(72);
		doublyLinkedList.addAtHead(52);
		doublyLinkedList.addAtHead(89);
		doublyLinkedList.addAtHead(0);
		doublyLinkedList.addAtHead(98);
		doublyLinkedList.printLinkedList();
		doublyLinkedList.addAtIndex(7, 97);
		doublyLinkedList.addAtIndex(2, 51);
		doublyLinkedList.printLinkedList();
		//doublyLinkedList.printLinkedList();
		valueAtIndex = doublyLinkedList.get(1);
		System.out.println("Value at requested index:"+valueAtIndex);
		valueAtIndex = doublyLinkedList.get(6);
		System.out.println("Value at requested index:"+valueAtIndex);
		doublyLinkedList.addAtIndex(6, 49);
		doublyLinkedList.printLinkedList();
		valueAtIndex = doublyLinkedList.get(8);
		System.out.println("Value at requested index:"+valueAtIndex);
		doublyLinkedList.addAtHead(72);
		doublyLinkedList.addAtIndex(7, 8);
		doublyLinkedList.addAtIndex(8, 58);
		doublyLinkedList.printLinkedList();
		doublyLinkedList.addAtHead(10);
		doublyLinkedList.addAtIndex(3, 6);
		doublyLinkedList.addAtIndex(9, 61);
		doublyLinkedList.printLinkedList();
		doublyLinkedList.addAtHead(63);
		doublyLinkedList.printLinkedList();
		valueAtIndex = doublyLinkedList.get(16);
		System.out.println("Value at requested index:"+valueAtIndex);
		doublyLinkedList.deleteAtIndex(7);
		doublyLinkedList.printLinkedList();
		doublyLinkedList.addAtIndex(16, 55);
		doublyLinkedList.printLinkedList();
		valueAtIndex = doublyLinkedList.get(4);
		System.out.println("Value at requested index:"+valueAtIndex);
		valueAtIndex = doublyLinkedList.get(10);
		System.out.println("Value at requested index:"+valueAtIndex);
		doublyLinkedList.deleteAtIndex(6);
		doublyLinkedList.printLinkedList();
		doublyLinkedList.addAtTail(96);
		doublyLinkedList.addAtHead(69);
		doublyLinkedList.addAtTail(20);
		doublyLinkedList.addAtHead(3);
		doublyLinkedList.printLinkedList();
		doublyLinkedList.addAtTail(44);
		doublyLinkedList.addAtTail(4);
		doublyLinkedList.addAtIndex(8, 16);
		doublyLinkedList.printLinkedList();
		valueAtIndex = doublyLinkedList.get(15);
		System.out.println("Value at requested index:"+valueAtIndex);
		valueAtIndex = doublyLinkedList.get(21);
		System.out.println("Value at requested index:"+valueAtIndex);
		doublyLinkedList.addAtHead(41);
		doublyLinkedList.deleteAtIndex(1);
		doublyLinkedList.printLinkedList();
		doublyLinkedList.deleteAtIndex(11);
		doublyLinkedList.printLinkedList();
		valueAtIndex = doublyLinkedList.get(21);
		System.out.println("Value at requested index:"+valueAtIndex);
		doublyLinkedList.deleteAtIndex(22);
		doublyLinkedList.printLinkedList();
		valueAtIndex = doublyLinkedList.get(2);
		System.out.println("Value at requested index:"+valueAtIndex);
		doublyLinkedList.addAtIndex(5, 7);
		doublyLinkedList.addAtTail(62);
		doublyLinkedList.addAtHead(95);
		doublyLinkedList.addAtTail(91);
		doublyLinkedList.addAtHead(69);
		valueAtIndex = doublyLinkedList.get(24);
		System.out.println("Value at requested index:"+valueAtIndex);
		doublyLinkedList.addAtTail(51);
		doublyLinkedList.addAtTail(94);
		doublyLinkedList.addAtHead(93);
		doublyLinkedList.printLinkedList();
		valueAtIndex = doublyLinkedList.get(29);
		System.out.println("Value at requested index:"+valueAtIndex);
		valueAtIndex = doublyLinkedList.get(10);
		System.out.println("Value at requested index:"+valueAtIndex);
		doublyLinkedList.addAtHead(68);
		doublyLinkedList.addAtHead(13);
		doublyLinkedList.addAtIndex(32, 42);
		doublyLinkedList.printLinkedList();
		doublyLinkedList.addAtHead(48);
		doublyLinkedList.addAtHead(55);
		doublyLinkedList.addAtHead(79);
		doublyLinkedList.addAtHead(5);
		doublyLinkedList.addAtHead(36);
		doublyLinkedList.addAtTail(32);
		doublyLinkedList.addAtIndex(25, 40);
		doublyLinkedList.printLinkedList();
		doublyLinkedList.addAtHead(8);
		doublyLinkedList.addAtTail(68);
		doublyLinkedList.deleteAtIndex(30);
		doublyLinkedList.printLinkedList();
		doublyLinkedList.addAtHead(66);
		doublyLinkedList.addAtHead(92);
		doublyLinkedList.addAtIndex(27, 26);
		doublyLinkedList.printLinkedList();
		doublyLinkedList.addAtTail(90);
		doublyLinkedList.addAtIndex(11, 19);
		doublyLinkedList.printLinkedList();
		doublyLinkedList.addAtTail(68);
		doublyLinkedList.addAtIndex(17, 62);
		valueAtIndex = doublyLinkedList.get(15);
		System.out.println("Value at requested index:"+valueAtIndex);
		doublyLinkedList.addAtIndex(17, 97);
		doublyLinkedList.addAtIndex(35, 89);
		doublyLinkedList.printLinkedList();
		valueAtIndex = doublyLinkedList.get(44);
		System.out.println("Value at requested index:"+valueAtIndex);
		doublyLinkedList.addAtTail(90);
		doublyLinkedList.addAtTail(67);
		doublyLinkedList.addAtHead(2);
		doublyLinkedList.addAtHead(51);
		doublyLinkedList.addAtHead(30);
		doublyLinkedList.printLinkedList();
		doublyLinkedList.deleteAtIndex(38);
		doublyLinkedList.printLinkedList();
		doublyLinkedList.addAtHead(30);
		doublyLinkedList.addAtTail(43);
		doublyLinkedList.addAtTail(76);
		doublyLinkedList.addAtTail(16);
		doublyLinkedList.addAtTail(38);
		doublyLinkedList.addAtHead(82);
		doublyLinkedList.addAtHead(81);
		doublyLinkedList.addAtTail(67);
		doublyLinkedList.addAtTail(67);
		doublyLinkedList.addAtIndex(3, 16);
		doublyLinkedList.printLinkedList();
		valueAtIndex = doublyLinkedList.get(57);
		System.out.println("Value at requested index:"+valueAtIndex);
		doublyLinkedList.addAtTail(94);
		doublyLinkedList.addAtHead(11);
		doublyLinkedList.addAtTail(31);
		doublyLinkedList.addAtHead(50);
		doublyLinkedList.printLinkedList();*/
		
		
	}
	
	
	public static void dynamicMethodCalling(String[] args) throws Exception{
		
		String[] methodnameArray = {"addAtHead","addAtHead","deleteAtIndex","addAtIndex","addAtTail","addAtIndex",
				"addAtTail","addAtHead","addAtHead","addAtHead","addAtTail","addAtTail","addAtHead","addAtTail",
				"addAtTail","addAtHead","addAtTail","deleteAtIndex","addAtTail","addAtTail","get","addAtIndex",
				"addAtHead","get","get","addAtHead","get","addAtIndex","addAtTail","addAtIndex","addAtHead",
				"addAtHead","addAtHead","get","addAtHead","addAtIndex","addAtTail","addAtHead","addAtIndex","get",
				"addAtTail","addAtTail","addAtIndex","addAtIndex","addAtHead","addAtHead","get","addAtTail",
				"addAtIndex","addAtIndex","addAtHead","deleteAtIndex","addAtIndex","addAtHead","deleteAtIndex",
				"addAtTail","deleteAtIndex","addAtTail","addAtHead","addAtTail","addAtTail","addAtHead","addAtTail",
				"addAtIndex","deleteAtIndex","addAtHead","addAtHead","addAtHead","addAtTail","get","addAtIndex",
				"printLinkedList","addAtTail","addAtTail","printLinkedList","addAtTail","printLinkedList","deleteAtIndex","printLinkedList","get","addAtHead","get","get","addAtTail",
				"printLinkedList","deleteAtIndex","addAtTail","addAtIndex","printLinkedList","addAtHead","addAtIndex","addAtTail","printLinkedList","get","addAtIndex",
				"addAtIndex","printLinkedList","addAtHead","addAtHead","get","get","get","addAtIndex","printLinkedList","addAtHead","addAtIndex",
				"addAtHead","printLinkedList","addAtTail","addAtIndex","printLinkedList","get"};
		int[] argumentArray = {38,45,2,1,24,36,3,72,76,7,36,34,91,69,37,38,4,66,38,14,12,32,5,7,5,74,7,13,11,8,
				10,9,19,3,76,7,37,99,10,12,1,20,29,42,21,52,11,44,47,6,27,31,85,59,57,4,99,13,83,10,34,48,9,22,
				64,69,33,5,18,87,42,1,35,31,67,36,46,23,64,81,29,50,23,36,63,8,19,98,22,28,42,24,34,32,25,53,
				55,76,38,23,98,27,18,44,27,16,8,70,15,9,27,59,40,50,15,11,57,80,50,23,37,12};
		
		int lengthMethodArray = methodnameArray.length;
		int lengthArgumentArray = argumentArray.length;
		
		int argumentArrayCouter=0;
		String linkedListClassName = "com.kunal.linkedlist.LinkedListDoubly";
		Class<?> linkedListClass = Class.forName(linkedListClassName); 
		Object linkedList = linkedListClass.getDeclaredConstructor().newInstance();
		
		for (int i=0 ; i< lengthMethodArray; i++) {
			String methodName = methodnameArray[i];
			int argument1;
			int argument2;
			if(methodName.equalsIgnoreCase("addAtIndex")) {
				argument1 = argumentArray[argumentArrayCouter];
				argumentArrayCouter++;
				argument2 = argumentArray[argumentArrayCouter];
				argumentArrayCouter++;
				
				Class<?>[] paramTypes = {int.class, int.class};
				 Method addAtIndex = linkedList.getClass().getMethod(methodName, paramTypes);
				 addAtIndex.invoke(linkedList, argument1,argument2); // pass arg
				 System.out.println(methodName+"::::"+argument1+":"+argument2);
			}else if(methodName.equalsIgnoreCase("get")) {
				argument1 = argumentArray[argumentArrayCouter];
				argumentArrayCouter++;
				
				Method oneMethod = linkedList.getClass().getMethod(methodName, int.class);
				int valueAtIndex = (int) oneMethod.invoke(linkedList, argument1); // pass arg
				System.out.println(methodName+"::::"+argument1);
				System.out.println("Value at Index :: "+argument1+" ::"+valueAtIndex);
			}else if(methodName.equalsIgnoreCase("printLinkedList")) {
				
				Method oneMethod = linkedList.getClass().getMethod(methodName);
				oneMethod.invoke(linkedList);
				System.out.println(methodName+"::::");
			}else {
				argument1 = argumentArray[argumentArrayCouter];
				argumentArrayCouter++;
				
				Method oneMethod = linkedList.getClass().getMethod(methodName, int.class);
				oneMethod.invoke(linkedList, argument1); // pass arg
				System.out.println(methodName+"::::"+argument1);
			}
		}
		
	}
	
	

}
