package modelos.personas;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "CLIENTE")
public class Cliente  {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_clnt; 
	
	@Column(name = "CORREO")
	private String email;
	
	@Column(name = "CARGO")
	private int id_rol;
	
	@Column(name = "PERSONA_ID")
	private int id_prsn;
	

	@Column(name = "NIP")
	private int nip;
	
	
	public Cliente() {
		
	}
	

	public Cliente(int id_clnt, String email, int id_rol, int id_prsn, int nip) {
		//super();
		this.id_clnt = id_clnt;
		this.email = email;
		this.id_rol = id_rol;
		this.id_prsn = id_prsn;
		this.nip = nip; 
	}

	public int getId_clnt() {
		return id_clnt;
	}

	public void setId_clnt(int id_clnt) {
		this.id_clnt = id_clnt;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId_rol() {
		return id_rol;
	}

	public void setId_rol(int id_rol) {
		this.id_rol = id_rol;
	}

	public int getId_prsn() {
		return id_prsn;
	}

	public void setId_prsn(int id_prsn) {
		this.id_prsn = id_prsn;
	}


	public int getNip() {
		return nip;
	}


	public void setNip(int nip) {
		this.nip = nip;
	}
	
	
}
