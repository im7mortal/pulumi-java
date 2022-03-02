// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudContactcenterinsightsV1IssueAssignmentResponse {
    /**
     * Immutable. Display name of the assigned issue. This field is set at time of analyis and immutable since then.
     * 
     */
    private final String displayName;
    /**
     * Resource name of the assigned issue.
     * 
     */
    private final String issue;
    /**
     * Score indicating the likelihood of the issue assignment. currently bounded on [0,1].
     * 
     */
    private final Double score;

    @OutputCustomType.Constructor({"displayName","issue","score"})
    private GoogleCloudContactcenterinsightsV1IssueAssignmentResponse(
        String displayName,
        String issue,
        Double score) {
        this.displayName = Objects.requireNonNull(displayName);
        this.issue = Objects.requireNonNull(issue);
        this.score = Objects.requireNonNull(score);
    }

    /**
     * Immutable. Display name of the assigned issue. This field is set at time of analyis and immutable since then.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Resource name of the assigned issue.
     * 
    */
    public String getIssue() {
        return this.issue;
    }
    /**
     * Score indicating the likelihood of the issue assignment. currently bounded on [0,1].
     * 
    */
    public Double getScore() {
        return this.score;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1IssueAssignmentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String issue;
        private Double score;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1IssueAssignmentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.issue = defaults.issue;
    	      this.score = defaults.score;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setIssue(String issue) {
            this.issue = Objects.requireNonNull(issue);
            return this;
        }

        public Builder setScore(Double score) {
            this.score = Objects.requireNonNull(score);
            return this;
        }
        public GoogleCloudContactcenterinsightsV1IssueAssignmentResponse build() {
            return new GoogleCloudContactcenterinsightsV1IssueAssignmentResponse(displayName, issue, score);
        }
    }
}
