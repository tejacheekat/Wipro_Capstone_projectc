package Run;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
// "I opened the RunWith Class to run the Cucumber File"
    @RunWith(Cucumber.class)
	@CucumberOptions(
			features="src/test/java/Cucumber/plug.feature")
	public class LoginTestRunner {

	


}
