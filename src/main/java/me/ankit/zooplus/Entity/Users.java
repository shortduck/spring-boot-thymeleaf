package me.ankit.zooplus.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;;

@Entity
public class Users {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Id;

	@NotNull
	private String Email;

	@NotNull
	private String Password;

	@NotNull
	private String Version;

	@NotNull
	private Date LastLogin;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getVersion() {
		return Version;
	}

	public void setVersion(String version) {
		Version = version;
	}

	public Date getLastLogin() {
		return LastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		LastLogin = lastLogin;
	}

	@Override
	public String toString() {
		return "Users [Id=" + Id + ", Email=" + Email + ", Password=" + Password + ", Version=" + Version
				+ ", LastLogin=" + LastLogin + "]";
	}

}
