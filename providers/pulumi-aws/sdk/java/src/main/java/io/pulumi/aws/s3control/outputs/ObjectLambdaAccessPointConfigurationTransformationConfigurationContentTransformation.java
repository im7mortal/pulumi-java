// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3control.outputs;

import io.pulumi.aws.s3control.outputs.ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation {
    /**
     * Configuration for an AWS Lambda function. See AWS Lambda below for more details.
     * 
     */
    private final ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda awsLambda;

    @OutputCustomType.Constructor({"awsLambda"})
    private ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation(ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda awsLambda) {
        this.awsLambda = Objects.requireNonNull(awsLambda);
    }

    /**
     * Configuration for an AWS Lambda function. See AWS Lambda below for more details.
     * 
    */
    public ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda getAwsLambda() {
        return this.awsLambda;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda awsLambda;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsLambda = defaults.awsLambda;
        }

        public Builder setAwsLambda(ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda awsLambda) {
            this.awsLambda = Objects.requireNonNull(awsLambda);
            return this;
        }
        public ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation build() {
            return new ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation(awsLambda);
        }
    }
}
