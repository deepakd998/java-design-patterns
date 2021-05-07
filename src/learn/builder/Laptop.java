package learn.builder;

public class Laptop {
	private String brand;
	private String ram;
	private String processor;
	private String diskCapacity;
	private String processorGeneration;
	

	public Laptop(Builder builder) {
		this.brand = builder.getBrand();
		this.ram = builder.getRam();
		this.processor = builder.getProcessor();
		this.diskCapacity = builder.getDiskCapacity();
		this.processorGeneration = builder.getProcessorGeneration();	
	}
	

	public String getBrand() {
		return brand;
	}

	public String getRam() {
		return ram;
	}

	public String getProcessor() {
		return processor;
	}

	public String getDiskCapacity() {
		return diskCapacity;
	}

	public String getProcessorGeneration() {
		return processorGeneration;
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", ram=" + ram + ", processor=" + processor + ", diskCapacity=" + diskCapacity
				+ ", processorGeneration=" + processorGeneration + "]";
	}
	
	
}
