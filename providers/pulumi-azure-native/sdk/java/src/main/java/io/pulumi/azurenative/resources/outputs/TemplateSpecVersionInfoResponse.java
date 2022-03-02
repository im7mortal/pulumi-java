// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TemplateSpecVersionInfoResponse {
    /**
     * Template Spec version description.
     * 
     */
    private final String description;
    /**
     * The timestamp of when the version was created.
     * 
     */
    private final String timeCreated;
    /**
     * The timestamp of when the version was last modified.
     * 
     */
    private final String timeModified;

    @OutputCustomType.Constructor({"description","timeCreated","timeModified"})
    private TemplateSpecVersionInfoResponse(
        String description,
        String timeCreated,
        String timeModified) {
        this.description = Objects.requireNonNull(description);
        this.timeCreated = Objects.requireNonNull(timeCreated);
        this.timeModified = Objects.requireNonNull(timeModified);
    }

    /**
     * Template Spec version description.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The timestamp of when the version was created.
     * 
    */
    public String getTimeCreated() {
        return this.timeCreated;
    }
    /**
     * The timestamp of when the version was last modified.
     * 
    */
    public String getTimeModified() {
        return this.timeModified;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemplateSpecVersionInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String timeCreated;
        private String timeModified;

        public Builder() {
    	      // Empty
        }

        public Builder(TemplateSpecVersionInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeModified = defaults.timeModified;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setTimeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }

        public Builder setTimeModified(String timeModified) {
            this.timeModified = Objects.requireNonNull(timeModified);
            return this;
        }
        public TemplateSpecVersionInfoResponse build() {
            return new TemplateSpecVersionInfoResponse(description, timeCreated, timeModified);
        }
    }
}
