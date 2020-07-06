package modelos.personas;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ESTADO_PERSONAL")
public class Estado_Personal  {

	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_st; 
	
	@Column(name = "ESTADO_PERSONAL")
	private String state;
	
	public Estado_Personal() {
		
	}

	public Estado_Personal(int id_st, String state) {
		//super();
		this.id_st = id_st;
		this.state = state;
	}

	public int getId_st() {
		return id_st;
	}

	public void setId_st(int id_st) {
		this.id_st = id_st;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	} 
	
	

}
