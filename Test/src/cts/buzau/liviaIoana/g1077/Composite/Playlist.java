package cts.buzau.liviaIoana.g1077.Composite;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements IClip {

	List<IClip> listaClipuri;
	private String denumirePlaylist;
	
	
	public Playlist( String denumirePlaylist) {
		listaClipuri = new ArrayList<IClip>();
		this.denumirePlaylist = denumirePlaylist;
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void start() {
		System.out.println("S-a pornit Playlistul: "+ denumirePlaylist);
		for(IClip clip:listaClipuri) {
			clip.start();
		}
		
	}
	
	public void stergeNod(IClip clip) {
		listaClipuri.remove(clip);
	}

	public void adaugaNod(IClip clip) {
		listaClipuri.add(clip);
	}

	public IClip getNod(int index) {
		return listaClipuri.get(index);
	}

}
