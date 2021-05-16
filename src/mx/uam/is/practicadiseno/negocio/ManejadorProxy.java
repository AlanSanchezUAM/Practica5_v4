package mx.uam.is.practicadiseno.negocio;

public class ManejadorProxy implements Manejador {

Manejador manejador;
	
	public ManejadorProxy(Manejador manejador) {
		this.manejador = manejador;
	}

	@Override
	public String[] dameDatos() {
		// TODO Auto-generated method stub
		System.out.println("Se invocó al metodo dameDatos()");
		return manejador.dameDatos();
	}

	@Override
	public boolean agrega(String dato) {
		// TODO Auto-generated method stub
		System.out.println("Se invocó al método agrega(String dato)");
		return manejador.agrega(dato);
	}

	@Override
	public boolean borra(String dato) {
		// TODO Auto-generated method stub
		System.out.println("Se invocó al método borra(String dato)");
		return manejador.borra(dato);
	}

	@Override
	public void finaliza() {
		// TODO Auto-generated method stub
		System.out.println("Se invocó al método finaliza()");
		manejador.finaliza();
	}

	@Override
	public boolean agregaObservador(Observador o) {
		// TODO Auto-generated method stub
		System.out.println("Se invocó al método agregaObservador(Observador o)");
		return manejador.agregaObservador(o);
	}

	@Override
	public boolean quitaObservador(Observador o) {
		// TODO Auto-generated method stub
		System.out.println("Se invocó al método quitaObservador(Observador o)");
		return manejador.quitaObservador(o);
	}

	@Override
	public void notifica() {
		// TODO Auto-generated method stub
		System.out.println("Se invocó al metodo notifica()");
		manejador.notifica();
	}

}