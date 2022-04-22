package com.wipro.inheritence;

public class Android13 extends AndroidKitKat {
    
	String android13Feature;
	
	
	public void sentAudioVideo() {
		System.out.println("Audio and Videio Messages");
		System.out.println(version);
		System.out.println(kitKatFeature);
		System.out.println(android13Feature);
	}
	
	
	public static void main(String[] args) {
		
		
		Android13 android13=new Android13();
		android13.version=13;
		android13.kitKatFeature="SMS";
		android13.android13Feature="Audio and Video";
		
		android13.sentMessage();
		android13.sentAudioVideo();
		
		
		
		
		
		
		
	}
	
}
