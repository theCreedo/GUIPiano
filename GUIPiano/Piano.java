package gui;

//*** 3/25 -10 late
//*** I don't see the quit frame, so i can't count it's stuff

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.*;
import java.io.*;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.swing.*;
import javax.swing.*;

import sun.audio.*;

import java.text.*;
/*/
 * Creates the Piano Class
 */
public class Piano extends JFrame implements MouseListener, KeyListener, ActionListener{
	boolean check = false;
	ImageIcon piano = new ImageIcon("piano.jpg");
	JLabel main = new JLabel(piano);
	Notes n;
    AudioStream audioStream;
	
	JPanel top = new JPanel(new BorderLayout());
	JLabel note = new JLabel("");
	
	MenuBar menuBar = new MenuBar();
	
	
	Menu optionsMenu = new Menu("Options");
	
	Menu color = new Menu("Change Color...");
	MenuItem white= new MenuItem("White");
	MenuItem black= new MenuItem("Black");
	MenuItem red = new MenuItem("Red");
	MenuItem blue = new MenuItem("Blue");
	MenuItem green= new MenuItem("Green");
	MenuItem pink = new MenuItem("Pink");
	
	MenuItem quit = new MenuItem("Quit");
	/*
	 * Default Constructor of Piano class
	 */
	Piano()
	{
		super("Piano");
		String gongFile = "C1.wav";
    	try
    	{
	    	InputStream in = new FileInputStream(gongFile);
			// create an audiostream from the inputstream
	    audioStream = new AudioStream(in);
		AudioPlayer.player.stop(audioStream);}
    	catch(FileNotFoundException i)
    	{
    	}
    	catch(IOException i)
    	{
    		
    	}
    	catch(NullPointerException i)
    	{
    		
    	}
    	n = new Notes();
		addKeyListener(this);
		top.add(note);
		menuBar.add(optionsMenu);
		white.addActionListener(this);
		black.addActionListener(this);
		red.addActionListener(this);
		blue.addActionListener(this);
		green.addActionListener(this);
		pink.addActionListener(this);
		quit.addActionListener(this);
		color.add(white);
		color.add(black);
		color.add(red);
		color.add(blue);
		color.add(green);
		color.add(pink);
		
//		sound.setActionCommand(new EventHandler<ActionEvent>() {
//		    public void handle(ActionEvent t) {
//		        System.exit(0);
//		    }
//		});
		optionsMenu.add(color);
		optionsMenu.add(quit);
		setMenuBar(menuBar);
		
		setBounds(250, 1000, 1130, 180);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addMouseListener(this);
		setResizable(false); //102
		setLocationByPlatform(true);
		add(main,BorderLayout.CENTER);
		setVisible(true);
		
	}
	/*
	 * No Action when mouse is released
		 * @param e the given mouseEvent
	 */
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		/*
		 * No Action when mouse is pressed
		 * @param e the given mouseEvent
		 */
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
		}

		/*
		 * No Action when mouse is released
		 * @param e the given mouseEvent
		 */
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		/*
		 * No Action when mouse is entered
		 * @param e the given mouseEvent
		 */
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
		}

		/*
		 * When mouse is clicked, plays the note of the key hit and shows the note
		 * that the mouse clicked
		 * @param e the given mouseEvent
		 */
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
							System.out.println ("X: "+ e.getX() + " Y: " + e.getY() );
			//C-1
			if(e.getX()>=0 && e.getY() >127 && e.getX() <40 && e.getY() <178)
			{
			String gongFile = "C1.wav";
			
			n.change("C-1");
	    	try
	    	{
	    		AudioPlayer.player.stop(audioStream);
	    	InputStream in = new FileInputStream(gongFile);
 
 			// create an audiostream from the inputstream
		    audioStream = new AudioStream(in);
			AudioPlayer.player.start(audioStream);}
	    	catch(FileNotFoundException i)
	    	{
	    	}
	    	catch(IOException i)
	    	{
	    		
	    	}
	    	catch(NullPointerException i)
	    	{
	    		
	    	}
		    // play the audio clip with the audioplayer class

			}
			//C/D-2
			if(e.getX()>=30 && e.getY() >0 && e.getX() <51 && e.getY() <127)
			{
			String gongFile = "CD2.wav";
			
			n.change("C/D-2");
	    	try
	    	{
	    		AudioPlayer.player.stop(audioStream);
	    	InputStream in = new FileInputStream(gongFile);
 
 			// create an audiostream from the inputstream
		    audioStream = new AudioStream(in);
			AudioPlayer.player.start(audioStream);}
	    	catch(FileNotFoundException i)
	    	{
	    	}
	    	catch(IOException i)
	    	{
	    		
	    	}
			}
			//D-3
			if(e.getX()>=40 && e.getY() >127 && e.getX() <81 && e.getY() <178)
			{
			String gongFile = "D3.wav";
			
			n.change("D-3");
	    	try
	    	{
	    		AudioPlayer.player.stop(audioStream);
	    	InputStream in = new FileInputStream(gongFile);
 
 			// create an audiostream from the inputstream
		     audioStream = new AudioStream(in);
			AudioPlayer.player.start(audioStream);}
	    	catch(FileNotFoundException i)
	    	{
	    	}
	    	catch(IOException i)
	    	{
	    		
	    	}
			}
			//D/E-4
			if(e.getX()>=70 && e.getY() >0 && e.getX() <91 && e.getY() <127)
			{
			String gongFile = "DE4.wav";
			
			n.change("D/E-4");
	    	try
	    	{
	    		AudioPlayer.player.stop(audioStream);
	    	InputStream in = new FileInputStream(gongFile);
 
 			// create an audiostream from the inputstream
		     audioStream = new AudioStream(in);
			AudioPlayer.player.start(audioStream);}
	    	catch(FileNotFoundException i)
	    	{
	    	}
	    	catch(IOException i)
	    	{
	    		
	    	}
			}
			//E-5
			if(e.getX()>=81 && e.getY() >127 && e.getX() <121 && e.getY() <178)
			{
			String gongFile = "E5.wav";
			
			n.change("E-5");
	    	try
	    	{
	    		AudioPlayer.player.stop(audioStream);
	    	InputStream in = new FileInputStream(gongFile);
 
 			// create an audiostream from the inputstream
		     audioStream = new AudioStream(in);
			AudioPlayer.player.start(audioStream);}
	    	catch(FileNotFoundException i)
	    	{
	    	}
	    	catch(IOException i)
	    	{
	    		
	    	}
				System.out.println ("E-5");
			}
			//F-6
			if(e.getX()>=121 && e.getY() >127 && e.getX() <162 && e.getY() <178)
			{
			String gongFile = "F6.wav";
			
			n.change("F-6");
	    	try
	    	{
	    		AudioPlayer.player.stop(audioStream);
	    	InputStream in = new FileInputStream(gongFile);
 
 			// create an audiostream from the inputstream
		     audioStream = new AudioStream(in);
			AudioPlayer.player.start(audioStream);}
	    	catch(FileNotFoundException i)
	    	{
	    	}
	    	catch(IOException i)
	    	{
	    		
	    	}
				System.out.println ("F-6");
			}
			//F/G-7
			if(e.getX()>=151 && e.getY() >0 && e.getX() <171 && e.getY() <127)
			{
			String gongFile = "FG7.wav";
			
			n.change("F/G-7");
	    	try
	    	{
	    		AudioPlayer.player.stop(audioStream);
	    	InputStream in = new FileInputStream(gongFile);
 
 			// create an audiostream from the inputstream
		     audioStream = new AudioStream(in);
			AudioPlayer.player.start(audioStream);}
	    	catch(FileNotFoundException i)
	    	{
	    	}
	    	catch(IOException i)
	    	{
	    		
	    	}
				System.out.println ("F/G-7");
			}
			//G-8
			if(e.getX()>=162 && e.getY() >127 && e.getX() <201 && e.getY() <178)
			{
			String gongFile = "G8.wav";
			
			n.change("G-8");
	    	try
	    	{
	    		AudioPlayer.player.stop(audioStream);
	    	InputStream in = new FileInputStream(gongFile);
 
 			// create an audiostream from the inputstream
		    audioStream = new AudioStream(in);
			AudioPlayer.player.start(audioStream);}
	    	catch(FileNotFoundException i)
	    	{
	    	}
	    	catch(IOException i)
	    	{
	    		
	    	}
				System.out.println ("G-8");
			}
			//G/A-9
			if(e.getX()>=191 && e.getY() >0 && e.getX() <212 && e.getY() <127)
			{
			String gongFile = "GA9.wav";
			
			n.change("G/A-9");
	    	try
	    	{
	    		AudioPlayer.player.stop(audioStream);
	    	InputStream in = new FileInputStream(gongFile);
 
 			// create an audiostream from the inputstream
		     audioStream = new AudioStream(in);
			AudioPlayer.player.start(audioStream);}
	    	catch(FileNotFoundException i)
	    	{
	    	}
	    	catch(IOException i)
	    	{
	    		
	    	}
				System.out.println ("G/A-9");
			}
			//A-10
			if(e.getX()>=201 && e.getY() >127 && e.getX() <242 && e.getY() <178)
			{
			String gongFile = "A10.wav";
			
			n.change("A-10");
	    	try
	    	{
	    		AudioPlayer.player.stop(audioStream);
	    	InputStream in = new FileInputStream(gongFile);
 
 			// create an audiostream from the inputstream
		     audioStream = new AudioStream(in);
			AudioPlayer.player.start(audioStream);}
	    	catch(FileNotFoundException i)
	    	{
	    	}
	    	catch(IOException i)
	    	{
	    		
	    	}
				System.out.println ("A-10");
			}
			//A/B-11
			if(e.getX()>=232 && e.getY() >0 && e.getX() <252 && e.getY() <127)
			{
			String gongFile = "AB11.wav";
			
			n.change("A/B-11");
	    	try
	    	{
	    		AudioPlayer.player.stop(audioStream);
	    	InputStream in = new FileInputStream(gongFile);
 
 			// create an audiostream from the inputstream
		     audioStream = new AudioStream(in);
			AudioPlayer.player.start(audioStream);}
	    	catch(FileNotFoundException i)
	    	{
	    	}
	    	catch(IOException i)
	    	{
	    		
	    	}
				System.out.println ("A/B-11");
			}
			//B-12
			if(e.getX()>=242 && e.getY() >127 && e.getX() <282 && e.getY() <178)
			{
			String gongFile = "B12.wav";
			
			n.change("B-12");
	    	try
	    	{
	    		AudioPlayer.player.stop(audioStream);
	    	InputStream in = new FileInputStream(gongFile);
 
 			// create an audiostream from the inputstream
		     audioStream = new AudioStream(in);
			AudioPlayer.player.start(audioStream);}
	    	catch(FileNotFoundException i)
	    	{
	    	}
	    	catch(IOException i)
	    	{
	    		
	    	}
				System.out.println ("B-12");
			}
			
			
			
			
			
			//C-13
			if(e.getX()>=282 && e.getY() >127 && e.getX() <322 && e.getY() <178)
			{
				String gongFile = "C13.wav";
				
				n.change("C-13");
	    	try
	    	{
	    		AudioPlayer.player.stop(audioStream);
	    	InputStream in = new FileInputStream(gongFile);
 
 			// create an audiostream from the inputstream
		     audioStream = new AudioStream(in);
			AudioPlayer.player.start(audioStream);}
	    	catch(FileNotFoundException i)
	    	{
	    	}
	    	catch(IOException i)
	    	{
	    		
	    	}
				System.out.println ("C-13");
			}
			//C/D-14
			if(e.getX()>=312 && e.getY() >0 && e.getX() <333 && e.getY() <127)
			{
				String gongFile = "CD14.wav";
				
				n.change("C/D-14");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			     audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}
				System.out.println ("C/D-14");
			}
			//D-15
			if(e.getX()>=322 && e.getY() >127 && e.getX() <363 && e.getY() <178)
			{
				String gongFile = "D15.wav";
				
				n.change("D-15");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			     audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}
				System.out.println ("D-15");
			}
			//D/E-16
			if(e.getX()>=352 && e.getY() >0 && e.getX() <373 && e.getY() <127)
			{
				String gongFile = "DE16.wav";
				
				n.change("D/E-16");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			     audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}
				System.out.println ("D/E-16");
			}
			//E-17
			if(e.getX()>=363 && e.getY() >127 && e.getX() <403 && e.getY() <178)
			{
				String gongFile = "E17.wav";
				
				n.change("E-17");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			     audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}
				System.out.println ("E-17");
			}
			//F-18
			if(e.getX()>=403 && e.getY() >127 && e.getX() <433 && e.getY() <178)
			{
				String gongFile = "F18.wav";
				
				n.change("F-18");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}
				System.out.println ("F-18");
			}
			//F/G-19
			if(e.getX()>=433 && e.getY() >0 && e.getX() <453 && e.getY() <127)
			{
				String gongFile = "FG19.wav";
				
				n.change("F/G-19");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			     audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}
				System.out.println ("F/G-19");
			}
			//G-20
			if(e.getX()>=443 && e.getY() >127 && e.getX() <483 && e.getY() <178)
			{
				String gongFile = "G20.wav";
				
				n.change("G-20");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			     audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}
				System.out.println ("G-20");
			}
			//G/A-21
			if(e.getX()>=473 && e.getY() >0 && e.getX() <493 && e.getY() <127)
			{
				String gongFile = "GA21.wav";
				
				n.change("G/A-21");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			     audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}
				System.out.println ("G/A-21");
			}
			//A-22
			if(e.getX()>=483 && e.getY() >127 && e.getX() <524 && e.getY() <178)
			{
				String gongFile = "A22.wav";
				
				n.change("A-22");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			     audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}
				System.out.println ("A-22");
			}
			//A/B-23
			if(e.getX()>=514 && e.getY() >0 && e.getX() <534 && e.getY() <127)
			{
				String gongFile = "AB23.wav";
				
				n.change("A/B-23");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			     audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}
				System.out.println ("A/B-23");
			}
			//B-24
			if(e.getX()>=524 && e.getY() >127 && e.getX() <564 && e.getY() <178)
			{
				String gongFile = "B24.wav";
				
				n.change("B-24");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			     audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}
				System.out.println ("B-24");
			}
			
			
			
			
			
			//C-25
			if(e.getX()>=564 && e.getY() >102 && e.getX() <604 && e.getY() <178)
			{
				String gongFile = "C25.wav";
				
				n.change("C-25");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			     audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}
				System.out.println ("C-25");
			}
			//C/D-26
			if(e.getX()>=594 && e.getY() >0 && e.getX() <615 && e.getY() <127)
			{
				String gongFile = "CD26.wav";
				
				n.change("C/D-26");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			     audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}
				System.out.println ("C/D-26");
			}
			//D-27
			if(e.getX()>=604 && e.getY() >127 && e.getX() <644 && e.getY() <178)
			{
				String gongFile = "D27.wav";
				
				n.change("D-27");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			     audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}
				System.out.println ("D-27");
			}
			//D/E-28
			if(e.getX()>=634 && e.getY() >0 && e.getX() <655 && e.getY() <127)
			{
				String gongFile = "DE28.wav";
				
				n.change("D/E-28");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			     audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}
				System.out.println ("D/E-28");
			}
			//E-29
			if(e.getX()>=644 && e.getY() >127 && e.getX() <685 && e.getY() <178)
			{
				String gongFile = "E29.wav";
				
				n.change("E-29");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			     audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}
				System.out.println ("E-29");
			}
			//F-30
			if(e.getX()>=685 && e.getY() >127 && e.getX() <725 && e.getY() <178)
			{
				String gongFile = "F30.wav";
				
				n.change("F-30");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			     audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}
				System.out.println ("F-30");
			}
			//F/G-31
			if(e.getX()>=715 && e.getY() >0 && e.getX() <735 && e.getY() <127)
			{
				String gongFile = "FG31.wav";
				
				n.change("F/G-31");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			     audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}
				System.out.println ("F/G-31");
			}
			//G-32
			if(e.getX()>=725 && e.getY() >127 && e.getX() <765 && e.getY() <178)
			{
				String gongFile = "G32.wav";
				
				n.change("G-32");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			     audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}
				System.out.println ("G-32");
			}
			//G/A-33
			if(e.getX()>=755 && e.getY() >0 && e.getX() <775 && e.getY() <127)
			{
				String gongFile = "GA33.wav";
				
				n.change("G/A-33");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			     audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}
				System.out.println ("G/A-33");
			}
			//A-34
			if(e.getX()>=765 && e.getY() >127 && e.getX() <806 && e.getY() <178)
			{
				String gongFile = "A34.wav";
				
				n.change("A-34");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			     audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}
				System.out.println ("A-34");
			}
			//A/B-35
			if(e.getX()>=796 && e.getY() >0 && e.getX() <816 && e.getY() <127)
			{
				String gongFile = "AB35.wav";
				
				n.change("A/B-35");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			     audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}
				System.out.println ("A/B-35");
			}
			//B-36
			if(e.getX()>=806 && e.getY() >127 && e.getX() <846 && e.getY() <178)
			{
				String gongFile = "B36.wav";
				
				n.change("B-36");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			     audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}
				System.out.println ("B-36");
			}
			
			
			
			
			
			//C-37
			if(e.getX()>=846 && e.getY() >127 && e.getX() <886 && e.getY() <178)
			{
				String gongFile = "C37.wav";
				
				n.change("C-37");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			     audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}
				System.out.println ("C-37");
			}
			//C/D-38
			if(e.getX()>=876 && e.getY() >0 && e.getX() <896 && e.getY() <127)
			{
				String gongFile = "CD38.wav";
				
				n.change("C/D-38");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			     audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}
				System.out.println ("C/D-38");
			}
			//D-39
			if(e.getX()>=886 && e.getY() >127 && e.getX() <927 && e.getY() <178)
			{
				String gongFile = "D39.wav";
				
				n.change("D-39");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			     audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}
				System.out.println ("D-39");
			}
			//D/E-40
			if(e.getX()>=916 && e.getY() >0 && e.getX() <937 && e.getY() <127)
			{
				String gongFile = "DE40.wav";
				
				n.change("D/E-40");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			     audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}
				System.out.println ("D/E-40");
			}
			//E-41
			if(e.getX()>=927 && e.getY() >127 && e.getX() <967 && e.getY() <178)
			{
				String gongFile = "E41.wav";
				
				n.change("E-41");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}
				System.out.println ("E-41");
			}
			//F-42
			if(e.getX()>=967 && e.getY() >127 && e.getX() <1007 && e.getY() <178)
			{
				String gongFile = "F42.wav";
				
				n.change("F-42");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}
				System.out.println ("F-42");
			}
			//F/G-43
			if(e.getX()>=996 && e.getY() >0 && e.getX() <1017 && e.getY() <127)
			{
				String gongFile = "FG43.wav";
				
				n.change("F/G-43");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}
				System.out.println ("F/G-43");
			}
			//G-44
			if(e.getX()>=1007 && e.getY() >127 && e.getX() <1047 && e.getY() <178)
			{
				String gongFile = "G44.wav";
				
				n.change("G-44");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}
				System.out.println ("G-44");
			}
			//G/A-45
			if(e.getX()>=1037 && e.getY() >0 && e.getX() <1057 && e.getY() <127)
			{
				String gongFile = "GA45.wav";
				n.change("G/A-45");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}
				System.out.println ("G/A-45");
			}
			//A-46
			if(e.getX()>=1047 && e.getY() >127 && e.getX() <1088 && e.getY() <178)
			{
				String gongFile = "A46.wav";
				n.change("A-46");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}
				System.out.println ("A-46");
			}
			//A/B-47
			if(e.getX()>=1078 && e.getY() >0 && e.getX() <1098 && e.getY() <127)
			{
				String gongFile = "AB47.wav";
				n.change("A/B-47");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}
				System.out.println ("A/B-47");
			}
			//B-48
			if(e.getX()>=1088 && e.getY() >127 && e.getX() <1128 && e.getY() <178)
			{
				String gongFile = "B48.wav";
				n.change("B-48");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    	}
				System.out.println ("B-48");
			}
		}
		
//		public double check(Point given, Point point)
//		{
//			double g = Math.pow(given.x,2) + Math.pow(given.y,2);
//			double p = Math.pow(point.x,2) + Math.pow(point.y,2);
//			return g-p;
//		}
		@Override
		/*
		 * When key is pressed, if it is relatable to a note, it plays the note
		 * and shows what note is played
		 * @param e the given keyEvent
		 */
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			int key = e.getKeyCode();
			//C-1
			if(key == KeyEvent.VK_Z)
			{
				String gongFile = "C1.wav";
				n.change("C-1");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("C-1");
			}
			//C/D-2
			if(key == KeyEvent.VK_X)
			{
				String gongFile = "CD2.wav";
				n.change("C/D-2");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("C/D-2");
			}
			//D-3
			if(key == KeyEvent.VK_C)
			{
				String gongFile = "D3.wav";
				n.change("D-3");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("D-3");
			}
			//D/E-4
			if(key == KeyEvent.VK_V)
			{
				String gongFile = "DE4.wav";
				n.change("D/E-4");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("D/E-4");
			}
			//E-5
			if(key == KeyEvent.VK_B)
			{
				String gongFile = "E5.wav";
				n.change("E-5");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("E-5");
			}
			//F-6
			if(key == KeyEvent.VK_N)
			{
				String gongFile = "F6.wav";
				n.change("F-6");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("F-6");
			}
			//F/G-7
			if(key == KeyEvent.VK_M)
			{
				String gongFile = "FG7.wav";
				n.change("F/G-7");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("F/G-7");
			}
			//G-8
			if(key == KeyEvent.VK_COMMA)
			{
				String gongFile = "G8.wav";
				n.change("G-8");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("G-8");
			}
			//G/A-9
			if(key == KeyEvent.VK_PERIOD)
			{
				String gongFile = "GA9.wav";
				n.change("G/A-9");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("G/A-9");
			}
			//A-10
			if(key == KeyEvent.VK_SLASH)
			{
				String gongFile = "A10.wav";
				n.change("A-10");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("A-10");
			}
			//A/B-11
			if(key == KeyEvent.VK_A)
			{
				String gongFile = "AB11.wav";
				n.change("A/B-11");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("A/B-11");
			}
			//B-12
			if(key == KeyEvent.VK_S)
			{
				String gongFile = "B12.wav";
				n.change("B-12");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("B-12");
			}
			
			
			
			
			
			//C-13
			if(key == KeyEvent.VK_D)
			{
				String gongFile = "C13.wav";
				n.change("C-13");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("C-13");
			}
			//C/D-14
			if(key == KeyEvent.VK_F)
			{
				String gongFile = "CD14.wav";
				n.change("C/D-14");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("C/D-14");
			}
			//D-15
			if(key == KeyEvent.VK_G)
			{
				String gongFile = "D15.wav";
				n.change("D-15");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("D-15");
			}
			//D/E-16
			if(key == KeyEvent.VK_H)
			{
				String gongFile = "DE16.wav";
				n.change("D/E-16");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("D/E-16");
			}
			//E-17
			if(key == KeyEvent.VK_J)
			{
				String gongFile = "E17.wav";
				n.change("E-17");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("E-17");
			}
			//F-18
			if(key == KeyEvent.VK_K)
			{
				String gongFile = "F18.wav";
				n.change("F-18");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("F-18");
			}
			//F/G-19
			if(key == KeyEvent.VK_L)
			{
				String gongFile = "FG19.wav";
				n.change("F/G-19");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("F/G-19");
			}
			//G-20
			if(key == KeyEvent.VK_SEMICOLON)
			{
				String gongFile = "G20.wav";
				n.change("G-20");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("G-20");
			}
			//G/A-21
			if(key == KeyEvent.VK_Q)
			{
				String gongFile = "GA21.wav";
				n.change("G/A-21");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("G/A-21");
			}
			//A-22
			if(key == KeyEvent.VK_W)
			{
				String gongFile = "A22.wav";
				n.change("A-22");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("A-22");
			}
			//A/B-23
			if(key == KeyEvent.VK_E)
			{
				String gongFile = "AB23.wav";
				n.change("A/B-23");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("A/B-23");
			}
			//B-24
			if(key == KeyEvent.VK_R)
			{
				String gongFile = "B24.wav";
				n.change("B-24");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("B-24");
			}
			
			
			
			
			
			//C-25
			if(key == KeyEvent.VK_T)
			{
				String gongFile = "C25.wav";
				n.change("C-25");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("C-25");
			}
			//C/D-26
			if(key == KeyEvent.VK_Y)
			{
				String gongFile = "CD26.wav";
				n.change("C/D-26");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("C/D-26");
			}
			//D-27
			if(key == KeyEvent.VK_U)
			{
				String gongFile = "D27.wav";
				n.change("D-27");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("D-27");
			}
			//D/E-28
			if(key == KeyEvent.VK_I)
			{
				String gongFile = "DE28.wav";
				n.change("D/E-28");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("D/E-28");
			}
			//E-29
			if(key == KeyEvent.VK_O)
			{
				String gongFile = "E29.wav";
				n.change("E-29");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("E-29");
			}
			//F-30
			if(key == KeyEvent.VK_P)
			{
				String gongFile = "F30.wav";
				n.change("F-30");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("F-30");
			}
			//F/G-31
			if(key == KeyEvent.VK_OPEN_BRACKET)
			{
				String gongFile = "FG31.wav";
				n.change("F/G-31");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("F/G-31");
			}
			//G-32
			if(key == KeyEvent.VK_CLOSE_BRACKET)
			{
				String gongFile = "G32.wav";
				n.change("G-32");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("G-32");
			}
			//G/A-33
			if(key == KeyEvent.VK_1)
			{
				String gongFile = "GA33.wav";
				n.change("G/A-33");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("G/A-33");
			}
			//A-34
			if(key == KeyEvent.VK_2)
			{
				String gongFile = "A34.wav";
				n.change("A-34");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("A-34");
			}
			//A/B-35
			if(key == KeyEvent.VK_AT)
			{
				String gongFile = "AB35.wav";
				n.change("A/B-35");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("A/B-35");
			}
			//B-36
			if(key == KeyEvent.VK_3)
			{
				String gongFile = "B36.wav";
				n.change("B-36");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("B-36");
			}
			
			
			
			
			
			//C-37
			if(key == KeyEvent.VK_4)
			{
				String gongFile = "C37.wav";
				n.change("C-37");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("C-37");
			}
			//C/D-38
			if(key == KeyEvent.VK_DOLLAR)
			{
				String gongFile = "CD38.wav";
				n.change("C/D-38");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("C/D-38");
			}
			//D-39
			if(key == KeyEvent.VK_5)
			{
				String gongFile = "D39.wav";
				n.change("D-39");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("D-39");
			}
			//D/E-40
			if(key == KeyEvent.VK_6)
			{
				String gongFile = "DE40.wav";
				n.change("D/E-40");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("D/E-40");
			}
			//E-41
			if(key == KeyEvent.VK_7)
			{
				String gongFile = "E41.wav";
				n.change("E-41");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("E-41");
			}
			//F-42
			if(key == KeyEvent.VK_8)
			{
				String gongFile = "F42.wav";
				n.change("F-42");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("F-42");
			}
			//F/G-43
			if(key == KeyEvent.VK_9)
			{
				String gongFile = "FG43.wav";
				n.change("F/G-43");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("F/G-43");
			}
			//G-44
			if(key == KeyEvent.VK_0)
			{
				String gongFile = "G44.wav";
				n.change("G-44");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("G-44");
			}
			//G/A-45
			if(key == KeyEvent.VK_LEFT_PARENTHESIS)
			{
				String gongFile = "GA45.wav";
				n.change("G/A-45");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("G/A-45");
			}
			//A-46
			if(key == KeyEvent.VK_MINUS)
			{
				String gongFile = "A46.wav";
				n.change("A-46");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("A-46");
			}
			//A/B-47
			if(key == KeyEvent.VK_UNDERSCORE)
			{
				String gongFile = "AB47.wav";
				n.change("A/B-47");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("A/B-47");
			}
			//B-48
			if(key == KeyEvent.VK_EQUALS)
			{
				String gongFile = "B48.wav";
				n.change("B-48");
		    	try
		    	{
		    		AudioPlayer.player.stop(audioStream);
		    	InputStream in = new FileInputStream(gongFile);
	 
	 			// create an audiostream from the inputstream
			    audioStream = new AudioStream(in);
				AudioPlayer.player.start(audioStream);}
		    	catch(FileNotFoundException i)
		    	{
		    	}
		    	catch(IOException i)
		    	{
		    		
		    	}

				System.out.println ("B-48");
			}
			
		}
		/*
		 * No Action when key is released
		 * @param e the given keyEvent
		 */
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		/*
		 * No action when mouse is typed
		 * @param e the given keyEvent
		 */
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		/*
		 * Takes actions from that menubar that changes the color of the background 
		 * @param e the given ActionEvent
		 */
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			if(e.getSource().equals(quit))
			{
				Quit q = new Quit();
			}
			if(e.getSource().equals(white))
			{
				getContentPane().setBackground(Color.white);
				n.color(Color.white);
			}
			if(e.getSource().equals(black))
			{
				getContentPane().setBackground(Color.black);
				n.color(Color.black);
			}
			if(e.getSource().equals(red))
			{
				getContentPane().setBackground(Color.red);
				n.color(Color.red);
				
			}
			if(e.getSource().equals(blue))
			{
				getContentPane().setBackground(Color.blue);
				n.color(Color.blue);
				
			}
			if(e.getSource().equals(green))
			{
				getContentPane().setBackground(Color.green);
				n.color(Color.green);
				
			}
			if(e.getSource().equals(pink))
			{
				getContentPane().setBackground(Color.pink);
				n.color(Color.pink);
				
			}
		}
}

/*
 *Class that shows the notes played on the piano
 */
class Notes extends JFrame{
	JPanel main = new JPanel(new GridLayout(2,0));
	JLabel word = new JLabel("Note", SwingConstants.CENTER);
	JTextField note = new JTextField("", SwingConstants.CENTER);
	
	/*
 *Constructor for Notes
 */
	Notes()
	{
		super("Note");
		setBounds(250, 1000, 200, 100);
		main.add(word);
		main.add(note);
		add(main);
		
		getContentPane().setBackground(Color.GREEN);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setResizable(false); //102
		add(main);//,BorderLayout.CENTER);
		setVisible(true);
	}
	

	/*
	 * Changes the JFrames text to show the note
	 * @param s the given note
	 */
	public void change(String s)
	{
		note.setText(s);
		setVisible(true);
	}
	/*
	 * Changes the JFrames Background color
	 * @param s the given color
	 */
	public void color(Color c)
	{
		main.setBackground(c);
		setVisible(true);
	}

}

		/*
		 * Quit class which opens a JFrame that can either Quit the program or not.
		 */
class Quit extends JFrame implements ActionListener{
	JPanel main = new JPanel(new GridLayout(2,0));
	JButton btnQuit = new JButton("Quit");
	JButton btnCancel = new JButton("Cancel");
	
	/*
 *Constructor for Quit class
 */
	Quit()
	{
		super("Quit");
		setBounds(250, 1000, 200, 100);
		btnQuit.addActionListener(this);
		btnCancel.addActionListener(this);
		main.add(btnQuit);
		main.add(btnCancel);
		add(main);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setResizable(false); //102
		add(main,BorderLayout.CENTER);
		setVisible(true);
		
	}
	
		/*
		 * Takes buttons from the Jpanel and does the action given
		 * @param e the given ActionEvent
		 */	
	public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			if(e.getSource().equals(btnQuit))
			{
				System.exit(0);
			}
			if(e.getSource().equals(btnCancel))
			{
				dispose();
			}
		}
}