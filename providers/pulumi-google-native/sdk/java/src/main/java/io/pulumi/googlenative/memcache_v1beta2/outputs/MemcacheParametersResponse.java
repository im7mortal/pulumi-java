// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.memcache_v1beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class MemcacheParametersResponse {
    /**
     * User defined set of parameters to use in the memcached process.
     * 
     */
    private final Map<String,String> params;

    @OutputCustomType.Constructor({"params"})
    private MemcacheParametersResponse(Map<String,String> params) {
        this.params = Objects.requireNonNull(params);
    }

    /**
     * User defined set of parameters to use in the memcached process.
     * 
    */
    public Map<String,String> getParams() {
        return this.params;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MemcacheParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> params;

        public Builder() {
    	      // Empty
        }

        public Builder(MemcacheParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.params = defaults.params;
        }

        public Builder setParams(Map<String,String> params) {
            this.params = Objects.requireNonNull(params);
            return this;
        }
        public MemcacheParametersResponse build() {
            return new MemcacheParametersResponse(params);
        }
    }
}
