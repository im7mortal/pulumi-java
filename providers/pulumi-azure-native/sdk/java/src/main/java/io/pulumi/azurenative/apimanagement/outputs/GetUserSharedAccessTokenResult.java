// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetUserSharedAccessTokenResult {
    /**
     * Shared Access Authorization token for the User.
     * 
     */
    private final @Nullable String value;

    @OutputCustomType.Constructor({"value"})
    private GetUserSharedAccessTokenResult(@Nullable String value) {
        this.value = value;
    }

    /**
     * Shared Access Authorization token for the User.
     * 
    */
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserSharedAccessTokenResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserSharedAccessTokenResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }
        public GetUserSharedAccessTokenResult build() {
            return new GetUserSharedAccessTokenResult(value);
        }
    }
}
