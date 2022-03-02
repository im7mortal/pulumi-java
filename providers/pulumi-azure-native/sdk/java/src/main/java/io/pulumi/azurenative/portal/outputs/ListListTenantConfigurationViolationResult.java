// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal.outputs;

import io.pulumi.azurenative.portal.outputs.ViolationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListListTenantConfigurationViolationResult {
    /**
     * The URL to use for getting the next set of results.
     * 
     */
    private final @Nullable String nextLink;
    /**
     * The array of violations.
     * 
     */
    private final @Nullable List<ViolationResponse> value;

    @OutputCustomType.Constructor({"nextLink","value"})
    private ListListTenantConfigurationViolationResult(
        @Nullable String nextLink,
        @Nullable List<ViolationResponse> value) {
        this.nextLink = nextLink;
        this.value = value;
    }

    /**
     * The URL to use for getting the next set of results.
     * 
    */
    public Optional<String> getNextLink() {
        return Optional.ofNullable(this.nextLink);
    }
    /**
     * The array of violations.
     * 
    */
    public List<ViolationResponse> getValue() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListListTenantConfigurationViolationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String nextLink;
        private @Nullable List<ViolationResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListListTenantConfigurationViolationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder setNextLink(@Nullable String nextLink) {
            this.nextLink = nextLink;
            return this;
        }

        public Builder setValue(@Nullable List<ViolationResponse> value) {
            this.value = value;
            return this;
        }
        public ListListTenantConfigurationViolationResult build() {
            return new ListListTenantConfigurationViolationResult(nextLink, value);
        }
    }
}
