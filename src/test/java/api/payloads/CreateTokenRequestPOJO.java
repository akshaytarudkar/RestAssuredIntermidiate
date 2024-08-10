package api.payloads;

public class CreateTokenRequestPOJO {

	 private String username;
	    private String password;

	    // Default constructor (needed for deserialization)
	    public CreateTokenRequestPOJO() {}

	    // Parameterized constructor
	    public CreateTokenRequestPOJO(String username, String password) {
	        this.username = username;
	        this.password = password;
	    }

	    // Getters and setters
	    public String getUsername() {
	        return username;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }
}
