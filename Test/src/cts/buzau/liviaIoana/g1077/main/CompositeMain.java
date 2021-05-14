package cts.buzau.liviaIoana.g1077.main;

import cts.buzau.liviaIoana.g1077.Composite.Clip;
import cts.buzau.liviaIoana.g1077.Composite.IClip;
import cts.buzau.liviaIoana.g1077.Composite.Playlist;

public class CompositeMain {

	public static void main(String[] args) {
		Playlist playlistmare = new Playlist("Playlisturi Favorite"); 
		// nu pot sa declar cu Iclip deoarece
		//nedorind sa modific interfata iclip
		
		Playlist playlist1 = new Playlist("Videoclipuri lungi");
		Playlist playlist2 = new Playlist("Videoclipuri scurte");
		IClip c1 = new Clip("Clip 1",10);
		IClip c2 = new Clip("Clip 2",40);
		IClip c3 = new Clip("Clip 3",30);
		IClip c4 = new Clip("Clip 4",2);
		IClip c5 = new Clip("Clip 5",5);
		
		playlistmare.adaugaNod(c4);
		playlistmare.adaugaNod(playlist1);
		
		playlistmare.adaugaNod(playlist2);
		
		playlist1.adaugaNod(c2);
		playlist1.adaugaNod(c3);
		
		playlist2.adaugaNod(c1);
		playlist2.adaugaNod(c4);
		playlist2.adaugaNod(c5);
		
		playlistmare.start();
	}

}
