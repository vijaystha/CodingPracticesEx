package model;

public class Claim {
    private String claimId;
    private String claimType;
    private String dateFiled;
    private String claimStatus;

    public Claim(String claimId, String claimType, String dateFiled, String claimStatus) {
        this.claimId = claimId;
        this.claimType = claimType;
        this.dateFiled = dateFiled;
        this.claimStatus = claimStatus;
    }

    public String getClaimId() {
        return claimId;
    }

    public void setClaimId(String claimId) {
        this.claimId = claimId;
    }

    public String getClaimType() {
        return claimType;
    }

    public void setClaimType(String claimType) {
        this.claimType = claimType;
    }

    public String getDateFiled() {
        return dateFiled;
    }

    public void setDateFiled(String dateFiled) {
        this.dateFiled = dateFiled;
    }

    public String getClaimStatus() {
        return claimStatus;
    }

    public void setClaimStatus(String claimStatus) {
        this.claimStatus = claimStatus;
    }
}
