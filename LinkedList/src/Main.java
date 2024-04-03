public class Main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(2);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.append(3);

        //REMOVE LAST
        System.out.println(myLinkedList.removeLast().value);
//        System.out.println(myLinkedList.removeLast());
//        System.out.println(myLinkedList.removeLast());
//        myLinkedList.prepend(1);
//
//        myLinkedList.printList();
//        System.out.println(myLinkedList.removeFirst().value);

//        myLinkedList.removeLast();
//        myLinkedList.printList();

        // GET METHOD
        LinkedList myLinkedList1 = new LinkedList(0);
        myLinkedList1.append(1);
        myLinkedList1.append(2);
        myLinkedList1.append(3);

        System.out.println(myLinkedList1.get(2).value + "\n");

        myLinkedList1.printList();

        // SET METHOD
        LinkedList myLinkedList2 = new LinkedList(11);
        myLinkedList2.append(3);
        myLinkedList2.append(23);
        myLinkedList2.append(7);
        myLinkedList2.append(5);
        myLinkedList2.printList();


//        myLinkedList2.set(1,4);

//        myLinkedList2.printList();

    }
}
