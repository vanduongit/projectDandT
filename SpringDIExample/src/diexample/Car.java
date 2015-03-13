package diexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;


public class Car {
	private String label;
	
	private Engineer engineer;
	
	public Car() {
		
	}
	public String getLabel() {
		return label;
	}
	@Required
	public void setLabel(String label) {
		this.label = label;
	}
	public Engineer getEngineer() {
		return engineer;
	}
	
	@Autowired
	public void setEngineer(Engineer engineer) {
		this.engineer = engineer;
	}
	public void show(){
		System.out.println(engineer.getName() + " is repairing car "+label);
	}
}
