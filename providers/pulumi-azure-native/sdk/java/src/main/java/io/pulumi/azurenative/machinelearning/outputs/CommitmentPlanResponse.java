// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CommitmentPlanResponse {
    /**
     * Specifies the Azure Resource Manager ID of the commitment plan associated with the web service.
     * 
     */
    private final String id;

    @OutputCustomType.Constructor({"id"})
    private CommitmentPlanResponse(String id) {
        this.id = Objects.requireNonNull(id);
    }

    /**
     * Specifies the Azure Resource Manager ID of the commitment plan associated with the web service.
     * 
    */
    public String getId() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CommitmentPlanResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(CommitmentPlanResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public CommitmentPlanResponse build() {
            return new CommitmentPlanResponse(id);
        }
    }
}
