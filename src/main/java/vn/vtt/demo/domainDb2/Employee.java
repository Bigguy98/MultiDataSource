package vn.vtt.demo.domainDb2;

import javax.persistence.*;
import java.sql.Time;

@Entity
public class Employee {
    private int empId;
    private Time endDate;
    private String firstName;
    private String lastName;
    private Time startDate;
    private String title;
    private Employee employeeBySuperiorEmpId;

    @Id
    @Column(name = "EMP_ID", nullable = false, precision = 0)
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Basic
    @Column(name = "END_DATE", nullable = true)
    public Time getEndDate() {
        return endDate;
    }

    public void setEndDate(Time endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "FIRST_NAME", nullable = false, length = 20)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "LAST_NAME", nullable = false, length = 20)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "START_DATE", nullable = false)
    public Time getStartDate() {
        return startDate;
    }

    public void setStartDate(Time startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "TITLE", nullable = true, length = 20)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (empId != employee.empId) return false;
        if (endDate != null ? !endDate.equals(employee.endDate) : employee.endDate != null) return false;
        if (firstName != null ? !firstName.equals(employee.firstName) : employee.firstName != null) return false;
        if (lastName != null ? !lastName.equals(employee.lastName) : employee.lastName != null) return false;
        if (startDate != null ? !startDate.equals(employee.startDate) : employee.startDate != null) return false;
        if (title != null ? !title.equals(employee.title) : employee.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empId;
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "SUPERIOR_EMP_ID", referencedColumnName = "EMP_ID")
    public Employee getEmployeeBySuperiorEmpId() {
        return employeeBySuperiorEmpId;
    }

    public void setEmployeeBySuperiorEmpId(Employee employeeBySuperiorEmpId) {
        this.employeeBySuperiorEmpId = employeeBySuperiorEmpId;
    }
}
