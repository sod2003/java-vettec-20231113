package Week03.animal;

public class Animal {
	
	private String name;
	private boolean isAlive;
	private boolean isExtinct;
	
	public Animal() {
	}
	
	
	public Animal(String name, boolean isAlive, boolean isExtinct) {
		super();
		this.name = name;
		this.isAlive = isAlive;
		this.isExtinct = isExtinct;
	}

	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isAlive() {
		return isAlive;
	}


	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}


	public boolean isExtinct() {
		return isExtinct;
	}


	public void setExtinct(boolean isExtinct) {
		this.isExtinct = isExtinct;
	}


	public void talk() {
		System.out.println("yadayadayada");
	}
	
	public Animal reproduce() {
		return new Animal(this.name, true, false);
	}
	
	

}
