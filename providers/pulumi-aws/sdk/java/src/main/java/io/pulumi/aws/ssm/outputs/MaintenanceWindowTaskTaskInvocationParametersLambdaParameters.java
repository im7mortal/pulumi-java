// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MaintenanceWindowTaskTaskInvocationParametersLambdaParameters {
    /**
     * Pass client-specific information to the Lambda function that you are invoking.
     * 
     */
    private final @Nullable String clientContext;
    /**
     * JSON to provide to your Lambda function as input.
     * 
     */
    private final @Nullable String payload;
    /**
     * Specify a Lambda function version or alias name.
     * 
     */
    private final @Nullable String qualifier;

    @OutputCustomType.Constructor({"clientContext","payload","qualifier"})
    private MaintenanceWindowTaskTaskInvocationParametersLambdaParameters(
        @Nullable String clientContext,
        @Nullable String payload,
        @Nullable String qualifier) {
        this.clientContext = clientContext;
        this.payload = payload;
        this.qualifier = qualifier;
    }

    /**
     * Pass client-specific information to the Lambda function that you are invoking.
     * 
    */
    public Optional<String> getClientContext() {
        return Optional.ofNullable(this.clientContext);
    }
    /**
     * JSON to provide to your Lambda function as input.
     * 
    */
    public Optional<String> getPayload() {
        return Optional.ofNullable(this.payload);
    }
    /**
     * Specify a Lambda function version or alias name.
     * 
    */
    public Optional<String> getQualifier() {
        return Optional.ofNullable(this.qualifier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceWindowTaskTaskInvocationParametersLambdaParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientContext;
        private @Nullable String payload;
        private @Nullable String qualifier;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceWindowTaskTaskInvocationParametersLambdaParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientContext = defaults.clientContext;
    	      this.payload = defaults.payload;
    	      this.qualifier = defaults.qualifier;
        }

        public Builder setClientContext(@Nullable String clientContext) {
            this.clientContext = clientContext;
            return this;
        }

        public Builder setPayload(@Nullable String payload) {
            this.payload = payload;
            return this;
        }

        public Builder setQualifier(@Nullable String qualifier) {
            this.qualifier = qualifier;
            return this;
        }
        public MaintenanceWindowTaskTaskInvocationParametersLambdaParameters build() {
            return new MaintenanceWindowTaskTaskInvocationParametersLambdaParameters(clientContext, payload, qualifier);
        }
    }
}
