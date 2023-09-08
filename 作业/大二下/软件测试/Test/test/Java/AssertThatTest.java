package Java;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class AssertThatTest {
private static AssertThat ass=new AssertThat();
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSubstract() {
		ass.substract(10, 7);
		 //allOf：所有条件必须都成立，测试才通过  ，结果在2和4之间
	    assertThat(ass.getResult(), allOf(greaterThan(2), lessThan(4)));		   
	    //anyOf大于2小于1
	    assertThat(ass.getResult(), anyOf(greaterThan(2), lessThan(1))); 
	  //anyOf大于4小于7
	    assertThat(ass.getResult(), anyOf(greaterThan(4), lessThan(7)));  
	    //anything：无论什么条件，测试都通过
	    assertThat(ass.getResult(), anything());
	    //is：变量的值等于指定值时，测试通过   
	    assertThat(ass.getResult(), is(3));
	    //not：和is相反，变量的值不等于指定值时，测试通过  
	    assertThat(ass.getResult(), not(2));

	}

	@Test
	public void testDivide() {
		ass.divide(8, 4);
		 //allOf：所有条件必须都成立，测试才通过  ，结果在1和3之间
	    assertThat(ass.getResult(), allOf(greaterThan(1), lessThan(3)));		   
	    //anyOf大于2小于1
	    assertThat(ass.getResult(), anyOf(greaterThan(1), lessThan(1))); 
	  //anyOf大于4小于7
	    assertThat(ass.getResult(), anyOf(greaterThan(8), lessThan(3)));  
	    //anything：无论什么条件，测试都通过
	    assertThat(ass.getResult(), anything());
	    //is：变量的值等于指定值时，测试通过   
	    assertThat(ass.getResult(), is(2));
	    //not：和is相反，变量的值不等于指定值时，测试通过  
	    assertThat(ass.getResult(), not(1));
	}

	@Test
	public void testClear() {
		 ass.clear();
	}


}
