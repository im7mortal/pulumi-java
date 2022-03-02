// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.management.outputs;

import io.pulumi.azurenative.management.outputs.EntityInfoResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetEntityResult {
    /**
     * Total count of records that match the filter
     * 
     */
    private final Integer count;
    /**
     * The URL to use for getting the next set of results.
     * 
     */
    private final String nextLink;
    /**
     * The list of entities.
     * 
     */
    private final @Nullable List<EntityInfoResponse> value;

    @OutputCustomType.Constructor({"count","nextLink","value"})
    private GetEntityResult(
        Integer count,
        String nextLink,
        @Nullable List<EntityInfoResponse> value) {
        this.count = Objects.requireNonNull(count);
        this.nextLink = Objects.requireNonNull(nextLink);
        this.value = value;
    }

    /**
     * Total count of records that match the filter
     * 
    */
    public Integer getCount() {
        return this.count;
    }
    /**
     * The URL to use for getting the next set of results.
     * 
    */
    public String getNextLink() {
        return this.nextLink;
    }
    /**
     * The list of entities.
     * 
    */
    public List<EntityInfoResponse> getValue() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEntityResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private String nextLink;
        private @Nullable List<EntityInfoResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEntityResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder setCount(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder setNextLink(String nextLink) {
            this.nextLink = Objects.requireNonNull(nextLink);
            return this;
        }

        public Builder setValue(@Nullable List<EntityInfoResponse> value) {
            this.value = value;
            return this;
        }
        public GetEntityResult build() {
            return new GetEntityResult(count, nextLink, value);
        }
    }
}
