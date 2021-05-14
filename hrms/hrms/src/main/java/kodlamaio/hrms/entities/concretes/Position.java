package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "job_positions")
public class Position {
	@Id
	@GeneratedValue
	@Column(name = "id")
	int id;
	@Column(name = "name")
	String name;

	public Position(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Position () {}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
