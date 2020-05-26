package org.CUCEI.PongRedServer;

import java.io.Serializable;

import org.CUCEI.PongRedServer.Objetos.Bola;
import org.CUCEI.PongRedServer.Objetos.Jugador;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class Estado implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Getter
	@Setter
	Bola bola;

	@Getter
	Jugador jugador1, jugador2;
	@Getter
	@Setter
	private int jugador;

	public Estado(int jugador) {
		jugador1 = new Jugador(1, 5, "Jugador1");
		jugador2 = new Jugador(18, 5, "Jugador2");
		bola = new Bola(10, 7);
		this.jugador = jugador;

	}

}
