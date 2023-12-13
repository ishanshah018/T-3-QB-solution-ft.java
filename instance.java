//using scanner class and instance metod + local

import java.util.*;
class instance
{
	public static void main(String args[])
	{
		circle ab = new circle();
		ab.input();
		ab.calculate();
	}
}
class circle
{
		double r,p,area,peri;

	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius");
		r = sc.nextDouble();
		System.out.println("Enter perimeter");
		p = sc.nextDouble();
	}
	void calculate()
	{
		 area= 3.14*r*r;
		 peri=2*3.14*r;
		System.out.println("Radius of circle is"+area);
		System.out.println("Perimeter of circle is"+peri);
	}
}