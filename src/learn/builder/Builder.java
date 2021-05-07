package learn.builder;

  class Builder{
	private String brand;
	private String ram;
	private String processor;
	private String diskCapacity;
	private String processorGeneration;
	
	public Builder withBrand(String brand) {
		this.brand=brand;
		return this;
	}
	public Builder withRam(String ram) {
		this.ram=ram;
		return this;
	}
	public Builder withProcessor(String processor) {
		this.processor=processor;
		return this;
	}
	public Builder withDiskCapacity(String diskCapacity) {
		this.diskCapacity=diskCapacity;
		return this;
	}
	public Builder withProcessorGeneration(String processorGeneration) {
		this.processorGeneration=processorGeneration;
		return this;
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
	public Laptop build() {
		return new Laptop(this);
	}
}
