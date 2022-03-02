// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.TargetRegionResponse;
import io.pulumi.azurenative.compute.outputs.UserArtifactManageResponse;
import io.pulumi.azurenative.compute.outputs.UserArtifactSourceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GalleryApplicationVersionPublishingProfileResponse {
    /**
     * Optional. Whether or not this application reports health.
     * 
     */
    private final @Nullable Boolean enableHealthCheck;
    /**
     * The end of life date of the gallery image version. This property can be used for decommissioning purposes. This property is updatable.
     * 
     */
    private final @Nullable String endOfLifeDate;
    /**
     * If set to true, Virtual Machines deployed from the latest version of the Image Definition won't use this Image Version.
     * 
     */
    private final @Nullable Boolean excludeFromLatest;
    private final @Nullable UserArtifactManageResponse manageActions;
    /**
     * The timestamp for when the gallery image version is published.
     * 
     */
    private final String publishedDate;
    /**
     * The number of replicas of the Image Version to be created per region. This property would take effect for a region when regionalReplicaCount is not specified. This property is updatable.
     * 
     */
    private final @Nullable Integer replicaCount;
    /**
     * The source image from which the Image Version is going to be created.
     * 
     */
    private final UserArtifactSourceResponse source;
    /**
     * Specifies the storage account type to be used to store the image. This property is not updatable.
     * 
     */
    private final @Nullable String storageAccountType;
    /**
     * The target regions where the Image Version is going to be replicated to. This property is updatable.
     * 
     */
    private final @Nullable List<TargetRegionResponse> targetRegions;

    @OutputCustomType.Constructor({"enableHealthCheck","endOfLifeDate","excludeFromLatest","manageActions","publishedDate","replicaCount","source","storageAccountType","targetRegions"})
    private GalleryApplicationVersionPublishingProfileResponse(
        @Nullable Boolean enableHealthCheck,
        @Nullable String endOfLifeDate,
        @Nullable Boolean excludeFromLatest,
        @Nullable UserArtifactManageResponse manageActions,
        String publishedDate,
        @Nullable Integer replicaCount,
        UserArtifactSourceResponse source,
        @Nullable String storageAccountType,
        @Nullable List<TargetRegionResponse> targetRegions) {
        this.enableHealthCheck = enableHealthCheck;
        this.endOfLifeDate = endOfLifeDate;
        this.excludeFromLatest = excludeFromLatest;
        this.manageActions = manageActions;
        this.publishedDate = Objects.requireNonNull(publishedDate);
        this.replicaCount = replicaCount;
        this.source = Objects.requireNonNull(source);
        this.storageAccountType = storageAccountType;
        this.targetRegions = targetRegions;
    }

    /**
     * Optional. Whether or not this application reports health.
     * 
    */
    public Optional<Boolean> getEnableHealthCheck() {
        return Optional.ofNullable(this.enableHealthCheck);
    }
    /**
     * The end of life date of the gallery image version. This property can be used for decommissioning purposes. This property is updatable.
     * 
    */
    public Optional<String> getEndOfLifeDate() {
        return Optional.ofNullable(this.endOfLifeDate);
    }
    /**
     * If set to true, Virtual Machines deployed from the latest version of the Image Definition won't use this Image Version.
     * 
    */
    public Optional<Boolean> getExcludeFromLatest() {
        return Optional.ofNullable(this.excludeFromLatest);
    }
    public Optional<UserArtifactManageResponse> getManageActions() {
        return Optional.ofNullable(this.manageActions);
    }
    /**
     * The timestamp for when the gallery image version is published.
     * 
    */
    public String getPublishedDate() {
        return this.publishedDate;
    }
    /**
     * The number of replicas of the Image Version to be created per region. This property would take effect for a region when regionalReplicaCount is not specified. This property is updatable.
     * 
    */
    public Optional<Integer> getReplicaCount() {
        return Optional.ofNullable(this.replicaCount);
    }
    /**
     * The source image from which the Image Version is going to be created.
     * 
    */
    public UserArtifactSourceResponse getSource() {
        return this.source;
    }
    /**
     * Specifies the storage account type to be used to store the image. This property is not updatable.
     * 
    */
    public Optional<String> getStorageAccountType() {
        return Optional.ofNullable(this.storageAccountType);
    }
    /**
     * The target regions where the Image Version is going to be replicated to. This property is updatable.
     * 
    */
    public List<TargetRegionResponse> getTargetRegions() {
        return this.targetRegions == null ? List.of() : this.targetRegions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GalleryApplicationVersionPublishingProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableHealthCheck;
        private @Nullable String endOfLifeDate;
        private @Nullable Boolean excludeFromLatest;
        private @Nullable UserArtifactManageResponse manageActions;
        private String publishedDate;
        private @Nullable Integer replicaCount;
        private UserArtifactSourceResponse source;
        private @Nullable String storageAccountType;
        private @Nullable List<TargetRegionResponse> targetRegions;

        public Builder() {
    	      // Empty
        }

        public Builder(GalleryApplicationVersionPublishingProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableHealthCheck = defaults.enableHealthCheck;
    	      this.endOfLifeDate = defaults.endOfLifeDate;
    	      this.excludeFromLatest = defaults.excludeFromLatest;
    	      this.manageActions = defaults.manageActions;
    	      this.publishedDate = defaults.publishedDate;
    	      this.replicaCount = defaults.replicaCount;
    	      this.source = defaults.source;
    	      this.storageAccountType = defaults.storageAccountType;
    	      this.targetRegions = defaults.targetRegions;
        }

        public Builder setEnableHealthCheck(@Nullable Boolean enableHealthCheck) {
            this.enableHealthCheck = enableHealthCheck;
            return this;
        }

        public Builder setEndOfLifeDate(@Nullable String endOfLifeDate) {
            this.endOfLifeDate = endOfLifeDate;
            return this;
        }

        public Builder setExcludeFromLatest(@Nullable Boolean excludeFromLatest) {
            this.excludeFromLatest = excludeFromLatest;
            return this;
        }

        public Builder setManageActions(@Nullable UserArtifactManageResponse manageActions) {
            this.manageActions = manageActions;
            return this;
        }

        public Builder setPublishedDate(String publishedDate) {
            this.publishedDate = Objects.requireNonNull(publishedDate);
            return this;
        }

        public Builder setReplicaCount(@Nullable Integer replicaCount) {
            this.replicaCount = replicaCount;
            return this;
        }

        public Builder setSource(UserArtifactSourceResponse source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder setStorageAccountType(@Nullable String storageAccountType) {
            this.storageAccountType = storageAccountType;
            return this;
        }

        public Builder setTargetRegions(@Nullable List<TargetRegionResponse> targetRegions) {
            this.targetRegions = targetRegions;
            return this;
        }
        public GalleryApplicationVersionPublishingProfileResponse build() {
            return new GalleryApplicationVersionPublishingProfileResponse(enableHealthCheck, endOfLifeDate, excludeFromLatest, manageActions, publishedDate, replicaCount, source, storageAccountType, targetRegions);
        }
    }
}
