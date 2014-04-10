package com.thecherno.cherno.engine.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileUtils {

	private FileUtils() {
	}
	
	/**
	 * Reads Text from a file
	 * <p>
	 * <strong> Takes in text from and loads it in as a string.
	 */

	public static String loadText(String path) {
		String result = "";
		try {
			BufferedReader reader = new BufferedReader(new FileReader(path));
			String buffer;
			while ((buffer = reader.readLine()) != null) {
				result += buffer + "\n";
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
}
