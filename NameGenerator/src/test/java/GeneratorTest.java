import org.junit.Assert;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class GeneratorTest {

	@Test
	public void CreateGeneratorClass(){
		Generator g = new Generator();
		
		Assert.assertNotNull(g);
	}
	
	@Test
	public void TryToGenerateAdam(){
		Generator g = new Generator();
		
		Assert.assertThat(g.generateName(), either(is("Adam")).or(is("Klausia")));
	}
	
}
