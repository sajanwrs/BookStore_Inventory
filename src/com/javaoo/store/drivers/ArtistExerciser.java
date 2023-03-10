package com.javaoo.store.drivers;

import java.util.TreeSet;

import com.javaoo.store.Artist;

public class ArtistExerciser {

	public static void main(String[] args) {
		
		Artist hotPlate = new Artist();
		
		TreeSet<String>  instruments1 = new TreeSet<>();
		
		instruments1.add("Piano");
		instruments1.add("Clarinet");
		instruments1.add("Hurdy Gurdy");
		instruments1.add("Tuba");
		hotPlate.addMember("Tom", instruments1);	//Adding members to the TreeSet
		
		TreeSet<String> instruments2 = new TreeSet<>();
		
		instruments2.add("Guitar");
		instruments2.add("Saxophone");
		instruments2.add("Drums");
		hotPlate.addMember("Steve", instruments2);
		
		printMemberInstruments(hotPlate, "Tom");
		printMemberInstruments(hotPlate, "Steve");
	}
	private static void printMemberInstruments(Artist artist, String memberName) {
		System.out.println("HotPlate band member " + memberName + " plays:" );
		for(String instrument : artist.getInstruments(memberName)) {
			System.out.println("\t" + instrument);
		}
	}
}
