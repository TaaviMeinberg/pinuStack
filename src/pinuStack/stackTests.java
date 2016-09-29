package pinuStack;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import esimene.Pinu;

public class stackTests {

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

}
