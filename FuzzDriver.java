import edu.berkeley.cs.jqf.fuzz.Fuzz;
import edu.berkeley.cs.jqf.fuzz.JQF;
import org.junit.Assume;
import org.junit.runner.RunWith;
import java.io.IOException;
import java.io.InputStream;

@RunWith(JQF.class)
public class FuzzDriver {

    @Fuzz /* JQF will generate inputs to this method */
    public void fuzz(InputStream input)  {
	// Init code here
	System.out.println("Test code");
	/*
        try {
	    // Test case here
        } catch (IOException e) {
            // This exception signals invalid input and not a test failure
            Assume.assumeNoException(e);
        }
	*/
    }
}
