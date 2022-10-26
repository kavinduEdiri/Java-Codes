public class Pract {
    public static void main(String[] args) {
        box b1=new box();

        b1.length=10;
        b1.height=10;
        b1.weight=10;
        b1.printMy();

    }
}



class box{
    int length;
    int weight;
    int height;

    public void  printMy(){
       int  volume =length* weight *height;
        System.out.println(volume);
    }
}