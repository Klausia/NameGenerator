import org.junit.Assert;
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
		
		Assert.assertEquals("Adam", g.generateName());
	}
	
}
