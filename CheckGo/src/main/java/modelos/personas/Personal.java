package modelos.personas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PERSONAL")
public class Personal {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_prsnl; 
	
	@Column(name = "ESTADO_PERSONAL_ID")
	private int state_id; 
	
	@Column(name = "Rol_PERSONAL_ID")
	private int rol_id; 
	
	@Column(name = "PERSONA_ID")
	private int person_id;
	
	@Column(name = "PASSWORD")
	private String password;
	
	public Personal() {
		
	}

	public Personal(int id_prsnl, int state_id,int rol_id, int person_id,String password) {
		//super();
		this.id_prsnl = id_prsnl;
		this.state_id = state_id;
		this.rol_id = rol_id;
		this.person_id = person_id;
		this.password= password; 
	}

	public int getId_prsnl() {
		return id_prsnl;
	}

	public void setId_prsnl(int id_prsnl) {
		this.id_prsnl = id_prsnl;
	}

	public int getState_id() {
		return state_id;
	}
	
	
	public void setState_id(int state_id) {
		this.state_id = state_id;
	}

	public int getPerson_id() {
		return person_id;
	}

	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRol_id() {
		return rol_id;
	}

	public void setRol_id(int rol_id) {
		this.rol_id = rol_id;
	} 
	

}
