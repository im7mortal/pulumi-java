// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless;

import io.pulumi.awsnative.iotwireless.inputs.ServiceProfileLoRaWANServiceProfileArgs;
import io.pulumi.awsnative.iotwireless.inputs.ServiceProfileTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceProfileArgs Empty = new ServiceProfileArgs();

    /**
     * LoRaWAN supports all LoRa specific attributes for service profile for CreateServiceProfile operation
     * 
     */
    @InputImport(name="loRaWAN")
    private final @Nullable Input<ServiceProfileLoRaWANServiceProfileArgs> loRaWAN;

    public Input<ServiceProfileLoRaWANServiceProfileArgs> getLoRaWAN() {
        return this.loRaWAN == null ? Input.empty() : this.loRaWAN;
    }

    /**
     * Name of service profile
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A list of key-value pairs that contain metadata for the service profile.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<List<ServiceProfileTagArgs>> tags;

    public Input<List<ServiceProfileTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ServiceProfileArgs(
        @Nullable Input<ServiceProfileLoRaWANServiceProfileArgs> loRaWAN,
        @Nullable Input<String> name,
        @Nullable Input<List<ServiceProfileTagArgs>> tags) {
        this.loRaWAN = loRaWAN;
        this.name = name;
        this.tags = tags;
    }

    private ServiceProfileArgs() {
        this.loRaWAN = Input.empty();
        this.name = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ServiceProfileLoRaWANServiceProfileArgs> loRaWAN;
        private @Nullable Input<String> name;
        private @Nullable Input<List<ServiceProfileTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loRaWAN = defaults.loRaWAN;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder setLoRaWAN(@Nullable Input<ServiceProfileLoRaWANServiceProfileArgs> loRaWAN) {
            this.loRaWAN = loRaWAN;
            return this;
        }

        public Builder setLoRaWAN(@Nullable ServiceProfileLoRaWANServiceProfileArgs loRaWAN) {
            this.loRaWAN = Input.ofNullable(loRaWAN);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setTags(@Nullable Input<List<ServiceProfileTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<ServiceProfileTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public ServiceProfileArgs build() {
            return new ServiceProfileArgs(loRaWAN, name, tags);
        }
    }
}
