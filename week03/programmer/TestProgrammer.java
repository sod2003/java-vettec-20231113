package Week03.programmer;

public class TestProgrammer {

	public static void main(String[] args) {
		Programmer programmer1 = new Programmer("Sean", "Delta", new String[] {"Java", "Python"});
		Programmer programmer2 = new Programmer("Jim", "NJOIT", new String[] {"Java", "HTML"});
		System.out.println(programmer1);
		System.out.println(programmer2);
		Programmer programmer3 = new Programmer("James", "NJOIT", new String[] {"Javascript"});
		System.out.println(programmer3);
		System.out.println(programmer2.equals(programmer3));
		programmer3.learnLanguage(null);
		programmer3.learnLanguage("");
		programmer3.learnLanguage("Java");
		programmer3.learnLanguage("HTML");
		programmer3.forgetLanguage("Javascript");
		System.out.println(programmer3);
		System.out.println(programmer2.equals(programmer3));
		
	}

}
