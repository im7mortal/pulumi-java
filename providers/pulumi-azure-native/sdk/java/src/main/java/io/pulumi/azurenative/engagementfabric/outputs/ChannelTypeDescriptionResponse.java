// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.engagementfabric.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ChannelTypeDescriptionResponse {
    /**
     * Text description for the channel
     * 
     */
    private final @Nullable String channelDescription;
    /**
     * All the available functions for the channel
     * 
     */
    private final @Nullable List<String> channelFunctions;
    /**
     * Channel type
     * 
     */
    private final @Nullable String channelType;

    @OutputCustomType.Constructor({"channelDescription","channelFunctions","channelType"})
    private ChannelTypeDescriptionResponse(
        @Nullable String channelDescription,
        @Nullable List<String> channelFunctions,
        @Nullable String channelType) {
        this.channelDescription = channelDescription;
        this.channelFunctions = channelFunctions;
        this.channelType = channelType;
    }

    /**
     * Text description for the channel
     * 
    */
    public Optional<String> getChannelDescription() {
        return Optional.ofNullable(this.channelDescription);
    }
    /**
     * All the available functions for the channel
     * 
    */
    public List<String> getChannelFunctions() {
        return this.channelFunctions == null ? List.of() : this.channelFunctions;
    }
    /**
     * Channel type
     * 
    */
    public Optional<String> getChannelType() {
        return Optional.ofNullable(this.channelType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelTypeDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String channelDescription;
        private @Nullable List<String> channelFunctions;
        private @Nullable String channelType;

        public Builder() {
    	      // Empty
        }

        public Builder(ChannelTypeDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelDescription = defaults.channelDescription;
    	      this.channelFunctions = defaults.channelFunctions;
    	      this.channelType = defaults.channelType;
        }

        public Builder setChannelDescription(@Nullable String channelDescription) {
            this.channelDescription = channelDescription;
            return this;
        }

        public Builder setChannelFunctions(@Nullable List<String> channelFunctions) {
            this.channelFunctions = channelFunctions;
            return this;
        }

        public Builder setChannelType(@Nullable String channelType) {
            this.channelType = channelType;
            return this;
        }
        public ChannelTypeDescriptionResponse build() {
            return new ChannelTypeDescriptionResponse(channelDescription, channelFunctions, channelType);
        }
    }
}
