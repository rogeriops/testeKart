package br.com.core;



import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;




public class FileHelperEngine  {

	private static final Logger LOGGER = Logger.getLogger(FileHelperEngine.class.getName());
    
    public FileHelperEngine() {
		
	}

	public Map<Integer,Piloto> readResource(String resourceName) {
        return readResource(resourceName, Integer.MAX_VALUE);
    }
    
	public Map<Integer, Piloto> readResource(String fileName, int maxRecords) {
		Map<Integer, Piloto> tempRes = null;
		Scanner sc = null;
		try {

			sc = new Scanner(new FileReader(fileName));
			tempRes = readStream(sc, maxRecords);
		
		} catch (FileNotFoundException e) {
			LOGGER.log(Level.SEVERE, "Ocorreu um erro ao ler o arquivo= " + fileName);
			e.printStackTrace();
		} //
		catch (IOException e) {
			LOGGER.log(Level.SEVERE, "Ocorreu um erro ao ler o arquivo= " + fileName);
			e.printStackTrace();

		} finally {
			if (sc != null) {
				sc.close();
			}
		}

		return tempRes;
	}
    
    public Map<Integer,Piloto> readStream(Scanner sc, int maxRecords){
        
    	Map<Integer,Piloto> list = null;
        try {
            list = new HashMap<Integer,Piloto>();
            sc.nextLine();//remove o header
            Piloto piloto=null;
            Piloto pilotoNew=null;
            while (sc.hasNext()) {
				piloto = new Piloto();
				piloto.setHorarioFinalização(Util.formatTime(sc.next(), new SimpleDateFormat( "HH:mm:ss.SSS")));
				piloto.setNumeracao(sc.nextInt());
				sc.next();
				piloto.setNome(sc.next());
				piloto.setNumeroVoltas(sc.nextInt());
				piloto.setTempoVolta(Util.formatTime(sc.next(),new SimpleDateFormat( "mm:ss.SSS")));
			    piloto.setVelocidadeVolta(new Double(Util.formartString(sc.next())));
				
			    if (list.containsKey((piloto).getNumeracao())) {
					pilotoNew = list.get(piloto.getNumeracao());
					pilotoNew.setTempoVolta(piloto.getTempoVolta()+pilotoNew.getTempoVolta());
					pilotoNew.setNumeroVoltas(piloto.getNumeroVoltas());
					pilotoNew.setHorarioFinalização(piloto.getHorarioFinalização());
					list.put(pilotoNew.getNumeracao(), pilotoNew);	
				}else{
					list.put(piloto.getNumeracao(), piloto);
				}
	        }
          
        } catch (ParseException e) {
        	LOGGER.log(Level.SEVERE, "Ocorreu um erro ao parsear o arquivo= " );
			e.printStackTrace();
		}
        return list;
    }

	
    
    
   
   
    
    
}
