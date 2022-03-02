// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class WebtestLocationAvailabilityCriteriaResponse {
    /**
     * The Application Insights resource Id.
     * 
     */
    private final String componentId;
    /**
     * The number of failed locations.
     * 
     */
    private final Double failedLocationCount;
    /**
     * specifies the type of the alert criteria.
     * Expected value is 'Microsoft.Azure.Monitor.WebtestLocationAvailabilityCriteria'.
     * 
     */
    private final String odataType;
    /**
     * The Application Insights web test Id.
     * 
     */
    private final String webTestId;

    @OutputCustomType.Constructor({"componentId","failedLocationCount","odataType","webTestId"})
    private WebtestLocationAvailabilityCriteriaResponse(
        String componentId,
        Double failedLocationCount,
        String odataType,
        String webTestId) {
        this.componentId = Objects.requireNonNull(componentId);
        this.failedLocationCount = Objects.requireNonNull(failedLocationCount);
        this.odataType = Objects.requireNonNull(odataType);
        this.webTestId = Objects.requireNonNull(webTestId);
    }

    /**
     * The Application Insights resource Id.
     * 
    */
    public String getComponentId() {
        return this.componentId;
    }
    /**
     * The number of failed locations.
     * 
    */
    public Double getFailedLocationCount() {
        return this.failedLocationCount;
    }
    /**
     * specifies the type of the alert criteria.
     * Expected value is 'Microsoft.Azure.Monitor.WebtestLocationAvailabilityCriteria'.
     * 
    */
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * The Application Insights web test Id.
     * 
    */
    public String getWebTestId() {
        return this.webTestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebtestLocationAvailabilityCriteriaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String componentId;
        private Double failedLocationCount;
        private String odataType;
        private String webTestId;

        public Builder() {
    	      // Empty
        }

        public Builder(WebtestLocationAvailabilityCriteriaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentId = defaults.componentId;
    	      this.failedLocationCount = defaults.failedLocationCount;
    	      this.odataType = defaults.odataType;
    	      this.webTestId = defaults.webTestId;
        }

        public Builder setComponentId(String componentId) {
            this.componentId = Objects.requireNonNull(componentId);
            return this;
        }

        public Builder setFailedLocationCount(Double failedLocationCount) {
            this.failedLocationCount = Objects.requireNonNull(failedLocationCount);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setWebTestId(String webTestId) {
            this.webTestId = Objects.requireNonNull(webTestId);
            return this;
        }
        public WebtestLocationAvailabilityCriteriaResponse build() {
            return new WebtestLocationAvailabilityCriteriaResponse(componentId, failedLocationCount, odataType, webTestId);
        }
    }
}
