package practice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Run {
	
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
				
		try {
			
			File directory = new File("/io_test/또연습");
			
			if(!directory.exists()) {
				directory.mkdir();
				System.out.println("폴더 생성 완료");
			}
			
			File file = new File("/io_test/또연습/또연습.txt");
			
			StringBuilder sb = new StringBuilder();
			
			sb.append("연습하자\n");
			sb.append("또 연습하자\n");
			sb.append("계속 연습하자");
			
			String content = sb.toString();
			
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			bos.write(content.getBytes());
			bos.flush();
//			bw.write(content);
			
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String result = null;
			
			while(true) {
				result = br.readLine();
				
				if(result == null) {
					break;
				}
				
				System.out.println(result);
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally{
			try {
				if(br != null) br.close();
				if(bw != null) bw.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
}