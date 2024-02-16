package assignment6;

public class Fixed_stk implements Interface_STK
{
	private int stack[] = new int[5];
	int top = -1;

	public int[] getStack() {
		return stack;
	}

	public void setStack(int[] stack) {
		this.stack = stack;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	@Override
	public void push(int e) {
		if(isFull())
		{
			System.out.println("Memory Limit Reached!!");
		}
		else
		{
			top = top+1;
			stack[top] = e;
		}
		
	}

	@Override
	public int pop() {
		int elem;
		if(isEmpty()) {
			return -1;
		}
		else {
			elem = stack[top];
			top--;
			return elem;
		}
			
	}

	@Override
	public void displayStack() {
		if (isEmpty())
		{
			System.out.println("Memory Empty!!");
		}
		else
		{
			for(int i = 0;i<=top;i++)
			{
				System.out.println(stack[i]+" ");
			}
		}
		
	}

	@Override
	public boolean isFull() {
		if (top == (stack.length-1))
			return true;
		else
			return false;
	}

	@Override
	public boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}
	
}
