// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ListDeviceRegistrationKeyResult {
    /**
     * The registration key for the device.
     * 
     */
    private final String registrationKey;

    @OutputCustomType.Constructor({"registrationKey"})
    private ListDeviceRegistrationKeyResult(String registrationKey) {
        this.registrationKey = Objects.requireNonNull(registrationKey);
    }

    /**
     * The registration key for the device.
     * 
    */
    public String getRegistrationKey() {
        return this.registrationKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListDeviceRegistrationKeyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String registrationKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ListDeviceRegistrationKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.registrationKey = defaults.registrationKey;
        }

        public Builder setRegistrationKey(String registrationKey) {
            this.registrationKey = Objects.requireNonNull(registrationKey);
            return this;
        }
        public ListDeviceRegistrationKeyResult build() {
            return new ListDeviceRegistrationKeyResult(registrationKey);
        }
    }
}
