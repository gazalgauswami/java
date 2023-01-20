//multipale interface in java

interface printable{
    void printm();
}
interface showable{
    void showm();
}
class MultiINterface implements printable,showable{
    public void printm(){
        System.out.println("Hello I am Simpale Interface");
    }
    public void showm(){
        System.out.println("Hello I am Interface ");
    }
    public static void main(String[] args){

        MultiINterface i = new MultiINterface();
        i.printm();
        i.showm();
    }
}