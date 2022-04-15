// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.auditregistration.k8s.io_v1alpha1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * WebhookThrottleConfig holds the configuration for throttling events
 * 
 */
public final class WebhookThrottleConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebhookThrottleConfigArgs Empty = new WebhookThrottleConfigArgs();

    /**
     * ThrottleBurst is the maximum number of events sent at the same moment default 15 QPS
     * 
     */
    @Import(name="burst")
      private final @Nullable Output<Integer> burst;

    public Output<Integer> burst() {
        return this.burst == null ? Codegen.empty() : this.burst;
    }

    /**
     * ThrottleQPS maximum number of batches per second default 10 QPS
     * 
     */
    @Import(name="qps")
      private final @Nullable Output<Integer> qps;

    public Output<Integer> qps() {
        return this.qps == null ? Codegen.empty() : this.qps;
    }

    public WebhookThrottleConfigArgs(
        @Nullable Output<Integer> burst,
        @Nullable Output<Integer> qps) {
        this.burst = burst;
        this.qps = qps;
    }

    private WebhookThrottleConfigArgs() {
        this.burst = Codegen.empty();
        this.qps = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhookThrottleConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> burst;
        private @Nullable Output<Integer> qps;

        public Builder() {
    	      // Empty
        }

        public Builder(WebhookThrottleConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.burst = defaults.burst;
    	      this.qps = defaults.qps;
        }

        public Builder burst(@Nullable Output<Integer> burst) {
            this.burst = burst;
            return this;
        }
        public Builder burst(@Nullable Integer burst) {
            this.burst = Codegen.ofNullable(burst);
            return this;
        }
        public Builder qps(@Nullable Output<Integer> qps) {
            this.qps = qps;
            return this;
        }
        public Builder qps(@Nullable Integer qps) {
            this.qps = Codegen.ofNullable(qps);
            return this;
        }        public WebhookThrottleConfigArgs build() {
            return new WebhookThrottleConfigArgs(burst, qps);
        }
    }
}
