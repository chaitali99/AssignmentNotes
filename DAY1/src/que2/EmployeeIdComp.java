package que2;

import java.util.Comparator;

public class EmployeeIdComp implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.getEmpId()<e2.getEmpId()) {
			return +1;
		}else {
			return -1;
		}
	}

}
