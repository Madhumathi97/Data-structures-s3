
import java.util.Scanner;
import java.util.Stack;
class Practice
{
	public static void main(String args[])
	{
		int ch,v,source;
		Scanner scan = new Scanner(System.in);
			
		do
		{
			try
			{
				System.out.println("Enter the number of vetices");
				v =  scan.nextInt();
				int adjacency_matrix[][] = new int[v +1][v + 1];
				System.out.println("Enter the adjacency matrix is : ");
				for(int i=1;i<=v;i++)
				{
					for(int j=1;j<=v;j++)
					{
						adjacency_matrix[i][j] = scan.nextInt();
					}
				}
				System.out.println("Enter the source vetice");
				source = scan.nextInt();

				System.out.println("THe dfs traversal for the graph is : " );
				DFS dfs = new DFS();
				dfs.dfs(adjacency_matrix,source);
				
			}
			catch(Exception E)
			{
				System.out.println("Something went wrong");
			}
			System.out.println("Enter 1 if you wish to continue.");
			ch = scan.nextInt();
		}while(ch == 1);
	}
}
 class DFS
{
    private Stack<Integer> stack;
 
    public DFS() 
    {
        stack = new Stack<Integer>();
    }
 
    public void dfs(int adjacency_matrix[][], int source)
    {
        int number_of_nodes = adjacency_matrix[source].length - 1;

        int visited[] = new int[number_of_nodes + 1];		

        int element = source;		
        int i = source;		

	
        System.out.print( element + "\t");		
        visited[source] = 1;		
        stack.push(source);
 
        while (!stack.isEmpty())
        {
            element = stack.peek();
            i = element;	
	    while (i <= number_of_nodes)
	    {
     	        if (adjacency_matrix[element][i] == 1 && visited[i] == 0)
	        {
                    stack.push(i);
                    visited[i] = 1;
                    element = i;
                    i = 1;
                    System.out.print(element + "\t");
	            continue;
                }
               i++;
	    }
            stack.pop();	
        
}
}	
}   
