//Super constructer in java

class Animal{
    Animal(){
        System.out.println("I am Animal Constructer");
    }
}
class Dog extends Animal{
    Dog(){
        super();
        System.out.println("I am Dog constructer");
    }
}
class SuperCon{
    public static void main(String[] args){
        Dog d = new Dog();
    }
}