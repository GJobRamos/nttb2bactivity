package br.com.ntt.b2b.Dto;

public class TmaIdentificationsRequest {
    private String identificationNumber;
    private String identificationType;

    public TmaIdentificationsRequest() {}

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getIdentificationType() {
        return identificationType;
    }

    public void setIdentificationType(String identificationType) {
        this.identificationType = identificationType;
    }
}
