//constructer overloading 

class conover{
    int id,age;
    String name;

    conover(int i,String n){
        id=i;
       name=n;
    }
    conover(int i,String n,int a){
        id=i;
        name=n;
        age=a;
    }
    void display(){
        System.out.println("ID: "+id+" Name: "+name+" Age: "+age);
    }
    public static void main(String args[]){
       conover c1 = new conover(111,"Gazal");
       conover c2 = new conover(222,"Pawan",15);

       c1.display();
       c2.display(); 
    }
}