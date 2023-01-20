//Default COnstructer in java

class defaultcon {
    int id;
    String name;

    defaultcon(){
        id=111;
        name="Gazal";
    }
    void display(){
        System.out.println("Id: "+id+" "+"Name: "+name);
    }

    public static void main(String args[]){
        defaultcon d1 = new defaultcon();
        defaultcon d2 = new defaultcon();

        d1.display();
        d2.display();
    }
}