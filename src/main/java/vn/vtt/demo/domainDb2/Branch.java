package vn.vtt.demo.domainDb2;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Branch {
    private int branchId;
    private String address;
    private String city;
    private String name;
    private String state;
    private String zipCode;

    @Id
    @Column(name = "BRANCH_ID", nullable = false, precision = 0)
    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    @Basic
    @Column(name = "ADDRESS", nullable = true, length = 30)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "CITY", nullable = true, length = 20)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "NAME", nullable = false, length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "STATE", nullable = true, length = 10)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "ZIP_CODE", nullable = true, length = 12)
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Branch branch = (Branch) o;

        if (branchId != branch.branchId) return false;
        if (address != null ? !address.equals(branch.address) : branch.address != null) return false;
        if (city != null ? !city.equals(branch.city) : branch.city != null) return false;
        if (name != null ? !name.equals(branch.name) : branch.name != null) return false;
        if (state != null ? !state.equals(branch.state) : branch.state != null) return false;
        if (zipCode != null ? !zipCode.equals(branch.zipCode) : branch.zipCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = branchId;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (zipCode != null ? zipCode.hashCode() : 0);
        return result;
    }
}
