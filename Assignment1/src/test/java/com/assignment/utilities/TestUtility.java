package com.assignment.utilities;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

import com.assignment.base.TestBase;

public class TestUtility extends TestBase{
	
	@DataProvider(name="dp")
	public static Object[][] getData(Method m) throws IOException {
		return ExcelReader.getExcelData(m.getName());
	
	}

	
	

}
