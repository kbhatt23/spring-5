package onetomany.uni.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="product_uni")
public class ProductUni {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_uni_id")
	private Integer id;
	
	@Column(name = "product_uni_name")
	private String name;
	

	@Column(name = "product_uni_description")
	private String description;
	
	//first coding bidirectionl
	//general approach first : later will comment out
	
	//@OneToMany(mappedBy = "product" , cascade = CascadeType.ALL)
	@OneToMany(  cascade = CascadeType.ALL)
	//in one to many join column can point to column from referenc table
	@JoinColumn(name = "sku_uni_product_id")
	private List<SkuUni> childSkus;
	
	public void addChildSku(SkuUni sku) {
		if(childSkus == null) {
			childSkus = new ArrayList<SkuUni>();
		}
		childSkus.add(sku);
		//removing bidirectional
		//sku.setProduct(this);
	}


	public ProductUni(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}


	public ProductUni() {
		super();
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
		return "ProductUni [id=" + id + ", name=" + name + ", description=" + description + ", childSkus=" + childSkus
				+ "]";
	}
}
