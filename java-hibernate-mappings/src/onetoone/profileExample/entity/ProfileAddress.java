package onetoone.profileExample.entity;
import javax.persistence.*;

@Entity
@Table(name = "profile_address")
public class ProfileAddress {
	@Id
	//identity strategy in mysql we can add autoincrement for this column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "profile_address_id")
	private Integer id;
	
	@Column(name = "address1")
	private String address1;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	//default country is india and hence no need
	
	//bidirectional
	//can not add cascade as use case does not suit us
	//we do not want to delete main table if we delte this table and other operation as well
	//default fetch for one to one is eager
	@OneToOne(mappedBy = "profileAddress")
	private Profile profile; 

	public ProfileAddress( String address1, String city, String state) {
		super();
		this.address1 = address1;
		this.city = city;
		this.state = state;
	}

	public ProfileAddress() {
		super();
	}

	public Integer getId() {
		return id;
	}


	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "ProfileAddress [id=" + id + ", address1=" + address1 + ", city=" + city + ", state=" + state + "]";
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	
	
}
