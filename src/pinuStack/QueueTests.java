package pinuStack;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class QueueTests {
	
	@Test
	public void eachPushIncreaseStackSize() {
		Queue queue = new Queue();
		queue.push(1);
		queue.push(41);
	        
	    assertThat(queue.getSize(),is(2));
	}
	
	@Test
    public void eachPopDecreaseStackSize()  {
		Queue queue = new Queue();
		queue.push(1);
		queue.push(41);
		queue.pop();
		queue.pop();
        assertThat(queue.getSize(),is(0));
    }
	@Test
    public void pushedelementsRet() throws Exception {
		Queue queue = new Queue();
		queue.push(5);
		queue.push(7);
        assertThat(queue.pop(), is(5));
    }
	
	@Test
    public void pushedelementsPeek() throws Exception {
		Queue queue = new Queue();
		queue.push(5);
		queue.push(8);
        assertThat(queue.peek(), is(5));
        assertThat(queue.getSize(),is(2));
        
    }
	
	public void callAllQueueTests() throws Exception{
		eachPushIncreaseStackSize();
		eachPopDecreaseStackSize();
		pushedelementsRet();
		pushedelementsPeek();
	}
}
