import java.util.LinkedList;
import java.util.List;

class LinkedListData{

    int a;
    String author;

    public void setData(int x, String y){
        this.a = x;
        this.author = y;

    }
}

public class LinkedListExample {
    public static void main(String[] args){

        List<LinkedListData> list = new LinkedList<LinkedListData>();

        LinkedListData linkedListData = new LinkedListData();
        linkedListData.setData(10,"J.K Rowling");

        list.add(linkedListData);
        LinkedListData linkedListData2 = new LinkedListData();

        linkedListData2.setData(20,"Arthur conan doyle");
        list.add(linkedListData2);
        LinkedListData linkedListData3 = new LinkedListData();
        linkedListData3.setData(30,"Rick Riordan");
        list.add(linkedListData3);

       for(LinkedListData b: list){

            System.out.println("value is: "+b.a+"The author is: "+b.author);
        }




    }
}
