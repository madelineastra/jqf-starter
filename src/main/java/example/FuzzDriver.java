//good
import edu.berkeley.cs.jqf.fuzz.Fuzz;
import edu.berkeley.cs.jqf.fuzz.JQF;
import org.junit.Assume;
import org.junit.runner.RunWith;
import java.io.IOException;
import java.io.InputStream;
import java.io.File;
import java.io.FileInputStream;

@RunWith(JQF.class)
public class FuzzDriver {

    public static void main(String[] args) {
	FuzzDriver me = new FuzzDriver();
	FileInputStream fis = null;
	try {
	    File inputFile = new File(args[1]);
	    fis = new FileInputStream(inputFile);
	} catch (IOException e) {
	    e.printStackTrace();
	}
	me.fuzz(fis);
    }

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
