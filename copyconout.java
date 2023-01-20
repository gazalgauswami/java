//copy constructer without constructer

class copyconout{
    int id;
    String name;

    copyconout(int i,String n){
        id=i;
        name=n;
    }
    copyconout(){};
    void display(){
        System.out.println("Id: "+id+" Name: "+name);
    }

    public static void main(String args[]){
        copyconout c1 = new copyconout (111,"Gazal");
        copyconout c2 = new copyconout ();

        c2.id=c1.id;
        c2.name=c1.name;

        c1.display();
        c2.display();
    }
}