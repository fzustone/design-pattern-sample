package com.chenly.designpattern.builder;

/**
 * 装机猿
 *
 * @author cly
 * @create 2020-09-07 21:23
 */
public class MonkeyBuilder implements Builder {
	private Computer computer = new Computer();

	@Override
	public void assembleCpu(String cpu) {
		this.computer.setCpu(cpu);
	}

	@Override
	public void assembleMainBoard(String mainBoard) {
		this.computer.setMainBoard(mainBoard);
	}

	@Override
	public void assembleGraphics(String graphics) {
		this.computer.setGraphics(graphics);
	}

	@Override
	public void assemblePower(String power) {
		this.computer.setPower(power);
	}

	@Override
	public void assembleBox(String box) {
		this.computer.setBox(box);
	}

	@Override
	public void assembleMemory(String memory) {
		this.computer.setMemory(memory);
	}

	@Override
	public void assembleSsd(String ssd) {
		this.computer.setSsd(ssd);
	}

	@Override
	public Computer assembleComputer() {
		return this.computer;
	}
}
