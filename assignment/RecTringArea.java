//Find Area of tringale and rectangle using class

//Rectanglae area logic
class Rectangle 
{
	public double Compute(double l, double b)
	{
		return (l*b);
	}
}

//tringale area logic
class Triangle 
{
	public double Compute(double b, double h)
	{
		return (b*h/2);
	}
}

//implement both logic area
public class RecTringArea
{
	public static void main(String args[])
	{
		Rectangle rect = new Rectangle();
		double RArea = rect.Compute(10, 20);
		System.out.println("The area of the Rectangle is "+RArea);
		
		Triangle tri = new Triangle();
		double TArea = tri.Compute(10, 20);
		System.out.println("The area of the triangle is "+TArea);
				
	}
}