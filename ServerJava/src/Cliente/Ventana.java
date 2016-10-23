package Cliente;

import javax.swing.JFrame;

public class Ventana extends JFrame{
	
	public Ventana(){
		setTitle("Server");
		this.setExtendedState(MAXIMIZED_BOTH);
	}
	public Ventana(int width,int height){
		setTitle("Server");
		this.setSize(width, height);
	}
}
