package org.yejq.util;

public class TestUtils {
	
	public static void pl(Object... object){
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < object.length; i++) {
			builder.append(object[i]);
			if (i < object.length -1) {
				builder.append(",");
			}
		}
		System.out.println(builder);
	}
	
}
