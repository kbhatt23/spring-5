package onetoone.unidirectional.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "instructor_uni")
public class InstructorUni {
	
	@Id
	//identity strategy in mysql we can add autoincrement for this column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "instructor_uni_id")
	private Integer id;
	
	@Column(name = "instructor_uni_name")
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	@JoinColumn(name = "instructor_details_uni_id")
	private InstructorDetailsUni instructorDetailsUni;

	public InstructorUni(String name) {
		this.name = name;
	}

	public InstructorUni() {
	}

	@Override
	public String toString() {
		return "InstructorUni [id=" + id + ", name=" + name + ", instructorDetailsUni=" + instructorDetailsUni + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public InstructorDetailsUni getInstructorDetailsUni() {
		return instructorDetailsUni;
	}

	public void setInstructorDetailsUni(InstructorDetailsUni instructorDetailsUni) {
		this.instructorDetailsUni = instructorDetailsUni;
	}


}
