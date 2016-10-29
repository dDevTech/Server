package Cliente;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Ventana extends JFrame{
	
	public Ventana(){
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setTitle("Server");
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setContentPane(new Panel());
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
	}
	public Ventana(int width,int height){
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setTitle("Server");
		this.setSize(width, height);
		this.setContentPane(new Panel());
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
	}
}
