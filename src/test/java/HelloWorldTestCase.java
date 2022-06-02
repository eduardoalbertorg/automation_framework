import org.testng.annotations.*;

public class HelloWorldTestCase {

    @DataProvider
    public Object[][] getData() {
        // 1st combination: username, password -> good credit history
        // 2nd combination: username, password -> no credit history
        // 3rd combination: username, password -> fraudulent credit history
        Object[][] data = new Object[3][2];

        data[0][0] = "username1";
        data[0][1] = "password1";

        data[1][0] = "username2";
        data[1][1] = "password2";

        data[2][0] = "username3";
        data[2][1] = "password3";

        return data;
    }

    @BeforeTest
    public void beforeTestMethod() {
        System.out.println("Before running test methods");
    }

    @BeforeClass
    public void beforeClassMethod() {
        System.out.println("Running before class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Running before each method");
    }

    @Test(groups = {"smoke"})
    public void helloWorld() {
        System.out.println("hello world!");
    }

    @Parameters({"URL"})
    @Test(dependsOnMethods = {"helloWorld"})
    public void secondTest(String url) {
        System.out.println("Second test case using parameter url: " + url);
    }

    @Test(enabled = false)
    public void thirdTest() {
        System.out.println("This 3rd test case should be skipped");
    }

    @Test(timeOut = 4000)
    public void timeoutTest() {
        System.out.println("This method was able to run before the 4secs timeout");
    }

    @Test(dataProvider = "getData")
    public void usingDataProviderTest(String username, String password) {
        System.out.println("Username: " + username + ", Password: " + password);
    }

    @Test
    public void deprecatedTest() {
        System.out.println("This deprecated test should not run!");
    }

}
