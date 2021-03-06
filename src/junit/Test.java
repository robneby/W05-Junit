/** @author Rob Nebeker */
// W05 JUNIT

package junit;

import java.util.Scanner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Test {

	public static void main(String[] args) {
		
		Result result = JUnitCore.runClasses(Assert.class);
		
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());
	   }

	

}