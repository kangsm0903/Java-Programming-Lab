package LabPratice;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Reverse {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		InputStream fis = new FileInputStream("input.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		List<String> list = new ArrayList<>();
		
		for(int i=0; i<3; i++) {
			String data = br.readLine();
			list.add(data);
		}
		
 		Collections.reverse(list);
		
		FileOutputStream fos = new FileOutputStream("output.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter (osw);
		
		
		for(String data : list) {
			System.out.println(data);
			bw.write(data);
			bw.newLine();
		}
		
		br.close(); isr.close(); fis.close();
		bw.close(); osw.close(); fos.close();
	}

}
