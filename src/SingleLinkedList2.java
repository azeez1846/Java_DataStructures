class Link2{
    public int data;
    public double ddata;
    public Link2 next;

    Link2(int data, double ddata){

        this.data = data;
        this.ddata = ddata;
    }

    public void display(){
        System.out.println("existing data: "+data+" and "+ddata);
    }
}

class LinkList2{

    Link2 first;

    public LinkList2(){
        first = null;
    }

    public boolean isEmpty(){

        return (first==null);

    }

    public void insertElement(int data, double ddata){

        Link2 newNode = new Link2(data, ddata);

        newNode.next = first;
        first = newNode;

    }

    public void insertLast(int data, double ddata){

        Link2 newNode = new Link2(data, ddata);
        Link2 current = first;
        while(null != current.next){
            current = current.next;
        }

        current.next = newNode;

    }

    public Link2 deleteFirst()
    {
        Link2 temp = first;
        first = first.next;
        return temp;
    }


    public void displayAll(){

        System.out.println("displaying the elements: ");

        Link2 current = first;

        while(current != null){

            current.display();
            current = current.next;


        }
    }
}

public class SingleLinkedList2 {

    public static void main(String[] args){

        LinkList2 linkList2 = new LinkList2();

        linkList2.insertElement(10,12.2);
        linkList2.insertElement(20,22.2);
        linkList2.insertElement(30,32.2);
        linkList2.insertElement(40,42.2);
        linkList2.insertElement(50,52.2);
        //linkList2.displayAll();

        linkList2.insertLast(60,62.2);
        linkList2.displayAll();


        System.out.println("Started deleting the elements: ");

        while(!linkList2.isEmpty()){
            Link2 link2 = linkList2.deleteFirst();
            System.out.print("Deleted: ");
            link2.display();
            System.out.println(" ");
        }





    }

}
