// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ResourceQuotaStatus defines the enforced hard limits and observed use.
 * 
 */
public final class ResourceQuotaStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceQuotaStatusArgs Empty = new ResourceQuotaStatusArgs();

    /**
     * Hard is the set of enforced hard limits for each named resource. More info: https://kubernetes.io/docs/concepts/policy/resource-quotas/
     * 
     */
    @Import(name="hard")
      private final @Nullable Output<Map<String,String>> hard;

    public Output<Map<String,String>> hard() {
        return this.hard == null ? Codegen.empty() : this.hard;
    }

    /**
     * Used is the current observed total usage of the resource in the namespace.
     * 
     */
    @Import(name="used")
      private final @Nullable Output<Map<String,String>> used;

    public Output<Map<String,String>> used() {
        return this.used == null ? Codegen.empty() : this.used;
    }

    public ResourceQuotaStatusArgs(
        @Nullable Output<Map<String,String>> hard,
        @Nullable Output<Map<String,String>> used) {
        this.hard = hard;
        this.used = used;
    }

    private ResourceQuotaStatusArgs() {
        this.hard = Codegen.empty();
        this.used = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceQuotaStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> hard;
        private @Nullable Output<Map<String,String>> used;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceQuotaStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hard = defaults.hard;
    	      this.used = defaults.used;
        }

        public Builder hard(@Nullable Output<Map<String,String>> hard) {
            this.hard = hard;
            return this;
        }
        public Builder hard(@Nullable Map<String,String> hard) {
            this.hard = Codegen.ofNullable(hard);
            return this;
        }
        public Builder used(@Nullable Output<Map<String,String>> used) {
            this.used = used;
            return this;
        }
        public Builder used(@Nullable Map<String,String> used) {
            this.used = Codegen.ofNullable(used);
            return this;
        }        public ResourceQuotaStatusArgs build() {
            return new ResourceQuotaStatusArgs(hard, used);
        }
    }
}
