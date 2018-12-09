public class LinkedList {

	public static void main(String[] args) {
		// Creating object of class linked list 
        java.util.LinkedList<String> object = new java.util.LinkedList<String>(); 
  
        // Adding elements to the linked list 
        object.add("A"); 
        object.add("B"); 
        object.addLast("C"); 
        object.addFirst("D"); 
        object.add(2, "E"); 
        object.add("F"); 
        object.add("G"); 
        System.out.println("Linked list : " + object); 
        
        object.removeFirst();
        object.removeLast();
        System.out.println(object);
        
	}
}
