package com.chenly.designpattern.builder;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author cly
 * @create 2020-09-07 21:24
 */
public class Computer {
	private String cpu ;

	private String ssd;

	private String mainBoard ;

	private String memory ;

	private String power;

	private String box;

	private String graphics;

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getSsd() {
		return ssd;
	}

	public void setSsd(String ssd) {
		this.ssd = ssd;
	}

	public String getMainBoard() {
		return mainBoard;
	}

	public void setMainBoard(String mainBoard) {
		this.mainBoard = mainBoard;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getBox() {
		return box;
	}

	public void setBox(String box) {
		this.box = box;
	}

	public String getGraphics() {
		return graphics;
	}

	public void setGraphics(String graphics) {
		this.graphics = graphics;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("cpu", cpu)
				.append("ssd", ssd)
				.append("mainBoard", mainBoard)
				.append("memory", memory)
				.append("power", power)
				.append("box", box)
				.append("graphics", graphics)
				.toString();
	}


}
