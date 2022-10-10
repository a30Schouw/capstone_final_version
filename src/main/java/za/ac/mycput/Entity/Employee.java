package za.ac.mycput.Entity;
/*
    Author : Devon Sherwyn May
    Student number : 219168296
    Date : 10 April 2022
    Employee.Java
*/

public class Employee
{
    private String empFirstName;
    private String empLastName;
    private String empPhoneNumber;
    private String empRole;
    private String empID;

    public Employee (Builder builder)
    {
        this.empFirstName=builder.empFirstName;
        this.empLastName=builder.empLastName;
        this.empPhoneNumber = builder.empPhoneNumber;
        this.empRole= builder.empRole;
        this.empID=builder.empID;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    public String getEmpPhoneNumber() {
        return empPhoneNumber;
    }

    public void setEmpPhoneNumber(String empPhoneNumber) {
        this.empPhoneNumber = empPhoneNumber;
    }

    public String getEmpRole() {
        return empRole;
    }

    public void setEmpRole(String empRole) {
        this.empRole = empRole;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empFirstName='" + empFirstName + '\'' +
                ", empLastName='" + empLastName + '\'' +
                ", empPhoneNumber='" + empPhoneNumber + '\'' +
                ", empRole='" + empRole + '\'' +
                ", empID='" + empID + '\'' +
                '}';
    }

    public static class Builder
    {
        private String empFirstName;
        private String empLastName;
        private String empPhoneNumber;
        private String empRole;
        private String empID;

        public Builder setEmpFirstName(String empFirstName)
        {
            this.empFirstName = empFirstName;
            return this;
        }

        public Builder setEmpLastName(String empLastName) {
            this.empLastName = empLastName;
            return this;
        }

        public Builder setEmpPhoneNumber(String empPhoneNumber) {
            this.empPhoneNumber = empPhoneNumber;
            return this;
        }

        public Builder setEmpRole(String empRole) {
            this.empRole = empRole;
            return this;
        }

        public Builder setEmpID(String empID) {
            this.empID = empID;
            return this;
        }

        public Builder copy(Employee employee)
        {
            this.empFirstName = employee.empFirstName;
            this.empLastName = employee.empLastName;
            this.empPhoneNumber = employee.empPhoneNumber;
            this.empRole = employee.empRole;
            this.empID = employee.empID;
            return this;
        }
        public Employee build(){return new Employee(this);}
    }
}
