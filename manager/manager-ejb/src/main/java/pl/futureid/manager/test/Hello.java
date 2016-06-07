package pl.futureid.manager.test;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 * Session Bean implementation class Hello
 */
@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
@LocalBean
public class Hello implements HelloLocal {

	/**
	 * Default constructor.
	 */
	public Hello() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sayMsg(String message) {

		System.out.println(message);

	}

	@Override
	public String getHello() {

		return "hello";
	}

}
