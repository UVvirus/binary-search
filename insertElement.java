public class insertElement
{  Node root;
//creating new node
public void addNode(int value){
	//node obj creation
	Node newNode=new Node(value);
	//checking is root is empty
	if(root==null){
		root=newNode;
	}else{
		//else we will start from root
		Node focusNode=root;
		
		Node parent=focusNode;
		while(true){
			if(value<focusNode.value){
               focusNode=focusNode.left;
			   //if left side has no node then
			   //creation of new node
			   if(focusNode==null){
				   parent.left=newNode;
			   }
			}else{
				focusNode=focusNode.right;
				
				if(focusNode==null){
					parent.right=newNode;
				}
			}
		}
	}
	
}
	public class Node{
		int value;
		Node left,right;
		//constructor
		public Node(int value){
			this.value=value;
			Node left=null;
			Node right=null;
		}
	
	}
}
