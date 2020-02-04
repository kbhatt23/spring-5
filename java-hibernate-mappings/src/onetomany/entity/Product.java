package onetomany.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_id")
	private Integer id;
	
	@Column(name = "product_name")
	private String name;
	

	@Column(name = "product_description")
	private String description;
	
	//if we delete the product it shud delete the sku as well
	//as one sku is used at one product only, if that prod is deleted lets delete the ksu as well
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "product" /* , fetch = FetchType.EAGER */)
	//in one to many we hsud have join column on many side
	//as in case we add this on one side then we will have extra rows on product side and hence more redundant data will exist
	private List<Sku> childSkus;
	
	public Product(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public Product() {
		super();
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
		return "Product [id=" + id + ", name=" + name + ", description=" + description + "]";
	}

	public List<Sku> getChildSkus() {
		return childSkus;
	}

	public void setChildSkus(List<Sku> childSkus) {
		this.childSkus = childSkus;
	}

}
