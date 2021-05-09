package learn.momento;

import java.util.Stack;

public class CareTaker {
private Stack<EmployeeMomento> empHistory=new Stack<>();


public void save(Employee emp) {
	empHistory.push(emp.save());
}

public void revert(Employee emp) {
	emp.revert(empHistory.pop());
}

}
