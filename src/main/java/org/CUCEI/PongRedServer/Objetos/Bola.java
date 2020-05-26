package org.CUCEI.PongRedServer.Objetos;

import java.io.Serializable;

import com.majoolwip.engine.Game;
import com.majoolwip.engine.Renderer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class Bola extends ObjetoDelJuego implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Porpiedades del la pelota
	@Getter
	@Setter
	private float velocidadX, velocidadY;
	@Getter
	private final float VELOCIDADMAXIMA = 60f;

	public Bola(float posicionX, float posicionY) {
		this.setNombre("Bola");
		this.setPosicionX(posicionX * this.getTamanoTiles());
		this.setPosicionY(posicionY * this.getTamanoTiles());
		this.setAltura(this.getTamanoTiles());
		this.setAnchura(this.getTamanoTiles());
		velocidadX = 10f;
		velocidadY = 0f;
	}

	@Override
	public void update(Game juego, float dt) {
		setPosicionX(getPosicionX() + (velocidadX / 10));
		setPosicionY(getPosicionY() + (velocidadY / 10));
		if (velocidadX > VELOCIDADMAXIMA)
			velocidadX = VELOCIDADMAXIMA;
		if (velocidadX < -VELOCIDADMAXIMA)
			velocidadX = -VELOCIDADMAXIMA;
		if (velocidadY > VELOCIDADMAXIMA)
			velocidadY = VELOCIDADMAXIMA;
		if (velocidadY < -VELOCIDADMAXIMA)
			velocidadY = -VELOCIDADMAXIMA;
		if (getPosicionX() > this.getTamanoTiles() * 20 || getPosicionY() > (this.getTamanoTiles() * 16) + velocidadY
				|| getPosicionY() < -VELOCIDADMAXIMA || getPosicionX() < -VELOCIDADMAXIMA) {
			this.setPosicionX(10 * this.getTamanoTiles());
			this.setPosicionY(7 * this.getTamanoTiles());
			velocidadX = 10f;
			velocidadY = 0f;
		}
		if (getPosicionY() >= this.getTamanoTiles() * 14 || getPosicionY() <= 0) {
			setVelocidadY(-velocidadY);
		}

	}

	@Override
	public void render(Game juego, Renderer r) {
		r.draw2DRect((int) getPosicionX(), (int) getPosicionY(), getAnchura(), getAltura(), 0xFFFFFF00);
	}

}
