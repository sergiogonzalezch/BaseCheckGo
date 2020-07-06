package modelos.inventario;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ARTICULO")
public class Articulo {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_item; 
	
	@Column(name = "CODIGO")
	private String code; 
	
	@Column(name = "TIPO_DE_ARTICULO")
	private int type;
	
	public Articulo() {
		
	}

	public Articulo(int id, String code, int type) {
		this.id_item = id;
		this.code = code;
		this.type = type;
	}

	public int getId_Item() {
		return id_item;
	}

	public void setId_Item(int id) {
		this.id_item = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	
	
	

}
