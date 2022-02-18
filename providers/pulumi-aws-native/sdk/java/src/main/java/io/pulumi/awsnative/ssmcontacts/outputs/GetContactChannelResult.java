// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssmcontacts.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetContactChannelResult {
    /**
     * The Amazon Resource Name (ARN) of the engagement to a contact channel.
     * 
     */
    private final @Nullable String arn;
    /**
     * The details that SSM Incident Manager uses when trying to engage the contact channel.
     * 
     */
    private final @Nullable String channelAddress;
    /**
     * The device name. String of 6 to 50 alphabetical, numeric, dash, and underscore characters.
     * 
     */
    private final @Nullable String channelName;
    /**
     * If you want to activate the channel at a later time, you can choose to defer activation. SSM Incident Manager can't engage your contact channel until it has been activated.
     * 
     */
    private final @Nullable Boolean deferActivation;

    @OutputCustomType.Constructor({"arn","channelAddress","channelName","deferActivation"})
    private GetContactChannelResult(
        @Nullable String arn,
        @Nullable String channelAddress,
        @Nullable String channelName,
        @Nullable Boolean deferActivation) {
        this.arn = arn;
        this.channelAddress = channelAddress;
        this.channelName = channelName;
        this.deferActivation = deferActivation;
    }

    /**
     * The Amazon Resource Name (ARN) of the engagement to a contact channel.
     * 
     */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * The details that SSM Incident Manager uses when trying to engage the contact channel.
     * 
     */
    public Optional<String> getChannelAddress() {
        return Optional.ofNullable(this.channelAddress);
    }
    /**
     * The device name. String of 6 to 50 alphabetical, numeric, dash, and underscore characters.
     * 
     */
    public Optional<String> getChannelName() {
        return Optional.ofNullable(this.channelName);
    }
    /**
     * If you want to activate the channel at a later time, you can choose to defer activation. SSM Incident Manager can't engage your contact channel until it has been activated.
     * 
     */
    public Optional<Boolean> getDeferActivation() {
        return Optional.ofNullable(this.deferActivation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetContactChannelResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String channelAddress;
        private @Nullable String channelName;
        private @Nullable Boolean deferActivation;

        public Builder() {
    	      // Empty
        }

        public Builder(GetContactChannelResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.channelAddress = defaults.channelAddress;
    	      this.channelName = defaults.channelName;
    	      this.deferActivation = defaults.deferActivation;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setChannelAddress(@Nullable String channelAddress) {
            this.channelAddress = channelAddress;
            return this;
        }

        public Builder setChannelName(@Nullable String channelName) {
            this.channelName = channelName;
            return this;
        }

        public Builder setDeferActivation(@Nullable Boolean deferActivation) {
            this.deferActivation = deferActivation;
            return this;
        }

        public GetContactChannelResult build() {
            return new GetContactChannelResult(arn, channelAddress, channelName, deferActivation);
        }
    }
}
