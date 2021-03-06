/*
 * EasyBimehLandingLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ir.notifaano.server.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class InsuranceCentreData 
        implements java.io.Serializable {
    private static final long serialVersionUID = 948160861892697583L;
    private int id;
    private String personId;
    private int personalityType;
    private int insuranceCentreType;
    private int registerStatus;
    private String centerName;
    private String centerCode;
    private String branchCount;
    private String registrationNumber;
    private String freeUseGoldenPackExpireDate;
    private int cityId;
    private boolean cashPayment;
    private boolean showInEasyBimeh;
    private boolean installmentsPayment;
    private boolean isInitialApplicant;
    private int branchsCount;
    private int employeesCount;
    private String zoneId;
    private String smsChargingStock;
    private String independentBranch;
    private String disableReason;
    private String termsConditions;
    private String disableReasonDescription;
    private String unlimitedAccount;
    private boolean whiteLabel;
    private String phone;
    private String fax;
    private String address;
    private String zipCode;
    private String email;
    private String paymentUrl;
    private String callbackUrl;
    private String callbackUrlWhitelabel;
    private String webSite;
    private double latitude;
    private double longitude;
    private boolean isActive;
    private String insuranceCentreId;
    private String cityRegionId;
    private int provinceId;
    private String cityName;
    private int metaMediaActivityLicenceId;
    private String metaMediaActivityLicenceUrl;
    private String createOnPersianDate;
    private List<Integer> insuranceCompanyId;
    private int activePackageId;
    private String packageActivationLastDate;
    private String licenseApiKey;
    private String verifyRequestUrl;
    private boolean onlinePayment;
    private boolean cardToCardPayment;
    private boolean bankTransferPayment;
    private boolean cashOnDelivery;
    private boolean bankTransferSameOnlinePaymentInfo;
    private int bankParamId;
    private String accountOwner;
    private String accountNumber;
    private String iban;
    private int cardBankParamId;
    private String cardAccountOwner;
    private String cardAccountNumber;
    private int bankTransferParamId;
    private String bankTransferAccountOwner;
    private String bankTransferAccountNumber;
    private String bankTransferIBAN;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("id")
    public int getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("id")
    public void setId (int value) { 
        this.id = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("personId")
    public String getPersonId ( ) { 
        return this.personId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("personId")
    public void setPersonId (String value) { 
        this.personId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("personalityType")
    public int getPersonalityType ( ) { 
        return this.personalityType;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("personalityType")
    public void setPersonalityType (int value) { 
        this.personalityType = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("insuranceCentreType")
    public int getInsuranceCentreType ( ) { 
        return this.insuranceCentreType;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("insuranceCentreType")
    public void setInsuranceCentreType (int value) { 
        this.insuranceCentreType = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("registerStatus")
    public int getRegisterStatus ( ) { 
        return this.registerStatus;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("registerStatus")
    public void setRegisterStatus (int value) { 
        this.registerStatus = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("centerName")
    public String getCenterName ( ) { 
        return this.centerName;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("centerName")
    public void setCenterName (String value) { 
        this.centerName = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("centerCode")
    public String getCenterCode ( ) { 
        return this.centerCode;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("centerCode")
    public void setCenterCode (String value) { 
        this.centerCode = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("branchCount")
    public String getBranchCount ( ) { 
        return this.branchCount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("branchCount")
    public void setBranchCount (String value) { 
        this.branchCount = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("registrationNumber")
    public String getRegistrationNumber ( ) { 
        return this.registrationNumber;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("registrationNumber")
    public void setRegistrationNumber (String value) { 
        this.registrationNumber = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("freeUseGoldenPackExpireDate")
    public String getFreeUseGoldenPackExpireDate ( ) { 
        return this.freeUseGoldenPackExpireDate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("freeUseGoldenPackExpireDate")
    public void setFreeUseGoldenPackExpireDate (String value) { 
        this.freeUseGoldenPackExpireDate = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("cityId")
    public int getCityId ( ) { 
        return this.cityId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("cityId")
    public void setCityId (int value) { 
        this.cityId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("cashPayment")
    public boolean getCashPayment ( ) { 
        return this.cashPayment;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("cashPayment")
    public void setCashPayment (boolean value) { 
        this.cashPayment = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("showInEasyBimeh")
    public boolean getShowInEasyBimeh ( ) { 
        return this.showInEasyBimeh;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("showInEasyBimeh")
    public void setShowInEasyBimeh (boolean value) { 
        this.showInEasyBimeh = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("installmentsPayment")
    public boolean getInstallmentsPayment ( ) { 
        return this.installmentsPayment;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("installmentsPayment")
    public void setInstallmentsPayment (boolean value) { 
        this.installmentsPayment = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("isInitialApplicant")
    public boolean getIsInitialApplicant ( ) { 
        return this.isInitialApplicant;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("isInitialApplicant")
    public void setIsInitialApplicant (boolean value) { 
        this.isInitialApplicant = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("branchsCount")
    public int getBranchsCount ( ) { 
        return this.branchsCount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("branchsCount")
    public void setBranchsCount (int value) { 
        this.branchsCount = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("employeesCount")
    public int getEmployeesCount ( ) { 
        return this.employeesCount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("employeesCount")
    public void setEmployeesCount (int value) { 
        this.employeesCount = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("zoneId")
    public String getZoneId ( ) { 
        return this.zoneId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("zoneId")
    public void setZoneId (String value) { 
        this.zoneId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("smsChargingStock")
    public String getSmsChargingStock ( ) { 
        return this.smsChargingStock;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("smsChargingStock")
    public void setSmsChargingStock (String value) { 
        this.smsChargingStock = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("independentBranch")
    public String getIndependentBranch ( ) { 
        return this.independentBranch;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("independentBranch")
    public void setIndependentBranch (String value) { 
        this.independentBranch = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("disableReason")
    public String getDisableReason ( ) { 
        return this.disableReason;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("disableReason")
    public void setDisableReason (String value) { 
        this.disableReason = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("termsConditions")
    public String getTermsConditions ( ) { 
        return this.termsConditions;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("termsConditions")
    public void setTermsConditions (String value) { 
        this.termsConditions = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("disableReasonDescription")
    public String getDisableReasonDescription ( ) { 
        return this.disableReasonDescription;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("disableReasonDescription")
    public void setDisableReasonDescription (String value) { 
        this.disableReasonDescription = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("unlimitedAccount")
    public String getUnlimitedAccount ( ) { 
        return this.unlimitedAccount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("unlimitedAccount")
    public void setUnlimitedAccount (String value) { 
        this.unlimitedAccount = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("whiteLabel")
    public boolean getWhiteLabel ( ) { 
        return this.whiteLabel;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("whiteLabel")
    public void setWhiteLabel (boolean value) { 
        this.whiteLabel = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("phone")
    public String getPhone ( ) { 
        return this.phone;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("phone")
    public void setPhone (String value) { 
        this.phone = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("fax")
    public String getFax ( ) { 
        return this.fax;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("fax")
    public void setFax (String value) { 
        this.fax = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("address")
    public String getAddress ( ) { 
        return this.address;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("address")
    public void setAddress (String value) { 
        this.address = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("zipCode")
    public String getZipCode ( ) { 
        return this.zipCode;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("zipCode")
    public void setZipCode (String value) { 
        this.zipCode = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("email")
    public String getEmail ( ) { 
        return this.email;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("email")
    public void setEmail (String value) { 
        this.email = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("paymentUrl")
    public String getPaymentUrl ( ) { 
        return this.paymentUrl;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("paymentUrl")
    public void setPaymentUrl (String value) { 
        this.paymentUrl = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("callbackUrl")
    public String getCallbackUrl ( ) { 
        return this.callbackUrl;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("callbackUrl")
    public void setCallbackUrl (String value) { 
        this.callbackUrl = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("callbackUrlWhitelabel")
    public String getCallbackUrlWhitelabel ( ) { 
        return this.callbackUrlWhitelabel;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("callbackUrlWhitelabel")
    public void setCallbackUrlWhitelabel (String value) { 
        this.callbackUrlWhitelabel = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("webSite")
    public String getWebSite ( ) { 
        return this.webSite;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("webSite")
    public void setWebSite (String value) { 
        this.webSite = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("latitude")
    public double getLatitude ( ) { 
        return this.latitude;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("latitude")
    public void setLatitude (double value) { 
        this.latitude = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("longitude")
    public double getLongitude ( ) { 
        return this.longitude;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("longitude")
    public void setLongitude (double value) { 
        this.longitude = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("isActive")
    public boolean getIsActive ( ) { 
        return this.isActive;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("isActive")
    public void setIsActive (boolean value) { 
        this.isActive = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("insuranceCentreId")
    public String getInsuranceCentreId ( ) { 
        return this.insuranceCentreId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("insuranceCentreId")
    public void setInsuranceCentreId (String value) { 
        this.insuranceCentreId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("cityRegionId")
    public String getCityRegionId ( ) { 
        return this.cityRegionId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("cityRegionId")
    public void setCityRegionId (String value) { 
        this.cityRegionId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("provinceId")
    public int getProvinceId ( ) { 
        return this.provinceId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("provinceId")
    public void setProvinceId (int value) { 
        this.provinceId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("cityName")
    public String getCityName ( ) { 
        return this.cityName;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("cityName")
    public void setCityName (String value) { 
        this.cityName = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("metaMediaActivityLicenceId")
    public int getMetaMediaActivityLicenceId ( ) { 
        return this.metaMediaActivityLicenceId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("metaMediaActivityLicenceId")
    public void setMetaMediaActivityLicenceId (int value) { 
        this.metaMediaActivityLicenceId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("metaMediaActivityLicenceUrl")
    public String getMetaMediaActivityLicenceUrl ( ) { 
        return this.metaMediaActivityLicenceUrl;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("metaMediaActivityLicenceUrl")
    public void setMetaMediaActivityLicenceUrl (String value) { 
        this.metaMediaActivityLicenceUrl = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("createOnPersianDate")
    public String getCreateOnPersianDate ( ) { 
        return this.createOnPersianDate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("createOnPersianDate")
    public void setCreateOnPersianDate (String value) { 
        this.createOnPersianDate = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("insuranceCompanyId")
    public List<Integer> getInsuranceCompanyId ( ) { 
        return this.insuranceCompanyId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("insuranceCompanyId")
    public void setInsuranceCompanyId (List<Integer> value) { 
        this.insuranceCompanyId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("activePackageId")
    public int getActivePackageId ( ) { 
        return this.activePackageId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("activePackageId")
    public void setActivePackageId (int value) { 
        this.activePackageId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("packageActivationLastDate")
    public String getPackageActivationLastDate ( ) { 
        return this.packageActivationLastDate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("packageActivationLastDate")
    public void setPackageActivationLastDate (String value) { 
        this.packageActivationLastDate = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("licenseApiKey")
    public String getLicenseApiKey ( ) { 
        return this.licenseApiKey;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("licenseApiKey")
    public void setLicenseApiKey (String value) { 
        this.licenseApiKey = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("verifyRequestUrl")
    public String getVerifyRequestUrl ( ) { 
        return this.verifyRequestUrl;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("verifyRequestUrl")
    public void setVerifyRequestUrl (String value) { 
        this.verifyRequestUrl = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("onlinePayment")
    public boolean getOnlinePayment ( ) { 
        return this.onlinePayment;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("onlinePayment")
    public void setOnlinePayment (boolean value) { 
        this.onlinePayment = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("cardToCardPayment")
    public boolean getCardToCardPayment ( ) { 
        return this.cardToCardPayment;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("cardToCardPayment")
    public void setCardToCardPayment (boolean value) { 
        this.cardToCardPayment = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("bankTransferPayment")
    public boolean getBankTransferPayment ( ) { 
        return this.bankTransferPayment;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("bankTransferPayment")
    public void setBankTransferPayment (boolean value) { 
        this.bankTransferPayment = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("cashOnDelivery")
    public boolean getCashOnDelivery ( ) { 
        return this.cashOnDelivery;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("cashOnDelivery")
    public void setCashOnDelivery (boolean value) { 
        this.cashOnDelivery = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("bankTransferSameOnlinePaymentInfo")
    public boolean getBankTransferSameOnlinePaymentInfo ( ) { 
        return this.bankTransferSameOnlinePaymentInfo;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("bankTransferSameOnlinePaymentInfo")
    public void setBankTransferSameOnlinePaymentInfo (boolean value) { 
        this.bankTransferSameOnlinePaymentInfo = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("bankParamId")
    public int getBankParamId ( ) { 
        return this.bankParamId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("bankParamId")
    public void setBankParamId (int value) { 
        this.bankParamId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("accountOwner")
    public String getAccountOwner ( ) { 
        return this.accountOwner;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("accountOwner")
    public void setAccountOwner (String value) { 
        this.accountOwner = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("accountNumber")
    public String getAccountNumber ( ) { 
        return this.accountNumber;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("accountNumber")
    public void setAccountNumber (String value) { 
        this.accountNumber = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("iban")
    public String getIban ( ) { 
        return this.iban;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("iban")
    public void setIban (String value) { 
        this.iban = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("cardBankParamId")
    public int getCardBankParamId ( ) { 
        return this.cardBankParamId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("cardBankParamId")
    public void setCardBankParamId (int value) { 
        this.cardBankParamId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("cardAccountOwner")
    public String getCardAccountOwner ( ) { 
        return this.cardAccountOwner;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("cardAccountOwner")
    public void setCardAccountOwner (String value) { 
        this.cardAccountOwner = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("cardAccountNumber")
    public String getCardAccountNumber ( ) { 
        return this.cardAccountNumber;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("cardAccountNumber")
    public void setCardAccountNumber (String value) { 
        this.cardAccountNumber = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("bankTransferParamId")
    public int getBankTransferParamId ( ) { 
        return this.bankTransferParamId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("bankTransferParamId")
    public void setBankTransferParamId (int value) { 
        this.bankTransferParamId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("bankTransferAccountOwner")
    public String getBankTransferAccountOwner ( ) { 
        return this.bankTransferAccountOwner;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("bankTransferAccountOwner")
    public void setBankTransferAccountOwner (String value) { 
        this.bankTransferAccountOwner = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("bankTransferAccountNumber")
    public String getBankTransferAccountNumber ( ) { 
        return this.bankTransferAccountNumber;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("bankTransferAccountNumber")
    public void setBankTransferAccountNumber (String value) { 
        this.bankTransferAccountNumber = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("bankTransferIBAN")
    public String getBankTransferIBAN ( ) { 
        return this.bankTransferIBAN;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("bankTransferIBAN")
    public void setBankTransferIBAN (String value) { 
        this.bankTransferIBAN = value;
    }
 
}
