package com.CoderTanu.Beanlearning;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ClientMain {

	public static void main(String[] args) {
		String url = "http://localhost:8080/fetch";
		int pollingInterval =5000;
		
		while(true) {
			try {
				HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
				int responseCode = connection.getResponseCode();
				
				if(responseCode == 200) {
					 BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
					 String response = in.readLine();
					 in.close();
					 System.out.println("Received response code " + response);
					
				}else {
					 System.out.println("Error: Received response code " + responseCode);
				}
				
				//waiting 
				Thread.sleep(pollingInterval);
				
			}catch(Exception e) {
				 System.err.println("Error during polling: " + e.getMessage());
			}
		}
	}

}
