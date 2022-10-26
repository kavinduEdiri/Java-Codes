import java.util.Scanner;

public class practice {



   /* public static void PrintMyData(){
        System.out.println("kavindu prabhshana Edirisinghe");
        System.out.println("Full stack Developer");

    }




    public static void MyDetails(){
        System.out.println("my Details.......!");
    } */



    /* public static void method1(){
        System.out.println("method 1 is calling!");
    }


    public static void method1(int x){
        System.out.println("method 2 is calling!");
    }



    public static void method1(float x){
        System.out.println("method 3 is calling!");
    } */





    public static void main(String[] args) {
        //System.out.println("Hi");

        //System.out.println("Count:" + (100+200));
        //System.out.println("Count:" + 100+200);


       /* int num1=100;
        int num2=200;

        int total=num1 +num2;
        System.out.println("Total is :" + total); */



        //byte b=100;
        //System.out.println("B is :" + b);

        //int x;
        //x =100;
        //System.out.println("X is :"  + x);



        /*int x,y,z;
        x=100;
        y=200;
        z=300;

        int total = x+y+z;
        System.out.println("Total is :" + total); */





        //String name="kavindu";
        //System.out.println("Name is :" + name);



        //int x=100;
        //System.out.println(x++);
        //System.out.println(x++);
        //System.out.println(++x);


        /* Scanner input=new Scanner(System.in);
        System.out.println("Enter your Details:");

        int value= input.nextInt();
        System.out.println("Entered value is :" +value); */



        /* Scanner input=new Scanner(System.in);
        System.out.println("Enter Your Name:" );

        String name = input.next();
        System.out.println("Your name is :" +name); */



        /* Scanner input= new Scanner(System.in);
        System.out.println("please enter your Marlks;");

        int marks = input.nextInt();
        System.out.println("Your Enter mark is:" +marks);

        if(marks>75){
            System.out.println("A Grade!");
        }


        else if (marks>65) {
            System.out.println("B Grade!");

        }


        else if (marks>55) {
            System.out.println("C Grade!");

        }


        else if (marks > 35) {
            System.out.println("S Grade!");

        }

        else if (marks>0) {
            System.out.println("Fail!");

        }

        else {
            System.out.println("Enter mark is Invalied!");
        } */


        /*for (int i = 0; i < 10; i++) {
            System.out.println("Hello Java");

        } */


        /*for (int i = 0; i < 10; i+=2) {
            System.out.println("Ful Stack developer!");

        } */


        /*System.out.print("[");

        for (int i = 0; i < 10; i++) {
            System.out.print(i);


        }

        System.out.println("]"); */





        /*int total=0;

        Scanner input=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter Number:");
            int num = input.nextInt();
            System.out.println("Number is :" +num);




            total=total + num;


        }
        System.out.println("Total is :" +total); */

       /* int x =0;
       while (x<10){
           System.out.println("Hi Full stack Developer!");
           x=x+1;
       } */





        //PrintMyData();
        //MyDetails();


        //method1();
        //method1(10);
        //method1((int) 2.3);




        /*int array[]=new int[5];
        array[0]=10;
        array[1]=10;
        array[2]=10;
        array[3]=10;
        array[4]=10;


        System.out.println(array);*/




        Box b1 =new Box();
        b1.weight=10;
        b1.height=10;
        b1.length=10;

        b1.PrintVolume();








    }


}










 class Box{
    int length;
    int height;
    int weight;

public void PrintVolume(){
    int volume=length * height *weight;
    System.out.println("Volume is :" +volume);
}

}
