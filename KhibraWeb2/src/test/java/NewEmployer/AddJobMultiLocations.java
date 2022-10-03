 package NewEmployer;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static org.hamcrest.CoreMatchers.*;
import static org.testng.Assert.assertEquals;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;

import students.StudentsDashboard;
import utils.EmployerUtility;
import utils.log;
import utils.utility;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import java.io.FileNotFoundException;
 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.Map;
import utils.APIClient;
import utils.APIException;  
public class AddJobMultiLocations extends EmployerUtility{
	 
		
	@BeforeMethod
    public void setUp1() throws Exception {
	  log.info("START=EmpAddJobMultiLocations--------------------------------------------------------------");

	  EmployerUtilityclass();
 	
}
	
	
	  @SuppressWarnings("rawtypes")
		@Test (description = "StudentsDashboard. TC_ID=C1155")
 
	
	public void testAddNewJob() throws Exception {
		  try {
			  Thread.sleep(2000);
			  
			  String filePath = System.getProperty("user.dir");
		 	  FileInputStream fis = new FileInputStream(filePath+"/config/Testdata.xlsx");
			    XSSFWorkbook workbook = new XSSFWorkbook(fis); 			  
				  XSSFSheet sheets = workbook.getSheet("Employer");
	 	  
				  Row title = sheets.getRow(7);
				  Cell cell1 = title.getCell(1);
				  String JobTitle  = cell1.getStringCellValue();
		  
				  
				  Row expdate = sheets.getRow(8);
				  Cell cell4 = expdate.getCell(1);
				  String JobExpDate  = cell4.getStringCellValue();  
				  
				  Row jobbackground = sheets.getRow(9);
				  Cell cell5 = jobbackground.getCell(1);
				  String Jobbackground  = cell5.getStringCellValue();  
				  
				  
				  Row question = sheets.getRow(33);
				  Cell cell6 = question.getCell(1);
				  String Question  = cell6.getStringCellValue();  
				  
				  Row salaryFrom = sheets.getRow(34);
				  Cell cell10 = salaryFrom.getCell(1);
				  String Salaryfrom  = cell10.getStringCellValue();  
				  
				  
				  Row salaryTo = sheets.getRow(35);
				  Cell cell11 = salaryTo.getCell(1);
				  String Salaryto  = cell11.getStringCellValue();  
				  
				  
			   driver.findElement(By.xpath(objectrepo.getProperty("EmpMenuDropdown"))).click();	 
			  	  log.info("Dropdown  Clicked");
			  	  Thread.sleep(2000);
			  	  
   driver.findElement(By.xpath(objectrepo.getProperty("EmpMyJobsDropdownMenu"))).click();	 
		  log.info("Jobs Menu  Clicked");
		  Thread.sleep(2000);
		  
		  
		  driver.findElement(By.xpath(objectrepo.getProperty("AddNewJobButton"))).click();	 
		  log.info("Add New Job Button  Clicked");
		  Thread.sleep(2000);
		  
		  
	  driver.findElement(By.xpath(objectrepo.getProperty("JobTitle"))).sendKeys(JobTitle);	
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath(objectrepo.getProperty("JobExpDate"))).sendKeys(JobExpDate);	
	  
	  WebElement YearsOfExperience = driver.findElement(By.xpath(objectrepo.getProperty("YearsOfExperience"))); 
	    Select sel1=new Select(YearsOfExperience);
	    sel1.selectByValue("1");
	  
	  driver.findElement(By.xpath(objectrepo.getProperty("JobType"))).click();
	  Actions keyDown = new Actions(driver);
	  keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.ENTER)).perform();
	  Thread.sleep(2000);
	  
	  
	   
	  WebElement JobType = driver.findElement(By.xpath(objectrepo.getProperty("JobType"))); 
	    Select sel2=new Select(JobType);
	    sel2.selectByValue("1");
	    
	    
	  driver.findElement(By.xpath(objectrepo.getProperty("JobNationality"))).click();
	  keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.ENTER)).perform();
	  Thread.sleep(2000);
	  
	  WebElement JobNationality = driver.findElement(By.xpath(objectrepo.getProperty("JobNationality"))); 
	    Select sel4=new Select(JobNationality);
	    sel4.selectByVisibleText("China");
	    
	    
	    
	  driver.findElement(By.xpath(objectrepo.getProperty("JobPositionLocation"))).click();
	  driver.findElement(By.xpath(objectrepo.getProperty("JobPositionLocation2"))).click();

	 
	  
	

	  driver.findElement(By.xpath(objectrepo.getProperty("NextButtons"))).click();
	  log.info("Page 1 job details completed and Next button clicked ");
	  Thread.sleep(2000);
			  
			  
	  
	  driver.findElement(By.xpath(objectrepo.getProperty("JobBackgroundTextbox"))).sendKeys(Jobbackground);	
	  
	  Thread.sleep(2000);
	  
	  
   
				  driver.findElement(By.xpath(objectrepo.getProperty("PostJob"))).click();
				  Thread.sleep(2000);
				  log.info("Page 2 job details completed and post job button is clicked with Multiple Location Selected  ");
 
				  
				  driver.findElement(By.xpath(objectrepo.getProperty("PostMultipleJobText")));
				  log.info("Multiple Jobs to be Posted Dialog Opened ");
				  driver.findElement(By.xpath(objectrepo.getProperty("CancelButton"))).click();
				  log.info("Cancel Button Clicked ");
				  
				  driver.findElement(By.xpath(objectrepo.getProperty("PostJob"))).click();
				  Thread.sleep(2000);
				  log.info("Post job button is clicked again");
				  driver.findElement(By.xpath(objectrepo.getProperty("Post2JobsButton"))).click();
				  Thread.sleep(2000);
				  log.info("Post 2 job button clicked on the Dialog ");
				  
				  driver.getPageSource().contains(JobTitle);
				  Thread.sleep(2000);
			 
				  log.info("Job Was Created Succesfully and also displayed");
				  
				  
				  
 	  Logs =   " log.info(\"Employer Dropdown  Menu Clicked\");\r\n"
							+ "		  log.info(\"Jobs Menu  Clicked\");\r\n"
							+ "		  log.info(\"Add New Job Button Clicke\");\r\n"
							+ "		  log.info(\"Page 1 job details completed and Next button clicked \");\r\n"
							+ "		  log.info(\"Page 2 job details completed and post job button is clicked with Multiple Location Selected  \");\r\n"
							+ "		  log.info(\"Multiple Jobs to be Posted Dialog Opened  \");\r\n"
							+ "		  log.info(\"Cancel Button Clicked \");\r\n"

							+ "		  log.info(\"Post job button is clicked again \");\r\n"

							+ "		  log.info(\"Yes Post JOB iS clicked on the Dialog  \");\r\n"

							+ "		  log.info(\"Mu;ltiple Jobs Posted Successfully \");\r\n"

							;

				  
				   
		   
			    log.info("End TEST-------------------------- EmpAddJobMultiLocations------------------------");     
	    
			    log.info("END=PASSED");
	 AddJobMultiLocations.addResultForTestCase("1155", TEST_CASE_PASSED_STATUS, ""); 	    


		  } 
	  
		  catch (Exception e) {
			  log.info("END=FAILED");
	  AddJobMultiLocations.addResultForTestCase("1155", TEST_CASE_FAILED_STATUS,  e.getMessage()); 	    
		   Assert.fail(e.getMessage());
								 
		 	}
		 }
      
	      


 
  
  
  
  @AfterMethod //AfterMethod annotation - This method executes after every test execution
  public void screenShot(ITestResult result){
  //using ITestResult.FAILURE is equals to result.getStatus then it enter into if condition
  if(ITestResult.FAILURE==result.getStatus()){
  try{
  // To create reference of TakesScreenshot
  TakesScreenshot screenshot=(TakesScreenshot)driver;
  // Call method to capture screenshot
  File src=screenshot.getScreenshotAs(OutputType.FILE);
  // Copy files to specific location 
  // result.getName() will return name of test case so that screenshot name will be same as test case name
  FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"/screenshots/"+result.getName()+new SimpleDateFormat("yyyyMMddhhmm").format(new Date())+".jpg"));

  System.out.println("Successfully captured a screenshot");
  }catch (Exception e){
  System.out.println("Exception while taking screenshot "+e.getMessage());
  } 
  }
  driver.quit();
  }
  
  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }
  
  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	   
 
  
}
