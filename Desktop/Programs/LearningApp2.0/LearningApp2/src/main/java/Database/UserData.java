package Database;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LearningApp")
public class UserData {
private String FirstName;
private String LastName;
private String MobileNo;
private String DOB;

@Id
private String Username;
private String Password;

public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getMobileNo() {
	return MobileNo;
}
public void setMobileNo(String mobileNo) {
	MobileNo = mobileNo;
}
public String getDOB() {
	return DOB;
}
public void setDOB(String dOB) {
	DOB = dOB;
}
public String getUsername() {
	return Username;
}
public void setUsername(String username) {
	Username = username;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public UserData(int iD, String firstName, String lastName, String mobileNo, String dOB, String username, String password) {
	super();

	FirstName = firstName;
	LastName = lastName;
	MobileNo = mobileNo;
	DOB = dOB;
	Username = username;
	Password = password;
}
public UserData() {
	super();
	// TODO Auto-generated constructor stub
}



}
