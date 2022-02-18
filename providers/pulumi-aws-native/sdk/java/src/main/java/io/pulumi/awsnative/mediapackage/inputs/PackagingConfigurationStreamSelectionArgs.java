// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.awsnative.mediapackage.enums.PackagingConfigurationStreamSelectionStreamOrder;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A StreamSelection configuration.
 * 
 */
public final class PackagingConfigurationStreamSelectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PackagingConfigurationStreamSelectionArgs Empty = new PackagingConfigurationStreamSelectionArgs();

    /**
     * The maximum video bitrate (bps) to include in output.
     * 
     */
    @InputImport(name="maxVideoBitsPerSecond")
    private final @Nullable Input<Integer> maxVideoBitsPerSecond;

    public Input<Integer> getMaxVideoBitsPerSecond() {
        return this.maxVideoBitsPerSecond == null ? Input.empty() : this.maxVideoBitsPerSecond;
    }

    /**
     * The minimum video bitrate (bps) to include in output.
     * 
     */
    @InputImport(name="minVideoBitsPerSecond")
    private final @Nullable Input<Integer> minVideoBitsPerSecond;

    public Input<Integer> getMinVideoBitsPerSecond() {
        return this.minVideoBitsPerSecond == null ? Input.empty() : this.minVideoBitsPerSecond;
    }

    /**
     * A directive that determines the order of streams in the output.
     * 
     */
    @InputImport(name="streamOrder")
    private final @Nullable Input<PackagingConfigurationStreamSelectionStreamOrder> streamOrder;

    public Input<PackagingConfigurationStreamSelectionStreamOrder> getStreamOrder() {
        return this.streamOrder == null ? Input.empty() : this.streamOrder;
    }

    public PackagingConfigurationStreamSelectionArgs(
        @Nullable Input<Integer> maxVideoBitsPerSecond,
        @Nullable Input<Integer> minVideoBitsPerSecond,
        @Nullable Input<PackagingConfigurationStreamSelectionStreamOrder> streamOrder) {
        this.maxVideoBitsPerSecond = maxVideoBitsPerSecond;
        this.minVideoBitsPerSecond = minVideoBitsPerSecond;
        this.streamOrder = streamOrder;
    }

    private PackagingConfigurationStreamSelectionArgs() {
        this.maxVideoBitsPerSecond = Input.empty();
        this.minVideoBitsPerSecond = Input.empty();
        this.streamOrder = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackagingConfigurationStreamSelectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> maxVideoBitsPerSecond;
        private @Nullable Input<Integer> minVideoBitsPerSecond;
        private @Nullable Input<PackagingConfigurationStreamSelectionStreamOrder> streamOrder;

        public Builder() {
    	      // Empty
        }

        public Builder(PackagingConfigurationStreamSelectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxVideoBitsPerSecond = defaults.maxVideoBitsPerSecond;
    	      this.minVideoBitsPerSecond = defaults.minVideoBitsPerSecond;
    	      this.streamOrder = defaults.streamOrder;
        }

        public Builder setMaxVideoBitsPerSecond(@Nullable Input<Integer> maxVideoBitsPerSecond) {
            this.maxVideoBitsPerSecond = maxVideoBitsPerSecond;
            return this;
        }

        public Builder setMaxVideoBitsPerSecond(@Nullable Integer maxVideoBitsPerSecond) {
            this.maxVideoBitsPerSecond = Input.ofNullable(maxVideoBitsPerSecond);
            return this;
        }

        public Builder setMinVideoBitsPerSecond(@Nullable Input<Integer> minVideoBitsPerSecond) {
            this.minVideoBitsPerSecond = minVideoBitsPerSecond;
            return this;
        }

        public Builder setMinVideoBitsPerSecond(@Nullable Integer minVideoBitsPerSecond) {
            this.minVideoBitsPerSecond = Input.ofNullable(minVideoBitsPerSecond);
            return this;
        }

        public Builder setStreamOrder(@Nullable Input<PackagingConfigurationStreamSelectionStreamOrder> streamOrder) {
            this.streamOrder = streamOrder;
            return this;
        }

        public Builder setStreamOrder(@Nullable PackagingConfigurationStreamSelectionStreamOrder streamOrder) {
            this.streamOrder = Input.ofNullable(streamOrder);
            return this;
        }

        public PackagingConfigurationStreamSelectionArgs build() {
            return new PackagingConfigurationStreamSelectionArgs(maxVideoBitsPerSecond, minVideoBitsPerSecond, streamOrder);
        }
    }
}
