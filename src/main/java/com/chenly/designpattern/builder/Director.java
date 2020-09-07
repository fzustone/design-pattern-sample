package com.chenly.designpattern.builder;

/**
 * @author cly
 * @create 2020-09-07 21:35
 */
public class Director {
	private final Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public Computer createComputer(String cpu, String ssd, String mainBoard, String memory, String graphics, String box,
			String power) {
		this.builder.assembleCpu(cpu);
		this.builder.assembleGraphics(graphics);
		this.builder.assembleMainBoard(mainBoard);
		this.builder.assembleMemory(memory);
		this.builder.assembleSsd(ssd);
		this.builder.assemblePower(power);
		this.builder.assembleBox(box);

		return this.builder.assembleComputer();
	}

}
