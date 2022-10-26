public class sep2{
    public static void main(String[] args) {
        //System.out.println("main start");

        /*int x=10;


        try{
            int y= 10/0 ;
        }


        catch (Exception e){
            System.out.println(e);
        } */


       // System.out.println("main start");

        /* int x=10;
        try{
            System.out.println("opening try");
            int y=10/0;
            System.out.println("End try");
        }



        catch (Exception e){
            System.out.println("open catch");
            System.out.println(e);
            System.out.println("End catch");
        }


        System.out.println("miain end"); */




        //System.out.println("Start Main");

        /* try {
            int y = 10 / 2;
            int ar[]= new int[10];
            ar[50]=10;
        }


        catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println(" catch 1"  +e);
        }



        catch (IndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println(" catch 2"  +e);
        }

        System.out.println("End Main"); */




        /* System.out.println("Start Main");

        try {
            int y = 10 / 2;
            int ar[]= new int[10];
            ar[50]=10;
        }


        catch (ArithmeticException | IndexOutOfBoundsException e){
            e.printStackTrace();
        }


        System.out.println("End Main");  */




        /* System.out.println("Start Main");

        try {
            int y = 10 / 0;
        }

        finally {
            System.out.println("finally");
        }

        System.out.println("End Main");  */




        /* System.out.println("Start Main");
        try {
            int y = 10 / 0;
        }

        catch (Exception e){
            System.out.println("Error is :" +e);

        }

        finally {
            System.out.println("finally");
        }


        System.out.println("End Main");  */




        try {
            new A().mA();
        }

        catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("End Main");


    }
}



class A{
    void mA() throws Exception {
        System.out.println("Start MA");
        new B().mB();
        System.out.println("End MA");
    }
}
class B{
    void mB() throws Exception{
        System.out.println("Start MB");
        try{
            new C().mC();
        }catch (Exception e){
            throw new Exception();
        }

        System.out.println("End MB");
    }
}
class C {
    void mC() throws Exception {
        System.out.println("Start MC");
        int x = 10 / 0;
        System.out.println("End MC");
    }
}