package com.demo03.game;

public class GameDemo {
	public static void main(String[] args) {
		RedPlayer redPlayer = new RedPlayer();
		WhitePlayer whitePlayer = new WhitePlayer();
		
		redPlayer.hit(whitePlayer);
		
		whitePlayer.eatPower(15);
		whitePlayer.eatPower(65);
		
		whitePlayer.hit(redPlayer);
		whitePlayer.hit(redPlayer);
		whitePlayer.hit(redPlayer);
		whitePlayer.hit(redPlayer);
	}
}
