package study.ch3_1;

public class Computer {
	private String manufactuer;
	private String processor;
	private int ramSize;
	private int diskSize;
	private double processorSpeed;
	
	public Computer(String manufactuer, String processor, int ramSize, int diskSize, double processorSpeed) {
		this.manufactuer = manufactuer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.diskSize = diskSize;
		this.processorSpeed = processorSpeed;
	}
	
	public double computePower() {
		return ramSize * processorSpeed;
	}
	
	public double getRamSize() {
		return ramSize;
	}
	
	public double getProcessorSpeed() {
		return processorSpeed;
	}
	
	public int getDiskSize() {
		return diskSize;
	}
	
	public String toString() {
		String result = "Computer Object"+
						"\nmanufactuer: " + manufactuer +
						"\nCPU: " + processor +
						"\nRAM: " + ramSize + "megabytes" +
						"\nDisk: " + diskSize +" gigabytes" +
						"\nProcessor speed: " + processorSpeed + " gigahertz";
		return result;
	}
}
