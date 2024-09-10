package br.com.exemplo.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;

import br.com.exemplo.utils.Util;

public class LeituraEscrita {

	static final String PATH_BASICO = "./temp/";
	static final String EXTENSAO = ".txt";

	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO + path + EXTENSAO));
		String linha = "";

		while (true) {
			linha = buffRead.readLine();
			if (linha != null) {
				Util.setupLogger().log(Level.INFO, linha);
			} else {
				break;
			}
		}
		buffRead.close();
	}
}
