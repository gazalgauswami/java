//write a java programme to print the odd numbers from 1 to 9 . Prints one number per line.

class OddNUmber{
    public static void main(String[] args){
        int number=10;

        System.out.println("List of Odd number from 1 to "+ number+" : ");

        for(int i=1;i<=number;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}