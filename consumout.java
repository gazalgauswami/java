//sum in copy constructer without consstructer

class consumout{
    int a,b;

    consumout(int i,int o){
        a=i;
        b=o;
    }
    consumout(){};

    public static void main(String args[]){
        int sum;

        consumout c1 = new consumout(10,20);
        consumout c2 = new consumout();

        c2.a=c1.a;
        c2.b=c1.b;

        sum=c2.a+c2.b+2;

        System.out.println("Sum of a+b+2: "+ sum);

    }
}