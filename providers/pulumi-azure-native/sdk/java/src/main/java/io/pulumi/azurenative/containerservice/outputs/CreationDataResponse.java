// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CreationDataResponse {
    /**
     * This is the ARM ID of the source object to be used to create the target object.
     * 
     */
    private final @Nullable String sourceResourceId;

    @OutputCustomType.Constructor({"sourceResourceId"})
    private CreationDataResponse(@Nullable String sourceResourceId) {
        this.sourceResourceId = sourceResourceId;
    }

    /**
     * This is the ARM ID of the source object to be used to create the target object.
     * 
    */
    public Optional<String> getSourceResourceId() {
        return Optional.ofNullable(this.sourceResourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CreationDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String sourceResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(CreationDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceResourceId = defaults.sourceResourceId;
        }

        public Builder setSourceResourceId(@Nullable String sourceResourceId) {
            this.sourceResourceId = sourceResourceId;
            return this;
        }
        public CreationDataResponse build() {
            return new CreationDataResponse(sourceResourceId);
        }
    }
}
