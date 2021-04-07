class e_g{
	static int b=0;
	public static void main(String[] args){
		int a=10;
		System.out.println("Now is 11:"+a);
		//call method(int a)
		method(a);
		System.out.println("Next minute is 11:"+b);		
	}
	public static int method(int a){
		b=a+1;
		return b;
	}
}

