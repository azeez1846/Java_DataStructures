import java.util.*;
public class SingleLinkedList {


    public static void display(LinkNode head) {
        if (head == null) {
            return;
        }
        LinkNode current = head;

        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print(current);
    }

    public LinkNode insertAtBeginning(LinkNode head, int data) {


        LinkNode newNode = new LinkNode(data);

        if (head == null) {
            return newNode;
        } else {
            newNode.next = head;
            head = newNode;
            return newNode;
        }

    }

    public LinkNode insertAtLast(LinkNode head, int data) {

        LinkNode newNode = new LinkNode(data);

        if (head == null) {
            return newNode;
        }
        LinkNode current = head;
        while (null != current.next) {
            current = current.next;
        }

        current.next = newNode;
        return head;

}

    public LinkNode insertAfter(LinkNode previous, int data){

        if(previous == null){
            System.out.println("The previous node value is null: ");

        }

        LinkNode newNode = new LinkNode(data);
        newNode.next = previous.next;
        previous.next = newNode;

        return previous;

    }

    public LinkNode deleteAtFirst(LinkNode head){
        LinkNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public LinkNode deleteAtLast(LinkNode head){
        LinkNode last = head;
        LinkNode previousToLast = null;

        while(last.next != null){
            previousToLast = last;
            last = last.next;
        }

        previousToLast.next = null;
        return last;
    }

    public LinkNode deleteAtPosition(LinkNode head, int position){

        int size = 4;
        if(position > size || position < 1){
            System.out.println("Invalid position ");
            return head;
        }

        if(position == 1){
            LinkNode temp = head;
            head = head.next;
            temp.next = null;
            return temp;
        }
        else {
            LinkNode previous = head;
            int count = 1;
            while(count< position -1){
                previous = previous.next;
                count++;
            }
            LinkNode current = previous.next;
            previous.next = current.next;
            current.next = null;
            return current;
        }

    }


    public static class LinkNode{
        public int data;
        LinkNode next;
        LinkNode(int data){
            this.data = data;
            this.next = null;

        }
    }

    public static void LinkedListLength(LinkNode head){

        LinkNode current = head;

        int count=0;
        if(head==null){
            System.out.println("The length is zero ");

        }
        while(current!=null){
            count++;
            current = current.next;

        }
        System.out.println("\nThe length of the LinkedList is: "+count);
    }

    public static void main(String[] args){


        LinkNode head = new LinkNode(10);
        LinkNode second = new LinkNode(20);
        LinkNode third = new LinkNode(30);
        LinkNode fourth = new LinkNode(40);



        head.next = second;
        second.next = third;
        third.next = fourth;
        //LinkNode newNode = new LinkNode(5);

        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.display(head);
        /*singleLinkedList.LinkedListLength(head);
        LinkNode newHead = singleLinkedList.insertAfter(second, 15);
        //newHead = singleLinkedList.insertAfter(second, 15);
        System.out.println("After adding the new element: ");
        singleLinkedList.display(head);*/

        LinkNode thirdNode = singleLinkedList.deleteAtPosition(head, 3);
        System.out.println("\n the deleted data at position 3 is:  "+thirdNode.data);

        singleLinkedList.display(head);




    }
}
