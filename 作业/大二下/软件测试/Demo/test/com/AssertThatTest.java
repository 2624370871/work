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
	    //allOf�������������붼���������Բ�ͨ��  �������6��8֮��
	    assertThat(ass.getResult(), allOf(greaterThan(6), lessThan(8)));		   
	    //anyOfֻҪ��һ���������������Ծ�ͨ��   
	    assertThat(ass.getResult(), anyOf(greaterThan(6), lessThan(5))); 
	    //anyOfֻҪ��һ���������������Ծ�ͨ��   
	    assertThat(ass.getResult(), anyOf(greaterThan(8), lessThan(9))); 	
	    //anything������ʲô���������Զ�ͨ��
	    assertThat(ass.getResult(), anything());
	    //is��������ֵ����ָ��ֵʱ������ͨ��   
	    assertThat(ass.getResult(), is(7));
	    //not����is�෴��������ֵ������ָ��ֵʱ������ͨ��  
	    assertThat(ass.getResult(), not(2));
	}
}
