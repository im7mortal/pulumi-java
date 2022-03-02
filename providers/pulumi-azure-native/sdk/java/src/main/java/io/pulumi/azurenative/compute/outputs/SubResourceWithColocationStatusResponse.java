// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.InstanceViewStatusResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SubResourceWithColocationStatusResponse {
    /**
     * Describes colocation status of a resource in the Proximity Placement Group.
     * 
     */
    private final @Nullable InstanceViewStatusResponse colocationStatus;
    /**
     * Resource Id
     * 
     */
    private final @Nullable String id;

    @OutputCustomType.Constructor({"colocationStatus","id"})
    private SubResourceWithColocationStatusResponse(
        @Nullable InstanceViewStatusResponse colocationStatus,
        @Nullable String id) {
        this.colocationStatus = colocationStatus;
        this.id = id;
    }

    /**
     * Describes colocation status of a resource in the Proximity Placement Group.
     * 
    */
    public Optional<InstanceViewStatusResponse> getColocationStatus() {
        return Optional.ofNullable(this.colocationStatus);
    }
    /**
     * Resource Id
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubResourceWithColocationStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable InstanceViewStatusResponse colocationStatus;
        private @Nullable String id;

        public Builder() {
    	      // Empty
        }

        public Builder(SubResourceWithColocationStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.colocationStatus = defaults.colocationStatus;
    	      this.id = defaults.id;
        }

        public Builder setColocationStatus(@Nullable InstanceViewStatusResponse colocationStatus) {
            this.colocationStatus = colocationStatus;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }
        public SubResourceWithColocationStatusResponse build() {
            return new SubResourceWithColocationStatusResponse(colocationStatus, id);
        }
    }
}
