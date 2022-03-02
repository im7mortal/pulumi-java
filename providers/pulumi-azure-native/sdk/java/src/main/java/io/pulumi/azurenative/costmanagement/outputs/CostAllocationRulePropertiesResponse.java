// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.outputs;

import io.pulumi.azurenative.costmanagement.outputs.CostAllocationRuleDetailsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CostAllocationRulePropertiesResponse {
    /**
     * Time at which the rule was created. Rules that change cost for the same resource are applied in order of creation.
     * 
     */
    private final String createdDate;
    /**
     * Description of a cost allocation rule.
     * 
     */
    private final @Nullable String description;
    /**
     * Resource information for the cost allocation rule
     * 
     */
    private final CostAllocationRuleDetailsResponse details;
    /**
     * Status of the rule
     * 
     */
    private final String status;
    /**
     * Time at which the rule was last updated.
     * 
     */
    private final String updatedDate;

    @OutputCustomType.Constructor({"createdDate","description","details","status","updatedDate"})
    private CostAllocationRulePropertiesResponse(
        String createdDate,
        @Nullable String description,
        CostAllocationRuleDetailsResponse details,
        String status,
        String updatedDate) {
        this.createdDate = Objects.requireNonNull(createdDate);
        this.description = description;
        this.details = Objects.requireNonNull(details);
        this.status = Objects.requireNonNull(status);
        this.updatedDate = Objects.requireNonNull(updatedDate);
    }

    /**
     * Time at which the rule was created. Rules that change cost for the same resource are applied in order of creation.
     * 
    */
    public String getCreatedDate() {
        return this.createdDate;
    }
    /**
     * Description of a cost allocation rule.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Resource information for the cost allocation rule
     * 
    */
    public CostAllocationRuleDetailsResponse getDetails() {
        return this.details;
    }
    /**
     * Status of the rule
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * Time at which the rule was last updated.
     * 
    */
    public String getUpdatedDate() {
        return this.updatedDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CostAllocationRulePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdDate;
        private @Nullable String description;
        private CostAllocationRuleDetailsResponse details;
        private String status;
        private String updatedDate;

        public Builder() {
    	      // Empty
        }

        public Builder(CostAllocationRulePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdDate = defaults.createdDate;
    	      this.description = defaults.description;
    	      this.details = defaults.details;
    	      this.status = defaults.status;
    	      this.updatedDate = defaults.updatedDate;
        }

        public Builder setCreatedDate(String createdDate) {
            this.createdDate = Objects.requireNonNull(createdDate);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDetails(CostAllocationRuleDetailsResponse details) {
            this.details = Objects.requireNonNull(details);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setUpdatedDate(String updatedDate) {
            this.updatedDate = Objects.requireNonNull(updatedDate);
            return this;
        }
        public CostAllocationRulePropertiesResponse build() {
            return new CostAllocationRulePropertiesResponse(createdDate, description, details, status, updatedDate);
        }
    }
}
