package modelos.negocio.prestamo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.util.Date;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRESTAMO")
public class Prestamo  {
	
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	
	@Column(name = "OBSERVACIONES")
	private String observations;
	
	@Column(name = "FECHA")
	private Date date_time;
	
	@Column(name = "SOLICITUD_ID")
	private int id_s;
	
	@Column(name = "SOLICITUD_CLIENTE_PERSONA_ID")
	private int id_client_person;
	
	@Column(name = "ENTREGA_ID")
	private int id_en; 
	
	@Column(name = "DEVOLUCION_ID")
	private int id_dev; 
	
	@Column(name = "PERSONAl_ID")
	private int id_personal;

	public Prestamo() {
		
	}
	
	public Prestamo(int id, String observations, Date date_time, int id_s, int id_client_person, int id_en, int id_dev,
			int id_personal) {
		//super();
		this.id = id;
		this.observations = observations;
		this.date_time = date_time;
		this.id_s = id_s;
		this.id_client_person = id_client_person;
		this.id_en = id_en;
		this.id_dev = id_dev;
		this.id_personal = id_personal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getObservations() {
		return observations;
	}

	public void setObservations(String observations) {
		this.observations = observations;
	}

	public Date getDate_time() {
		return date_time;
	}

	public void setDate_time(Date date_time) {
		this.date_time = date_time;
	}

	public int getId_s() {
		return id_s;
	}

	public void setId_s(int id_s) {
		this.id_s = id_s;
	}

	public int getId_client_person() {
		return id_client_person;
	}

	public void setId_client_person(int id_client_person) {
		this.id_client_person = id_client_person;
	}

	public int getId_en() {
		return id_en;
	}

	public void setId_en(int id_en) {
		this.id_en = id_en;
	}

	public int getId_dev() {
		return id_dev;
	}

	public void setId_dev(int id_dev) {
		this.id_dev = id_dev;
	}

	public int getId_personal() {
		return id_personal;
	}

	public void setId_personal(int id_personal) {
		this.id_personal = id_personal;
	}
	
	
}
