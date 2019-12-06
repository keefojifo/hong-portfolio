package com.sp.papago.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class PropertiesReader {

	public static void main(String[] args) {
//++++++++++++++++++++++++++++1번+++++++++++++++++++++++++++++++++++++++++++++++++
		/*
		 * String str = "1,2,3,4";
		 * 
		 * String[] strs = str.split(",");
		 * 
		 * for (int i = 0; i < strs.length; i++) { System.out.print(strs[i]); }
		 */
		
//++++++++++++++++++++++++++++2번+++++++++++++++++++++++++++++++++++++++++++++++++
		/*
		 * String path ="c:\\test.properties"; System.out.println(path); try {
		 * FileInputStream fis = new FileInputStream(path); InputStreamReader isr = new
		 * InputStreamReader(fis); BufferedReader br = new BufferedReader(isr); String
		 * str = null; Map<String,String> strMap = new HashMap<String,String>(); try {
		 * while((str=br.readLine())!=null) { int idx = str.indexOf("=");
		 * //str.substring(0, idx); if(idx!=-1) { strMap.put(str.substring(0, idx),
		 * str.substring(idx+1)); } //strList.addAll(str.substring(0,
		 * idx),str.substring(idx+1)); //System.out.println(str.substring(0, idx));
		 * //System.out.println(strMap); } System.out.println(strMap);
		 * 
		 * } catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } } catch (FileNotFoundException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
//++++++++++++++++++++++++++++3번+++++++++++++++++++++++++++++++++++++++++++++++++		
		/*
		 * String str1 = "client.id=1234=4"; int idx =str1.indexOf("=");
		 * System.out.println(idx); System.out.println(str1.substring(0,idx));
		 * System.out.println(str1.substring(idx+1));
		 */
//++++++++++++++++++++++++++++4번+++++++++++++++++++++++++++++++++++++++++++++++++	
		/*
		 * String path ="c:\\test.properties"; try { FileInputStream fis = new
		 * FileInputStream(path); Properties prop = new Properties(); prop.load(fis);
		 * System.out.println(prop.getProperty("client.id"));
		 * System.out.println(prop.getProperty("client.secret"));
		 * 
		 * } catch (FileNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }catch (IOException e) { // TODO: handle exception }
		 */
		
//++++++++++++++++++++++++++++5번+++++++++++++++++++++++++++++++++++++++++++++++++		
		String path ="test.properties";
		try {
			InputStream fis = PropertiesReader.class.getClassLoader().getResourceAsStream(path);
			Properties prop = new Properties();
			prop.load(fis);
			System.out.println(prop.getProperty("client.id"));
			System.out.println(prop.getProperty("client.secret"));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
		}
		

		

	}
}
