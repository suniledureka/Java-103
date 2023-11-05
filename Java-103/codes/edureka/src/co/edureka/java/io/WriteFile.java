package co.edureka.java.io;

import java.io.FileWriter;

public class WriteFile {

	public static void main(String[] args) throws Exception {
		//FileWriter fout = new FileWriter("src/co/edureka/java/io/edureka1.txt"); 
		FileWriter fout = new FileWriter("src/co/edureka/java/io/edureka1.txt", true); //true - appending mode
		
		String str = "Edureka | Learn from Experts | Learn at Your Convenience | Unlock Your Career's Potential. Edureka's online training helps you land the job of your dreams. Enroll now in edureka.co\n";
		
		fout.write(str);
		System.out.println("file saved!!");
		
		fout.close();
	}

}
