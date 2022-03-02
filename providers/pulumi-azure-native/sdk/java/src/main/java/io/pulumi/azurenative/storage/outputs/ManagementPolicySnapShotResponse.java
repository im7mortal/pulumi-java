// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.azurenative.storage.outputs.DateAfterCreationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagementPolicySnapShotResponse {
    /**
     * The function to delete the blob snapshot
     * 
     */
    private final @Nullable DateAfterCreationResponse delete;
    /**
     * The function to tier blob snapshot to archive storage. Support blob snapshot currently at Hot or Cool tier
     * 
     */
    private final @Nullable DateAfterCreationResponse tierToArchive;
    /**
     * The function to tier blob snapshot to cool storage. Support blob snapshot currently at Hot tier
     * 
     */
    private final @Nullable DateAfterCreationResponse tierToCool;

    @OutputCustomType.Constructor({"delete","tierToArchive","tierToCool"})
    private ManagementPolicySnapShotResponse(
        @Nullable DateAfterCreationResponse delete,
        @Nullable DateAfterCreationResponse tierToArchive,
        @Nullable DateAfterCreationResponse tierToCool) {
        this.delete = delete;
        this.tierToArchive = tierToArchive;
        this.tierToCool = tierToCool;
    }

    /**
     * The function to delete the blob snapshot
     * 
    */
    public Optional<DateAfterCreationResponse> getDelete() {
        return Optional.ofNullable(this.delete);
    }
    /**
     * The function to tier blob snapshot to archive storage. Support blob snapshot currently at Hot or Cool tier
     * 
    */
    public Optional<DateAfterCreationResponse> getTierToArchive() {
        return Optional.ofNullable(this.tierToArchive);
    }
    /**
     * The function to tier blob snapshot to cool storage. Support blob snapshot currently at Hot tier
     * 
    */
    public Optional<DateAfterCreationResponse> getTierToCool() {
        return Optional.ofNullable(this.tierToCool);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementPolicySnapShotResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DateAfterCreationResponse delete;
        private @Nullable DateAfterCreationResponse tierToArchive;
        private @Nullable DateAfterCreationResponse tierToCool;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementPolicySnapShotResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delete = defaults.delete;
    	      this.tierToArchive = defaults.tierToArchive;
    	      this.tierToCool = defaults.tierToCool;
        }

        public Builder setDelete(@Nullable DateAfterCreationResponse delete) {
            this.delete = delete;
            return this;
        }

        public Builder setTierToArchive(@Nullable DateAfterCreationResponse tierToArchive) {
            this.tierToArchive = tierToArchive;
            return this;
        }

        public Builder setTierToCool(@Nullable DateAfterCreationResponse tierToCool) {
            this.tierToCool = tierToCool;
            return this;
        }
        public ManagementPolicySnapShotResponse build() {
            return new ManagementPolicySnapShotResponse(delete, tierToArchive, tierToCool);
        }
    }
}
