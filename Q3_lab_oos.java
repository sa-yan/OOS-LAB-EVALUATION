/*
 * Diamond problem using interface 
 */
interface Parent1 { 
	void fun(); 
} 

interface Parent2 { 
	void fun(); 
} 

class test implements Parent1, Parent2 { 
	public void fun() 
	{ 
		System.out.println("fun function"); 
	} 
} 

class test1 { 
	public static void main(String[] args) 
	{ 
		test t = new test(); 
		t.fun(); 
	} 
}
