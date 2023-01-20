//while and do while
//filename: DOWHILE

class DOWHILE{
	public static void main(String args[]){

	int n = 10,sum=0;

	while(n>0){
		System.out.println("tick"+n);
		n--;
		sum+=n;
	}
	System.out.println("Sum"+ sum);

	do{
		System.out.println("toke"+n);
		n++;
		sum+=n;
	}
	while(n<=0);
	System.out.println("Sum"+sum);

   }

}