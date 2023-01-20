//prime number programme in java
//filename: primenumber

class primenumber{
	public static void main(String args[]){

	int num,i;
	boolean isPrime = true;

	num=13;

	for(i=2;i<=num/2;i++){
		if((num % i)==0)
		{
		isPrime=false;
		break; }
	}
    
	
	if(isPrime)
	System.out.println("Prime");
	else
	System.out.println("Not Prime");
	
      }
  }
	