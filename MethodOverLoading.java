//fumction overloading with diffrant number of parameter

class Adder{
    static int add(int a,int b){return (a+b);}
    static int add(int a,int b,int c){return(a+b+c);}
}
class MethodOverLoading{
    public static void main(String[] args){
        System.out.println("a+b: "+Adder.add(11,11));
        System.out.println("a+b+c: "+Adder.add(11,11,11));
    }
}