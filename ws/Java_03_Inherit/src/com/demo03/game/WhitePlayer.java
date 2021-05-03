package com.demo03.game;
public class WhitePlayer implements Player{
	private int currentPower = MAX_POWER;
	
	@Override
	public void hit(Player p) {
		System.out.println("Hitting other player");
		p.getDamaged(30);
	}

	@Override
	public void getDamaged(int d) {
		currentPower -= d;
		System.out.println("whiteplayer has current power: "+currentPower);
		if(currentPower <= MIN_POWER) {
			System.out.println("Game over");
		}
	}

	@Override
	public void eatPower(int p) {
		currentPower += p;
		if(currentPower > MAX_POWER) {
			currentPower = MAX_POWER;
		}
		System.out.println("red player has current power: "+currentPower);
	}

	@Override
	public void run() {
		System.out.println("Running on water");
	}
	
}