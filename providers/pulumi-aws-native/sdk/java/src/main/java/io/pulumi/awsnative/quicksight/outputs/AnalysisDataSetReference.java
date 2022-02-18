// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AnalysisDataSetReference {
    /**
     * <p>Dataset Amazon Resource Name (ARN).</p>
     * 
     */
    private final String dataSetArn;
    /**
     * <p>Dataset placeholder.</p>
     * 
     */
    private final String dataSetPlaceholder;

    @OutputCustomType.Constructor({"dataSetArn","dataSetPlaceholder"})
    private AnalysisDataSetReference(
        String dataSetArn,
        String dataSetPlaceholder) {
        this.dataSetArn = Objects.requireNonNull(dataSetArn);
        this.dataSetPlaceholder = Objects.requireNonNull(dataSetPlaceholder);
    }

    /**
     * <p>Dataset Amazon Resource Name (ARN).</p>
     * 
     */
    public String getDataSetArn() {
        return this.dataSetArn;
    }
    /**
     * <p>Dataset placeholder.</p>
     * 
     */
    public String getDataSetPlaceholder() {
        return this.dataSetPlaceholder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalysisDataSetReference defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataSetArn;
        private String dataSetPlaceholder;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalysisDataSetReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSetArn = defaults.dataSetArn;
    	      this.dataSetPlaceholder = defaults.dataSetPlaceholder;
        }

        public Builder setDataSetArn(String dataSetArn) {
            this.dataSetArn = Objects.requireNonNull(dataSetArn);
            return this;
        }

        public Builder setDataSetPlaceholder(String dataSetPlaceholder) {
            this.dataSetPlaceholder = Objects.requireNonNull(dataSetPlaceholder);
            return this;
        }

        public AnalysisDataSetReference build() {
            return new AnalysisDataSetReference(dataSetArn, dataSetPlaceholder);
        }
    }
}
