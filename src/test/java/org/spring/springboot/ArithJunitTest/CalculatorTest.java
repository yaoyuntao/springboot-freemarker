package org.spring.springboot.ArithJunitTest; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* Calculator Tester. 
* 
* @author <Authors name> 
* @since <pre>25, 2019</pre>
* @version 1.0 
*/ 
public class CalculatorTest {
    Calculator c = new Calculator();

@Before
public void before() throws Exception {
}

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: add(int x, int y) 
* 
*/ 
@Test
public void testAdd() throws Exception { 
//TODO: Test goes here...
    Assert.assertEquals(3,c.add(1,2));
} 

/** 
* 
* Method: sub(int x, int y) 
* 
*/ 
@Test
public void testSub() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: mul(int x, int y) 
* 
*/ 
@Test
public void testMul() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: div(int x, int y) 
* 
*/ 
@Test
public void testDiv() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: div2(int x, int y) 
* 
*/ 
@Test
public void testDiv2() throws Exception { 
//TODO: Test goes here...
//    Assert.assertEquals("除数不能为0",new Calculator().div2(6,0));
    Assert.assertEquals("出错了！实际结果与预期不符！",2,c.div2(5,3));
}

/** 
* 
* Method: loop(int x, int y) 
* 
*/ 
@Test
public void testLoop() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: unCompleted(int x, int y) 
* 
*/ 
@Test
public void testUnCompleted() throws Exception { 
//TODO: Test goes here... 
} 


} 
