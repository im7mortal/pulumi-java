// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AssignmentPropertiesResponseAdditionalData {
    /**
     * Exemption category of this assignment
     * 
     */
    private final @Nullable String exemptionCategory;

    @OutputCustomType.Constructor({"exemptionCategory"})
    private AssignmentPropertiesResponseAdditionalData(@Nullable String exemptionCategory) {
        this.exemptionCategory = exemptionCategory;
    }

    /**
     * Exemption category of this assignment
     * 
    */
    public Optional<String> getExemptionCategory() {
        return Optional.ofNullable(this.exemptionCategory);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssignmentPropertiesResponseAdditionalData defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String exemptionCategory;

        public Builder() {
    	      // Empty
        }

        public Builder(AssignmentPropertiesResponseAdditionalData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exemptionCategory = defaults.exemptionCategory;
        }

        public Builder setExemptionCategory(@Nullable String exemptionCategory) {
            this.exemptionCategory = exemptionCategory;
            return this;
        }
        public AssignmentPropertiesResponseAdditionalData build() {
            return new AssignmentPropertiesResponseAdditionalData(exemptionCategory);
        }
    }
}
