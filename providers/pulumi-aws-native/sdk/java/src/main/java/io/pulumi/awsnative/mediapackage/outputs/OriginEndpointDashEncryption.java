// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.outputs;

import io.pulumi.awsnative.mediapackage.outputs.OriginEndpointSpekeKeyProvider;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OriginEndpointDashEncryption {
    /**
     * Time (in seconds) between each encryption key rotation.
     * 
     */
    private final @Nullable Integer keyRotationIntervalSeconds;
    private final OriginEndpointSpekeKeyProvider spekeKeyProvider;

    @OutputCustomType.Constructor({"keyRotationIntervalSeconds","spekeKeyProvider"})
    private OriginEndpointDashEncryption(
        @Nullable Integer keyRotationIntervalSeconds,
        OriginEndpointSpekeKeyProvider spekeKeyProvider) {
        this.keyRotationIntervalSeconds = keyRotationIntervalSeconds;
        this.spekeKeyProvider = Objects.requireNonNull(spekeKeyProvider);
    }

    /**
     * Time (in seconds) between each encryption key rotation.
     * 
     */
    public Optional<Integer> getKeyRotationIntervalSeconds() {
        return Optional.ofNullable(this.keyRotationIntervalSeconds);
    }
    public OriginEndpointSpekeKeyProvider getSpekeKeyProvider() {
        return this.spekeKeyProvider;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginEndpointDashEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer keyRotationIntervalSeconds;
        private OriginEndpointSpekeKeyProvider spekeKeyProvider;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginEndpointDashEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyRotationIntervalSeconds = defaults.keyRotationIntervalSeconds;
    	      this.spekeKeyProvider = defaults.spekeKeyProvider;
        }

        public Builder setKeyRotationIntervalSeconds(@Nullable Integer keyRotationIntervalSeconds) {
            this.keyRotationIntervalSeconds = keyRotationIntervalSeconds;
            return this;
        }

        public Builder setSpekeKeyProvider(OriginEndpointSpekeKeyProvider spekeKeyProvider) {
            this.spekeKeyProvider = Objects.requireNonNull(spekeKeyProvider);
            return this;
        }

        public OriginEndpointDashEncryption build() {
            return new OriginEndpointDashEncryption(keyRotationIntervalSeconds, spekeKeyProvider);
        }
    }
}
