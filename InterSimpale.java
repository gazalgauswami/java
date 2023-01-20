//simpale interface in java

interface printable{
    void printm();
}

class InterSimpale implements printable{
    public void printm(){
        System.out.println("Hello I am Simpale Interface");
    }
   
    public static void main(String[] args){

        InterSimpale i = new InterSimpale();
        i.printm();
     
    }
}