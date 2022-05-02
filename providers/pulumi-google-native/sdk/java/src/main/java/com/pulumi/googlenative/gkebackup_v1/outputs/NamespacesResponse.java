// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkebackup_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class NamespacesResponse {
    /**
     * @return A list of Kubernetes Namespaces
     * 
     */
    private final List<String> namespaces;

    @CustomType.Constructor
    private NamespacesResponse(@CustomType.Parameter("namespaces") List<String> namespaces) {
        this.namespaces = namespaces;
    }

    /**
     * @return A list of Kubernetes Namespaces
     * 
     */
    public List<String> namespaces() {
        return this.namespaces;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NamespacesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> namespaces;

        public Builder() {
    	      // Empty
        }

        public Builder(NamespacesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespaces = defaults.namespaces;
        }

        public Builder namespaces(List<String> namespaces) {
            this.namespaces = Objects.requireNonNull(namespaces);
            return this;
        }
        public Builder namespaces(String... namespaces) {
            return namespaces(List.of(namespaces));
        }        public NamespacesResponse build() {
            return new NamespacesResponse(namespaces);
        }
    }
}
