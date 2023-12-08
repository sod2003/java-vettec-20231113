package com.skillstorm.arraylist;
import java.util.ArrayList;

public class IceCreamShop {
	private String name;
    private double amountEarned;
    private ArrayList<IceCream> flavors; // Are the flavors available at a given store
    private ArrayList<Customer> customerLine = new ArrayList<>();

	public IceCreamShop(String name, double amountEarned, ArrayList<IceCream> flavors,
			ArrayList<Customer> customerLine) {
		this.name = name;
		this.amountEarned = amountEarned;
		this.flavors = flavors;
		this.customerLine = customerLine;
	}

	/*
     * TODO
     * 
     * This function services the customer at the front of the customer line and 
     * adds their total ice cream cost to the line before removing them from the line.
     * 
     * If they do not have an ice cream (null value) throw an IllegalArgumentException
     * If they have a flavor that's not in the flavors list, throw an IllegalArgumentException
     * 
     * HINT: For IceCream comparison, compare the two Ice Cream's String flavors
     */
    public void serviceCustomer() throws Exception {
    	if (customerLine == null || customerLine.isEmpty()) {
    		throw new Exception("Nobody in line.\n");
    	}
    	IceCream order = customerLine.get(0).getIceCream();
    	if (order == null || !flavors.contains(order)) {
    		customerLine.remove(0);
    		throw new IllegalArgumentException("The customer tried to order a "
    				+ "flavor we didn't have, or wasn't ready.\n");
    	}
    	System.out.println(customerLine.get(0));
    	amountEarned += order.getPrice();
    	customerLine.remove(0);
    }

    /*
     * TODO
     * This function adds a customer to the back of the line
     */
    public void addCustomer(Customer c) {
        customerLine.add(c);
    }

    /*
     * TODO
     * This function should add a flavor to the ice cream list
     * HINT: For IceCream comparison, compare the two Ice Cream's String flavors
     */
    public void addFlavor(IceCream flavor) {
        if (!flavors.contains(flavor)) {
        	flavors.add(flavor);
        }
    }

    /*
     * TODO
     * This function should remove a flavor from the ice cream list
     * HINT: For IceCream comparison, compare the two Ice Cream's String flavors
     */
    public void removeFlavor(IceCream flavor) {
        if (flavors.contains(flavor)) {
        	flavors.remove(flavors.indexOf(flavor));
        }
    }

	public String toString() {
		String str =  String.format("%s has currently earned $%.2f\nThey have the"
				+ " following flavors:\n", name, amountEarned);
		for (IceCream flavor : flavors) {
			str += flavor + "\n";
		}
		str += "And the following Customers in line:\n";
		if (customerLine.isEmpty()) {
			str += "None\n";
		} else {
			for (Customer customer : customerLine) {
				str += customer.getName() + "\n";
			}
		}

		return str;
	}
}
