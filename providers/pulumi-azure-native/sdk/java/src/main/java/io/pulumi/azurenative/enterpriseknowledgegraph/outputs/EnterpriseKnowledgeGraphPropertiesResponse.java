// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.enterpriseknowledgegraph.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EnterpriseKnowledgeGraphPropertiesResponse {
    /**
     * The description of the EnterpriseKnowledgeGraph
     * 
     */
    private final @Nullable String description;
    /**
     * Specifies the metadata  of the resource.
     * 
     */
    private final @Nullable Object metadata;
    /**
     * The state of EnterpriseKnowledgeGraph provisioning
     * 
     */
    private final @Nullable String provisioningState;

    @OutputCustomType.Constructor({"description","metadata","provisioningState"})
    private EnterpriseKnowledgeGraphPropertiesResponse(
        @Nullable String description,
        @Nullable Object metadata,
        @Nullable String provisioningState) {
        this.description = description;
        this.metadata = metadata;
        this.provisioningState = provisioningState;
    }

    /**
     * The description of the EnterpriseKnowledgeGraph
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Specifies the metadata  of the resource.
     * 
    */
    public Optional<Object> getMetadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * The state of EnterpriseKnowledgeGraph provisioning
     * 
    */
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnterpriseKnowledgeGraphPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable Object metadata;
        private @Nullable String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(EnterpriseKnowledgeGraphPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.metadata = defaults.metadata;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setMetadata(@Nullable Object metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public EnterpriseKnowledgeGraphPropertiesResponse build() {
            return new EnterpriseKnowledgeGraphPropertiesResponse(description, metadata, provisioningState);
        }
    }
}
