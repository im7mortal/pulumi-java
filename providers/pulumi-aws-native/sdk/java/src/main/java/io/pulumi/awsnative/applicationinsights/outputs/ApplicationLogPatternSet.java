// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.applicationinsights.outputs;

import io.pulumi.awsnative.applicationinsights.outputs.ApplicationLogPattern;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ApplicationLogPatternSet {
    /**
     * The log patterns of a set.
     * 
     */
    private final List<ApplicationLogPattern> logPatterns;
    /**
     * The name of the log pattern set.
     * 
     */
    private final String patternSetName;

    @OutputCustomType.Constructor({"logPatterns","patternSetName"})
    private ApplicationLogPatternSet(
        List<ApplicationLogPattern> logPatterns,
        String patternSetName) {
        this.logPatterns = Objects.requireNonNull(logPatterns);
        this.patternSetName = Objects.requireNonNull(patternSetName);
    }

    /**
     * The log patterns of a set.
     * 
     */
    public List<ApplicationLogPattern> getLogPatterns() {
        return this.logPatterns;
    }
    /**
     * The name of the log pattern set.
     * 
     */
    public String getPatternSetName() {
        return this.patternSetName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationLogPatternSet defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ApplicationLogPattern> logPatterns;
        private String patternSetName;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationLogPatternSet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logPatterns = defaults.logPatterns;
    	      this.patternSetName = defaults.patternSetName;
        }

        public Builder setLogPatterns(List<ApplicationLogPattern> logPatterns) {
            this.logPatterns = Objects.requireNonNull(logPatterns);
            return this;
        }

        public Builder setPatternSetName(String patternSetName) {
            this.patternSetName = Objects.requireNonNull(patternSetName);
            return this;
        }

        public ApplicationLogPatternSet build() {
            return new ApplicationLogPatternSet(logPatterns, patternSetName);
        }
    }
}
