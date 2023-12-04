package com.skillstorm.programmer;

public class Programmer {
	private String name;
	private String employer;
	private String[] languages;
	
	public Programmer(String name, String employer, String[] languages) {
		super();
		this.name = name;
		this.employer = employer;
		this.languages = languages;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public String[] getLanguages() {
		return languages;
	}

	public void setLanguages(String[] languages) {
		this.languages = languages;
	}
	
	public void learnLanguage(String language) {
		if (language != null && !language.isEmpty()) {
			String[] newList = new String[languages.length + 1];
			for (int i = 0; i < languages.length; i++) {
				newList[i] = languages[i];
			}
			newList[newList.length - 1] = language;
			languages = newList;
		}
	}
	
	public boolean containsLanguage(String language) {
		for (String str : languages) {
			if (language.equals(str)) {
				return true;
			}
		}
		return false;
	}
	
	public void forgetLanguage(String language) {
		if  (language != null && !language.isEmpty() && containsLanguage(language)) {
			String[] newList = new String[languages.length - 1];
			int index = 0;
			for (int i = 0; i < languages.length; i++) {
				if (!languages[i].equals(language)) {
					newList[index++] = languages[i];
				}
			}
			languages = newList;
		}
	}
	
	public String toString() {
		String str = String.format("\nProgrammer\nName: %s\nCompany: "
				+ "%s\nLanguages: ", name, employer);
		if (!(languages.length == 0)) {
			for (String language : languages) {
				str += language;
				if (!language.equals(languages[languages.length - 1])) {
					str += ", ";
				}
			}
		} else {
			str += "None";
		}
		return str;
	}
	
	public boolean equals(Object obj) {
		if (!obj.getClass().equals(this.getClass())) {
			return false;
		}
		
		Programmer other = (Programmer) obj;
		
		if (this.languages.length != other.languages.length) {
			return false;
		}
		
		for (String language : other.languages) {
			if (!containsLanguage(language)) {
				return false;
			}
		}
			
		return true;
	}
}
