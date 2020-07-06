package modelos.negocio.prestamo;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ENTREGA")
public class Entrega  {
		
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	
	@Column(name = "DIA")
	private Date day;
	
	@Column(name = "ENTREGARON")
	private String set;
	
	@Column(name = "PERSONAL_ID")
	private int id_prsnl;

	public Entrega() {
		
	}
	public Entrega(int id, Date day, String set, int id_prsnl) {
		//super();
		this.id = id;
		this.day = day;
		this.set = set;
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
	public String getSet() {
		return set;
	}
	public void setSet(String set) {
		this.set = set;
	}
	public int getId_prsnl() {
		return id_prsnl;
	}
	public void setId_prsnl(int id_prsnl) {
		this.id_prsnl = id_prsnl;
	}


}
