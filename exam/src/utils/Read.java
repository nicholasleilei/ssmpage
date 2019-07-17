package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Read {
   public static List<String> read() throws IOException {
	   BufferedReader br = new BufferedReader(new FileReader("d:/questions.txt"));
	   List<String> ques= new ArrayList<>();
	   
	   String que = br.readLine();
	   while(que!=null &&!"".equals(que)) {
		   ques.add(que);
		   que=br.readLine();
	   }
	   br.close();
	   //System.out.println(ques);
	   return ques;
   }
public static void main(String[] args) throws IOException {
	read();
}   
}
