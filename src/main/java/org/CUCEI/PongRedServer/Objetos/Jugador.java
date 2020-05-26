package org.CUCEI.PongRedServer.Objetos;

import java.io.Serializable;

import com.majoolwip.engine.Game;
import com.majoolwip.engine.Renderer;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Jugador extends ObjetoDelJuego implements Serializable {

	// Porpiedades del Jugador

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Jugador(float posicionX, float posicionY, String nombre) {
		this.setNombre(nombre);
		this.setPosicionX(posicionX * this.getTamanoTiles() + 8);
		this.setPosicionY(posicionY * this.getTamanoTiles() + 8);
		this.setAltura(this.getTamanoTiles() * 3);
		this.setAnchura(this.getTamanoTiles() * 3 / 5);
	}

	@Override
	public void update(Game juego, float dt) {

	}

	@Override
	public void render(Game juego, Renderer r) {
		r.draw2DRect((int) getPosicionX(), (int) getPosicionY(), getAnchura(), getAltura(), 0xFF00FF00);
	}

}
