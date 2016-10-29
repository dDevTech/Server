package Cliente;

public class Cliente {
	private int ip=0;

	public Cliente(int ip){
		this.ip=ip;
		Ventana v = new Ventana(900,650);
		v.setVisible(true);
	}
}
