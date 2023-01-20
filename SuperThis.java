//Super and This keyword in java

class Animal{
    int id;
    String name;
    Animal(int id,String name){
        this.id = id;
        this.name=name;
    }
}
class Dog extends Animal{
    int salary;
    Dog(int id,String name ,int salary){
        super(id,name);
        this.salary= salary;
    }
    void display(){
        System.out.println(id+" "+name+" "+salary);
    }
}
class SuperThis{
    public static void main(String[] args){
        Dog d = new Dog(111,"Gazal",50000);

        d.display();
    }
}