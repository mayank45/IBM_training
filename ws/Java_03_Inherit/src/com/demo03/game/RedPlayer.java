package com.demo03.game;
public class RedPlayer implements Player{
	
	private int currentPower = MAX_POWER;
	
	@Override
	public void hit(Player p) {
		p.getDamaged(40);
		System.out.println("Hitting other player");
	}

	@Override
	public void getDamaged(int d) {
		currentPower -= d;
		System.out.println("red player has current power: "+currentPower);
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
		System.out.println("Flying");
	}
	
}