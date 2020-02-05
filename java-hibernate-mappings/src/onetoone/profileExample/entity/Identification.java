package onetoone.profileExample.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "identification")
public class Identification {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "identification_id")
	private Integer id;
	
	@Column(name = "identification_type" , nullable = false)
	private String type;
	
	@ManyToOne
	@JoinColumn(name = "profile_id")
	private Profile profile;
	
	@Column(name = "identification_number" , nullable = false)
	private String number;
	
	public Identification() {
		super();
	}

	public Identification(String type, String number) {
		super();
		this.type = type;
		this.number = number;
	}



	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Identification [id=" + id + ", type=" + type + ", number=" + number + "]";
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	

}
