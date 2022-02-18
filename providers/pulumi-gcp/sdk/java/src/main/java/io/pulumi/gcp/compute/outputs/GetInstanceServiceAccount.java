// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetInstanceServiceAccount {
    /**
     * The service account e-mail address.
     * 
     */
    private final String email;
    /**
     * A list of service scopes.
     * 
     */
    private final List<String> scopes;

    @OutputCustomType.Constructor({"email","scopes"})
    private GetInstanceServiceAccount(
        String email,
        List<String> scopes) {
        this.email = Objects.requireNonNull(email);
        this.scopes = Objects.requireNonNull(scopes);
    }

    /**
     * The service account e-mail address.
     * 
     */
    public String getEmail() {
        return this.email;
    }
    /**
     * A list of service scopes.
     * 
     */
    public List<String> getScopes() {
        return this.scopes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceServiceAccount defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String email;
        private List<String> scopes;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceServiceAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.scopes = defaults.scopes;
        }

        public Builder setEmail(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }

        public Builder setScopes(List<String> scopes) {
            this.scopes = Objects.requireNonNull(scopes);
            return this;
        }

        public GetInstanceServiceAccount build() {
            return new GetInstanceServiceAccount(email, scopes);
        }
    }
}