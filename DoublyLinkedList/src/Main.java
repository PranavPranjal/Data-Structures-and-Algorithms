public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(7);
//   APPEND METHOD :
        myDLL.append(2);
        myDLL.append(5);

        myDLL.printList();

//   REMOVELAST METHOD:
        System.out.println(myDLL.removeLast().value);
        System.out.println(myDLL.removeLast().value);
        System.out.println(myDLL.removeLast());






    }

}
