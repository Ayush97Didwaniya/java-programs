//import java.util.Scanner;
class Node{
	Node left=null,right=null;
	int value;
	public Node(int n) {
		this.value=n;
		// TODO Auto-generated constructor stub
	}
}

public class binaryTree {
	static Node start=null;
	public static void main(String...args){
		System.out.println("Tree program");	
//		System.out.println("Enter the number of element you want to insert");
//		Scanner sc=new Scanner(System.in);
		binaryTree tr1=new binaryTree();
		start = tr1.insert(5, start);
		start = tr1.insert(1, start);
		start = tr1.insert(3, start);
		start = tr1.insert(10, start);
		start = tr1.insert(11, start);
		tr1.print(start);
	}
	
	Node insert(int n, Node start){
		if(start==null){
			start=new Node(n);
		}
		else{
			if(start.value>n){
				start.left = insert(n, start.left);
			}
			else{
				start.right = insert(n, start.right);
			}
		}	
		return start;
	}
	
	void print(Node start){
		if(start!=null){
			print(start.left);
			System.out.println(start.value);
			print(start.right);
			
		}
	}
}
