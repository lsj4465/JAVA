public class StringLinkedList {
		private Node head;
		private Node tail;
		private int size = 0;

		private class Node{

			public String data;
			public Node next;
			public Node(String input) {
				this.data = input;
				this.next = null;
			}
			
		}
	
	    void add(String input){ 
		
		Node temp = new Node(input);
		if(size == 0){
			
			temp.next = head;
			head = temp;
			size++;
			if(head.next == null){
				tail = head;
		} else {
			tail.next = temp;
			tail = temp;
			size++;
		}
		}
	}
			
			void add(int idx, String input){ 
		
			Node temp1 = head;
			for(int i=0; i<idx-1; i++){
				temp1 = temp1.next;
			}
			Node temp2 = temp1.next;
			Node newNode = new Node(input);
			temp1.next = newNode;
			newNode.next = temp2;
			size++;
		
			if(newNode.next == null){
				tail = newNode;
			}
		
	}
	

	   void remove(int k){

		Node temp = head;

        for(int i=0; i<k-1; i++){
            temp = temp.next;
        }
	}
	
	public int size(){
		return size;
	}
	
	public String get(int k){
		
		Node temp = head;

		for(int i=0; i<k; i++){
			temp = temp.next;
		}
		return temp.data;
	}
	
}