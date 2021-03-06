/*
 * EasyBimehLandingLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ir.notifaano.server.models;

import java.util.*;

public class TravelInsurancePolicyExtendBuilder {
    //the instance to build
    private TravelInsurancePolicyExtend travelInsurancePolicyExtend;

    /**
     * Default constructor to initialize the instance
     */
    public TravelInsurancePolicyExtendBuilder() {
        travelInsurancePolicyExtend = new TravelInsurancePolicyExtend();
    }

    public TravelInsurancePolicyExtendBuilder insurancePolicyId(int insurancePolicyId) {
        travelInsurancePolicyExtend.setInsurancePolicyId(insurancePolicyId);
        return this;
    }

    public TravelInsurancePolicyExtendBuilder travelDurationParam(String travelDurationParam) {
        travelInsurancePolicyExtend.setTravelDurationParam(travelDurationParam);
        return this;
    }

    public TravelInsurancePolicyExtendBuilder passengersCount(int passengersCount) {
        travelInsurancePolicyExtend.setPassengersCount(passengersCount);
        return this;
    }

    public TravelInsurancePolicyExtendBuilder birthDate(String birthDate) {
        travelInsurancePolicyExtend.setBirthDate(birthDate);
        return this;
    }

    public TravelInsurancePolicyExtendBuilder birthDatePersian(String birthDatePersian) {
        travelInsurancePolicyExtend.setBirthDatePersian(birthDatePersian);
        return this;
    }

    public TravelInsurancePolicyExtendBuilder riskLevelDiscount(int riskLevelDiscount) {
        travelInsurancePolicyExtend.setRiskLevelDiscount(riskLevelDiscount);
        return this;
    }

    public TravelInsurancePolicyExtendBuilder basePremium(String basePremium) {
        travelInsurancePolicyExtend.setBasePremium(basePremium);
        return this;
    }

    public TravelInsurancePolicyExtendBuilder allPremium(String allPremium) {
        travelInsurancePolicyExtend.setAllPremium(allPremium);
        return this;
    }

    public TravelInsurancePolicyExtendBuilder insuranceCompanyDiscountRate(int insuranceCompanyDiscountRate) {
        travelInsurancePolicyExtend.setInsuranceCompanyDiscountRate(insuranceCompanyDiscountRate);
        return this;
    }

    public TravelInsurancePolicyExtendBuilder insuranceCompanyDiscount(int insuranceCompanyDiscount) {
        travelInsurancePolicyExtend.setInsuranceCompanyDiscount(insuranceCompanyDiscount);
        return this;
    }

    public TravelInsurancePolicyExtendBuilder insuranceCentreDiscount(int insuranceCentreDiscount) {
        travelInsurancePolicyExtend.setInsuranceCentreDiscount(insuranceCentreDiscount);
        return this;
    }

    public TravelInsurancePolicyExtendBuilder coupenDiscount(int coupenDiscount) {
        travelInsurancePolicyExtend.setCoupenDiscount(coupenDiscount);
        return this;
    }

    public TravelInsurancePolicyExtendBuilder allDiscount(int allDiscount) {
        travelInsurancePolicyExtend.setAllDiscount(allDiscount);
        return this;
    }

    public TravelInsurancePolicyExtendBuilder exchangePremium(int exchangePremium) {
        travelInsurancePolicyExtend.setExchangePremium(exchangePremium);
        return this;
    }

    public TravelInsurancePolicyExtendBuilder travelRatePlanId(String travelRatePlanId) {
        travelInsurancePolicyExtend.setTravelRatePlanId(travelRatePlanId);
        return this;
    }

    public TravelInsurancePolicyExtendBuilder planTitle(String planTitle) {
        travelInsurancePolicyExtend.setPlanTitle(planTitle);
        return this;
    }

    public TravelInsurancePolicyExtendBuilder travelInsurancePolicyExtendAges(String travelInsurancePolicyExtendAges) {
        travelInsurancePolicyExtend.setTravelInsurancePolicyExtendAges(travelInsurancePolicyExtendAges);
        return this;
    }

    public TravelInsurancePolicyExtendBuilder travelInsurancePolicyExtendPassengers(String travelInsurancePolicyExtendPassengers) {
        travelInsurancePolicyExtend.setTravelInsurancePolicyExtendPassengers(travelInsurancePolicyExtendPassengers);
        return this;
    }

    public TravelInsurancePolicyExtendBuilder zoneIds(String zoneIds) {
        travelInsurancePolicyExtend.setZoneIds(zoneIds);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public TravelInsurancePolicyExtend build() {
        return travelInsurancePolicyExtend;
    }
}