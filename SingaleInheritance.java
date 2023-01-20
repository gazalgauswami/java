//Singale Inheritance with this keyword in java
class A{
    int i,j;
    void showij(){
        System.out.println("i: "+i+"\nj: "+j);
    }
}
class B extends A{
    int k;
    void showk(){
        System.out.println("K: "+k);
    }
    void sum(){
        super.showij();
        this.showk();
        System.out.println("SUM: "+(i+j+k));
    }
}
class SingaleInheritance{
    public static void main(String[] args){
        B b = new B();
        b.i=10;
        b.j=20;
        b.k=30;

        b.sum();
    }
}
