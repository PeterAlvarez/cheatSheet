import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class das {
	public static void main(String[] args) throws IOException {
		String cadena,datos="dasdasd";
		FileReader fr = new FileReader("./Texto.txt");
		BufferedReader br = new BufferedReader(fr);
		while((cadena = br.readLine())!=null) {
            datos+=cadena+"\n";
        }
		System.out.println(datos);
	}
}
