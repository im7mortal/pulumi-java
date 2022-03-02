// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.FilterTrackSelectionResponse;
import io.pulumi.azurenative.media.outputs.FirstQualityResponse;
import io.pulumi.azurenative.media.outputs.PresentationTimeRangeResponse;
import io.pulumi.azurenative.media.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAssetFilterResult {
    /**
     * The first quality.
     * 
     */
    private final @Nullable FirstQualityResponse firstQuality;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The presentation time range.
     * 
     */
    private final @Nullable PresentationTimeRangeResponse presentationTimeRange;
    /**
     * The system metadata relating to this resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The tracks selection conditions.
     * 
     */
    private final @Nullable List<FilterTrackSelectionResponse> tracks;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"firstQuality","id","name","presentationTimeRange","systemData","tracks","type"})
    private GetAssetFilterResult(
        @Nullable FirstQualityResponse firstQuality,
        String id,
        String name,
        @Nullable PresentationTimeRangeResponse presentationTimeRange,
        SystemDataResponse systemData,
        @Nullable List<FilterTrackSelectionResponse> tracks,
        String type) {
        this.firstQuality = firstQuality;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.presentationTimeRange = presentationTimeRange;
        this.systemData = Objects.requireNonNull(systemData);
        this.tracks = tracks;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The first quality.
     * 
    */
    public Optional<FirstQualityResponse> getFirstQuality() {
        return Optional.ofNullable(this.firstQuality);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The presentation time range.
     * 
    */
    public Optional<PresentationTimeRangeResponse> getPresentationTimeRange() {
        return Optional.ofNullable(this.presentationTimeRange);
    }
    /**
     * The system metadata relating to this resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The tracks selection conditions.
     * 
    */
    public List<FilterTrackSelectionResponse> getTracks() {
        return this.tracks == null ? List.of() : this.tracks;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAssetFilterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FirstQualityResponse firstQuality;
        private String id;
        private String name;
        private @Nullable PresentationTimeRangeResponse presentationTimeRange;
        private SystemDataResponse systemData;
        private @Nullable List<FilterTrackSelectionResponse> tracks;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAssetFilterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.firstQuality = defaults.firstQuality;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.presentationTimeRange = defaults.presentationTimeRange;
    	      this.systemData = defaults.systemData;
    	      this.tracks = defaults.tracks;
    	      this.type = defaults.type;
        }

        public Builder setFirstQuality(@Nullable FirstQualityResponse firstQuality) {
            this.firstQuality = firstQuality;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPresentationTimeRange(@Nullable PresentationTimeRangeResponse presentationTimeRange) {
            this.presentationTimeRange = presentationTimeRange;
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTracks(@Nullable List<FilterTrackSelectionResponse> tracks) {
            this.tracks = tracks;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetAssetFilterResult build() {
            return new GetAssetFilterResult(firstQuality, id, name, presentationTimeRange, systemData, tracks, type);
        }
    }
}
