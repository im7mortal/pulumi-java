// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SubResourceReadOnlyResponse {
    /**
     * Resource Id
     * 
     */
    private final String id;

    @OutputCustomType.Constructor({"id"})
    private SubResourceReadOnlyResponse(String id) {
        this.id = Objects.requireNonNull(id);
    }

    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubResourceReadOnlyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(SubResourceReadOnlyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public SubResourceReadOnlyResponse build() {
            return new SubResourceReadOnlyResponse(id);
        }
    }
}
