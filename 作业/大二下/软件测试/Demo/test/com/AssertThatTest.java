package com;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.Before;
import org.junit.Test;
public class AssertThatTest {
	private static AssertThat ass = new AssertThat();	
	@Before
	public void setUp() throws Exception{
	    ass.clear();
	}
	@Test
	public void testAdd() {
	    ass.add(3, 4);
	    //allOf：所有条件必须都成立，测试才通过  ，结果在6和8之间
	    assertThat(ass.getResult(), allOf(greaterThan(6), lessThan(8)));		   
	    //anyOf只要有一个条件成立，测试就通过   
	    assertThat(ass.getResult(), anyOf(greaterThan(6), lessThan(5))); 
	    //anyOf只要有一个条件成立，测试就通过   
	    assertThat(ass.getResult(), anyOf(greaterThan(8), lessThan(9))); 	
	    //anything：无论什么条件，测试都通过
	    assertThat(ass.getResult(), anything());
	    //is：变量的值等于指定值时，测试通过   
	    assertThat(ass.getResult(), is(7));
	    //not：和is相反，变量的值不等于指定值时，测试通过  
	    assertThat(ass.getResult(), not(2));
	}
}
