//super method in java

class Animal{
    void display(){
        System.out.println("Animal");
    }
}
class Dog extends Animal{
    void display(){
        System.out.println("Dog");
    }
    void displayall(){
        this.display();
        super.display();
    }
}
class SuperMethod{
    public static void main(String[] args){
        Dog d = new Dog();
        d.displayall();
    }
}