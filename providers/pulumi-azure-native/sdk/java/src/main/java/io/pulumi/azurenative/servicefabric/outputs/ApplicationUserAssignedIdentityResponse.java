// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ApplicationUserAssignedIdentityResponse {
    /**
     * The friendly name of user assigned identity.
     * 
     */
    private final String name;
    /**
     * The principal id of user assigned identity.
     * 
     */
    private final String principalId;

    @OutputCustomType.Constructor({"name","principalId"})
    private ApplicationUserAssignedIdentityResponse(
        String name,
        String principalId) {
        this.name = Objects.requireNonNull(name);
        this.principalId = Objects.requireNonNull(principalId);
    }

    /**
     * The friendly name of user assigned identity.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The principal id of user assigned identity.
     * 
    */
    public String getPrincipalId() {
        return this.principalId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationUserAssignedIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String principalId;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationUserAssignedIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.principalId = defaults.principalId;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrincipalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }
        public ApplicationUserAssignedIdentityResponse build() {
            return new ApplicationUserAssignedIdentityResponse(name, principalId);
        }
    }
}
