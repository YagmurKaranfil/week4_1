package kodlama.io.Kodlama.io.Devs.entities.concretes;

public class ProgrammingLanguage {
	
	private int id;
	private String programmingLanguage;
	
	
	public ProgrammingLanguage() {
		super();
	}


	public ProgrammingLanguage(int id, String programmingLanguage) {
		super();
		this.id = id;
		this.programmingLanguage = programmingLanguage;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getProgrammingLanguage() {
		return programmingLanguage;
	}


	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
	
	
	
	

}
