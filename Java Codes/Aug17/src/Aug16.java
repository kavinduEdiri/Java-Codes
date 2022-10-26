import java.util.Scanner;

public class Aug16 {
    public static void main(String[] args) {
        System.out.println("hi");


        int x;
        x=100;
        System.out.println(x);


        int x1;// Create a Variable
        x1=100; // assign 100 to x variable
        System.out.println(x); // print value of




        int y;
        y=100;
        y=200;
        System.out.println(y);



        int x11,y1,z;
        x11=100;
        y1=200;
        z=300;
        System.out.println(x11);
        System.out.println(y1);
        System.out.println(z);




        int x111,y111,z1;
        x111=y111=z1=100;
        System.out.println(x111);
        System.out.println(y111);
        System.out.println(z1);





        int a,b,c;
        a=100;
        b=200;
        c=a + b; // ok x=300
        System.out.println(a); // 100
        System.out.println(b); // 200
        System.out.println(c); // 300


        //Scanner input= new Scanner(System.in);
        //System.out.println("Insert your age:");

        //byte age=input.nextByte();
        //System.out.println("My age is : "+age);

        //byte after;
        //after = (byte) (age + 10);
       // System.out.println(" After 10 years age is:"  + after);








        char ch='A'; // 65
        double d;
        d=ch;
        System.out.println("d : "+d); // 65.0
        System.out.println("ch : "+ch); // A






        double d1=97.12345;
        char ch1;
        //ch=d; // illegal
        ch1=(char) d1;
        System.out.println("d : "+d1);// 97.12345
        System.out.println("ch : "+ch1);//a




        char ch2 = '\b';// 8
        System.out.println(ch2);
        System.out.println((int)ch2);



        Scanner input = new Scanner(System.in);
        System.out.println("Insert Your Salary : ");
        int salary=input.nextInt();
        int r5000,r1000,r500,r100,r50,r20,r10,r5,r2,r1;

        r5000=salary/5000;
        salary=salary%5000;

        r1000=salary/1000;
        salary=salary%1000;

        r500=salary/500;
        salary=salary%500;

        r100=salary/100;
        salary=salary%100;

        r50=salary/50;
        salary=salary%50;

        r20=salary/20;
        salary=salary%20;

        r10=salary/10;
        salary=salary%10;

        r5=salary/5;
        salary=salary%5;

        r2=salary/2;
        salary=salary%2;

        r1=salary/1;
        salary=salary%1;

        // 12650 ==(5000=2,1000=2,500=1,100=1,50=1,20=0,...)
        System.out.println("R5000 : "+r5000);
        System.out.println("R1000 : "+r1000);
        System.out.println("R500 : "+r500);
        System.out.println("R100 : "+r100);
        System.out.println("R50 : "+r50);
        System.out.println("R20 : "+r20);
        System.out.println("R10 : "+r10);
        System.out.println("R5 : "+r5);
        System.out.println("R2 : "+r2);
        System.out.println("R1 : "+r1);










}
}
