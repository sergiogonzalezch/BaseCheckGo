package modelos.negocio.area;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AREA")
public class Area   {
		
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_area; 
	
	@Column(name = "NOMBRE_AREA")
	private String name_area;
	
	@Column(name = "EDIFICIO_ID")
	private int id_build; 
	
	@Column(name = "TIPO_AREA_ID")
	private int id_type_area;

	public Area() {
		
	}

	public Area(int id_area, String name_area, int id_build, int id_type_area) {
		//super();
		this.id_area = id_area;
		this.name_area = name_area;
		this.id_build = id_build;
		this.id_type_area = id_type_area;
	}

	public int getId_area() {
		return id_area;
	}

	public void setId_area(int id_area) {
		this.id_area = id_area;
	}

	public String getName_area() {
		return name_area;
	}

	public void setName_area(String name_area) {
		this.name_area = name_area;
	}

	public int getId_build() {
		return id_build;
	}

	public void setId_build(int id_build) {
		this.id_build = id_build;
	}

	public int getId_type_area() {
		return id_type_area;
	}

	public void setId_type_area(int id_type_area) {
		this.id_type_area = id_type_area;
	}
	
	

}
