/**
 * @author Narendra Borhade
 *
 */
package com.design.patterns.builder;

public class Computer {

	private String company;
	private String hardDisk;
	private String ram;
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;
	
	private Computer(ComputerBuilder computerBuilder) {
		super();
		this.company = computerBuilder.company;
		this.hardDisk = computerBuilder.hardDisk;
		this.ram = computerBuilder.ram;
		this.isGraphicsCardEnabled = computerBuilder.isGraphicsCardEnabled;
		this.isBluetoothEnabled = computerBuilder.isBluetoothEnabled;
	}

	public String getCompany() {
		return company;
	}

	public String getHardDisk() {
		return hardDisk;
	}

	public String getRam() {
		return ram;
	}

	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	@Override
	public String toString() {
		return "Computer [company=" + company + ", hardDisk=" + hardDisk + ", ram=" + ram + ", isGraphicsCardEnabled="
				+ isGraphicsCardEnabled + ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}

	public static class ComputerBuilder{
		
		//Required parameters
		private String company;
		private String hardDisk;
		private String ram;
		
		//Optional parameters
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;
		
		public ComputerBuilder(String company, String hardDisk, String ram) {
			super();
			this.company = company;
			this.hardDisk = hardDisk;
			this.ram = ram;
		}
		
		public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}
		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}
		
		public Computer build(){
			return new Computer(this);
		}

		@Override
		public String toString() {
			return "ComputerBuilder [company=" + company + ", hardDisk=" + hardDisk + ", ram=" + ram
					+ ", isGraphicsCardEnabled=" + isGraphicsCardEnabled + ", isBluetoothEnabled=" + isBluetoothEnabled
					+ "]";
		}
		
	}
}
