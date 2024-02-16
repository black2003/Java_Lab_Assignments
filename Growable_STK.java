package assignment6;

import java.util.ArrayList;

public class Growable_STK implements Interface2
{
	ArrayList<Integer> stack;
	int top = -1;
	public Growable_STK() {
		stack = new ArrayList<Integer>(5);
		this.top = -1;
	}
	@Override
	public void push(int element)
	{
	stack.add(++top, element);
	}
	@Override
	public int pop() {
	if(isEmpty())
	{
	System.out.println("Stack is Empty");
	}
	else
	{
	int element = stack.get(top);
	stack.remove(top--);
	return element;
	}
	return -1;
	}
	@Override
	
	public void displayStack() {
	// TODO Auto-generated method stub
	for(int x:stack)
	{
	System.out.print(x + " ");
	}
	System.out.println("");
	}
	@Override
	public boolean isFull()
	{
	System.out.println("Not applicable for growable stack");
	return false;
	}
	@Override
	public boolean isEmpty()
	{
	if (top == -1)
	{
	return true;
	}
	else
	{
	return false;
	}
	}
	
}
