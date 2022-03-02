// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3control.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda {
    /**
     * The Amazon Resource Name (ARN) of the AWS Lambda function.
     * 
     */
    private final String functionArn;
    /**
     * Additional JSON that provides supplemental data to the Lambda function used to transform objects.
     * 
     */
    private final @Nullable String functionPayload;

    @OutputCustomType.Constructor({"functionArn","functionPayload"})
    private ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda(
        String functionArn,
        @Nullable String functionPayload) {
        this.functionArn = Objects.requireNonNull(functionArn);
        this.functionPayload = functionPayload;
    }

    /**
     * The Amazon Resource Name (ARN) of the AWS Lambda function.
     * 
    */
    public String getFunctionArn() {
        return this.functionArn;
    }
    /**
     * Additional JSON that provides supplemental data to the Lambda function used to transform objects.
     * 
    */
    public Optional<String> getFunctionPayload() {
        return Optional.ofNullable(this.functionPayload);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String functionArn;
        private @Nullable String functionPayload;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionArn = defaults.functionArn;
    	      this.functionPayload = defaults.functionPayload;
        }

        public Builder setFunctionArn(String functionArn) {
            this.functionArn = Objects.requireNonNull(functionArn);
            return this;
        }

        public Builder setFunctionPayload(@Nullable String functionPayload) {
            this.functionPayload = functionPayload;
            return this;
        }
        public ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda build() {
            return new ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda(functionArn, functionPayload);
        }
    }
}
