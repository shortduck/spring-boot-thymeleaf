package me.ankit.zooplus.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;;

@Entity
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;

	@NotNull
	private String Email;

	@NotNull
	private String Password;

	@NotNull
	private int Version;

	private String LastLogin;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
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

	public int getVersion() {
		return Version;
	}

	public void setVersion(int version) {
		Version = version;
	}

	public String getLastLogin() {
		return LastLogin;
	}

	public void setLastLogin(String lastLogin) {
		LastLogin = lastLogin;
	}

	public Users() {
	}

	public Users(@NotNull String email, @NotNull String password, @NotNull int version, String lastLogin) {
		super();
		Email = email;
		Password = password;
		Version = version;
		LastLogin = lastLogin;
	}

	@Override
	public String toString() {
		return "Users [Id=" + Id + ", Email=" + Email + ", Password=" + Password + ", Version=" + Version
				+ ", LastLogin=" + LastLogin + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (Id ^ (Id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		if (Id != other.Id)
			return false;
		return true;
	}

}
