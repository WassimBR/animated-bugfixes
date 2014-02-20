package tn.edu.esprit.gl8.attarManClient.junitTests;

import junit.framework.Assert;

import org.junit.Test;

import tn.edu.esprit.gl8.attarMan.domain.Customer;
import tn.edu.esprit.gl8.attarManClient.bestPractice.buisnesDelegate.CustomerDelegate;

public class TestCustomerManagementServices {

	@Test
	public void itShouldAddCustomer() {
		Customer customer = new Customer("tabbessi");
		Assert.assertTrue(CustomerDelegate.doAddCustomer(customer));
	}

}
