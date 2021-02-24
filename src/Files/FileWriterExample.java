package Files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter writer=new FileWriter("poem.txt");
			writer.write("Johny Johny");
			writer.append("\nA poem by Gublu");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
