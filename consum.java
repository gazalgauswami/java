//sum using constructer with copy constructer

class consum{
    int a,b;

    consum(int i,int o){
        a=i;
        b=o;

    }
    consum(consum c){
        a=c.a;
        b=c.b;
        int sum = c.a+c.b+2;
        System.out.println("sum: "+sum );
    }
   
    public static void main(String args[]){
        consum c1 = new consum(10,20);
        consum c2 = new consum(c1);

    
    }

}