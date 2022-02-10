// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DeprecationStatusResponse {
    private final String deleted;
    private final String deprecated;
    private final String obsolete;
    private final String replacement;
    private final String state;

    @OutputCustomType.Constructor({"deleted","deprecated","obsolete","replacement","state"})
    private DeprecationStatusResponse(
        String deleted,
        String deprecated,
        String obsolete,
        String replacement,
        String state) {
        this.deleted = Objects.requireNonNull(deleted);
        this.deprecated = Objects.requireNonNull(deprecated);
        this.obsolete = Objects.requireNonNull(obsolete);
        this.replacement = Objects.requireNonNull(replacement);
        this.state = Objects.requireNonNull(state);
    }

    public String getDeleted() {
        return this.deleted;
    }
    public String getDeprecated() {
        return this.deprecated;
    }
    public String getObsolete() {
        return this.obsolete;
    }
    public String getReplacement() {
        return this.replacement;
    }
    public String getState() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeprecationStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deleted;
        private String deprecated;
        private String obsolete;
        private String replacement;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(DeprecationStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleted = defaults.deleted;
    	      this.deprecated = defaults.deprecated;
    	      this.obsolete = defaults.obsolete;
    	      this.replacement = defaults.replacement;
    	      this.state = defaults.state;
        }

        public Builder setDeleted(String deleted) {
            this.deleted = Objects.requireNonNull(deleted);
            return this;
        }

        public Builder setDeprecated(String deprecated) {
            this.deprecated = Objects.requireNonNull(deprecated);
            return this;
        }

        public Builder setObsolete(String obsolete) {
            this.obsolete = Objects.requireNonNull(obsolete);
            return this;
        }

        public Builder setReplacement(String replacement) {
            this.replacement = Objects.requireNonNull(replacement);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public DeprecationStatusResponse build() {
            return new DeprecationStatusResponse(deleted, deprecated, obsolete, replacement, state);
        }
    }
}