// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.applicationinsights.inputs;

import io.pulumi.awsnative.applicationinsights.inputs.ApplicationLogPatternArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The log pattern set.
 * 
 */
public final class ApplicationLogPatternSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationLogPatternSetArgs Empty = new ApplicationLogPatternSetArgs();

    /**
     * The log patterns of a set.
     * 
     */
    @InputImport(name="logPatterns", required=true)
    private final Input<List<ApplicationLogPatternArgs>> logPatterns;

    public Input<List<ApplicationLogPatternArgs>> getLogPatterns() {
        return this.logPatterns;
    }

    /**
     * The name of the log pattern set.
     * 
     */
    @InputImport(name="patternSetName", required=true)
    private final Input<String> patternSetName;

    public Input<String> getPatternSetName() {
        return this.patternSetName;
    }

    public ApplicationLogPatternSetArgs(
        Input<List<ApplicationLogPatternArgs>> logPatterns,
        Input<String> patternSetName) {
        this.logPatterns = Objects.requireNonNull(logPatterns, "expected parameter 'logPatterns' to be non-null");
        this.patternSetName = Objects.requireNonNull(patternSetName, "expected parameter 'patternSetName' to be non-null");
    }

    private ApplicationLogPatternSetArgs() {
        this.logPatterns = Input.empty();
        this.patternSetName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationLogPatternSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<ApplicationLogPatternArgs>> logPatterns;
        private Input<String> patternSetName;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationLogPatternSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logPatterns = defaults.logPatterns;
    	      this.patternSetName = defaults.patternSetName;
        }

        public Builder setLogPatterns(Input<List<ApplicationLogPatternArgs>> logPatterns) {
            this.logPatterns = Objects.requireNonNull(logPatterns);
            return this;
        }

        public Builder setLogPatterns(List<ApplicationLogPatternArgs> logPatterns) {
            this.logPatterns = Input.of(Objects.requireNonNull(logPatterns));
            return this;
        }

        public Builder setPatternSetName(Input<String> patternSetName) {
            this.patternSetName = Objects.requireNonNull(patternSetName);
            return this;
        }

        public Builder setPatternSetName(String patternSetName) {
            this.patternSetName = Input.of(Objects.requireNonNull(patternSetName));
            return this;
        }

        public ApplicationLogPatternSetArgs build() {
            return new ApplicationLogPatternSetArgs(logPatterns, patternSetName);
        }
    }
}
