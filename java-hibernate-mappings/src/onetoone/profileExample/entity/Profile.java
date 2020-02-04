package onetoone.profileExample.entity;

import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "profile")
public class Profile {
	
	@Id
	//identity strategy in mysql we can add autoincrement for this column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "profile_id")
	private Integer id;
	
	

	@Column(name = "profile_first_name")
	private String firstName;
	
	@Column(name = "profile_last_name")
	private String lastName;
	
	@Column(name = "date_of_birth")
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	
	@OneToOne(cascade = {CascadeType.ALL
			})
	@JoinColumn(name = "address_id")
	private ProfileAddress profileAddress;

	public Profile() {
		super();
	}

	public Profile(String firstName, String lastName, Date dateOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}
	
	@Override
	public String toString() {
		return "Profile [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth="
				+ dateOfBirth + "]";
	}

	public Integer getId() {
		return id;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public ProfileAddress getProfileAddress() {
		return profileAddress;
	}

	public void setProfileAddress(ProfileAddress profileAddress) {
		this.profileAddress = profileAddress;
	}

}
