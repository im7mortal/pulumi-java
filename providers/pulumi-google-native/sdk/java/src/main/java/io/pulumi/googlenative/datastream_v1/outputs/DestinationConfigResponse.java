// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.datastream_v1.outputs.GcsDestinationConfigResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DestinationConfigResponse {
    /**
     * Destination connection profile resource. Format: `projects/{project}/locations/{location}/connectionProfiles/{name}`
     * 
     */
    private final String destinationConnectionProfile;
    /**
     * A configuration for how data should be loaded to Cloud Storage.
     * 
     */
    private final GcsDestinationConfigResponse gcsDestinationConfig;

    @OutputCustomType.Constructor({"destinationConnectionProfile","gcsDestinationConfig"})
    private DestinationConfigResponse(
        String destinationConnectionProfile,
        GcsDestinationConfigResponse gcsDestinationConfig) {
        this.destinationConnectionProfile = Objects.requireNonNull(destinationConnectionProfile);
        this.gcsDestinationConfig = Objects.requireNonNull(gcsDestinationConfig);
    }

    /**
     * Destination connection profile resource. Format: `projects/{project}/locations/{location}/connectionProfiles/{name}`
     * 
    */
    public String getDestinationConnectionProfile() {
        return this.destinationConnectionProfile;
    }
    /**
     * A configuration for how data should be loaded to Cloud Storage.
     * 
    */
    public GcsDestinationConfigResponse getGcsDestinationConfig() {
        return this.gcsDestinationConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DestinationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String destinationConnectionProfile;
        private GcsDestinationConfigResponse gcsDestinationConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(DestinationConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationConnectionProfile = defaults.destinationConnectionProfile;
    	      this.gcsDestinationConfig = defaults.gcsDestinationConfig;
        }

        public Builder setDestinationConnectionProfile(String destinationConnectionProfile) {
            this.destinationConnectionProfile = Objects.requireNonNull(destinationConnectionProfile);
            return this;
        }

        public Builder setGcsDestinationConfig(GcsDestinationConfigResponse gcsDestinationConfig) {
            this.gcsDestinationConfig = Objects.requireNonNull(gcsDestinationConfig);
            return this;
        }
        public DestinationConfigResponse build() {
            return new DestinationConfigResponse(destinationConnectionProfile, gcsDestinationConfig);
        }
    }
}
