package GitHubSerialDeserial;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseRootPojo {

		 private int id;
		 private String name;
		 private String full_name;

		 OwnerPojo OwnerObject;
		 OrganizationPojo OrganizationObject;


		 // Getter Methods 

		 public float getId() {
		  return id;
		 }

		 public String getName() {
		  return name;
		 }

		 public String getFull_name() {
		  return full_name;
		 }

		 public OwnerPojo getOwner() {
		  return OwnerObject;
		 }

		 public OrganizationPojo getOrganization() {
		  return OrganizationObject;
		 }

		 // Setter Methods 

		 public void setId(int id) {
		  this.id = id;
		 }

		 public void setName(String name) {
		  this.name = name;
		 }

		 public void setFull_name(String full_name) {
		  this.full_name = full_name;
		 }

		

		 public void setOwner(OwnerPojo ownerObject) {
		  this.OwnerObject = ownerObject;
		 }

		 public void setOrganization(OrganizationPojo organizationObject) {
		  this.OrganizationObject = organizationObject;
		 }
		}
		
		

