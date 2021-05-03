package com.demo03.game;

public interface Player {
	final int MAX_POWER = 100;
	final int MIN_POWER = 0;

	void hit(Player p);

	void getDamaged(int d);

	void eatPower(int p);

	void run();
}