//function overloading with diffrant datatype

class Adder{
    static int add(int a,int b){return (a+b);}
    static double add(double a,double b){return(a+b);}
}
class MethodOverLoading2{
    public static void main(String[] args){
        System.out.println("a+b: "+Adder.add(11,11));
        System.out.println("a+b+c: "+Adder.add(11.22,22.33));
    }
}