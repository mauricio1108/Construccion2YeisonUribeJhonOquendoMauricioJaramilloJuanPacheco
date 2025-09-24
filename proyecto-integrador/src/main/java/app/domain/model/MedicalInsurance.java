package app.domain.model;

import java.util.Date;

public class MedicalInsurance {

    private String companyName;
    private String policyNumber;
    private boolean isActive;
    private Date expirationDate;

    public MedicalInsurance(String companyName, String policyNumber, boolean isActive, Date expirationDate) {
        this.companyName = companyName;
        this.policyNumber = policyNumber;
        this.isActive = isActive;
        this.expirationDate = expirationDate;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean isPolicyStatus() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
