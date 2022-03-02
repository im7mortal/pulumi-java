// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InstanceServiceAccount {
    /**
     * The service account e-mail address. If not given, the
     * default Google Compute Engine service account is used.
     * **Note**: `allow_stopping_for_update` must be set to true or your instance must have a `desired_status` of `TERMINATED` in order to update this field.
     * 
     */
    private final @Nullable String email;
    /**
     * A list of service scopes. Both OAuth2 URLs and gcloud
     * short names are supported. To allow full access to all Cloud APIs, use the
     * `cloud-platform` scope. See a complete list of scopes [here](https://cloud.google.com/sdk/gcloud/reference/alpha/compute/instances/set-scopes#--scopes).
     * **Note**: `allow_stopping_for_update` must be set to true or your instance must have a `desired_status` of `TERMINATED` in order to update this field.
     * 
     */
    private final List<String> scopes;

    @OutputCustomType.Constructor({"email","scopes"})
    private InstanceServiceAccount(
        @Nullable String email,
        List<String> scopes) {
        this.email = email;
        this.scopes = Objects.requireNonNull(scopes);
    }

    /**
     * The service account e-mail address. If not given, the
     * default Google Compute Engine service account is used.
     * **Note**: `allow_stopping_for_update` must be set to true or your instance must have a `desired_status` of `TERMINATED` in order to update this field.
     * 
    */
    public Optional<String> getEmail() {
        return Optional.ofNullable(this.email);
    }
    /**
     * A list of service scopes. Both OAuth2 URLs and gcloud
     * short names are supported. To allow full access to all Cloud APIs, use the
     * `cloud-platform` scope. See a complete list of scopes [here](https://cloud.google.com/sdk/gcloud/reference/alpha/compute/instances/set-scopes#--scopes).
     * **Note**: `allow_stopping_for_update` must be set to true or your instance must have a `desired_status` of `TERMINATED` in order to update this field.
     * 
    */
    public List<String> getScopes() {
        return this.scopes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceServiceAccount defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String email;
        private List<String> scopes;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceServiceAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.scopes = defaults.scopes;
        }

        public Builder setEmail(@Nullable String email) {
            this.email = email;
            return this;
        }

        public Builder setScopes(List<String> scopes) {
            this.scopes = Objects.requireNonNull(scopes);
            return this;
        }
        public InstanceServiceAccount build() {
            return new InstanceServiceAccount(email, scopes);
        }
    }
}
