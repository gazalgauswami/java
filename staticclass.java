//nested static class in java

class staticclass {
	static int i=30;
	
	static class inner{
		void msg(){
		System.out.println("i is: "+ i);}
	{
	public static void main(String args[]){

	staticclass.inner s1 = new staticclass.inner();

	s1.msg();

	}
}

