import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

// Interface which implements TestNG listeners
public class Listeners implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        // screenshot code
        // response if API failed
        System.out.println("I failed you :( -> " +  result.getTestName());
    }


}
