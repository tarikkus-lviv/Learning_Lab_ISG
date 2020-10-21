package LinkedList_for_Olexandr;

public class LinkedList {
    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;


//        excaption to check if number is below 0;
        if (data < 0){
            try {
                throw new InsertException("Your number is below zero");
            } catch (InsertException e) {
                System.err.println(e.getMessage());
                System.exit(0);
            }
        } else {
            if (head==null){
                head = node;
            } else {
                Node n = head;
                while(n.next != null){
                    n = n.next;
                }
                n.next = node;
            }
        }

    }

    public void show(){
        Node node = head;

        while (node.next!=null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}
