// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class IntegrationAccountSkuResponse {
    /**
     * The sku name.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"name"})
    private IntegrationAccountSkuResponse(String name) {
        this.name = Objects.requireNonNull(name);
    }

    /**
     * The sku name.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationAccountSkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationAccountSkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public IntegrationAccountSkuResponse build() {
            return new IntegrationAccountSkuResponse(name);
        }
    }
}
