package com.AnyAUT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class play {

	public static void main(String[] args) throws IOException {
		//** add this into your application code as appropriate
		// Open an input stream  to the audio file.

		/*
		InputStream in = new FileInputStream("StarWars60.wav");

		// Create an AudioStream object from the input stream.
		AudioStream as = new AudioStream(in);         

		// Use the static class member "player" from class AudioPlayer to play
		// clip.
		AudioPlayer.player.start(as);            

		AudioPlayer.player.stop();
		*/
		/*
		 
		String fullPath = "C:\\Hello\\AnotherFolder\\The File Name.PDF";
		int index = fullPath.lastIndexOf("\\");
		String fileName = fullPath.substring(index + 1);
		System.out.println(fileName);
		*/

		/*
		String strTestRunLocation = "C:\\CTAF-Main-SourceCode-v0.94\\CTAF_V0.94_GIT\\Demo_Small.xls";
		File f = new File(strTestRunLocation);
		String vFileName = f.getName().toString();
		System.out.println(vFileName);
		String[] vExcelName =  vFileName.split("\\.");
		System.out.println(vExcelName[0]);
		f = null;
		*/
		
		String string = "jh32kjrfdfdjh32fgdfjh32g";

		// Anywhere
		boolean b = string.matches("(?i).*jh32.*");
		
		if(b){
			System.out.println("Yoooo");
		} else {
			System.out.println("Naaaaa ");
		}
	}

}
