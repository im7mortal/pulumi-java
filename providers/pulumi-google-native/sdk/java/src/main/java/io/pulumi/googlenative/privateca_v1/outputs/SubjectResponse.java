// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SubjectResponse {
    /**
     * The "common name" of the subject.
     * 
     */
    private final String commonName;
    /**
     * The country code of the subject.
     * 
     */
    private final String countryCode;
    /**
     * The locality or city of the subject.
     * 
     */
    private final String locality;
    /**
     * The organization of the subject.
     * 
     */
    private final String organization;
    /**
     * The organizational_unit of the subject.
     * 
     */
    private final String organizationalUnit;
    /**
     * The postal code of the subject.
     * 
     */
    private final String postalCode;
    /**
     * The province, territory, or regional state of the subject.
     * 
     */
    private final String province;
    /**
     * The street address of the subject.
     * 
     */
    private final String streetAddress;

    @OutputCustomType.Constructor({"commonName","countryCode","locality","organization","organizationalUnit","postalCode","province","streetAddress"})
    private SubjectResponse(
        String commonName,
        String countryCode,
        String locality,
        String organization,
        String organizationalUnit,
        String postalCode,
        String province,
        String streetAddress) {
        this.commonName = Objects.requireNonNull(commonName);
        this.countryCode = Objects.requireNonNull(countryCode);
        this.locality = Objects.requireNonNull(locality);
        this.organization = Objects.requireNonNull(organization);
        this.organizationalUnit = Objects.requireNonNull(organizationalUnit);
        this.postalCode = Objects.requireNonNull(postalCode);
        this.province = Objects.requireNonNull(province);
        this.streetAddress = Objects.requireNonNull(streetAddress);
    }

    /**
     * The "common name" of the subject.
     * 
    */
    public String getCommonName() {
        return this.commonName;
    }
    /**
     * The country code of the subject.
     * 
    */
    public String getCountryCode() {
        return this.countryCode;
    }
    /**
     * The locality or city of the subject.
     * 
    */
    public String getLocality() {
        return this.locality;
    }
    /**
     * The organization of the subject.
     * 
    */
    public String getOrganization() {
        return this.organization;
    }
    /**
     * The organizational_unit of the subject.
     * 
    */
    public String getOrganizationalUnit() {
        return this.organizationalUnit;
    }
    /**
     * The postal code of the subject.
     * 
    */
    public String getPostalCode() {
        return this.postalCode;
    }
    /**
     * The province, territory, or regional state of the subject.
     * 
    */
    public String getProvince() {
        return this.province;
    }
    /**
     * The street address of the subject.
     * 
    */
    public String getStreetAddress() {
        return this.streetAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubjectResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String commonName;
        private String countryCode;
        private String locality;
        private String organization;
        private String organizationalUnit;
        private String postalCode;
        private String province;
        private String streetAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(SubjectResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commonName = defaults.commonName;
    	      this.countryCode = defaults.countryCode;
    	      this.locality = defaults.locality;
    	      this.organization = defaults.organization;
    	      this.organizationalUnit = defaults.organizationalUnit;
    	      this.postalCode = defaults.postalCode;
    	      this.province = defaults.province;
    	      this.streetAddress = defaults.streetAddress;
        }

        public Builder setCommonName(String commonName) {
            this.commonName = Objects.requireNonNull(commonName);
            return this;
        }

        public Builder setCountryCode(String countryCode) {
            this.countryCode = Objects.requireNonNull(countryCode);
            return this;
        }

        public Builder setLocality(String locality) {
            this.locality = Objects.requireNonNull(locality);
            return this;
        }

        public Builder setOrganization(String organization) {
            this.organization = Objects.requireNonNull(organization);
            return this;
        }

        public Builder setOrganizationalUnit(String organizationalUnit) {
            this.organizationalUnit = Objects.requireNonNull(organizationalUnit);
            return this;
        }

        public Builder setPostalCode(String postalCode) {
            this.postalCode = Objects.requireNonNull(postalCode);
            return this;
        }

        public Builder setProvince(String province) {
            this.province = Objects.requireNonNull(province);
            return this;
        }

        public Builder setStreetAddress(String streetAddress) {
            this.streetAddress = Objects.requireNonNull(streetAddress);
            return this;
        }
        public SubjectResponse build() {
            return new SubjectResponse(commonName, countryCode, locality, organization, organizationalUnit, postalCode, province, streetAddress);
        }
    }
}
