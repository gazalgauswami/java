//super variable in java
class Animal{
    String color="White";
}
class Dog extends Animal{
    String color ="Black";
    void display(){
        System.out.println(color);
        System.out.println(super.color);
    }
}
class SuperVar{
    public static void main(String[] args){
        Dog d = new Dog();
        d.display();
                         
    }
}