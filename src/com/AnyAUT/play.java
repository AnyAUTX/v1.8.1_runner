package com.AnyAUT;

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

		InputStream in = new FileInputStream("StarWars60.wav");

		// Create an AudioStream object from the input stream.
		AudioStream as = new AudioStream(in);         

		// Use the static class member "player" from class AudioPlayer to play
		// clip.
		AudioPlayer.player.start(as);            

		AudioPlayer.player.stop();
	}

}
