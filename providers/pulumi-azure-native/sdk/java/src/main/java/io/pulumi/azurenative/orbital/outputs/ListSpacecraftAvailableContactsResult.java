// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.orbital.outputs;

import io.pulumi.azurenative.orbital.outputs.AvailableContactsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListSpacecraftAvailableContactsResult {
    /**
     * The URL to get the next set of results.
     * 
     */
    private final String nextLink;
    /**
     * A list of available contacts
     * 
     */
    private final @Nullable List<AvailableContactsResponse> value;

    @OutputCustomType.Constructor({"nextLink","value"})
    private ListSpacecraftAvailableContactsResult(
        String nextLink,
        @Nullable List<AvailableContactsResponse> value) {
        this.nextLink = Objects.requireNonNull(nextLink);
        this.value = value;
    }

    /**
     * The URL to get the next set of results.
     * 
    */
    public String getNextLink() {
        return this.nextLink;
    }
    /**
     * A list of available contacts
     * 
    */
    public List<AvailableContactsResponse> getValue() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListSpacecraftAvailableContactsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String nextLink;
        private @Nullable List<AvailableContactsResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListSpacecraftAvailableContactsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder setNextLink(String nextLink) {
            this.nextLink = Objects.requireNonNull(nextLink);
            return this;
        }

        public Builder setValue(@Nullable List<AvailableContactsResponse> value) {
            this.value = value;
            return this;
        }
        public ListSpacecraftAvailableContactsResult build() {
            return new ListSpacecraftAvailableContactsResult(nextLink, value);
        }
    }
}
