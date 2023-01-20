//multilevel inheritance in java

class A{
    void a(){
        System.out.println("Hey I am Class A");
    }
}
class B extends A{
    void b(){
        System.out.println("Hey I am Class B");
    }
}
class C extends B{
    void c(){
        System.out.println("Hey I am Class C");
    }
}
class Multilevel{
    public static void main(String[] args){
        C c= new C();

        c.a();
        c.b();
        c.c();
    }
}
