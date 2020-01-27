package inner;

public class lambda {

		int empId;
		int empSalary;
		 String empName,empLocation;
			//Address a;
		public lambda(int empId, int empSalary, String empName, String empLocation ) {
			super();
			this.empId = empId;
			this.empSalary = empSalary;
			this.empName = empName;
			this.empLocation = empLocation;
			//this.a = a;
		}


		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public int getEmpSalary() {
			return empSalary;
		}
		public void setEmpSalary(int empSalary) {
			this.empSalary = empSalary;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public String getEmpLocation() {
			return empLocation;
		}
		public void setEmpLocation(String empLocation) {
			this.empLocation = empLocation;
		}
		

		@Override
		public String toString() {
			return "EmployeeDetails [empId=" + empId + ", empSalary=" + empSalary + ", empName=" + empName
					+ ", empLocation=" + empLocation + "]";
		}


}
