import java.io.File;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;
import BaseTest;

public class Screenshot extends TestListenerAdapter {

@Override
public void onTestFailure(ITestResult result) {
File file = new File("");

Reporter.setCurrentTestResult(result);
System.out.println(file.getAbsolutePath());
Reporter.<span class="IL_AD" id="IL_AD2">log</span>(file.getAbsolutePath());

Reporter.log("screenshot saved at "+file.getAbsolutePath()+"\\reports\\"+result.getName()+".jpg");
Reporter.log("<a href='../"+result.getName()+".jpg' <img src='../"+result.getName()+".jpg' hight='100' width='100'/> </a>");
BaseClass.selenium.captureScreenshot(file.getAbsolutePath()+"\\reports\\"+result.getName()+".jpg");
Reporter.setCurrentTestResult(<span class="IL_AD" id="IL_AD12">null</span>);
}


}

