package tourDAO;

import java.util.concurrent.CopyOnWriteArrayList;

import experts.GeneralExpert;

public interface DAO <T extends GeneralExpert>{
	void create (T GeneralExpert);
	CopyOnWriteArrayList <T> findAll();
	T findById(int id);
	T update(T GeneralExpert);
	void delete (int id);
	boolean delete (T GeneralExpert);
}
