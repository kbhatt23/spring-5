package onetomany.uni.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sku_uni")
public class SkuUni {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="sku_uni_id")
	private Integer id;
	
	@Column(name = "sku_uni_name")
	private String name;
	

	@Column(name = "sku_uni_description")
	private String description;
	
	@Column(name = "sku_uni_price")
	private Double price;

	//commenting below to remove bidirectional mapping
	//@JoinColumn(name = "sku_uni_product_id") 
	//@ManyToOne
	//private ProductUni product;
	public SkuUni(String name, String description, Double price) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public SkuUni() {
		super();
	}

	@Override
	public String toString() {
		return "SkuUni [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
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
	//no need for unidirectional
	/*
	 * public ProductUni getProduct() { return product; }
	 * 
	 * public void setProduct(ProductUni product) { this.product = product; }
	 */
}
