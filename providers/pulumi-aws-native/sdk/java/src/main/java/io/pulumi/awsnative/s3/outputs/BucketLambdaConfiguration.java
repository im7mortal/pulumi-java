// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.awsnative.s3.outputs.BucketNotificationFilter;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BucketLambdaConfiguration {
    /**
     * The Amazon S3 bucket event for which to invoke the AWS Lambda function.
     * 
     */
    private final String event;
    /**
     * The filtering rules that determine which objects invoke the AWS Lambda function.
     * 
     */
    private final @Nullable BucketNotificationFilter filter;
    /**
     * The Amazon Resource Name (ARN) of the AWS Lambda function that Amazon S3 invokes when the specified event type occurs.
     * 
     */
    private final String function;

    @OutputCustomType.Constructor({"event","filter","function"})
    private BucketLambdaConfiguration(
        String event,
        @Nullable BucketNotificationFilter filter,
        String function) {
        this.event = Objects.requireNonNull(event);
        this.filter = filter;
        this.function = Objects.requireNonNull(function);
    }

    /**
     * The Amazon S3 bucket event for which to invoke the AWS Lambda function.
     * 
     */
    public String getEvent() {
        return this.event;
    }
    /**
     * The filtering rules that determine which objects invoke the AWS Lambda function.
     * 
     */
    public Optional<BucketNotificationFilter> getFilter() {
        return Optional.ofNullable(this.filter);
    }
    /**
     * The Amazon Resource Name (ARN) of the AWS Lambda function that Amazon S3 invokes when the specified event type occurs.
     * 
     */
    public String getFunction() {
        return this.function;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLambdaConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String event;
        private @Nullable BucketNotificationFilter filter;
        private String function;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLambdaConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.event = defaults.event;
    	      this.filter = defaults.filter;
    	      this.function = defaults.function;
        }

        public Builder setEvent(String event) {
            this.event = Objects.requireNonNull(event);
            return this;
        }

        public Builder setFilter(@Nullable BucketNotificationFilter filter) {
            this.filter = filter;
            return this;
        }

        public Builder setFunction(String function) {
            this.function = Objects.requireNonNull(function);
            return this;
        }

        public BucketLambdaConfiguration build() {
            return new BucketLambdaConfiguration(event, filter, function);
        }
    }
}
