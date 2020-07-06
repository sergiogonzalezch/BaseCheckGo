package modelos.personas;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ROL")
public class Rol_Personal {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_rol; 
	
	@Column(name = "ESTADO_PERSONAL")
	private String rol;
	
	public Rol_Personal() {
		
	}

	public Rol_Personal(int id_rol, String rol) {
		//super();
		this.id_rol = id_rol;
		this.rol = rol;
	}

	public int getId_rol() {
		return id_rol;
	}

	public String getRol() {
		return rol;
	}

	public void setId_rol(int id_rol) {
		this.id_rol = id_rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}



}
