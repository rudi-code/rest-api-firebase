/**
 * 
 */
package com.example.restfirebasedemo.service;

import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.example.restfirebasedemo.model.Person;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;

/**
 * @author rudi_
 * Apr 13, 2022
 */
@Service
public class FirebaseService {
	
	public String saveUserDetail(Person person) throws InterruptedException, ExecutionException {
		Firestore dbFirestore = FirestoreClient.getFirestore();
		ApiFuture<WriteResult> collectionApiFuture = dbFirestore.collection("users")
				.document(person.getName()).set(person);
		return collectionApiFuture.get().getUpdateTime().toString();
	}
	
	public Person getUserDetails(String name) throws InterruptedException, ExecutionException {
		Firestore dbFirestore = FirestoreClient.getFirestore();
		DocumentReference documentReference = dbFirestore.collection("users").document(name);
		ApiFuture<DocumentSnapshot> future = documentReference.get();
		DocumentSnapshot documentSnapshot = future.get();
		if(documentSnapshot.exists()) 
			return documentSnapshot.toObject(Person.class);
		else
			return null;
	}
}
