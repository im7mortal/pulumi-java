// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta1.inputs.QueuingConfigurationArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * LimitResponse defines how to handle requests that can not be executed right now.
 * 
 */
public final class LimitResponseArgs extends io.pulumi.resources.ResourceArgs {

    public static final LimitResponseArgs Empty = new LimitResponseArgs();

    /**
     * `queuing` holds the configuration parameters for queuing. This field may be non-empty only if `type` is `"Queue"`.
     * 
     */
    @InputImport(name="queuing")
    private final @Nullable Input<QueuingConfigurationArgs> queuing;

    public Input<QueuingConfigurationArgs> getQueuing() {
        return this.queuing == null ? Input.empty() : this.queuing;
    }

    /**
     * `type` is "Queue" or "Reject". "Queue" means that requests that can not be executed upon arrival are held in a queue until they can be executed or a queuing limit is reached. "Reject" means that requests that can not be executed upon arrival are rejected. Required.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public LimitResponseArgs(
        @Nullable Input<QueuingConfigurationArgs> queuing,
        Input<String> type) {
        this.queuing = queuing;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private LimitResponseArgs() {
        this.queuing = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LimitResponseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<QueuingConfigurationArgs> queuing;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(LimitResponseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queuing = defaults.queuing;
    	      this.type = defaults.type;
        }

        public Builder setQueuing(@Nullable Input<QueuingConfigurationArgs> queuing) {
            this.queuing = queuing;
            return this;
        }

        public Builder setQueuing(@Nullable QueuingConfigurationArgs queuing) {
            this.queuing = Input.ofNullable(queuing);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public LimitResponseArgs build() {
            return new LimitResponseArgs(queuing, type);
        }
    }
}
