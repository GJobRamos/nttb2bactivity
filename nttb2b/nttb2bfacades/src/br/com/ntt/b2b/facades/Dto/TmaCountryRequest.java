package br.com.ntt.b2b.facades.Dto;

public class TmaCountryRequest {
    private String isocode;
    private String name;

    public TmaCountryRequest() {}

    public String getIsocode() {
        return isocode;
    }

    public void setIsocode(String isocode) {
        this.isocode = isocode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
