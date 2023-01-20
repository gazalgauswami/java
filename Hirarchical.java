//hirarchical inheritance in java

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
class C extends A{
    void c(){
        System.out.println("Hey I am Class C");
    }
}
class Hirarchical{
    public static void main(String[] args){
        B b = new B();
        C c = new C();

        b.a();
        b.b();
        c.a();
        c.c();
    }

}