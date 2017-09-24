import java.util.Scanner;
import java.util.Stack;

class StackClass {

    public static int tos = -1;
    public int size;

    public static int[] Stack = new int[5];

    public void push(int num){

        Stack[++tos] = num;
        System.out.println("value pushed is: "+Stack[tos]);

    }

    public static int pop(){

        if(tos != -1) {
            System.out.println("\n");
            return Stack[tos--];
        }
        else
        {
            System.out.println("We have reached the end of the stack");
        }
        return 0;
    }

    public boolean isEmpty(){
        return (tos == -1);
    }
}



class Mystack3{
    public static void main(String[] args){
        StackClass stackClass = new StackClass();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 values to insert\n ");

        int[] value = new int[5];

        for(int i=0; i< stackClass.Stack.length; i++){

            value[i] = scanner.nextInt();


        }
        for(int i=0; i< stackClass.Stack.length; i++){


            stackClass.push(value[i]);

        }



        while(!stackClass.isEmpty()) {

            System.out.println("value popped is: " + StackClass.pop());

        }


    }
}
