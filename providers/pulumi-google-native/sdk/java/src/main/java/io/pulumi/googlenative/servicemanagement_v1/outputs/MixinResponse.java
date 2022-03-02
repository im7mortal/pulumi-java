// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MixinResponse {
    /**
     * The fully qualified name of the interface which is included.
     * 
     */
    private final String name;
    /**
     * If non-empty specifies a path under which inherited HTTP paths are rooted.
     * 
     */
    private final String root;

    @OutputCustomType.Constructor({"name","root"})
    private MixinResponse(
        String name,
        String root) {
        this.name = Objects.requireNonNull(name);
        this.root = Objects.requireNonNull(root);
    }

    /**
     * The fully qualified name of the interface which is included.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * If non-empty specifies a path under which inherited HTTP paths are rooted.
     * 
    */
    public String getRoot() {
        return this.root;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MixinResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String root;

        public Builder() {
    	      // Empty
        }

        public Builder(MixinResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.root = defaults.root;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRoot(String root) {
            this.root = Objects.requireNonNull(root);
            return this;
        }
        public MixinResponse build() {
            return new MixinResponse(name, root);
        }
    }
}
