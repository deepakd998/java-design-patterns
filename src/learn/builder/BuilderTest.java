package learn.builder;

public class BuilderTest {

	public static void main(String[] args) {
		Laptop myLapi = new Builder().withBrand("DELL").withProcessor("Intel I9")
				.withProcessorGeneration("11th Generation").withDiskCapacity("1TB SSD")
				.withRam("16GB").build();
		
		System.out.println(myLapi);

	}

}
