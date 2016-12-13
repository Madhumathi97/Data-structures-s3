import java.util.Scanner;
import java.util.*;
class Node
{
public int data;
public Node next;
public Node prev;

public Node()
{
next = null;
prev = null;
data = 0;
}    

public Node(int d,Node n,Node m)
{
data = d;
next= n;
prev=m;
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

public void insertAtBeg(int val)
{
Node n = new Node(val, null,null);    
Node t=head;
if(head==null)
	head=n;
else
{
n.next=head;
head.prev=n;
head=n;
}
}
public void insertAtPos(int val , int pos)
{
int count=1;
Node n = new Node(val, null,null);  
Node t=head;
if(head==null)
	head=n;
else
{
if(pos==1)
{
n.next=head;
head.prev=n;
head=n;
}
else
{
while(t.next!=null&&count!=pos)
{
t=t.next;
count++;
}
(t.prev).next=n;
n.prev=t.prev;
n.next=t;
t.prev=n;
}
}
}

public void deleteAtEnd()
{
Node t=head;
while(t.next!=null)        
{
t=t.next;
}
t=t.prev;
t.next=null;
}    

public void deleteAtPos(int pos)
{ 
int count=1;
Node t=head;
if(pos==1)
{
(head.next).prev=null;
head=head.next;

}
else
{
while(t.next!=null&&count!=pos)        
{
t=t.next;
count++;
}
(t.prev).next=t.next;
(t.next).prev=t.prev;
}
}    

public void displayFor()
{
System.out.print("Doubly Linked List in forward order \n");
Node t=head;
while(t!=null)
{
System.out.println(t.data);
t=t.next;
}
}

public void displayBack()
{
System.out.print("Doubly Linked List in backward order \n");
Node t=head;
while(t.next!=null)
{

t=t.next;
}
while(t!=null)
{
System.out.println(t.data);
t=t.prev;
}
}
}
class DoublyLinkedList
{    
public static void main(String[] args)
{             
Scanner scan = new Scanner(System.in);

linkedList list = new linkedList(); 
System.out.println("Doubly Linked List Test");          
char ch;
do
{
System.out.println("\nDoubly Linked List Operations");
System.out.println("1. insert at beginning");
System.out.println("2. insert at position");
System.out.println("3. delete at end");
System.out.println("4. delete at position");
System.out.println("5. display in forward order");
System.out.println("6. display in backward order");            
int choice = scan.nextInt();            
switch (choice)
{
case 1 :System.out.println("enter the value to be stored ");  
	int k=scan.nextInt();
	list.insertAtBeg(k);
	list.displayFor();
	break;
case 2 : System.out.println("enter the value to be stored "); 
	int m=scan.nextInt();
	System.out.println("enter the position "); 
	int p=scan.nextInt();
	list.insertAtPos(m,p);
	list.displayFor();
	break;
case 3 :
	list.deleteAtEnd();
	list.displayFor();
	break;
case 4 : 
	System.out.println("enter the position"); 
	int j=scan.nextInt();
	list.deleteAtPos(j);
	list.displayFor();
	break;
case 5 :
	list.displayFor();
	break; 
	
case 6 : 
	list.displayBack();
	break; 
default:
	System.out.println("sorry entered the wrong option!");
	break; 
}


System.out.println("\nDo you want to continue (Type y or n) ");
ch = scan.next().charAt(0);                        
}while (ch == 'Y'|| ch == 'y');

}
}
