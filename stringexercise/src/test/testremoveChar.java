package test;
import main.removeChar;
import junit.framework.*;

public class testremoveChar extends TestCase {

	public void testRegression1() {
/* Positive test - Remove single char that exists in string" */ 		
		removeChar test1 = new removeChar();
		StringBuffer actual = test1.updWord("Ravikumar", 'r') ;
	    Assert.assertEquals("Ravikuma", actual.toString());

	}
	
	public void testRegression2() {
/* Positive test - Remove All special characters" */ 
		removeChar test1 = new removeChar();
		StringBuffer actual = test1.updWord("%%%%%", '%') ;
	    Assert.assertEquals("", actual.toString());

	}
	public void testRegression3() {
/* Negative test - Remove non existent character from String" */ 
		removeChar test1 = new removeChar();
		StringBuffer actual = test1.updWord("Ravikumar", '%') ;
	    Assert.assertEquals("Ravikumar", actual.toString());

	}
	
}
