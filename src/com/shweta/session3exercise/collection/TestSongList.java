package com.shweta.session3exercise.collection;

import java.util.ArrayList;
import java.util.List;

public class TestSongList {

	public static void main(String[] args) {
		
		Songs s1 = new Songs(1, "Beyond the sea", "Charles Trenet", "Bobby Darin");
		Songs s2 = new Songs(2, "Grow old with you", "Robbie Hart", "Adam Sandler");
		Songs s3 = new Songs(3, "Baby I Love Your Way", "Big Mountain", "Big Mountain");
		Songs s4 = new Songs(4, "Magic", "Billy Lyall and David Paton", "Nasri");
		
		List<Songs> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		System.out.println("Welcome to the Songs list");
		System.out.println("----------------------------------------------------------------");
		
		for(Songs song : list) {
			
			System.out.println("ID "+song.getId()+ ", Song name "+song.getSongName()+
					", Writer "+song.getSongWriter()+ ", Singer "+ song.getSinger());
			
			System.out.println("----------------------------------------------------------------");
			
		}
}
}