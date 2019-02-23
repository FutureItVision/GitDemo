package BasicTest;

public class ScriptBase {
    protected WebDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {

        DesiredCapabilities dc = DesiredCapabilities.chrome();

        if (System.getProperty("browser").equals("firefox"))
            dc = DesiredCapabilities.firefox();

        String host = System.getProperty("seleniumHubHost");

        driver = new RemoteWebDriver(new URL("http://" + host + ":4444/wd/hub"), dc);

    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        driver.quit();
    }
}
}
