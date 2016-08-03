/*
Name:Madhumathi
Roll No:u4cse15256
*/
public class StackDemo
{

	private static int n_size=10;
	int A[]=new int[n_size];
	char B[]=new char[n_size];
	int i;
	int top=-1;

	public void push(int x)
	{
		if(!isFull()){
		top++;
		A[top]=x;
		System.out.println("Inserted "+x);
		}
	}

	public void pop()
	{
		if(!isEmpty())
		top--;
	}

	public void displayElements()
	{
		for(int i=0;i<=top;i++)
		{
		System.out.println(A[i]);
		}
	}

	public int getSize()
	{
		return top+2;
	}

	public int getTop()
	{
	return A[top];
	}

	public boolean isEmpty()
	{
		if(top==-1)
		return true;
		else
		return false;
	}

	public boolean isFull()
	{
		if (top==n_size-1)
		return true;
		else 
		return false;
	}
	public static void main(String[] args) 
	{
		StackDemo s = new StackDemo();
		s.push(5);
		//Try push on a full stack
		s.push(10);
		s.pop();
		//Try pop on empty stack
		int n=s.getSize();
		//print n
		System.out.println("size is "+n);
		int m= s.getTop();
		
	}
}

