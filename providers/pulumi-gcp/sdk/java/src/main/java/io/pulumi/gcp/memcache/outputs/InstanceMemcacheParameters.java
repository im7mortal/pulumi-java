// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.memcache.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InstanceMemcacheParameters {
    /**
     * - 
     * This is a unique ID associated with this set of parameters.
     * 
     */
    private final @Nullable String id;
    /**
     * User-defined set of parameters to use in the memcache process.
     * 
     */
    private final @Nullable Map<String,String> params;

    @OutputCustomType.Constructor({"id","params"})
    private InstanceMemcacheParameters(
        @Nullable String id,
        @Nullable Map<String,String> params) {
        this.id = id;
        this.params = params;
    }

    /**
     * - 
     * This is a unique ID associated with this set of parameters.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * User-defined set of parameters to use in the memcache process.
     * 
    */
    public Map<String,String> getParams() {
        return this.params == null ? Map.of() : this.params;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceMemcacheParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable Map<String,String> params;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceMemcacheParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.params = defaults.params;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setParams(@Nullable Map<String,String> params) {
            this.params = params;
            return this;
        }
        public InstanceMemcacheParameters build() {
            return new InstanceMemcacheParameters(id, params);
        }
    }
}
