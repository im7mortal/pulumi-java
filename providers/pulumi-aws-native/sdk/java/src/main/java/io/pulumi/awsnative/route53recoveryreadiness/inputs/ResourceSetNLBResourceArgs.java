// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoveryreadiness.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The Network Load Balancer resource that a DNS target resource points to.
 * 
 */
public final class ResourceSetNLBResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceSetNLBResourceArgs Empty = new ResourceSetNLBResourceArgs();

    /**
     * A Network Load Balancer resource Amazon Resource Name (ARN).
     * 
     */
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    public ResourceSetNLBResourceArgs(@Nullable Input<String> arn) {
        this.arn = arn;
    }

    private ResourceSetNLBResourceArgs() {
        this.arn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceSetNLBResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceSetNLBResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public ResourceSetNLBResourceArgs build() {
            return new ResourceSetNLBResourceArgs(arn);
        }
    }
}
