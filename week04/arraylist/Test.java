package Week04.arraylist;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		ArrayList<IceCream> flavors = new ArrayList<IceCream>(
				Arrays.asList(new IceCream("Chocolate", 1.5), 
						new IceCream("Vanilla", 1.45), 
						new IceCream("Strawberry", 1.55)));
		ArrayList<Customer> customers = new ArrayList<Customer>();
		IceCreamShop mooShop = new IceCreamShop("Moo Shop", 0, flavors, customers);
		
		try {
			mooShop.addCustomer(new Customer(new IceCream("chocolate", 1.50), "Bob"));
			mooShop.addCustomer(new Customer(new IceCream("BaNaNa", 1.50), "Jack"));
			System.out.println(mooShop);
			test1(mooShop);
			test2(mooShop);
			test3(mooShop);
			System.out.println(mooShop);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void test1(IceCreamShop mooShop) {
		try {
			mooShop.serviceCustomer();
			mooShop.serviceCustomer();
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void test2(IceCreamShop mooShop) {
		try {
			mooShop.serviceCustomer();
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void test3(IceCreamShop mooShop) {
		mooShop.addFlavor(new IceCream("VaNiLlA", 1.44)); //This won't be added again.
		mooShop.addFlavor(new IceCream("Banana", 1.55));
	}

}
