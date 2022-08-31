package br.com.ntt.b2b.Dto;


import java.util.List;

public class TmaCustomerRequest {
    private TmaAddressRequest address;
    private String birthdate;
    private String firstName;
    private List<TmaIdentificationsRequest> identifications;
    private String lastName;
    private String mobilephone;
    private String mothersName;
    private String name;
    private String nickname;
    private String password;
    private boolean smsNotifications;
    private String telephone1;
    private String telephone2;
    private String titleCode;
    private String uid;
    private boolean whatsappNotifications;
    private String rg;
    private String cpf;
    private String passport;
    private String title;

    public TmaCustomerRequest(){}

    public TmaAddressRequest getAddress() {
        return address;
    }

    public void setAddress(TmaAddressRequest address) {
        this.address = address;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public List<TmaIdentificationsRequest> getIdentifications() {
        return identifications;
    }

    public void setIdentifications(List<TmaIdentificationsRequest> identifications) {
        this.identifications = identifications;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
    }

    public String getMothersName() {
        return mothersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isSmsNotifications() {
        return smsNotifications;
    }

    public void setSmsNotifications(boolean smsNotifications) {
        this.smsNotifications = smsNotifications;
    }

    public String getTelephone1() {
        return telephone1;
    }

    public void setTelephone1(String telephone1) {
        this.telephone1 = telephone1;
    }

    public String getTelephone2() {
        return telephone2;
    }

    public void setTelephone2(String telephone2) {
        this.telephone2 = telephone2;
    }

    public String getTitleCode() {
        return titleCode;
    }

    public void setTitleCode(String titleCode) {
        this.titleCode = titleCode;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public boolean isWhatsappNotifications() {
        return whatsappNotifications;
    }

    public void setWhatsappNotifications(boolean whatsappNotifications) {
        this.whatsappNotifications = whatsappNotifications;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
