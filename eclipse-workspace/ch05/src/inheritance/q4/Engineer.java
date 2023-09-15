package inheritance.q4;
//자식 class
public class Engineer extends Employee{	
	private String skillset;
	
	public Engineer(String name) {
		super(name);
	}
	public String getSkillSet() {
		return skillset;
	}
	public void setSkillset(String skillset) {
		this.skillset = skillset;
	}

		
		
		
	

}
