package me.ankit.zooplus.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;;

@Entity
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;

	@NotNull
	private String Username;

	@NotNull
	private String Password;

	@NotNull
	private String Role;

	@NotNull
	private int Version;
	
	@OneToMany (mappedBy = "user")
	private List<EnquiryHistory> enquiries = new ArrayList<>();

	private String LastLogin;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
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

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}
	
	public int getVersion() {
		return Version;
	}

	public List<EnquiryHistory> getEnquiries() {
		return enquiries;
	}

	public void setEnquiries(ArrayList<EnquiryHistory> enquiries) {
		this.enquiries = enquiries;
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

	public Users(@NotNull String username, @NotNull String password, @NotNull String role, @NotNull int version,
			String lastLogin) {
		super();
		Username = username;
		Password = password;
		Role = role;
		Version = version;
		LastLogin = lastLogin;
	}

	@Override
	public String toString() {
		return "Users [Id=" + Id + ", Username=" + Username + ", Password=" + Password + ", Role=" + Role + ", Version="
				+ Version + ", LastLogin=" + LastLogin + "]";
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
