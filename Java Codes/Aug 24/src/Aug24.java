


class Box{
    int length;
    int width;
    int height;
}










public class Aug24 {

    public static void main(String[] args) {

        int[]xr;
        xr= new int[3];
        System.out.println(xr);// address
        xr[0]=100;
        System.out.println(xr[0]);

        Box b1; // create a reference variable
        b1= new Box(); // create an object "Box"
        System.out.println(b1);
        b1.length=12;
        System.out.println(b1.length);


    }
}
