/*
Name:Madhumathi
Roll No:u4cse15256
*/
public class MyStack {

	
	
	private static int size=10;
	int[] A = new int[size];
	char[] B = new char[size];
	int top = -1;
	
	public void push(int x)
	{
		if(top == size)
			System.out.println("Overflow");
		else
		{
			top++;
			A[top] = x;
		}
	}
	
	public void push(char ch)
	{
		if(top == size)
			System.out.println("Overflow");
		else
		{
			top++;
			B[top] = ch;
		}
	}
	
	public void pop()
	{
		if(top == -1)
			System.out.println("Underflow");
		else
		{
			top--;
		}
	}
	
	public int getTop()
	{
		return A[top];
	}
	
	public int getSize()
	{
		return top+1;
	}
	
	public boolean isEmpty()
	{
		if(top == -1)
			return true;
		else
			return false;
	}

	public boolean isFull()
	{
		if(top == size)
			return true;
		else
			return false;
	}
	
	public void display()
	{
		for(int i=0;i <= top;i++)
			System.out.println(A[i]);
	}
	
	public void parenthesis(String s)
	{
		top=-1;
		for(int i=0;i < s.length();i++)
		{
			if(s.charAt(i) == '(' || s.charAt(i) == '{' ||s.charAt(i) == '['  )
			{
				push(s.charAt(i));
			}
			
			if(s.charAt(i) == ')' || s.charAt(i) == '}' ||s.charAt(i) == ']'  )
			{
				if(top != -1)
				{
					if(s.charAt(i) == ')')
					{
						if(B[top] == '(')
						{
							pop();
						}
					}
					
					if(s.charAt(i) == '}')
					{
						if(B[top] == '{')
						{
							pop();
						}
					}
					
					if(s.charAt(i) == ']')
					{
						if(B[top] == '[')
						{
							pop();
						}
					}
				}	
			}
		}
		
		if(isEmpty())
		{
			System.out.println("Balanced");
		}
		else
			System.out.println("Not Balanced");
			
		
	
	
		}
	}

	class MyStackTest
	{

		public static void main(String args[]){
		MyStack S=new MyStack();
		S.parenthesis("{()()()[{}]}");
		S.pop();
	}
}
