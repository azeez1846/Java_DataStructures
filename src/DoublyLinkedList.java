class Link3 {

    int data;
    Link3 previous;
    Link3 next;

    public Link3(int data) {
        this.data = data;
        previous = null;
        next = null;
    }

    public void display() {

        System.out.println("data currently is: " + data);
    }

}

class LinkNode3{

    Link3 head;
    Link3 tail;

       public LinkNode3(){
           head = null;
           tail = null;
        }

        public boolean isEmpty(){
           return (head==null);
    }

    public void insertNodeAtBeginning(int data){

        Link3 newNode = new Link3(data);

            if(isEmpty()){
                tail = newNode;
            }


        newNode.next = head;
        head = newNode;



    }
    public boolean insertNodeAtPosition(int key, int data){


        Link3 current = head;
        Link3 temp;


        while(current.data != key){

            current = current.next;
            if(current == null)
                return false;

        }
        Link3 newNode = new Link3(data);
        if(current==tail) // if last link,
        {
            newNode.next = null;
            tail = newNode;
        }
        else
        {

            /*newNode.next = current.next;

            current.next.previous = newNode;*/
            temp = current.next;
            current.next = newNode;
            newNode.previous = current;
            newNode.next = temp;
        }
        /*newNode.previous = current;
        current.next = newNode; //*/
        return true;


    }

    public void displayNodeValues(){

        Link3 current = head;

        while(current != null){

            current.display();

            current = current.next;
        }
    }
}

public class DoublyLinkedList {

    public static void main(String[] args) {

        LinkNode3 linkNode3 = new LinkNode3();
        linkNode3.insertNodeAtBeginning(20);
        linkNode3.insertNodeAtBeginning(30);
        linkNode3.insertNodeAtBeginning(40);
        linkNode3.insertNodeAtBeginning(60);
        linkNode3.displayNodeValues();
        System.out.println("After inserting the element at 3rd position\n ");
        linkNode3.insertNodeAtPosition(30,50);
        linkNode3.displayNodeValues();

    }
}
