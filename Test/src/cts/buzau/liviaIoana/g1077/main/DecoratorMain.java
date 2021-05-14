package cts.buzau.liviaIoana.g1077.main;

import cts.buzau.liviaIoana.g1077.Decorator.AbstractDecoratorClipReclame;
import cts.buzau.liviaIoana.g1077.Decorator.ClipTutorial;
import cts.buzau.liviaIoana.g1077.Decorator.ClipVideoLive;
import cts.buzau.liviaIoana.g1077.Decorator.DecoratorClipTutorial;
import cts.buzau.liviaIoana.g1077.Decorator.DecoratorClipVideoReclame;
import cts.buzau.liviaIoana.g1077.Decorator.IClip;

public class DecoratorMain {
	public static void main(String[] args) {
		IClip clip = new ClipVideoLive("Video1", 20);
		System.out.println("Acesta este un videoclip fara reclame");
		clip.start();
		
		IClip clipTutorial = new ClipTutorial("Video1", 20);
		System.out.println("Acesta este un tutorial fara reclame");
		clipTutorial.start();
		System.out.println("-------------reclame-----------");
		
		AbstractDecoratorClipReclame decoratorReclameLive = new DecoratorClipVideoReclame(clip, 10);
		System.out.println("Acesta este un videoclip cu reclame");
		decoratorReclameLive.start();
		decoratorReclameLive.afiseazaReclama();
		
		AbstractDecoratorClipReclame decoratorReclameTutorial = new DecoratorClipTutorial(clipTutorial, 5);
		System.out.println("Acesta este un tutorial cu reclame");
		decoratorReclameTutorial.start();
		decoratorReclameTutorial.afiseazaReclama();
	}
}
