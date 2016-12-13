import java.util.Scanner;
import java.util.*;
class Node
{
public int data;
public Node link;

public Node()
{
link = null;
data = 0;
}    

public Node(int d,Node n)
{
data = d;
link = n;
}    
}

class linkedList
{
public Node head;
public int size ;

public linkedList()
{
head = null;
}
public void insertAtEnd(int val)
{
Node n = new Node(val, null);    
Node t=head;
if(head==null)
	head=n;
else
{

while(t.link!=null)
{
t=t.link;
}
t.link=n;
}
}
public void insertAtBeg(int val)
{
Node n = new Node(val, null);    
Node t=head;
if(head==null)
	head=n;
else
{
n.link=head;
head=n;
}
}
public void insertAtPos(int val , int pos)
{
int count=1;
Node n = new Node(val, null); 
Node m=new Node();   
Node t=head;
if(head==null)
	head=n;
else
{
if(pos==1)
{
n.link=head;
head=n;
}
else
{
while(t.link!=null&&count!=pos)
{
m=t;
t=t.link;
count++;
}
m.link=n;
n.link=t;
}
}
}

public void deleteAtPos(int pos)
{
Node m=new Node(); 
int count=1;
Node t=head;
if(pos==1)
{
head=head.link;
}
else
{
while(t!=null&&count!=pos)        
{
m=t;
t=t.link;
count++;
}
m.link=t.link;
}
}    
public boolean isEmpty()
{
if(head==null)
	return true;
else
	return false;
}

public int countNode()
{
int count=1;
Node t=head;
while(t.link!=null)
{
t=t.link;
count++;
}
return count;
}
public void display()
{
System.out.print("Singly Linked List \n");
Node t=head;
while(t!=null)
{
System.out.println(t.data);
t=t.link;
}
}
}
class SinglyLinkedList
{    
public static void main(String[] args)
{             
Scanner scan = new Scanner(System.in);

linkedList list = new linkedList(); 
System.out.println("Singly Linked List Test");          
char ch;
do
{
System.out.println("\nSingly Linked List Operations");
System.out.println("1. insert at beginning");
System.out.println("2. insert at end");
System.out.println("3. insert at position");
System.out.println("4. delete at position");
System.out.println("5. check empty");
System.out.println("6. get size");            
int choice = scan.nextInt();            
switch (choice)
{
case 1 :System.out.println("enter the value to be stored ");  
	int k=scan.nextInt();
	list.insertAtBeg(k);
	
	break;
case 2 : System.out.println("enter the value to be stored "); 
	int m=scan.nextInt();
	list.insertAtEnd(m);
	
	break;
case 3 :System.out.println("enter the value to be stored "); 
	 int l=scan.nextInt();
	System.out.println("enter the position"); 
	int pos=scan.nextInt();
	list.insertAtPos(l,pos);
	
	break;
case 4 : 
	System.out.println("enter the position"); 
	int p=scan.nextInt();
	list.deleteAtPos(p);
	
	break;
case 5 :
	System.out.println(list.isEmpty());
	break; 
	
case 6 : 
	System.out.println(list.countNode());
	break; 
default:
	System.out.println("sorry entered the wrong option!");
	break; 
}

list.display();
System.out.println("\nDo you want to continue (Type y or n) ");
ch = scan.next().charAt(0);                        
}while (ch == 'Y'|| ch == 'y');

}
}
