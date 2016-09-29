package pinuStack;

public class Stack {
	private Integer[] elements = new Integer[100];
	private int Stacksize = 0;
	
	int size = 0;
	public static void main(String[] args) {
		
		Stack sk=new Stack();
		sk.push(4);
		System.out.println(sk.getSize());
		
	}
	
	

	/**
	 * 
	 */
	public Stack() {

	}

	public int getSize() {
		return Stacksize;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public int pinuSize(Stack s){
		return s.getSize();
	}
	
	public void push(Integer i) {
		elements[Stacksize] = i;
		Stacksize++;
	}
	
	
	
	
	
	
	
}
