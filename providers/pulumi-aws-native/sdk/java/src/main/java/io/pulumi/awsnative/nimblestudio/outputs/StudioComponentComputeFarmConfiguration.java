// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StudioComponentComputeFarmConfiguration {
    /**
     * <p>The name of an Active Directory user that is used on ComputeFarm worker instances.</p>
     * 
     */
    private final @Nullable String activeDirectoryUser;
    /**
     * <p>The endpoint of the ComputeFarm that is accessed by the studio component resource.</p>
     * 
     */
    private final @Nullable String endpoint;

    @OutputCustomType.Constructor({"activeDirectoryUser","endpoint"})
    private StudioComponentComputeFarmConfiguration(
        @Nullable String activeDirectoryUser,
        @Nullable String endpoint) {
        this.activeDirectoryUser = activeDirectoryUser;
        this.endpoint = endpoint;
    }

    /**
     * <p>The name of an Active Directory user that is used on ComputeFarm worker instances.</p>
     * 
    */
    public Optional<String> getActiveDirectoryUser() {
        return Optional.ofNullable(this.activeDirectoryUser);
    }
    /**
     * <p>The endpoint of the ComputeFarm that is accessed by the studio component resource.</p>
     * 
    */
    public Optional<String> getEndpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StudioComponentComputeFarmConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String activeDirectoryUser;
        private @Nullable String endpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(StudioComponentComputeFarmConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeDirectoryUser = defaults.activeDirectoryUser;
    	      this.endpoint = defaults.endpoint;
        }

        public Builder setActiveDirectoryUser(@Nullable String activeDirectoryUser) {
            this.activeDirectoryUser = activeDirectoryUser;
            return this;
        }

        public Builder setEndpoint(@Nullable String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public StudioComponentComputeFarmConfiguration build() {
            return new StudioComponentComputeFarmConfiguration(activeDirectoryUser, endpoint);
        }
    }
}
