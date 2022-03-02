// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_beta.outputs.MetadataFilterLabelMatchResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class MetadataFilterResponse {
    /**
     * The list of label value pairs that must match labels in the provided metadata based on filterMatchCriteria This list must not be empty and can have at the most 64 entries.
     * 
     */
    private final List<MetadataFilterLabelMatchResponse> filterLabels;
    /**
     * Specifies how individual filter label matches within the list of filterLabels and contributes toward the overall metadataFilter match. Supported values are: - MATCH_ANY: at least one of the filterLabels must have a matching label in the provided metadata. - MATCH_ALL: all filterLabels must have matching labels in the provided metadata.
     * 
     */
    private final String filterMatchCriteria;

    @OutputCustomType.Constructor({"filterLabels","filterMatchCriteria"})
    private MetadataFilterResponse(
        List<MetadataFilterLabelMatchResponse> filterLabels,
        String filterMatchCriteria) {
        this.filterLabels = Objects.requireNonNull(filterLabels);
        this.filterMatchCriteria = Objects.requireNonNull(filterMatchCriteria);
    }

    /**
     * The list of label value pairs that must match labels in the provided metadata based on filterMatchCriteria This list must not be empty and can have at the most 64 entries.
     * 
    */
    public List<MetadataFilterLabelMatchResponse> getFilterLabels() {
        return this.filterLabels;
    }
    /**
     * Specifies how individual filter label matches within the list of filterLabels and contributes toward the overall metadataFilter match. Supported values are: - MATCH_ANY: at least one of the filterLabels must have a matching label in the provided metadata. - MATCH_ALL: all filterLabels must have matching labels in the provided metadata.
     * 
    */
    public String getFilterMatchCriteria() {
        return this.filterMatchCriteria;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<MetadataFilterLabelMatchResponse> filterLabels;
        private String filterMatchCriteria;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filterLabels = defaults.filterLabels;
    	      this.filterMatchCriteria = defaults.filterMatchCriteria;
        }

        public Builder setFilterLabels(List<MetadataFilterLabelMatchResponse> filterLabels) {
            this.filterLabels = Objects.requireNonNull(filterLabels);
            return this;
        }

        public Builder setFilterMatchCriteria(String filterMatchCriteria) {
            this.filterMatchCriteria = Objects.requireNonNull(filterMatchCriteria);
            return this;
        }
        public MetadataFilterResponse build() {
            return new MetadataFilterResponse(filterLabels, filterMatchCriteria);
        }
    }
}
