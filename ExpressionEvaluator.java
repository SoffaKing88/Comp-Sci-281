//Nick Soffa
//Comp Sci 281
//11-13-14

import java.io.*;
import java.util.*;

public class ExpressionEvaluator{
	public static void main(String args[]) throws IOException{
		//LinkedList that args values will be stored in
		CustomizedStack stack = new CustomizedStack();
		//Operators to look out for in args
		String operators = "+-x/%";
		//variables for using Operators on stored numbers
		int firstNum = 0;
		int secondNum = 0;
		int endValue = 0;

		for (String s: args) {
			if(!operators.contains(s)) {
				stack.push(Integer.valueOf(s));
			} else {
				firstNum = stack.pop();
				secondNum = stack.pop();
				switch (s) {
					case "+":
						stack.push(Integer.valueOf(firstNum + secondNum));
						break;
					case "-":
						stack.push(Integer.valueOf(secondNum - firstNum));
						break;
					case "x":
						stack.push(Integer.valueOf(firstNum * secondNum));
						break;
					case "/":
						stack.push(Integer.valueOf(secondNum / firstNum));
						break;
					case "%":
						stack.push(Integer.valueOf(secondNum % firstNum));
						break;
				}
			}
		}
		endValue = Integer.valueOf(stack.pop());

		System.out.print(endValue);

	}
}

class CustomizedStack {

	private Node front;
	private int stackCount;

	public CustomizedStack() {

		front = null;
	}

	public void push(int data) {

		Node temp = new Node(data);
		Node current = new Node(front.getData(front));

		current.setData(temp.getData(temp));
		current.setNext(front);
		front = current;
	}

	public int pop(){

		Node current = front;
		int temp = current.getData(current);
		front = new Node(front.getNext(), null);

		return temp;
	}

	private class Node {

		Node next;
		int data;
		int bValue;

		public Node(int value){

			next = null;
			data = value;
		}

		public Node(int value, Node nextValue){
			next = nextValue;
			bValue = getData(nextValue);
			data = value;
		}

		public int getData(Node thisNode){
			return data;
		}

		public void setData(int value){
			data = value;
		}

		public int getNext(){
			return bValue;
		}

		public void setNext(Node nextValue){
			next = nextValue;
		}
	}
}