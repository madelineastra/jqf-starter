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
	    File inputFile = new File(args[0]);
	    fis = new FileInputStream(inputFile);
	} catch (IOException e) {
	    e.printStackTrace();
	}
	me.fuzz(fis);
    }

        private String stringfromIs(InputStream is)
	throws IOException {

	StringBuilder textBuilder = new StringBuilder();
	try (Reader reader = new BufferedReader(new InputStreamReader
						(is, Charset.forName(StandardCharsets.UTF_8.name())))) {
	    int c = 0;
	    while ((c = reader.read()) != -1) {
		textBuilder.append((char) c);
	    }
	}
	return textBuilder.toString();
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
