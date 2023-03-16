package GitHubSerialDeserial;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OwnerPojo {
	String login;
	int id;
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrganization() {
		return Organization;
	}
	public void setOrganization(String organization) {
		Organization = organization;
	}
	String Organization;    
}
