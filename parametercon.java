//parameterized constructer

class parametercon{
    int id;
    String name;

    void display(){
        System.out.println("Id: "+id+" Name: "+name);
    }
    //parameterizes constructer
    parametercon(int i,String a){
        id=i;
        name=a;
    }

    public static void main(String args[]){
        parametercon p1 = new parametercon(111,"Gazal");
        parametercon p2 = new parametercon(222,"Pawan");

        p1.display();
        p2.display();
    }
}