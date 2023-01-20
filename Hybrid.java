//Hybrid inheritance in java

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
class D extends A{
    void d(){
        System.out.println("Hey I am Class D");
    }
}
class Hybrid{
    public static void main(String[] args){
        C c = new C();
        D d = new D();

        c.a();
        c.b();
        c.c();
        d.a();
        d.d();
    }
}