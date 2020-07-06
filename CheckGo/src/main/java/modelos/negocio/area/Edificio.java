package modelos.negocio.area;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EDIFICIO")
public class Edificio {
	
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_build; 
	
	@Column(name = "NOMBRE")
	private String name_build;
	
	public Edificio() {
		
	}

	public Edificio(int id_build, String name_build) {
		//super();
		this.id_build = id_build;
		this.name_build = name_build;
	}

	public int getId_build() {
		return id_build;
	}

	public void setId_build(int id_build) {
		this.id_build = id_build;
	}

	public String getName_build() {
		return name_build;
	}

	public void setName_build(String name_build) {
		this.name_build = name_build;
	}



}
