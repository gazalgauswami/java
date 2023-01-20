//basic class in java

class classdemo{
    int id;
    String name;

    void display(){
        System.out.println("id: "+id+" "+name);
    }
    public static void main(String args[]){
        
        classdemo c1= new classdemo();
        classdemo c2= new classdemo();
        c1.display();
        c2.display();
    } 
}