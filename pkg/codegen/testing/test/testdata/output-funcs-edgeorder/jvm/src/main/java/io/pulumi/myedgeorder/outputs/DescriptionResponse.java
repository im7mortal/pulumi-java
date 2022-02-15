// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.myedgeorder.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.myedgeorder.outputs.LinkResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class DescriptionResponse {
    /**
     * Attributes for the product system.
     * 
     */
    private final List<String> attributes;
    /**
     * Type of description.
     * 
     */
    private final String descriptionType;
    /**
     * Keywords for the product system.
     * 
     */
    private final List<String> keywords;
    /**
     * Links for the product system.
     * 
     */
    private final List<LinkResponse> links;
    /**
     * Long description of the product system.
     * 
     */
    private final String longDescription;
    /**
     * Short description of the product system.
     * 
     */
    private final String shortDescription;

    @OutputCustomType.Constructor({"attributes","descriptionType","keywords","links","longDescription","shortDescription"})
    private DescriptionResponse(
        List<String> attributes,
        String descriptionType,
        List<String> keywords,
        List<LinkResponse> links,
        String longDescription,
        String shortDescription) {
        this.attributes = Objects.requireNonNull(attributes);
        this.descriptionType = Objects.requireNonNull(descriptionType);
        this.keywords = Objects.requireNonNull(keywords);
        this.links = Objects.requireNonNull(links);
        this.longDescription = Objects.requireNonNull(longDescription);
        this.shortDescription = Objects.requireNonNull(shortDescription);
    }

    /**
     * Attributes for the product system.
     * 
     */
    public List<String> getAttributes() {
        return this.attributes;
    }
    /**
     * Type of description.
     * 
     */
    public String getDescriptionType() {
        return this.descriptionType;
    }
    /**
     * Keywords for the product system.
     * 
     */
    public List<String> getKeywords() {
        return this.keywords;
    }
    /**
     * Links for the product system.
     * 
     */
    public List<LinkResponse> getLinks() {
        return this.links;
    }
    /**
     * Long description of the product system.
     * 
     */
    public String getLongDescription() {
        return this.longDescription;
    }
    /**
     * Short description of the product system.
     * 
     */
    public String getShortDescription() {
        return this.shortDescription;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> attributes;
        private String descriptionType;
        private List<String> keywords;
        private List<LinkResponse> links;
        private String longDescription;
        private String shortDescription;

        public Builder() {
    	      // Empty
        }

        public Builder(DescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.descriptionType = defaults.descriptionType;
    	      this.keywords = defaults.keywords;
    	      this.links = defaults.links;
    	      this.longDescription = defaults.longDescription;
    	      this.shortDescription = defaults.shortDescription;
        }

        public Builder setAttributes(List<String> attributes) {
            this.attributes = Objects.requireNonNull(attributes);
            return this;
        }

        public Builder setDescriptionType(String descriptionType) {
            this.descriptionType = Objects.requireNonNull(descriptionType);
            return this;
        }

        public Builder setKeywords(List<String> keywords) {
            this.keywords = Objects.requireNonNull(keywords);
            return this;
        }

        public Builder setLinks(List<LinkResponse> links) {
            this.links = Objects.requireNonNull(links);
            return this;
        }

        public Builder setLongDescription(String longDescription) {
            this.longDescription = Objects.requireNonNull(longDescription);
            return this;
        }

        public Builder setShortDescription(String shortDescription) {
            this.shortDescription = Objects.requireNonNull(shortDescription);
            return this;
        }

        public DescriptionResponse build() {
            return new DescriptionResponse(attributes, descriptionType, keywords, links, longDescription, shortDescription);
        }
    }
}
