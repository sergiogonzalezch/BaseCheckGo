package modelos.inventario;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TIPO_ARTICULO")
public class Tipo_Articulo  {
	
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int type_id_item; 
	
	@Column(name = "NOMBRE")
	private String name;

	public Tipo_Articulo() {
		
	}
	public Tipo_Articulo(int id, String name) {
		//super();
		this.type_id_item = id;
		this.name = name;
	}
	public int getId() {
		return type_id_item;
	}
	public void setId(int id) {
		this.type_id_item = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
	

	
	
}
