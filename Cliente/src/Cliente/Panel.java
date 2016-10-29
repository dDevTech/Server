package Cliente;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Panel extends JPanel{
	JButton enviar = new JButton("Enviar");
	JPanel contenedorIP= new JPanel(new FlowLayout(FlowLayout.CENTER)); 
	JPanel mensajeria= new JPanel(new FlowLayout(FlowLayout.CENTER));
	JPanel envio= new JPanel(new FlowLayout(FlowLayout.CENTER));
	JPanel container= new JPanel(new GridLayout(2,1));
	JPanel containerBoton= new JPanel(new FlowLayout(FlowLayout.CENTER));
	JTextArea sistemaMensajes= new JTextArea(25,50);
	JTextField mensaje = new JTextField(20);
	JLabel ip = new JLabel("IP");
	JLabel m = new JLabel("Mensaje: ");
	
	public Panel(){
		this.setLayout(new BorderLayout());
		this.setBackground(Color.black);
		ip.setForeground(Color.WHITE);
		contenedorIP.add(ip);
		contenedorIP.setBackground(null);
		m.setForeground(Color.WHITE);
		m.setFont(new Font("Sheriff",Font.BOLD,20));
		mensajeria.add(sistemaMensajes);
		mensajeria.setBackground(null);
		envio.add(m);
		envio.add(mensaje);
		envio.setBackground(null);
		mensaje.setFont(new Font("Sheriff",Font.BOLD,20));
		enviar.setFont(new Font("Sheriff",Font.BOLD,20));
		
		
		containerBoton.add(enviar);
		
		containerBoton.setBackground(null);
		container.add(envio);
		container.add(containerBoton);
		container.setBackground(null);
		this.add(contenedorIP,BorderLayout.NORTH);	
		this.add(mensajeria,BorderLayout.CENTER);		
		this.add(container,BorderLayout.SOUTH);

	}
	
}
