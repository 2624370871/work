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
		 //allOf�������������붼���������Բ�ͨ��  �������2��4֮��
	    assertThat(ass.getResult(), allOf(greaterThan(2), lessThan(4)));		   
	    //anyOf����2С��1
	    assertThat(ass.getResult(), anyOf(greaterThan(2), lessThan(1))); 
	  //anyOf����4С��7
	    assertThat(ass.getResult(), anyOf(greaterThan(4), lessThan(7)));  
	    //anything������ʲô���������Զ�ͨ��
	    assertThat(ass.getResult(), anything());
	    //is��������ֵ����ָ��ֵʱ������ͨ��   
	    assertThat(ass.getResult(), is(3));
	    //not����is�෴��������ֵ������ָ��ֵʱ������ͨ��  
	    assertThat(ass.getResult(), not(2));

	}

	@Test
	public void testDivide() {
		ass.divide(8, 4);
		 //allOf�������������붼���������Բ�ͨ��  �������1��3֮��
	    assertThat(ass.getResult(), allOf(greaterThan(1), lessThan(3)));		   
	    //anyOf����2С��1
	    assertThat(ass.getResult(), anyOf(greaterThan(1), lessThan(1))); 
	  //anyOf����4С��7
	    assertThat(ass.getResult(), anyOf(greaterThan(8), lessThan(3)));  
	    //anything������ʲô���������Զ�ͨ��
	    assertThat(ass.getResult(), anything());
	    //is��������ֵ����ָ��ֵʱ������ͨ��   
	    assertThat(ass.getResult(), is(2));
	    //not����is�෴��������ֵ������ָ��ֵʱ������ͨ��  
	    assertThat(ass.getResult(), not(1));
	}

	@Test
	public void testClear() {
		 ass.clear();
	}


}
