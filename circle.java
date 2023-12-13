class circle
{
	public static void main(String args[])
	{
		circle ab = new circle();
		ab.input();
	}
	void input()
	{
		double r=5,area,peri;
		area=3.14*r*r;
		peri=2*3.14*r;
		System.out.println("Area is"+area);
		System.out.println("Perimeter is"+peri);
	}
}