package org.info;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Details {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\folderno1\\folderno2\\folderno3\\test.txt");
		
		FileUtils.write(f, "java");
		FileUtils.write(f, "python");//overwrite
		FileUtils.write(f, "javaclass", false);//overwrite
		FileUtils.write(f, "pythonclass", true);//append
		System.out.println("done");
		List<String> rd = FileUtils.readLines(f);
		for (String x : rd) {
			System.out.println(x);
			
		}
		
		

		}
}
