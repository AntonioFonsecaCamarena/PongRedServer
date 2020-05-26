package org.CUCEI.PongRedServer;

import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;

public class Escuchador extends Listener {

	Estado estadoServer;

	public Escuchador() {
		estadoServer = new Estado(0);
	}

	public void received(Connection connection, Object object) {
		if (object instanceof Estado) {
			Estado estado = (Estado) object;
			actualizaEstado(estado);
			connection.sendTCP(estadoServer);
		}
	}

	private void actualizaEstado(Estado estado) {
		if (estado.getJugador() == 1) {
			estadoServer.getJugador1().setPosicionY(estado.getJugador1().getPosicionY());
			estadoServer.setBola(estado.getBola());
		} else if (estado.getJugador() == 2) {
			estadoServer.getJugador2().setPosicionY(estado.getJugador2().getPosicionY());
		}
	}
}