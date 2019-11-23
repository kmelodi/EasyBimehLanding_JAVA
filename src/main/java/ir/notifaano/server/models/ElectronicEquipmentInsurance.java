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
public class ElectronicEquipmentInsurance 
        implements java.io.Serializable {
    private static final long serialVersionUID = 2950604610287362473L;
    private boolean hasPlan;
    private List<Franchisee> franchisees;
    private List<DeviceType> deviceTypes;
    private List<String> deviceBrands;
    private List<String> deviceModels;
    private List<InsuranceCompany> insuranceCompanies;
    private List<String> insuranceExtraCoverage;
    private List<InsurancePolicyTerm> insurancePolicyTerms;
    private List<Province> provinces;
    private List<String> cities;
    private List<String> cityRegions;
    private List<ShippingType> shippingTypes;
    private List<PostType> postTypes;
    private InsurancePolicyCondition insurancePolicyCondition;
    private InsuranceData insuranceData;
    /** GETTER
     * آیا این نوع بیمه نامه، طرح بیمه ای دارد؟
     */
    @JsonGetter("hasPlan")
    public boolean getHasPlan ( ) { 
        return this.hasPlan;
    }
    
    /** SETTER
     * آیا این نوع بیمه نامه، طرح بیمه ای دارد؟
     */
    @JsonSetter("hasPlan")
    public void setHasPlan (boolean value) { 
        this.hasPlan = value;
    }
 
    /** GETTER
     * لیست فرانشیز های بیمه ی تجهیزات الکترونیک
     */
    @JsonGetter("franchisees")
    public List<Franchisee> getFranchisees ( ) { 
        return this.franchisees;
    }
    
    /** SETTER
     * لیست فرانشیز های بیمه ی تجهیزات الکترونیک
     */
    @JsonSetter("franchisees")
    public void setFranchisees (List<Franchisee> value) { 
        this.franchisees = value;
    }
 
    /** GETTER
     * انواع دستگاه ها
     */
    @JsonGetter("deviceTypes")
    public List<DeviceType> getDeviceTypes ( ) { 
        return this.deviceTypes;
    }
    
    /** SETTER
     * انواع دستگاه ها
     */
    @JsonSetter("deviceTypes")
    public void setDeviceTypes (List<DeviceType> value) { 
        this.deviceTypes = value;
    }
 
    /** GETTER
     * برند های دستگاه ها
     */
    @JsonGetter("deviceBrands")
    public List<String> getDeviceBrands ( ) { 
        return this.deviceBrands;
    }
    
    /** SETTER
     * برند های دستگاه ها
     */
    @JsonSetter("deviceBrands")
    public void setDeviceBrands (List<String> value) { 
        this.deviceBrands = value;
    }
 
    /** GETTER
     * مدل های دستگاه ها
     */
    @JsonGetter("deviceModels")
    public List<String> getDeviceModels ( ) { 
        return this.deviceModels;
    }
    
    /** SETTER
     * مدل های دستگاه ها
     */
    @JsonSetter("deviceModels")
    public void setDeviceModels (List<String> value) { 
        this.deviceModels = value;
    }
 
    /** GETTER
     * شرکت های بیمه ی ارائه دهنده ی بیمه ی تجهیزات الکترونیک
     */
    @JsonGetter("insuranceCompanies")
    public List<InsuranceCompany> getInsuranceCompanies ( ) { 
        return this.insuranceCompanies;
    }
    
    /** SETTER
     * شرکت های بیمه ی ارائه دهنده ی بیمه ی تجهیزات الکترونیک
     */
    @JsonSetter("insuranceCompanies")
    public void setInsuranceCompanies (List<InsuranceCompany> value) { 
        this.insuranceCompanies = value;
    }
 
    /** GETTER
     * پوشش های اضافه
     */
    @JsonGetter("insuranceExtraCoverage")
    public List<String> getInsuranceExtraCoverage ( ) { 
        return this.insuranceExtraCoverage;
    }
    
    /** SETTER
     * پوشش های اضافه
     */
    @JsonSetter("insuranceExtraCoverage")
    public void setInsuranceExtraCoverage (List<String> value) { 
        this.insuranceExtraCoverage = value;
    }
 
    /** GETTER
     * دوره های بیمه نامه
     */
    @JsonGetter("insurancePolicyTerms")
    public List<InsurancePolicyTerm> getInsurancePolicyTerms ( ) { 
        return this.insurancePolicyTerms;
    }
    
    /** SETTER
     * دوره های بیمه نامه
     */
    @JsonSetter("insurancePolicyTerms")
    public void setInsurancePolicyTerms (List<InsurancePolicyTerm> value) { 
        this.insurancePolicyTerms = value;
    }
 
    /** GETTER
     * لیست استان ها
     */
    @JsonGetter("provinces")
    public List<Province> getProvinces ( ) { 
        return this.provinces;
    }
    
    /** SETTER
     * لیست استان ها
     */
    @JsonSetter("provinces")
    public void setProvinces (List<Province> value) { 
        this.provinces = value;
    }
 
    /** GETTER
     * لیست شهر ها
     */
    @JsonGetter("cities")
    public List<String> getCities ( ) { 
        return this.cities;
    }
    
    /** SETTER
     * لیست شهر ها
     */
    @JsonSetter("cities")
    public void setCities (List<String> value) { 
        this.cities = value;
    }
 
    /** GETTER
     * لیست محله ها
     */
    @JsonGetter("cityRegions")
    public List<String> getCityRegions ( ) { 
        return this.cityRegions;
    }
    
    /** SETTER
     * لیست محله ها
     */
    @JsonSetter("cityRegions")
    public void setCityRegions (List<String> value) { 
        this.cityRegions = value;
    }
 
    /** GETTER
     * روش های دریافت بیمه نامه
     */
    @JsonGetter("shippingTypes")
    public List<ShippingType> getShippingTypes ( ) { 
        return this.shippingTypes;
    }
    
    /** SETTER
     * روش های دریافت بیمه نامه
     */
    @JsonSetter("shippingTypes")
    public void setShippingTypes (List<ShippingType> value) { 
        this.shippingTypes = value;
    }
 
    /** GETTER
     * روش های ارسال بیمه نامه
     */
    @JsonGetter("postTypes")
    public List<PostType> getPostTypes ( ) { 
        return this.postTypes;
    }
    
    /** SETTER
     * روش های ارسال بیمه نامه
     */
    @JsonSetter("postTypes")
    public void setPostTypes (List<PostType> value) { 
        this.postTypes = value;
    }
 
    /** GETTER
     * شرایط بیمه نامه
     */
    @JsonGetter("insurancePolicyCondition")
    public InsurancePolicyCondition getInsurancePolicyCondition ( ) { 
        return this.insurancePolicyCondition;
    }
    
    /** SETTER
     * شرایط بیمه نامه
     */
    @JsonSetter("insurancePolicyCondition")
    public void setInsurancePolicyCondition (InsurancePolicyCondition value) { 
        this.insurancePolicyCondition = value;
    }
 
    /** GETTER
     * اطلاعات بیمه نامه
     */
    @JsonGetter("insuranceData")
    public InsuranceData getInsuranceData ( ) { 
        return this.insuranceData;
    }
    
    /** SETTER
     * اطلاعات بیمه نامه
     */
    @JsonSetter("insuranceData")
    public void setInsuranceData (InsuranceData value) { 
        this.insuranceData = value;
    }
 
}
