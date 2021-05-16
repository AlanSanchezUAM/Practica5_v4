package mx.uam.is.practicadiseno.negocio;

import java.util.ArrayList;
import java.util.List;

import mx.uam.is.practicadiseno.datos.MapeadorDatosImpl;

public class ManejadorImpl implements Manejador {
	
	private MapeadorDatosImpl mapeadorDatosImpl;
	       
	//Arreglo para los observadores
	private ArrayList<Observador>observadores = new ArrayList<Observador>();
	/**
	 * Constructor que recibe un mapeador
	 * @param mapeadorDatosImpl
	 */
	public ManejadorImpl(MapeadorDatosImpl mapeadorDatosImpl) {
			this.mapeadorDatosImpl = mapeadorDatosImpl;
	}

		/**
		 * Recupera los datos
		 *
		 * @return la lista de datos
		 */
		public String[] dameDatos() {
		return mapeadorDatosImpl.dameDatos();
		}

		/**
		 * Agrega un dato mientras no este vacio y no este ya en la lista
		 *
		 * @param dato el dato a agregar
		 * @return true si se agrego exitosamente false sino
		 */
		public boolean agrega(String dato) {
			return mapeadorDatosImpl.agrega(dato);
		}

		/**
		 * Borra un dato de la list
		 * @param dato el dato a borrar
		 * @return true si se borro exitosamente, false sino
		 */
		public boolean borra(String dato) {
			return mapeadorDatosImpl.borra(dato);
		}

		/**
		 * Metodo llamado cuando se cierra la ventana
		 */
		/**
		 * Metodo llamado cuando se cierra la ventana
		 *
		 */
		public void finaliza() {
			System.exit(0);
			
		}
       @Override
       /**
        * Agregar un observador a la lista de observadores
        *
        */
		public boolean agregaObservador(Observador o) {
			// agregar un observador a la lista de observadores
			return observadores.add(o);
		}
       @Override
       /**
        * Quitar un observador de la lista de observadores
        *
        */

		public boolean quitaObservador(Observador o) {
			// quitar un observador de la lista de observadores
			if(observadores.size()-1 == 0)
				System.exit(0);
			return false;
		}
		
		public void notifica() {
			// llamar actualiza() sobre todos los observadores
			for(Observador observador : observadores) {
				observador.actualiza();
			}
		}

}
