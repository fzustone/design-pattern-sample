package com.chenly.designpattern.builder;

/**
 * @author cly
 * @create 2020-09-07 21:16
 */
public interface Builder {

	void assembleCpu(String cpu);

	void assembleMainBoard(String mainBoard);

	void assembleGraphics(String graphics);

	void assemblePower(String power);

	void assembleBox(String box);

	void assembleMemory(String memory);

	void assembleSsd(String ssd);

	Computer assembleComputer();
}
