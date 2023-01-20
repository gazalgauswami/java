//static keyword in java

class demo{
    int id;
    String name;
    static String collage = "Amroli";

    demo(int i,String n){
        id=i;
        name=n;
    }

    void display(){
        System.out.println("ID: "+id+" Name: "+name+" Collage: "+collage);
    }
   
    }
    
     public class statickey{
        public static void main(String args[]){
            demo s1 = new demo(111,"Pawan");
            demo s2 = new demo(222,"Gazal");

            s1.display();
            s2.display();
        }
     }    