package in.ineuron.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer eno;
	

	private String ename;
	
	private String eaddr;
	
	private String esalary;

	

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", eaddr=" + eaddr + ", esalary=" + esalary + "]";
	}
	
	

}
