package pInheritance;

public class Computer{

	protected String manufacturer;
	protected String processor;
	protected int ramSize;
	protected int diskSize;
	private int count = 0;
	
	public Computer(String manufacturer, String processor, int ramSize, int diskSize)
	{
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.diskSize = diskSize;
		count++;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public int getRamSize() {
		return ramSize;
	}

	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}

	public int getDiskSize() {
		return diskSize;
	}

	public void setDiskSize(int diskSize) {
		this.diskSize = diskSize;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public String toString()
	{
		return "Manufacturer: " + manufacturer + "\nProcessor: " + processor + "\nRam Size: " + ramSize + "\nDisk Space: " + diskSize;
	}
	
	
}
