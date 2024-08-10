package api.payloads;

public class CreateTokenResponsePOJO {
	private String token;

    // Default constructor
    public CreateTokenResponsePOJO () {}

    // Constructor with token parameter
    public CreateTokenResponsePOJO (String token) {
        this.token = token;
    }

    // Getter and Setter for token
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}
