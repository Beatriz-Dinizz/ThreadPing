package view;

import controller.ThreadPingLinux;

public class Principal {

	public static void main(String[] args) {
		String[] site = {"www.uol.com.br", "www.terra.com.br", "www.google.com.br"};
		
		for(int i = 0; i < 3; i++) {
			ThreadPingLinux t = new ThreadPingLinux(site[i]);
			t.start();
		}
	}
}
