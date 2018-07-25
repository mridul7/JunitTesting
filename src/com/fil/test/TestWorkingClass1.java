package com.fil.test;

//import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.fil.model.WorkingClass;
@RunWith(Parameterized.class)
public class TestWorkingClass1 {

	private String input,output;
	//private static WorkingClass work= new WorkingClass();
	public TestWorkingClass1 (String input,String output)
	{
		super();
		this.input=input;
		this.output=output;
	}
	
	@Parameters
	public static Collection<String[]> stringParameters()
	{
	  List<String[]> inputAndOutput = new ArrayList<String[]>();
	  inputAndOutput.add(new String[] {"cba","abc"});
	  inputAndOutput.add(new String[] {"cbad","abcd"});
	  inputAndOutput.add(new String[] {"cbadd","abcdd"});
	   
	  return inputAndOutput;
	  
	}
	
	

	@Test
	 public void testSort() {
		WorkingClass obj = new WorkingClass();
		System.out.println("running with"+input+":"+output);
		String actualOutput =obj.sort(input);
		assert(actualOutput.equals(output));
	}

}