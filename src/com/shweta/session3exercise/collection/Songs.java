package com.shweta.session3exercise.collection;

public class Songs {

	private int id;
	private String songName;
	private String songWriter;
	private String singer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getSongWriter() {
		return songWriter;
	}
	public void setSongWriter(String songWriter) {
		this.songWriter = songWriter;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public Songs(int id, String songName, String songWriter, String singer) {
		super();
		this.id = id;
		this.songName = songName;
		this.songWriter = songWriter;
		this.singer = singer;
	}
	
	public Songs() {}
	
	
}
