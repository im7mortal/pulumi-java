// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.applicationinsights.inputs;

import io.pulumi.awsnative.applicationinsights.enums.ApplicationSubComponentTypeConfigurationSubComponentType;
import io.pulumi.awsnative.applicationinsights.inputs.ApplicationSubComponentConfigurationDetailsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;


/**
 * One type sub component configurations for the component.
 * 
 */
public final class ApplicationSubComponentTypeConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationSubComponentTypeConfigurationArgs Empty = new ApplicationSubComponentTypeConfigurationArgs();

    /**
     * The configuration settings of sub components.
     * 
     */
    @InputImport(name="subComponentConfigurationDetails", required=true)
    private final Input<ApplicationSubComponentConfigurationDetailsArgs> subComponentConfigurationDetails;

    public Input<ApplicationSubComponentConfigurationDetailsArgs> getSubComponentConfigurationDetails() {
        return this.subComponentConfigurationDetails;
    }

    /**
     * The sub component type.
     * 
     */
    @InputImport(name="subComponentType", required=true)
    private final Input<ApplicationSubComponentTypeConfigurationSubComponentType> subComponentType;

    public Input<ApplicationSubComponentTypeConfigurationSubComponentType> getSubComponentType() {
        return this.subComponentType;
    }

    public ApplicationSubComponentTypeConfigurationArgs(
        Input<ApplicationSubComponentConfigurationDetailsArgs> subComponentConfigurationDetails,
        Input<ApplicationSubComponentTypeConfigurationSubComponentType> subComponentType) {
        this.subComponentConfigurationDetails = Objects.requireNonNull(subComponentConfigurationDetails, "expected parameter 'subComponentConfigurationDetails' to be non-null");
        this.subComponentType = Objects.requireNonNull(subComponentType, "expected parameter 'subComponentType' to be non-null");
    }

    private ApplicationSubComponentTypeConfigurationArgs() {
        this.subComponentConfigurationDetails = Input.empty();
        this.subComponentType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationSubComponentTypeConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ApplicationSubComponentConfigurationDetailsArgs> subComponentConfigurationDetails;
        private Input<ApplicationSubComponentTypeConfigurationSubComponentType> subComponentType;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationSubComponentTypeConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subComponentConfigurationDetails = defaults.subComponentConfigurationDetails;
    	      this.subComponentType = defaults.subComponentType;
        }

        public Builder setSubComponentConfigurationDetails(Input<ApplicationSubComponentConfigurationDetailsArgs> subComponentConfigurationDetails) {
            this.subComponentConfigurationDetails = Objects.requireNonNull(subComponentConfigurationDetails);
            return this;
        }

        public Builder setSubComponentConfigurationDetails(ApplicationSubComponentConfigurationDetailsArgs subComponentConfigurationDetails) {
            this.subComponentConfigurationDetails = Input.of(Objects.requireNonNull(subComponentConfigurationDetails));
            return this;
        }

        public Builder setSubComponentType(Input<ApplicationSubComponentTypeConfigurationSubComponentType> subComponentType) {
            this.subComponentType = Objects.requireNonNull(subComponentType);
            return this;
        }

        public Builder setSubComponentType(ApplicationSubComponentTypeConfigurationSubComponentType subComponentType) {
            this.subComponentType = Input.of(Objects.requireNonNull(subComponentType));
            return this;
        }

        public ApplicationSubComponentTypeConfigurationArgs build() {
            return new ApplicationSubComponentTypeConfigurationArgs(subComponentConfigurationDetails, subComponentType);
        }
    }
}
