//Nick Soffa
//Comp Sci 281
//10-23-14

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class WordSort{
	public static void main(String[] args) throws IOException{

		java.io.BufferedReader stdIn 
			= new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		ArrayList<String> wordList = new ArrayList<String>();
		String s = "";
		//Can't figure out how to do the delimiters
		/*String[] delims = new String[5];
		delims[0] = "-";
		delims[1] = ":";
		delims[2] = ";";
		delims[3] = " ";
		delims[4] = ",";
		int locator = 0;
		String[] split; */

		try{

			s = stdIn.readLine();

			while(s != null){
				s = s.replaceAll("\\d", "").toUpperCase();
				/*if(s.contains(delims[locator])){
					for(int i = 0; i < delims.length; i++){
						split = s.split(delims[i]);
						wordList.add(split[1]);
						wordList.add(split[2]);
						delims = new String[2];
					}
					locator++;
				}else{*/
					wordList.add(s);
				//} 
				s = stdIn.readLine();
			}

		}finally{
			if(s != null) {
				stdIn.close();
			}
			Collections.sort(wordList);
			System.out.print(wordList);
		}
	}
}