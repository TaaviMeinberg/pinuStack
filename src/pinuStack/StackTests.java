package pinuStack;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class StackTests {

	@Test
	public void isEmpty(){
		Stack stack = new Stack();
		assertThat(stack.getSize(), is(0));
	}
	
	@Test
	public void eachPushIncreaseStackSize() {
		Stack stack = new Stack();
	    stack.push(1);
	    stack.push(41);
	        
	    assertThat(stack.getSize(),is(2));
	}

	@Test
    public void eachPopDecreaseStackSize()  {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(41);
        stack.pop();
        stack.pop();
        assertThat(stack.getSize(),is(0));
    }
	
	@Test
    public void pushedelementsRet() throws Exception {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(2);
        
        assertThat(stack.pop(), is(2));
        assertThat(stack.pop(), is(5));
    }
	@Test
    public void pushedelementsPeek() throws Exception {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(8);
        assertThat(stack.peek(), is(8));
    }
	@Test
    public void pushedelementsSizeTwo() throws Exception {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(2);
        assertThat(stack.peek(), is(2));
        assertThat(stack.getSize(), is(2));
    }
	@Test
    public void pushedelementsPeekTwice() throws Exception {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(6);
        assertThat(stack.peek(), is(6));
        int peeked = stack.peek();
        assertThat(peeked, is(6));
    }
	@Test(expected= IllegalStateException.class)
		public void popEmptyStackThows() throws Exception {
	    	Stack stack = new Stack();
	        stack.pop();
	    }
	@Test(expected= IllegalStateException.class)
    public void peekEmptyStackThows() throws Exception {
        Stack stack = new Stack();
        stack.peek();
    }
}
