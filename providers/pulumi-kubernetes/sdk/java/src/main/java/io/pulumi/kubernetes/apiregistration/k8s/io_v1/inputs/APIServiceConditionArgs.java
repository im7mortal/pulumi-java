// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiregistration.k8s.io_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * APIServiceCondition describes the state of an APIService at a particular point
 * 
 */
public final class APIServiceConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final APIServiceConditionArgs Empty = new APIServiceConditionArgs();

    /**
     * Last time the condition transitioned from one status to another.
     * 
     */
    @Import(name="lastTransitionTime")
      private final @Nullable Output<String> lastTransitionTime;

    public Output<String> lastTransitionTime() {
        return this.lastTransitionTime == null ? Codegen.empty() : this.lastTransitionTime;
    }

    /**
     * Human-readable message indicating details about last transition.
     * 
     */
    @Import(name="message")
      private final @Nullable Output<String> message;

    public Output<String> message() {
        return this.message == null ? Codegen.empty() : this.message;
    }

    /**
     * Unique, one-word, CamelCase reason for the condition's last transition.
     * 
     */
    @Import(name="reason")
      private final @Nullable Output<String> reason;

    public Output<String> reason() {
        return this.reason == null ? Codegen.empty() : this.reason;
    }

    /**
     * Status is the status of the condition. Can be True, False, Unknown.
     * 
     */
    @Import(name="status", required=true)
      private final Output<String> status;

    public Output<String> status() {
        return this.status;
    }

    /**
     * Type is the type of the condition.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public APIServiceConditionArgs(
        @Nullable Output<String> lastTransitionTime,
        @Nullable Output<String> message,
        @Nullable Output<String> reason,
        Output<String> status,
        Output<String> type) {
        this.lastTransitionTime = lastTransitionTime;
        this.message = message;
        this.reason = reason;
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private APIServiceConditionArgs() {
        this.lastTransitionTime = Codegen.empty();
        this.message = Codegen.empty();
        this.reason = Codegen.empty();
        this.status = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(APIServiceConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> lastTransitionTime;
        private @Nullable Output<String> message;
        private @Nullable Output<String> reason;
        private Output<String> status;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(APIServiceConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastTransitionTime = defaults.lastTransitionTime;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder lastTransitionTime(@Nullable Output<String> lastTransitionTime) {
            this.lastTransitionTime = lastTransitionTime;
            return this;
        }
        public Builder lastTransitionTime(@Nullable String lastTransitionTime) {
            this.lastTransitionTime = Codegen.ofNullable(lastTransitionTime);
            return this;
        }
        public Builder message(@Nullable Output<String> message) {
            this.message = message;
            return this;
        }
        public Builder message(@Nullable String message) {
            this.message = Codegen.ofNullable(message);
            return this;
        }
        public Builder reason(@Nullable Output<String> reason) {
            this.reason = reason;
            return this;
        }
        public Builder reason(@Nullable String reason) {
            this.reason = Codegen.ofNullable(reason);
            return this;
        }
        public Builder status(Output<String> status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder status(String status) {
            this.status = Output.of(Objects.requireNonNull(status));
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public APIServiceConditionArgs build() {
            return new APIServiceConditionArgs(lastTransitionTime, message, reason, status, type);
        }
    }
}
