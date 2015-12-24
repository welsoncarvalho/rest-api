package com.rest.api.dao.connection;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.mongodb.MongoClient;

@Named
@ApplicationScoped
public class DBConnection {

	private Datastore datastore;
	
	@PostConstruct
	public void init() {
		MongoClient client = new MongoClient("159.203.79.29");
		this.datastore = new Morphia().createDatastore(client, "accessdb");
	}
	
	public Datastore getDatastore() {
		return this.datastore;
	}
	
}
