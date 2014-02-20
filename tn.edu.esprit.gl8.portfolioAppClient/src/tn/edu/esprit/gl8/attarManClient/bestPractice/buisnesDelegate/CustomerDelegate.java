package tn.edu.esprit.gl8.attarManClient.bestPractice.buisnesDelegate;

import tn.edu.esprit.gl8.attarMan.domain.Customer;
import tn.edu.esprit.gl8.attarMan.services.interfaces.CustomerManagmentRemote;
import tn.edu.esprit.gl8.attarManClient.bestPractice.serviceLocater.ServiceLocater;

public class CustomerDelegate {
	private static final String jndiName = "ejb:/tn.edu.esprit.gl8.attarMan/CustomerManagement!"
			+ CustomerManagmentRemote.class.getCanonicalName();

	private static CustomerManagmentRemote getProxy() {
		return (CustomerManagmentRemote) ServiceLocater.getInstance().getProxy(
				jndiName);

	}

	public static boolean doAddCustomer(Customer customer) {
		return getProxy().addCustomer(customer);
	}

}
