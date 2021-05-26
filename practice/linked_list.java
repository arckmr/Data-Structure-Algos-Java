import java.util.*;
class linked_list
{ 

// node 
static class Node 
{ 
	int data; 
	Node next; 
}; 

/* Function to insert a node 
at the beginning of a Circular 
linked list */
static Node push(Node head_ref, 
				int data) 
{ 
	Node ptr1 = new Node(); 
	Node temp = head_ref; 
	ptr1.data = data; 
	ptr1.next = head_ref; 

	/* If linked list is not null 
	then set the next of last node */
	if (head_ref != null) 
	{ 
		while (temp.next != head_ref) 
			temp = temp.next; 
		temp.next = ptr1; 
	} 
	else
		ptr1.next = ptr1; 

	head_ref = ptr1; 
	
	return head_ref; 
} 


public static void main(String args[]) 
{  Scanner sc = new Scanner(System. in); int n=0;int t=0;int k=0;int x=0;
    int y=0; Node head;
	       if(sc.hasNextInt()) 
	       t=sc.nextInt(); 
	
	for(int i=0;i<t;i++)
	{ n=sc.nextInt();  head= null; 
	    for(int j=1;j<=n;j++)
	    {
	        head=push(head,j);
	      
            }
        }
	
} 
} 

// This code is contributed 
// by Arnab Kundu 
