#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

typedef struct Node{
    struct Node* left;
    struct Node* right;
    int data;
}Node;
Node* newNode(int data){
    Node* node=(Node*)malloc(sizeof(Node));
    node->left=node->right=NULL;
    node->data=data;
    return node;
}
int height(Node* root)
{
    if (root==NULL) 
        return 0; 
    else
    { 
        int l= height(root->left); 
        int r= height(root->right); 
  
        if (l > r) 
            return l+1; 
        else 
            return r+1; 
    }
}
void levelorderPrint(Node *root,int l){
    if(root==NULL){
        return;
    }
    if(l==1){
        printf("%d ",root->data);
    }
    else if(l>1){
        levelorderPrint(root->left,l-1);
        levelorderPrint(root->right,l-1);
    }
}
void levelOrder(Node* root){
  //Write your code here
  int h=height(root);
  int i;
  for(int i=1;i<=h;i++)
  {
      levelorderPrint(root,i);
  }
}

Node* insert(Node* root,int data){
    if(root==NULL)
        return newNode(data);
    else{
        Node* cur;
        if(data<=root->data){
            cur=insert(root->left,data);
            root->left=cur;                
        }
        else{
            cur=insert(root->right,data);
            root->right=cur;
        }
        
    }
    return root;
}
int main(){
    Node* root=NULL;
    int T,data;
    scanf("%d",&T);
    while(T-->0){
        scanf("%d",&data);
        root=insert(root,data);
    }
    levelOrder(root);
    return 0;
    
}

