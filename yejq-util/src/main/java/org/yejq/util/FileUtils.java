package org.yejq.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * @author jim.ye
 */
public class FileUtils {

	public static String readFile(String path){
		StringBuilder builder = new StringBuilder();
		try {
			File file = new File("");
			path = file.getAbsolutePath() + path;
			BufferedReader reader = new BufferedReader(new FileReader(path));
			String line = null;
			while ((line = reader.readLine()) != null) {
				builder.append(line);
			}
			reader.close();
			System.out.println(builder);
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return builder.toString();
	}
}
