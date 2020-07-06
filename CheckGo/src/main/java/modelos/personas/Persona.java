
package modelos.personas;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "PERSONA")
public class Persona {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_prsn; 
	
	@Column(name = "NOMBRE")
	private String first_name; 
	
	@Column(name = "SEGUNDO NOMBRE")
	private String second_name; 
	
	@Column(name = "APELLIDO_PATERNO")
	private String f_last_name; 
	@Id
	@Column(name = "APELLIDO_MATERNO")
	private Long m_last_name;
	
	public Persona() {
		
	}

	public Persona(int id_prsn, String first_name, String second_name, String f_last_name, Long m_last_name) {
		//super();
		this.id_prsn = id_prsn;
		this.first_name = first_name;
		this.second_name = second_name;
		this.f_last_name = f_last_name;
		this.m_last_name = m_last_name;
	}

	public int getId_prsn() {
		return id_prsn;
	}

	public void setId_prsn(int id_prsn) {
		this.id_prsn = id_prsn;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getSecond_name() {
		return second_name;
	}

	public void setSecond_name(String second_name) {
		this.second_name = second_name;
	}

	public String getF_last_name() {
		return f_last_name;
	}

	public void setF_last_name(String f_last_name) {
		this.f_last_name = f_last_name;
	}

	public Long getM_last_name() {
		return m_last_name;
	}

	public void setM_last_name(Long m_last_name) {
		this.m_last_name = m_last_name;
	}
	
	
	
}
