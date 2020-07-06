package modelos.negocio.prestamo;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DEVOLUCION")
public class Devolucion  {
	
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	
	@Column(name = "DIA")
	private Date day;
	
	@Column(name = "RECIBIERON")
	private String get;
	
	@Column(name = "PERSONAL_ID")
	private int id_prsnl;

	public Devolucion() {
		
	}
	public Devolucion(int id, Date day, String get, int id_prsnl) {
		//super();
		this.id = id;
		this.day = day;
		this.get = get;
		this.id_prsnl = id_prsnl;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDay() {
		return day;
	}
	public void setDay(Date day) {
		this.day = day;
	}
	public String getGet() {
		return get;
	}
	public void setGet(String get) {
		this.get = get;
	}
	public int getId_prsnl() {
		return id_prsnl;
	}
	public void setId_prsnl(int id_prsnl) {
		this.id_prsnl = id_prsnl;
	}


}
