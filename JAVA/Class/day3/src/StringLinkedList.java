
public class StringLinkedList {
	Node head;
	Node tail;

	int size;

	public StringLinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public class Node {
		String value;
		Node next;

		public Node(String value) {
			this.value = value;
		}
	}


	void add(String value) {
		Node temp = new Node(value);
		Node ptr = this.head;
		if (size == 0) {
			this.head = temp;
			this.tail = temp.next;
			size++;
		} else {
			for (int i = 0; i < size-1; i++) {
				ptr = ptr.next;
			}
			ptr.next = temp;
			temp.next = this.tail;
			size++;
		}
	}

	void add(int index, String value) {
		Node ptr = this.head;
		Node temp = new Node(value);
		if (index <= size) {
			if(index == 1){
				temp.next = head;
				this.head = temp;
			}
			else{
				for (int i = 0; i < index-1; i++) {
					ptr = ptr.next;
				}
				temp.next = ptr.next;
				ptr.next = temp;
			}
			size++;
		}
	}

	String get(int index) {
		Node ptr = this.head;
		if (index < size) {
			for (int i = 0; i < index-1; i++)
				ptr = ptr.next;
			return ptr.value;
		}
		else return "error";
	}

	void remove(int index) {
		Node ptr = this.head;
		if (index<size){
			for(int i = 0;i<index-2;i++){
				ptr = ptr.next;
			}
			ptr.next = ptr.next.next;
			size--;
		}
	}


	int size(){
		return size;
	}

	void show(){
		Node ptr = this.head;
		for(int i = 0; i<size;i++){
			System.out.print(ptr.value+" ");
			if(ptr.next != null)
				ptr = ptr.next;
		}
	}

}