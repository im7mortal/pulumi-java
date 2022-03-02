// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fms.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PolicySecurityServicePolicyData {
    /**
     * Details about the service that are specific to the service type, in JSON format. For service type `SHIELD_ADVANCED`, this is an empty string. Examples depending on `type` can be found in the [AWS Firewall Manager SecurityServicePolicyData API Reference](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_SecurityServicePolicyData.html).
     * 
     */
    private final @Nullable String managedServiceData;
    /**
     * The service that the policy is using to protect the resources. For the current list of supported types, please refer to the [AWS Firewall Manager SecurityServicePolicyData API Type Reference](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_SecurityServicePolicyData.html#fms-Type-SecurityServicePolicyData-Type).
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"managedServiceData","type"})
    private PolicySecurityServicePolicyData(
        @Nullable String managedServiceData,
        String type) {
        this.managedServiceData = managedServiceData;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Details about the service that are specific to the service type, in JSON format. For service type `SHIELD_ADVANCED`, this is an empty string. Examples depending on `type` can be found in the [AWS Firewall Manager SecurityServicePolicyData API Reference](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_SecurityServicePolicyData.html).
     * 
    */
    public Optional<String> getManagedServiceData() {
        return Optional.ofNullable(this.managedServiceData);
    }
    /**
     * The service that the policy is using to protect the resources. For the current list of supported types, please refer to the [AWS Firewall Manager SecurityServicePolicyData API Type Reference](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_SecurityServicePolicyData.html#fms-Type-SecurityServicePolicyData-Type).
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicySecurityServicePolicyData defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String managedServiceData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicySecurityServicePolicyData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managedServiceData = defaults.managedServiceData;
    	      this.type = defaults.type;
        }

        public Builder setManagedServiceData(@Nullable String managedServiceData) {
            this.managedServiceData = managedServiceData;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public PolicySecurityServicePolicyData build() {
            return new PolicySecurityServicePolicyData(managedServiceData, type);
        }
    }
}
