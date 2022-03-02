// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfig {
    /**
     * Amazon SNS topic to post a notification to when inference fails. If no topic is provided, no notification is sent on failure.
     * 
     */
    private final @Nullable String errorTopic;
    /**
     * Amazon SNS topic to post a notification to when inference completes successfully. If no topic is provided, no notification is sent on success.
     * 
     */
    private final @Nullable String successTopic;

    @OutputCustomType.Constructor({"errorTopic","successTopic"})
    private EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfig(
        @Nullable String errorTopic,
        @Nullable String successTopic) {
        this.errorTopic = errorTopic;
        this.successTopic = successTopic;
    }

    /**
     * Amazon SNS topic to post a notification to when inference fails. If no topic is provided, no notification is sent on failure.
     * 
    */
    public Optional<String> getErrorTopic() {
        return Optional.ofNullable(this.errorTopic);
    }
    /**
     * Amazon SNS topic to post a notification to when inference completes successfully. If no topic is provided, no notification is sent on success.
     * 
    */
    public Optional<String> getSuccessTopic() {
        return Optional.ofNullable(this.successTopic);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String errorTopic;
        private @Nullable String successTopic;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorTopic = defaults.errorTopic;
    	      this.successTopic = defaults.successTopic;
        }

        public Builder setErrorTopic(@Nullable String errorTopic) {
            this.errorTopic = errorTopic;
            return this;
        }

        public Builder setSuccessTopic(@Nullable String successTopic) {
            this.successTopic = successTopic;
            return this;
        }
        public EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfig build() {
            return new EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfig(errorTopic, successTopic);
        }
    }
}
