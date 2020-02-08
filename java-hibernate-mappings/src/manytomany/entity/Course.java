package manytomany.entity;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Table
@Entity(name="course")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="course_id")
	private Integer id;
	
	@Column(name="course_name")
	private String name;
	
	@Column(name="course_description")
	private String description;

	@ManyToMany(cascade = {CascadeType.PERSIST 
			,CascadeType.MERGE , CascadeType.REFRESH, CascadeType.DETACH
	} )
	@JoinTable(name = "course_student" ,
			 joinColumns = { @JoinColumn(name = "course_id") },
	            inverseJoinColumns = { @JoinColumn(name = "student_id") })
	private List<Student> students;
	
	public void removeStudent(Student student) {
		students.remove(student);
	}
	public void addStudent(Student student) {
		if(students == null)
			students = new ArrayList<Student>();
		students.add(student);
		//bidirectional mapping
		//student.addCourse(this);
	}
	
	
	public Course() {
		super();
	}

	public Course(String name, String description) {
		super();
		this.name = name;
		this.description = description;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", description=" + description + "]";
	}


	public List<Student> getStudents() {
		return students;
	}


	public void setStudents(List<Student> students) {
		this.students = students;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((students == null) ? 0 : students.hashCode());
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
		Course other = (Course) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (students == null) {
			if (other.students != null)
				return false;
		} else if (!students.equals(other.students))
			return false;
		return true;
	}
	
}
