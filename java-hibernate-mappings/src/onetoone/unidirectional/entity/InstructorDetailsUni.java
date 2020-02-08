package onetoone.unidirectional.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "instructor_details_uni")
public class InstructorDetailsUni {

	@Id
	//identity strategy in mysql we can add autoincrement for this column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "instructor_details_uni_id")
	private Integer id;
	
	@Column(name = "instructor_details_uni_hobby")
	private String hobby;
	
	@Column(name = "instructor_details_uni_favourite_sports")
	private String favouriteSports;

	public InstructorDetailsUni(String hobby, String favouriteSports) {
		super();
		this.hobby = hobby;
		this.favouriteSports = favouriteSports;
	}

	public InstructorDetailsUni() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getFavouriteSports() {
		return favouriteSports;
	}

	public void setFavouriteSports(String favouriteSports) {
		this.favouriteSports = favouriteSports;
	}

	@Override
	public String toString() {
		return "InstructorDetailsUni [id=" + id + ", hobby=" + hobby + ", favouriteSports=" + favouriteSports + "]";
	}
	
}
