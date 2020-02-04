package onetomany.entity;

import javax.persistence.*;

@Entity
@Table(name = "sku")
public class Sku {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="sku_id")
	private Integer id;
	
	@Column(name = "sku_name")
	private String name;
	

	@Column(name = "sku_description")
	private String description;
	
	@Column(name = "sku_price")
	private Double price;

	@ManyToOne
	@JoinColumn(name = "sku_product_id")
	private Product product;
	
	public Sku(String name, String description, Double price) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public Sku() {
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Sku [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
}
