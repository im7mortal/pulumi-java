// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.transcoder_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Deblock preprocessing configuration. **Note:** This configuration is not supported.
 * 
 */
public final class DeblockArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeblockArgs Empty = new DeblockArgs();

    /**
     * Enable deblocker. The default is `false`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Enable deblocker. The default is `false`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Set strength of the deblocker. Enter a value between 0 and 1. The higher the value, the stronger the block removal. 0 is no deblocking. The default is 0.
     * 
     */
    @Import(name="strength")
    private @Nullable Output<Double> strength;

    /**
     * @return Set strength of the deblocker. Enter a value between 0 and 1. The higher the value, the stronger the block removal. 0 is no deblocking. The default is 0.
     * 
     */
    public Optional<Output<Double>> strength() {
        return Optional.ofNullable(this.strength);
    }

    private DeblockArgs() {}

    private DeblockArgs(DeblockArgs $) {
        this.enabled = $.enabled;
        this.strength = $.strength;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeblockArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeblockArgs $;

        public Builder() {
            $ = new DeblockArgs();
        }

        public Builder(DeblockArgs defaults) {
            $ = new DeblockArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Enable deblocker. The default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enable deblocker. The default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param strength Set strength of the deblocker. Enter a value between 0 and 1. The higher the value, the stronger the block removal. 0 is no deblocking. The default is 0.
         * 
         * @return builder
         * 
         */
        public Builder strength(@Nullable Output<Double> strength) {
            $.strength = strength;
            return this;
        }

        /**
         * @param strength Set strength of the deblocker. Enter a value between 0 and 1. The higher the value, the stronger the block removal. 0 is no deblocking. The default is 0.
         * 
         * @return builder
         * 
         */
        public Builder strength(Double strength) {
            return strength(Output.of(strength));
        }

        public DeblockArgs build() {
            return $;
        }
    }

}
