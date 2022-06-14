/**
 * 
 */
package com.example.restfirebasedemo.service;

import java.io.FileInputStream;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

/**
 * @author rudi_
 * Apr 13, 2022
 */

@Service
public class FirebaseInitialize {
	
	@PostConstruct
	public void initialize() {
		try {
			FileInputStream serviceAccount =
			  new FileInputStream("./serviceAccountKey.json");

			FirebaseOptions options = new FirebaseOptions.Builder()
			  .setCredentials(GoogleCredentials.fromStream(serviceAccount))
			  .build();

			FirebaseApp.initializeApp(options);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
