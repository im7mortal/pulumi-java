// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SkuResponse {
    /**
     * SKU family name
     * 
     */
    private final String family;
    /**
     * SKU name to specify whether the key vault is a standard vault or a premium vault.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"family","name"})
    private SkuResponse(
        String family,
        String name) {
        this.family = Objects.requireNonNull(family);
        this.name = Objects.requireNonNull(name);
    }

    /**
     * SKU family name
     * 
    */
    public String getFamily() {
        return this.family;
    }
    /**
     * SKU name to specify whether the key vault is a standard vault or a premium vault.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String family;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.family = defaults.family;
    	      this.name = defaults.name;
        }

        public Builder setFamily(String family) {
            this.family = Objects.requireNonNull(family);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public SkuResponse build() {
            return new SkuResponse(family, name);
        }
    }
}
