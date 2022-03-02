// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2KAnonymityHistogramBucketResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2KAnonymityResultResponse {
    /**
     * Histogram of k-anonymity equivalence classes.
     * 
     */
    private final List<GooglePrivacyDlpV2KAnonymityHistogramBucketResponse> equivalenceClassHistogramBuckets;

    @OutputCustomType.Constructor({"equivalenceClassHistogramBuckets"})
    private GooglePrivacyDlpV2KAnonymityResultResponse(List<GooglePrivacyDlpV2KAnonymityHistogramBucketResponse> equivalenceClassHistogramBuckets) {
        this.equivalenceClassHistogramBuckets = Objects.requireNonNull(equivalenceClassHistogramBuckets);
    }

    /**
     * Histogram of k-anonymity equivalence classes.
     * 
    */
    public List<GooglePrivacyDlpV2KAnonymityHistogramBucketResponse> getEquivalenceClassHistogramBuckets() {
        return this.equivalenceClassHistogramBuckets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2KAnonymityResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GooglePrivacyDlpV2KAnonymityHistogramBucketResponse> equivalenceClassHistogramBuckets;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2KAnonymityResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.equivalenceClassHistogramBuckets = defaults.equivalenceClassHistogramBuckets;
        }

        public Builder setEquivalenceClassHistogramBuckets(List<GooglePrivacyDlpV2KAnonymityHistogramBucketResponse> equivalenceClassHistogramBuckets) {
            this.equivalenceClassHistogramBuckets = Objects.requireNonNull(equivalenceClassHistogramBuckets);
            return this;
        }
        public GooglePrivacyDlpV2KAnonymityResultResponse build() {
            return new GooglePrivacyDlpV2KAnonymityResultResponse(equivalenceClassHistogramBuckets);
        }
    }
}
