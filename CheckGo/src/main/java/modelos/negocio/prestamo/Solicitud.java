package modelos.negocio.prestamo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SOLICITUD")
public class Solicitud  {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	
	@Column(name = "ID_CLIENTE")
	private int id_client;
	
	@Column(name = "Area")
	private String id_area;
	
	@Column(name = "ACEPTADA")
	private boolean aprove ;

	public Solicitud(int id, int id_client, String id_area, boolean aprove) {
		//super();
		this.id = id;
		this.id_client = id_client;
		this.id_area = id_area;
		this.aprove = aprove;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_client() {
		return id_client;
	}

	public void setId_client(int id_client) {
		this.id_client = id_client;
	}

	public String getId_area() {
		return id_area;
	}

	public void setId_area(String id_area) {
		this.id_area = id_area;
	}

	public boolean isAprove() {
		return aprove;
	}

	public void setAprove(boolean aprove) {
		this.aprove = aprove;
	}
	
	
	
	
}
