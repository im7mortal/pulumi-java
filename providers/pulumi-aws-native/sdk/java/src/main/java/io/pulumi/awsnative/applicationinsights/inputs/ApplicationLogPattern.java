// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.applicationinsights.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * The log pattern.
 * 
 */
public final class ApplicationLogPattern extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationLogPattern Empty = new ApplicationLogPattern();

    /**
     * The log pattern.
     * 
     */
    @InputImport(name="pattern", required=true)
    private final String pattern;

    public String getPattern() {
        return this.pattern;
    }

    /**
     * The name of the log pattern.
     * 
     */
    @InputImport(name="patternName", required=true)
    private final String patternName;

    public String getPatternName() {
        return this.patternName;
    }

    /**
     * Rank of the log pattern.
     * 
     */
    @InputImport(name="rank", required=true)
    private final Integer rank;

    public Integer getRank() {
        return this.rank;
    }

    public ApplicationLogPattern(
        String pattern,
        String patternName,
        Integer rank) {
        this.pattern = Objects.requireNonNull(pattern, "expected parameter 'pattern' to be non-null");
        this.patternName = Objects.requireNonNull(patternName, "expected parameter 'patternName' to be non-null");
        this.rank = Objects.requireNonNull(rank, "expected parameter 'rank' to be non-null");
    }

    private ApplicationLogPattern() {
        this.pattern = null;
        this.patternName = null;
        this.rank = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationLogPattern defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String pattern;
        private String patternName;
        private Integer rank;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationLogPattern defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pattern = defaults.pattern;
    	      this.patternName = defaults.patternName;
    	      this.rank = defaults.rank;
        }

        public Builder setPattern(String pattern) {
            this.pattern = Objects.requireNonNull(pattern);
            return this;
        }

        public Builder setPatternName(String patternName) {
            this.patternName = Objects.requireNonNull(patternName);
            return this;
        }

        public Builder setRank(Integer rank) {
            this.rank = Objects.requireNonNull(rank);
            return this;
        }

        public ApplicationLogPattern build() {
            return new ApplicationLogPattern(pattern, patternName, rank);
        }
    }
}