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
if(head==null){
	head=n;
	head.link=head;
}
else
{
while(t.link!=head)
{
t=t.link;
}
t.link=n;
n.link=head;
}
}
public void insertAtBeg(int val)
{
Node n = new Node(val, null);    
Node t=head;
if(head==null){
	head=n;
	head.link=head;
}
else
{
while(t.link!=head)
{
t=t.link;
}
t.link=n;
n.link=head;
head=n;
}
}
public void deleteAtEnd()
{
Node m= new Node(); 
Node t=head;
while(t.link!=head)
{
m=t;
t=t.link;
}
m.link=head;
}

public void deleteAtBeg()
{
Node m= new Node(); 
Node t=head;
while(t.link!=head)
{
t=t.link;
}
t.link=head.link;
head=head.link;
}

public void deleteAtPos(int pos)
{
Node m=new Node(); 
int count=1;
Node t=head;
if(pos==1)
{
deleteAtBeg();
return;
}
else{
while(t.link!=head&&count!=pos)        
{
m=t;
t=t.link;
count++;
}
m.link=t.link;
}    
}
public void display()
{
System.out.print("Circular Linked List \n");
Node t=head;
while(t.link!=head)
{
System.out.println(t.data);
t=t.link;
}
System.out.println(t.data);
}
}

class CircularLinkedList
{    
public static void main(String[] args)
{             
Scanner scan = new Scanner(System.in);

linkedList list = new linkedList(); 
System.out.println("Circular Linked List Test");          
char ch;
do
{
System.out.println("\nCircular Linked List Operations");
System.out.println("1. insert at beginning");
System.out.println("2. insert at end");
System.out.println("3. delete at end");
System.out.println("4. delete at beginning");
System.out.println("5. delete at position");
            
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
case 3 :list.deleteAtEnd();
	break;
case 4 : 
	list.deleteAtBeg();
	break;
case 5 :
	System.out.println("enter the position to be deleted "); 
	int l=scan.nextInt();
	list.deleteAtPos(l);
	break; 
	
default:
	System.out.println("sorry wrong option!");
	break; 
}

list.display();
System.out.println("\nDo you want to continue (Type y or n) ");
ch = scan.next().charAt(0);                        
}while (ch == 'Y'|| ch == 'y');

}
}
