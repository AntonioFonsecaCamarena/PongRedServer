package org.CUCEI.PongRedServer;

import java.io.IOException;

import org.CUCEI.PongRedServer.Objetos.Bola;
import org.CUCEI.PongRedServer.Objetos.Jugador;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryonet.Server;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			Server server = new Server();
			server.start();
			server.bind(54555, 54777);
			Kryo kryo = server.getKryo();
			kryo.register(Estado.class);
			kryo.register(Bola.class);
			kryo.register(Jugador.class);
			Escuchador escuchador = new Escuchador();
			server.addListener(escuchador);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
