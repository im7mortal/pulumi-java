// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse Empty = new GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse();

    @InputImport(name="analyzedConversationsCount", required=true)
    private final String analyzedConversationsCount;

    public String getAnalyzedConversationsCount() {
        return this.analyzedConversationsCount;
    }

    @InputImport(name="issueStats", required=true)
    private final Map<String,String> issueStats;

    public Map<String,String> getIssueStats() {
        return this.issueStats;
    }

    @InputImport(name="unclassifiedConversationsCount", required=true)
    private final String unclassifiedConversationsCount;

    public String getUnclassifiedConversationsCount() {
        return this.unclassifiedConversationsCount;
    }

    public GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse(
        String analyzedConversationsCount,
        Map<String,String> issueStats,
        String unclassifiedConversationsCount) {
        this.analyzedConversationsCount = Objects.requireNonNull(analyzedConversationsCount, "expected parameter 'analyzedConversationsCount' to be non-null");
        this.issueStats = Objects.requireNonNull(issueStats, "expected parameter 'issueStats' to be non-null");
        this.unclassifiedConversationsCount = Objects.requireNonNull(unclassifiedConversationsCount, "expected parameter 'unclassifiedConversationsCount' to be non-null");
    }

    private GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse() {
        this.analyzedConversationsCount = null;
        this.issueStats = Map.of();
        this.unclassifiedConversationsCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String analyzedConversationsCount;
        private Map<String,String> issueStats;
        private String unclassifiedConversationsCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analyzedConversationsCount = defaults.analyzedConversationsCount;
    	      this.issueStats = defaults.issueStats;
    	      this.unclassifiedConversationsCount = defaults.unclassifiedConversationsCount;
        }

        public Builder setAnalyzedConversationsCount(String analyzedConversationsCount) {
            this.analyzedConversationsCount = Objects.requireNonNull(analyzedConversationsCount);
            return this;
        }

        public Builder setIssueStats(Map<String,String> issueStats) {
            this.issueStats = Objects.requireNonNull(issueStats);
            return this;
        }

        public Builder setUnclassifiedConversationsCount(String unclassifiedConversationsCount) {
            this.unclassifiedConversationsCount = Objects.requireNonNull(unclassifiedConversationsCount);
            return this;
        }

        public GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse build() {
            return new GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse(analyzedConversationsCount, issueStats, unclassifiedConversationsCount);
        }
    }
}