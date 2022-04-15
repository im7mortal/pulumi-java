// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.inputs.LimitedPriorityLevelConfigurationArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * PriorityLevelConfigurationSpec specifies the configuration of a priority level.
 * 
 */
public final class PriorityLevelConfigurationSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final PriorityLevelConfigurationSpecArgs Empty = new PriorityLevelConfigurationSpecArgs();

    /**
     * `limited` specifies how requests are handled for a Limited priority level. This field must be non-empty if and only if `type` is `"Limited"`.
     * 
     */
    @Import(name="limited")
      private final @Nullable Output<LimitedPriorityLevelConfigurationArgs> limited;

    public Output<LimitedPriorityLevelConfigurationArgs> limited() {
        return this.limited == null ? Codegen.empty() : this.limited;
    }

    /**
     * `type` indicates whether this priority level is subject to limitation on request execution.  A value of `"Exempt"` means that requests of this priority level are not subject to a limit (and thus are never queued) and do not detract from the capacity made available to other priority levels.  A value of `"Limited"` means that (a) requests of this priority level _are_ subject to limits and (b) some of the server's limited capacity is made available exclusively to this priority level. Required.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public PriorityLevelConfigurationSpecArgs(
        @Nullable Output<LimitedPriorityLevelConfigurationArgs> limited,
        Output<String> type) {
        this.limited = limited;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private PriorityLevelConfigurationSpecArgs() {
        this.limited = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PriorityLevelConfigurationSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<LimitedPriorityLevelConfigurationArgs> limited;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(PriorityLevelConfigurationSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limited = defaults.limited;
    	      this.type = defaults.type;
        }

        public Builder limited(@Nullable Output<LimitedPriorityLevelConfigurationArgs> limited) {
            this.limited = limited;
            return this;
        }
        public Builder limited(@Nullable LimitedPriorityLevelConfigurationArgs limited) {
            this.limited = Codegen.ofNullable(limited);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public PriorityLevelConfigurationSpecArgs build() {
            return new PriorityLevelConfigurationSpecArgs(limited, type);
        }
    }
}
