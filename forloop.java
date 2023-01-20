//for loop in java

class forloop{
    public static void main(String args[]){
        int [] numners = {10,20,30,40,50};

        for (int x: numners){
            System.out.print(x);
            System.out.print(",");
        }
        System.out.print("\n");
        String names []={"Gazal","Pawan","Meera","Om","Sumita"};

        for(String name : names){
            System.out.print(name);
            System.out.print(",");
        }
    }
}