// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.applicationinsights.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * The log pattern.
 * 
 */
public final class ApplicationLogPatternArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationLogPatternArgs Empty = new ApplicationLogPatternArgs();

    /**
     * The log pattern.
     * 
     */
    @InputImport(name="pattern", required=true)
    private final Input<String> pattern;

    public Input<String> getPattern() {
        return this.pattern;
    }

    /**
     * The name of the log pattern.
     * 
     */
    @InputImport(name="patternName", required=true)
    private final Input<String> patternName;

    public Input<String> getPatternName() {
        return this.patternName;
    }

    /**
     * Rank of the log pattern.
     * 
     */
    @InputImport(name="rank", required=true)
    private final Input<Integer> rank;

    public Input<Integer> getRank() {
        return this.rank;
    }

    public ApplicationLogPatternArgs(
        Input<String> pattern,
        Input<String> patternName,
        Input<Integer> rank) {
        this.pattern = Objects.requireNonNull(pattern, "expected parameter 'pattern' to be non-null");
        this.patternName = Objects.requireNonNull(patternName, "expected parameter 'patternName' to be non-null");
        this.rank = Objects.requireNonNull(rank, "expected parameter 'rank' to be non-null");
    }

    private ApplicationLogPatternArgs() {
        this.pattern = Input.empty();
        this.patternName = Input.empty();
        this.rank = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationLogPatternArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> pattern;
        private Input<String> patternName;
        private Input<Integer> rank;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationLogPatternArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pattern = defaults.pattern;
    	      this.patternName = defaults.patternName;
    	      this.rank = defaults.rank;
        }

        public Builder setPattern(Input<String> pattern) {
            this.pattern = Objects.requireNonNull(pattern);
            return this;
        }

        public Builder setPattern(String pattern) {
            this.pattern = Input.of(Objects.requireNonNull(pattern));
            return this;
        }

        public Builder setPatternName(Input<String> patternName) {
            this.patternName = Objects.requireNonNull(patternName);
            return this;
        }

        public Builder setPatternName(String patternName) {
            this.patternName = Input.of(Objects.requireNonNull(patternName));
            return this;
        }

        public Builder setRank(Input<Integer> rank) {
            this.rank = Objects.requireNonNull(rank);
            return this;
        }

        public Builder setRank(Integer rank) {
            this.rank = Input.of(Objects.requireNonNull(rank));
            return this;
        }

        public ApplicationLogPatternArgs build() {
            return new ApplicationLogPatternArgs(pattern, patternName, rank);
        }
    }
}