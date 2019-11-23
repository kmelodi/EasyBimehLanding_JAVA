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
public class LiabilityDoctorInsurancePolicyFilter 
        implements java.io.Serializable {
    private static final long serialVersionUID = -8979460374054513088L;
    private int expertiseParamId;
    private boolean isResident;
    private boolean isStudent;
    private String riskLevelId;
    private int activityAreaParamId;
    private int commitmentCeilingParamId;
    private String insuranceExtraCoverageIds;
    private String policyTermId;
    private String insuranceCentreSubDomainName;
    private String insuranceCentreId;
    private String insuranceCompanyId;
    private boolean isSearchQuery;
    private String giftCode;
    private String customerUserId;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("expertiseParamId")
    public int getExpertiseParamId ( ) { 
        return this.expertiseParamId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("expertiseParamId")
    public void setExpertiseParamId (int value) { 
        this.expertiseParamId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("isResident")
    public boolean getIsResident ( ) { 
        return this.isResident;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("isResident")
    public void setIsResident (boolean value) { 
        this.isResident = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("isStudent")
    public boolean getIsStudent ( ) { 
        return this.isStudent;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("isStudent")
    public void setIsStudent (boolean value) { 
        this.isStudent = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("riskLevelId")
    public String getRiskLevelId ( ) { 
        return this.riskLevelId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("riskLevelId")
    public void setRiskLevelId (String value) { 
        this.riskLevelId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("activityAreaParamId")
    public int getActivityAreaParamId ( ) { 
        return this.activityAreaParamId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("activityAreaParamId")
    public void setActivityAreaParamId (int value) { 
        this.activityAreaParamId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("commitmentCeilingParamId")
    public int getCommitmentCeilingParamId ( ) { 
        return this.commitmentCeilingParamId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("commitmentCeilingParamId")
    public void setCommitmentCeilingParamId (int value) { 
        this.commitmentCeilingParamId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("insuranceExtraCoverageIds")
    public String getInsuranceExtraCoverageIds ( ) { 
        return this.insuranceExtraCoverageIds;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("insuranceExtraCoverageIds")
    public void setInsuranceExtraCoverageIds (String value) { 
        this.insuranceExtraCoverageIds = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("policyTermId")
    public String getPolicyTermId ( ) { 
        return this.policyTermId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("policyTermId")
    public void setPolicyTermId (String value) { 
        this.policyTermId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("insuranceCentreSubDomainName")
    public String getInsuranceCentreSubDomainName ( ) { 
        return this.insuranceCentreSubDomainName;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("insuranceCentreSubDomainName")
    public void setInsuranceCentreSubDomainName (String value) { 
        this.insuranceCentreSubDomainName = value;
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
    @JsonGetter("insuranceCompanyId")
    public String getInsuranceCompanyId ( ) { 
        return this.insuranceCompanyId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("insuranceCompanyId")
    public void setInsuranceCompanyId (String value) { 
        this.insuranceCompanyId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("isSearchQuery")
    public boolean getIsSearchQuery ( ) { 
        return this.isSearchQuery;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("isSearchQuery")
    public void setIsSearchQuery (boolean value) { 
        this.isSearchQuery = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("giftCode")
    public String getGiftCode ( ) { 
        return this.giftCode;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("giftCode")
    public void setGiftCode (String value) { 
        this.giftCode = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("customerUserId")
    public String getCustomerUserId ( ) { 
        return this.customerUserId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("customerUserId")
    public void setCustomerUserId (String value) { 
        this.customerUserId = value;
    }
 
}
