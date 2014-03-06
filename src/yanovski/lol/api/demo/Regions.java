package yanovski.lol.api.demo;

public enum Regions {
	EUNE("eune"),
	EUW("euw"),
	NA("na");
	
	private String id;
	
	Regions(String id) { 
		this.id = id;
	}
	
	public String id() {
		return id;
	}
}
