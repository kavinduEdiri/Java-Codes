// parsing an object to a method
class Value{
    int a;
    Value(int a){this.a=a;}
}
class ChangeValue{
    public static void increment(int a){
        a++;
    }
}
class Aug25{
    public static void main(String[] args) {
        Value v1= new Value(100);
        System.out.println(v1.a);
        ChangeValue.increment(v1.a);
        System.out.println(v1.a);
    }
}
