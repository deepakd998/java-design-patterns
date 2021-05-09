package learn.momento;

import learn.facade.PhoneImpl;

public class MomentoDemo {

	public static void main(String[] args) {
	CareTaker careTaker=new CareTaker();
	Employee emp= new Employee();
	emp.setName("DEEPAK");
	emp.setPhone("999999999");
	emp.setAddress("hjbajbja");
	
	careTaker.save(emp);
	System.out.println("phone after save=="+emp.getPhone());
	emp.setPhone("7777777777");
	careTaker.save(emp);
	System.out.println("phone after save1=="+emp.getPhone());
	
	emp.setPhone("888888888");
	careTaker.revert(emp);
	System.out.println("phone after revert=="+emp.getPhone());
	careTaker.revert(emp);
	
	System.out.println("phone after revert1=="+emp.getPhone());
	}

}
