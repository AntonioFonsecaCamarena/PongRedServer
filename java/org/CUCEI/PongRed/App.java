package org.CUCEI.PongRed;

import com.majoolwip.engine.Pix;
import com.majoolwip.engine.util.PixSettings;

/**
 * Clase principal del Juego, que contiene el metodo Main. Esta clase extiende
 * la interfaz abstracta com.majoolwip.engine.game para ser usada con el
 * proyecto PixEngine de Ryan Moore.
 * 
 * @see https://github.com/Majoolwip/PixEngine Cuenta con una serie de Videos
 *      explicando el desarrollo del motor grafico.
 */
public class App {

	public static void main(String[] args) {
		//nos preparamos
		ContenedorDelJuego juego = new ContenedorDelJuego();
		PixSettings settings = new PixSettings();
		Pix pix = new Pix(juego, settings);

		//Arrancamos!
		pix.start();

	
	}

}
