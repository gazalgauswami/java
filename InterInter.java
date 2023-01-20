//inheritance in interface

interface printable{
    void printm();
}
interface showable extends printable{
    void showm();
}
class InterInter implements showable{
    public void printm(){
        System.out.println("I am first interface method");
    }
    public void showm(){
        System.out.println("I am Second interface method");
    }
    public static void main(String[] args){
        InterInter i = new InterInter();
        i.printm();
        i.showm();
    }
}