#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

typedef struct Node
{
    int data;
    struct Node* next;
}Node;

Node* removeDuplicates(Node *head){
  //Write your code here
  Node *ptr,*prev,*chn;
      int i,f;
  if(head==NULL){
      return;
  }
  else{
      
      ptr=head;
      while(ptr->next!=NULL){
          i=ptr->data;
          prev=ptr;
          f=0;
          while(prev->next!=NULL){
              chn=prev;
              prev=prev->next;
              if(prev->data==i){
                  chn->next=prev->next;
                  f=1;
                  break;
              }
          }
          if(f==0){
              ptr=ptr->next;
          }
      }
      return head;
  }  
}

Node* insert(Node *head,int data)
{
  Node *p = (Node*)malloc(sizeof(Node));
  p->data = data;
  p->next=NULL;   
  
  if(head==NULL){
   head=p;  
  
  }
  else if(head->next==NULL)
  {
      head->next=p;
      
  }
  else{
  Node *start=head;
  while(start->next!=NULL)
    start=start->next;
  
  start->next=p;   
  
  }
      return head;
}
void display(Node *head)
{
	Node *start=head;
	while(start)
	{
		printf("%d ",start->data);
		start=start->next;
	}
}
int main()
{
	int T,data;
    scanf("%d",&T);
    Node *head=NULL;	
    while(T-->0){
        scanf("%d",&data);
        head=insert(head,data);
    }
    head=removeDuplicates(head);
	display(head);
		
}


