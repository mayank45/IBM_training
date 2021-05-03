package com.demo03.mp3;

import java.util.Set;
import java.util.TreeSet;

class Song implements Comparable<Song>{
//	title, track, releasedOn, artist, singer, 
	String title;
	Song(String title){
		this.title = title;
	}
	@Override
	public String toString() {
		return "Song [title=" + title + "]";
	}
	@Override
	public int compareTo(Song s) {
		return this.title.compareTo(s.title);
	}
	
}

class Mp3Player{
//	Comparator<Song> c= new Comparator<Song>() {
//		@Override
//		public int compare(Song s1, Song s2) {
//			return s1.title.compareTo(s2.title);
//		}
//	};
	private Set<Song> songs = new TreeSet<Song>();

	public void insert(Song song) {
		songs.add(song);
	}

	public void list() {
		System.out.println(songs);
	}
	
}

public class Mp3PlayerDemo {
	public static void main(String[] args) {
		Mp3Player player = new Mp3Player();
		player.insert(new Song("Oh Carol"));
		player.insert(new Song("Baby"));
		player.insert(new Song("When you love someone"));
		player.insert(new Song("Oh Carol"));
		player.insert(new Song("Baby"));
		player.insert(new Song("When you love someone"));
		
		player.list();
	}
}
