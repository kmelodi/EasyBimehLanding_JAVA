/*
 * EasyBimehLandingLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ir.notifaano.server.models;

import java.util.*;

public class ElectronicEquipmentInsuranceBuilder {
    //the instance to build
    private ElectronicEquipmentInsurance electronicEquipmentInsurance;

    /**
     * Default constructor to initialize the instance
     */
    public ElectronicEquipmentInsuranceBuilder() {
        electronicEquipmentInsurance = new ElectronicEquipmentInsurance();
    }

    /**
     * آیا این نوع بیمه نامه، طرح بیمه ای دارد؟
     */
    public ElectronicEquipmentInsuranceBuilder hasPlan(boolean hasPlan) {
        electronicEquipmentInsurance.setHasPlan(hasPlan);
        return this;
    }

    /**
     * لیست فرانشیز های بیمه ی تجهیزات الکترونیک
     */
    public ElectronicEquipmentInsuranceBuilder franchisees(List<Franchisee> franchisees) {
        electronicEquipmentInsurance.setFranchisees(franchisees);
        return this;
    }

    /**
     * انواع دستگاه ها
     */
    public ElectronicEquipmentInsuranceBuilder deviceTypes(List<DeviceType> deviceTypes) {
        electronicEquipmentInsurance.setDeviceTypes(deviceTypes);
        return this;
    }

    /**
     * برند های دستگاه ها
     */
    public ElectronicEquipmentInsuranceBuilder deviceBrands(List<String> deviceBrands) {
        electronicEquipmentInsurance.setDeviceBrands(deviceBrands);
        return this;
    }

    /**
     * مدل های دستگاه ها
     */
    public ElectronicEquipmentInsuranceBuilder deviceModels(List<String> deviceModels) {
        electronicEquipmentInsurance.setDeviceModels(deviceModels);
        return this;
    }

    /**
     * شرکت های بیمه ی ارائه دهنده ی بیمه ی تجهیزات الکترونیک
     */
    public ElectronicEquipmentInsuranceBuilder insuranceCompanies(List<InsuranceCompany> insuranceCompanies) {
        electronicEquipmentInsurance.setInsuranceCompanies(insuranceCompanies);
        return this;
    }

    /**
     * پوشش های اضافه
     */
    public ElectronicEquipmentInsuranceBuilder insuranceExtraCoverage(List<String> insuranceExtraCoverage) {
        electronicEquipmentInsurance.setInsuranceExtraCoverage(insuranceExtraCoverage);
        return this;
    }

    /**
     * دوره های بیمه نامه
     */
    public ElectronicEquipmentInsuranceBuilder insurancePolicyTerms(List<InsurancePolicyTerm> insurancePolicyTerms) {
        electronicEquipmentInsurance.setInsurancePolicyTerms(insurancePolicyTerms);
        return this;
    }

    /**
     * لیست استان ها
     */
    public ElectronicEquipmentInsuranceBuilder provinces(List<Province> provinces) {
        electronicEquipmentInsurance.setProvinces(provinces);
        return this;
    }

    /**
     * لیست شهر ها
     */
    public ElectronicEquipmentInsuranceBuilder cities(List<String> cities) {
        electronicEquipmentInsurance.setCities(cities);
        return this;
    }

    /**
     * لیست محله ها
     */
    public ElectronicEquipmentInsuranceBuilder cityRegions(List<String> cityRegions) {
        electronicEquipmentInsurance.setCityRegions(cityRegions);
        return this;
    }

    /**
     * روش های دریافت بیمه نامه
     */
    public ElectronicEquipmentInsuranceBuilder shippingTypes(List<ShippingType> shippingTypes) {
        electronicEquipmentInsurance.setShippingTypes(shippingTypes);
        return this;
    }

    /**
     * روش های ارسال بیمه نامه
     */
    public ElectronicEquipmentInsuranceBuilder postTypes(List<PostType> postTypes) {
        electronicEquipmentInsurance.setPostTypes(postTypes);
        return this;
    }

    /**
     * شرایط بیمه نامه
     */
    public ElectronicEquipmentInsuranceBuilder insurancePolicyCondition(InsurancePolicyCondition insurancePolicyCondition) {
        electronicEquipmentInsurance.setInsurancePolicyCondition(insurancePolicyCondition);
        return this;
    }

    /**
     * اطلاعات بیمه نامه
     */
    public ElectronicEquipmentInsuranceBuilder insuranceData(InsuranceData insuranceData) {
        electronicEquipmentInsurance.setInsuranceData(insuranceData);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ElectronicEquipmentInsurance build() {
        return electronicEquipmentInsurance;
    }
}