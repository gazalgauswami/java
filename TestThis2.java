//this: to recive currant class variable 
class Student{
    int roll;
    String name;
    float fee;

    Student(int r,String n,float f){
        this.roll=r;
        this.name=n;
        this.fee=f;
    }
    void display(){
        System.out.println(roll+" "+name+" "+fee);
    }
}
class TestThis2{
    public static void main(String[] args){
        Student s1 = new Student(111,"Gazal",5000f);
        Student s2 = new Student(222,"Pawan",6000f);

        s1.display();
        s2.display();
    }
}