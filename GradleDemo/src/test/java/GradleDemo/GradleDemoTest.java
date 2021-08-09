package GradleDemo;

import org.testng.annotations.*;
import static org.testng.Assert.*;

public class GradleDemoTest{
     @Test 
	 public void gradleDemoHasAGreeting(){
	    //Arrange
	    GradleDemo myApp = new GradleDemo();
	    //Act and Assert
	    assertNotNull(myApp.getGreeting(), "app should have a greeting");
	 }
}	