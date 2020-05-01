import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

public class AnimaisMimica {
	
	String[] vetorAnimais = new String [10];
	File animaisTXT = new File ("C:\\WORKSPACE_SAMARA\\Swing_treino\\resources\\animais.txt");
	Random r = new Random ();
	String str;
	
	public void preencherVetorComTxt () {
		
		try {
		FileReader arq = new FileReader (animaisTXT);
		BufferedReader lerArq = new BufferedReader(arq);
		for (int i = 0; i<vetorAnimais.length; i++) {
			
            
            str = lerArq.readLine();
            vetorAnimais[i] = str;
            System.out.println(str);
			
			
		}
		
		}
	catch (Exception e){
		e.printStackTrace();
		
	}
		
	}
	
	public String pegarVetorPosição () {
			int i = r.nextInt(10);
			System.out.println(i);
			return vetorAnimais[i];
			
			
		}
	

}
