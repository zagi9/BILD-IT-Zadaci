package zadaci_14_03_2017;

public class TestMyStack {
	public static void main (String[] args)
		throws CloneNotSupportedException {
	
		MyStack stack = new MyStack();
	    stack.push("1");
	    stack.push("2");
	    stack.push("3");

	    MyStack stack2 = (MyStack) (stack.clone());
	    
	    System.out.print("Stack1: ");
	    while (!stack.isEmpty())
	    	System.out.print(stack.pop() + " ");

	    System.out.println();
	    
	    System.out.print("Stack2: ");
	    while (!stack2.isEmpty())
	    	System.out.print(stack2.pop() + " ");
	    
	    System.out.println();
	    
	    stack2.push("5");
	    stack2.push("6");
	    stack2.push("7");

	    System.out.print("Stack1: ");
	    while (!stack.isEmpty())
	    	System.out.print(stack.pop() + " ");

	    System.out.println();
	    
	    System.out.print("Stack2: ");
	    while (!stack2.isEmpty())
	    	System.out.print(stack2.pop() + " ");
	  }
	

}
