package pl.futureid.manager.test;

import javax.ejb.Local;

@Local
public interface HelloLocal {

	public void sayMsg(String message);
}
