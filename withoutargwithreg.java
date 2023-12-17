//without arg with return

class withoutargwithreg
{
	public static void main(String args[])
	{
		withoutargwithreg ab = new withoutargwithreg();
		int ans= ab.main();	//return apde 'c' karavyo etle ene ahiya store karvano rehse koi variable api ne(Store returned value in object by making variable)
		System.out.print("Your answer is "+ans);  //ahiya variable mukvo not 'c' but je variable karyo a
	}
	int main()     // ahiya void nahi ave return value no je type cha e ave (here:-int)
	{
		int a=5;
		int b=3;
		int c=a+b;
		return c;  // c ni value je avi e return thase int ma
	}
}