//function overloading with diffrant datatype

class Adder{
    static int add(int a,int b){return (a+b);}
    static double add(int a,int b){return(a+b);}
}
class MethodOverLoading3{
    public static void main(String[] args){
        System.out.println("a+b: "+Adder.add(11,11));//ambiguity
        // System.out.println("a+b+c: "+Adder.add(11.22,22.33));
    }
}