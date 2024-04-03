public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    //  nested NODE CLASS :
    class Node {
        int value;
        Node next;

        // Node constructor -> creates a node
        Node(int value) {
            this.value = value;
        }
    }
    // LinkedList Constructor -> creates a LnkedList , Node + Head + Tail
    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    //Prints The LinkedList:
    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    //Prints The Head Of LL:
    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    //Prints The Tail Of LL:
    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    //Prints The Length Of LL:
    public void getLength() {
        System.out.println("Length: " + length);
    }

    // Adds A node To the End ( After the lastNode ) of LL:
    public void append(int value){
        Node newNode = new Node(value);
        if (length == 0){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }


    //Removes the LastNode (END) of LL and returns it:
    public Node removeLast(){
        if (length == 0) return null;
        Node temp = head;
        Node pre = head;
        while (temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0){
            head = null;
            tail = null;
        }
        return temp;

    }

    //Adds a Node to the start of LL (before head and makes that new head):
    public void prepend(int value){
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    //Removes the head(0) of LL and next(1) is made head and returns head(0):
    public Node removeFirst(){
        if (length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next =null;
        length--;
        if (length == 0){
            tail = null;
        }
        return temp;

    }

    //Returns the Node at the index requested:
    public Node get(int index){
        if (index < 0 || index >= length){
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }


    //SET method changes the value of a Node at an index:
    public boolean set(int index, int value){
        Node temp = get(index);
        if (temp != null){
            temp.value = value;
            return true;
        }
        return false;

    }

    //Inserts a node at an index:
    public boolean insert (int index, int value){
        if (index < 0 || index > length) return false;
        if (index == 0){
            prepend(value);
            return true;
        }
        if (index == length){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index -1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;

    }


    //Removes a node at an index:
    public Node remove(int index){
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length - 1 ) return removeLast();
        Node pre = get(index - 1);
        Node temp = pre.next;
        pre.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    //Reverses the LinkedList:
    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;

        Node after = temp.next;
        Node before = null;

        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;

        }
    }




}


