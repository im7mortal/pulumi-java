// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class RuleResultsPropertiesResponse {
    /**
     * Expected results in the baseline.
     * 
     */
    private final @Nullable List<List<String>> results;

    @OutputCustomType.Constructor({"results"})
    private RuleResultsPropertiesResponse(@Nullable List<List<String>> results) {
        this.results = results;
    }

    /**
     * Expected results in the baseline.
     * 
    */
    public List<List<String>> getResults() {
        return this.results == null ? List.of() : this.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleResultsPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<List<String>> results;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleResultsPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.results = defaults.results;
        }

        public Builder setResults(@Nullable List<List<String>> results) {
            this.results = results;
            return this;
        }
        public RuleResultsPropertiesResponse build() {
            return new RuleResultsPropertiesResponse(results);
        }
    }
}
