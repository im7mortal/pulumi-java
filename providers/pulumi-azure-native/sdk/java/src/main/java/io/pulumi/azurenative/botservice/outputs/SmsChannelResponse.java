// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.outputs;

import io.pulumi.azurenative.botservice.outputs.SmsChannelPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SmsChannelResponse {
    /**
     * The channel name
     * Expected value is 'SmsChannel'.
     * 
     */
    private final String channelName;
    /**
     * Entity Tag of the resource
     * 
     */
    private final @Nullable String etag;
    /**
     * Specifies the location of the resource.
     * 
     */
    private final @Nullable String location;
    /**
     * The set of properties specific to Sms channel resource
     * 
     */
    private final @Nullable SmsChannelPropertiesResponse properties;
    /**
     * Provisioning state of the resource
     * 
     */
    private final String provisioningState;

    @OutputCustomType.Constructor({"channelName","etag","location","properties","provisioningState"})
    private SmsChannelResponse(
        String channelName,
        @Nullable String etag,
        @Nullable String location,
        @Nullable SmsChannelPropertiesResponse properties,
        String provisioningState) {
        this.channelName = Objects.requireNonNull(channelName);
        this.etag = etag;
        this.location = location;
        this.properties = properties;
        this.provisioningState = Objects.requireNonNull(provisioningState);
    }

    /**
     * The channel name
     * Expected value is 'SmsChannel'.
     * 
    */
    public String getChannelName() {
        return this.channelName;
    }
    /**
     * Entity Tag of the resource
     * 
    */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * Specifies the location of the resource.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The set of properties specific to Sms channel resource
     * 
    */
    public Optional<SmsChannelPropertiesResponse> getProperties() {
        return Optional.ofNullable(this.properties);
    }
    /**
     * Provisioning state of the resource
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SmsChannelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String channelName;
        private @Nullable String etag;
        private @Nullable String location;
        private @Nullable SmsChannelPropertiesResponse properties;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(SmsChannelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelName = defaults.channelName;
    	      this.etag = defaults.etag;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder setChannelName(String channelName) {
            this.channelName = Objects.requireNonNull(channelName);
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setProperties(@Nullable SmsChannelPropertiesResponse properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public SmsChannelResponse build() {
            return new SmsChannelResponse(channelName, etag, location, properties, provisioningState);
        }
    }
}
