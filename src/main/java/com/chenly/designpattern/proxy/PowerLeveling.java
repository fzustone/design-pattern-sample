package com.chenly.designpattern.proxy;

/**
 * 游戏代练
 *
 * @author cly
 * @create 2020-09-09 21:29
 */
public class PowerLeveling implements HonorOfKingsPlayer {

	private final HonorOfKingsPlayer honorOfKingsPlayer;

	public PowerLeveling(HonorOfKingsPlayer honorOfKingsPlayer) {
		this.honorOfKingsPlayer = honorOfKingsPlayer;
	}

	@Override
	public void rank() {
		System.out.println("代练开始工作");
		this.honorOfKingsPlayer.rank();
	}
}
