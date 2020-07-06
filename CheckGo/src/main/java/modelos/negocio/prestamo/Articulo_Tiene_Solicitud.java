package modelos.negocio.prestamo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ARTICULO_TIENE_SOLICITUD")
public class Articulo_Tiene_Solicitud {
		
	@Id
	@Column(name = "ARTICULO_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_item; 
	
	@Column(name = "SOLICITUD_ID")
	private int id_request;

	public Articulo_Tiene_Solicitud() {
		
	}

	public Articulo_Tiene_Solicitud(int id_item, int id_request) {
		//super();
		this.id_item = id_item;
		this.id_request = id_request;
	}

	public int getId_item() {
		return id_item;
	}

	public int getId_request() {
		return id_request;
	}

	public void setId_item(int id_item) {
		this.id_item = id_item;
	}

	public void setId_request(int id_request) {
		this.id_request = id_request;
	}
	
	


}
