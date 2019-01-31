public class StringArrayList {
    public int capacity;
    public String[] arrList;
    public int size;

    public StringArrayList() {
        this.capacity = 10;
        this.size = 0;
        arrList = new String[this.capacity];
    }

    public StringArrayList(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.arrList = new String[this.capacity];
    }


    void add(String string) {
        if (isFull())
            esureCapacity();
        this.arrList[size++] = string;
    }

    void add(int idx, String string) {
        if (idx < this.size){
            if (isFull())
                esureCapacity();
            for(int i = this.size;i>idx;i--){
                arrList[i+1] = arrList[i];
            }
            this.arrList[idx] = string;
        }
    }

    String get(int idx) {
        if (idx < size)
            return this.arrList[idx];
        else return "error";
    }

    void remove(int idx) {
        if (idx < size) {
            this.arrList[idx] = null;
        }
    }

    boolean isEmpty() {
        if (size == 0)
            return true;
        else return false;
    }
    boolean isFull(){
        if(size == capacity)
            return true;
        else return false;
    }

    int size() {
        return this.size;
    }

    void esureCapacity() {
        String[] tempList = new String[this.capacity + 10];
        arrList = tempList;
        this.capacity += 10;
    }
}

