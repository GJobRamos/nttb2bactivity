package br.com.ntt.b2b.Dto;

public class TmaRegionRequest {
    private String countryIso;
    private String isocode;
    private String isocodeShort;
    private String name;
    private String role;

    public TmaRegionRequest(){}

    public String getCountryIso() {
        return countryIso;
    }

    public void setCountryIso(String countryIso) {
        this.countryIso = countryIso;
    }

    public String getIsocode() {
        return isocode;
    }

    public void setIsocode(String isocode) {
        this.isocode = isocode;
    }

    public String getIsocodeShort() {
        return isocodeShort;
    }

    public void setIsocodeShort(String isocodeShort) {
        this.isocodeShort = isocodeShort;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
