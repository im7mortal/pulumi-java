// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AliasContextResponse {
    /**
     * The alias kind.
     * 
     */
    private final String kind;
    /**
     * The alias name.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"kind","name"})
    private AliasContextResponse(
        String kind,
        String name) {
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
    }

    /**
     * The alias kind.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * The alias name.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AliasContextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(AliasContextResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public AliasContextResponse build() {
            return new AliasContextResponse(kind, name);
        }
    }
}
