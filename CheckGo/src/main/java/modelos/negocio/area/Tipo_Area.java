package modelos.negocio.area;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TIPO_AREA")

public class Tipo_Area  {
	
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_type_area; 
	
	@Column(name = "NOMBRE_TIPO_AREA")
	private String type_area;

	public Tipo_Area() {
		
	}
	public Tipo_Area(int id_area, String type_area) {
		super();
		this.id_type_area = id_area;
		this.type_area = type_area;
	}
	public int getId_area() {
		return id_type_area;
	}
	public void setId_area(int id_area) {
		this.id_type_area = id_area;
	}
	public String getType_area() {
		return type_area;
	}
	public void setType_area(String type_area) {
		this.type_area = type_area;
	}	
}
