package co.edureka.java.io;

import java.io.FileOutputStream;

public class WriteFile1 {

	public static void main(String[] args) throws Exception {
		FileOutputStream fout = new FileOutputStream("src/co/edureka/java/io/edureka.txt"); 
		
		String str = "Edureka | Learn from Experts | Learn at Your Convenience | Unlock Your Career's Potential. Edureka's online training helps you land the job of your dreams. Enroll now in edureka.co\n";
		byte[] data = str.getBytes();
		fout.write(data);
		System.out.println("file saved!!");
		
		fout.close();
	}

}
