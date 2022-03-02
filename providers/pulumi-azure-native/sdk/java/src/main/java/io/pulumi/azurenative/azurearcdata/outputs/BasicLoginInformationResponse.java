// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurearcdata.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BasicLoginInformationResponse {
    /**
     * Login username.
     * 
     */
    private final @Nullable String username;

    @OutputCustomType.Constructor({"username"})
    private BasicLoginInformationResponse(@Nullable String username) {
        this.username = username;
    }

    /**
     * Login username.
     * 
    */
    public Optional<String> getUsername() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BasicLoginInformationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(BasicLoginInformationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.username = defaults.username;
        }

        public Builder setUsername(@Nullable String username) {
            this.username = username;
            return this;
        }
        public BasicLoginInformationResponse build() {
            return new BasicLoginInformationResponse(username);
        }
    }
}
