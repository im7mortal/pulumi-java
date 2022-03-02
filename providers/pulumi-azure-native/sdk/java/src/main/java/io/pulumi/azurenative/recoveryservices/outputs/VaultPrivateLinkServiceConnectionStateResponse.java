// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VaultPrivateLinkServiceConnectionStateResponse {
    /**
     * Gets or sets actions required.
     * 
     */
    private final String actionsRequired;
    /**
     * Gets or sets description.
     * 
     */
    private final String description;
    /**
     * Gets or sets the status.
     * 
     */
    private final String status;

    @OutputCustomType.Constructor({"actionsRequired","description","status"})
    private VaultPrivateLinkServiceConnectionStateResponse(
        String actionsRequired,
        String description,
        String status) {
        this.actionsRequired = Objects.requireNonNull(actionsRequired);
        this.description = Objects.requireNonNull(description);
        this.status = Objects.requireNonNull(status);
    }

    /**
     * Gets or sets actions required.
     * 
    */
    public String getActionsRequired() {
        return this.actionsRequired;
    }
    /**
     * Gets or sets description.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets or sets the status.
     * 
    */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultPrivateLinkServiceConnectionStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String actionsRequired;
        private String description;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(VaultPrivateLinkServiceConnectionStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionsRequired = defaults.actionsRequired;
    	      this.description = defaults.description;
    	      this.status = defaults.status;
        }

        public Builder setActionsRequired(String actionsRequired) {
            this.actionsRequired = Objects.requireNonNull(actionsRequired);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public VaultPrivateLinkServiceConnectionStateResponse build() {
            return new VaultPrivateLinkServiceConnectionStateResponse(actionsRequired, description, status);
        }
    }
}
