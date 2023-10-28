package model;

public class Policy {
    private int customerId;

    private int policyNumber;

    private String policyHolderName;

    private String PolicyType;

    private int startDate;

    private int endDate;

    private int premium;

    private int coverageAmount;

    private String beneficiaries;

    public Policy(int customerId, int policyNumber, String policyHolderName, String policyType, int startDate, int endDate, int premium, int coverageAmount, String beneficiaries) {
        this.customerId = customerId;
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.PolicyType = policyType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.premium = premium;
        this.coverageAmount = coverageAmount;
        this.beneficiaries = beneficiaries;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public void setPolicyHolderName(String policyHolderName) {
        this.policyHolderName = policyHolderName;
    }

    public String getPolicyType() {
        return PolicyType;
    }

    public void setPolicyType(String policyType) {
        PolicyType = policyType;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }

    public int getPremium() {
        return premium;
    }

    public void setPremium(int premium) {
        this.premium = premium;
    }

    public int getCoverageAmount() {
        return coverageAmount;
    }

    public void setCoverageAmount(int coverageAmount) {
        this.coverageAmount = coverageAmount;
    }

    public String getBeneficiaries() {
        return beneficiaries;
    }

    public void setBeneficiaries(String beneficiaries) {
        this.beneficiaries = beneficiaries;
    }
}
