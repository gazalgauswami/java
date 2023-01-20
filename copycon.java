//copy constructer with constructer

class copycon{
    int id;
    String name;

    copycon(int i,String n){
        id=i;
        name=n;
    }

    copycon(copycon c){
        id=c.id;
        name=c.name;
    }
    void display(){
        System.out.println("Id: "+id+" Name: "+name);
    }
    public static void main(String args[]){
        copycon c1 = new copycon(111,"Gazal");
        copycon c2 = new copycon(c1);

        c1.display();
        c2.display();
    }
}