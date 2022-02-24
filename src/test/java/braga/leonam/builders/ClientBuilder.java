package braga.leonam.builders;

import java.time.Instant;

import braga.leonam.entities.Client;

public class ClientBuilder {
	
	private Client client;
	
	public ClientBuilder() {
	}
	
	public static ClientBuilder aClient() {
		ClientBuilder builder = new ClientBuilder();
		builder.client = new Client("Leonam Braga", 33, Instant.parse("1989-12-01T00:00:00Z"));
		return builder;
	}
	
	public Client now() {
		return client;
	}

}
