//this: keyword invoke currant method

class A{
    void m(){
        System.out.println("Hello M");
    }
    void n(){
        System.out.println("Hello N");
        this.m();
    }
}
class TestThis4{
    public static void main(String args[]){
        A a = new A();

        a.n();
    }
}