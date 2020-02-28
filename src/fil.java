import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import no.hvl.dat102.adt.FilmArkivADT;

public class fil {

	public static void main(String[] args) {
		// TODO	public static boolean sjekkFnr(FilmArkivADT filmark, String filnavn) {
		try {
			FileReader Fil = new FileReader(path + filnavn + ".txt");
			BufferedReader leser = new BufferedReader(Fil);
			int linenumber = 1;
			boolean funnet = false;
			String[] Film = null;
			int fnr;
			String line;
			while (leser.ready()) {
				line = leser.readLine();
				Film = line.split(SKILLE);
				fnr = Integer.parseInt(Film[0]);
				
				if(filmark.finnFnr(fnr)) {
					return false;
				}
				leser.close();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	} Auto-generated method stub

	}

}
