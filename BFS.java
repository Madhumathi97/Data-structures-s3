
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
class BFSTraversal
{

	Queue<Integer> queue;
	public BFSTraversal()
	{
		queue = new LinkedList();
	}

	//method for breadth first travesal
	public void bfs(int adj_Matrix[][],int source)
	{
		int vertices = adj_Matrix[source].length - 1;
		int visited[] = new int[vertices + 1];
		int element,i;
		visited[source] = 1;
		queue.add(source);
		while(!queue.isEmpty())
		{

			element = queue.remove();
			i = element;
			System.out.print(i + "\t");
			while(i<=vertices)
			{
				if(adj_Matrix[element][i] == 1&&visited[i] == 0)
				{
					queue.add(i);
					visited[i]= 1;
				}i++;
			}
		}
	}
}

class BFS
{
		
			public static void main(String args[])
			{
				try
				{
					Scanner scan = new Scanner(System.in);
					int v,source;
					System.out.println("Enter the number of vertices : " );
					v = scan.nextInt();
					int[][] adjacency_Matrix = new int[v+1][v+1];
					System.out.println("Enter the adjacency matrix : ");
					for(int i = 1;i<=v;i++)
					{
						for(int j = 1;j<=v;j++)
						{
							adjacency_Matrix[i][j] = scan.nextInt();
						}
					} 	
		
					System.out.println("enter the source: " );
					source = scan.nextInt();

					BFSTraversal bfs = new BFSTraversal();
					System.out.println("The bfs traversal is : " );
					bfs.bfs(adjacency_Matrix,source);
				}	

			
				catch(Exception E)
				{
					System.out.println("Opps something went wrong!");
				}
			}
}
