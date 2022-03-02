// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.accessanalyzer.outputs;

import io.pulumi.awsnative.accessanalyzer.outputs.AnalyzerFilter;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class AnalyzerArchiveRule {
    private final List<AnalyzerFilter> filter;
    /**
     * The archive rule name
     * 
     */
    private final String ruleName;

    @OutputCustomType.Constructor({"filter","ruleName"})
    private AnalyzerArchiveRule(
        List<AnalyzerFilter> filter,
        String ruleName) {
        this.filter = Objects.requireNonNull(filter);
        this.ruleName = Objects.requireNonNull(ruleName);
    }

    public List<AnalyzerFilter> getFilter() {
        return this.filter;
    }
    /**
     * The archive rule name
     * 
    */
    public String getRuleName() {
        return this.ruleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyzerArchiveRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AnalyzerFilter> filter;
        private String ruleName;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyzerArchiveRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.ruleName = defaults.ruleName;
        }

        public Builder setFilter(List<AnalyzerFilter> filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }

        public Builder setRuleName(String ruleName) {
            this.ruleName = Objects.requireNonNull(ruleName);
            return this;
        }
        public AnalyzerArchiveRule build() {
            return new AnalyzerArchiveRule(filter, ruleName);
        }
    }
}
