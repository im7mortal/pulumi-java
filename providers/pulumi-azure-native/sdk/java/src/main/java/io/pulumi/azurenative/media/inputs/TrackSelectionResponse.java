// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.TrackPropertyConditionResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TrackSelectionResponse extends io.pulumi.resources.InvokeArgs {

    public static final TrackSelectionResponse Empty = new TrackSelectionResponse();

    @InputImport(name="trackSelections")
    private final @Nullable List<TrackPropertyConditionResponse> trackSelections;

    public List<TrackPropertyConditionResponse> getTrackSelections() {
        return this.trackSelections == null ? List.of() : this.trackSelections;
    }

    public TrackSelectionResponse(@Nullable List<TrackPropertyConditionResponse> trackSelections) {
        this.trackSelections = trackSelections;
    }

    private TrackSelectionResponse() {
        this.trackSelections = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrackSelectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<TrackPropertyConditionResponse> trackSelections;

        public Builder() {
    	      // Empty
        }

        public Builder(TrackSelectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.trackSelections = defaults.trackSelections;
        }

        public Builder setTrackSelections(@Nullable List<TrackPropertyConditionResponse> trackSelections) {
            this.trackSelections = trackSelections;
            return this;
        }

        public TrackSelectionResponse build() {
            return new TrackSelectionResponse(trackSelections);
        }
    }
}