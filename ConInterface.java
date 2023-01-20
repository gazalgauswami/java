//constructer in java

interface sub{
    int sub(int a,int b);
}
class ConInterface implements sub{
    public int sub(int a,int b){
        int k = a-b;
        return k;
    }
    public static void main(String[] args){
        ConInterface c = new ConInterface();
        System.out.println("Substraction:  "+ c.sub(20,5));
    }
}