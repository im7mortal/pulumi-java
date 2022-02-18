// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.outputs;

import io.pulumi.awsnative.groundstation.outputs.MissionProfileDataflowEdge;
import io.pulumi.awsnative.groundstation.outputs.MissionProfileTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetMissionProfileResult {
    private final @Nullable String arn;
    /**
     * Post-pass time needed after the contact.
     * 
     */
    private final @Nullable Integer contactPostPassDurationSeconds;
    /**
     * Pre-pass time needed before the contact.
     * 
     */
    private final @Nullable Integer contactPrePassDurationSeconds;
    private final @Nullable List<MissionProfileDataflowEdge> dataflowEdges;
    private final @Nullable String id;
    /**
     * Visibilities with shorter duration than the specified minimum viable contact duration will be ignored when searching for available contacts.
     * 
     */
    private final @Nullable Integer minimumViableContactDurationSeconds;
    /**
     * A name used to identify a mission profile.
     * 
     */
    private final @Nullable String name;
    private final @Nullable String region;
    private final @Nullable List<MissionProfileTag> tags;
    private final @Nullable String trackingConfigArn;

    @OutputCustomType.Constructor({"arn","contactPostPassDurationSeconds","contactPrePassDurationSeconds","dataflowEdges","id","minimumViableContactDurationSeconds","name","region","tags","trackingConfigArn"})
    private GetMissionProfileResult(
        @Nullable String arn,
        @Nullable Integer contactPostPassDurationSeconds,
        @Nullable Integer contactPrePassDurationSeconds,
        @Nullable List<MissionProfileDataflowEdge> dataflowEdges,
        @Nullable String id,
        @Nullable Integer minimumViableContactDurationSeconds,
        @Nullable String name,
        @Nullable String region,
        @Nullable List<MissionProfileTag> tags,
        @Nullable String trackingConfigArn) {
        this.arn = arn;
        this.contactPostPassDurationSeconds = contactPostPassDurationSeconds;
        this.contactPrePassDurationSeconds = contactPrePassDurationSeconds;
        this.dataflowEdges = dataflowEdges;
        this.id = id;
        this.minimumViableContactDurationSeconds = minimumViableContactDurationSeconds;
        this.name = name;
        this.region = region;
        this.tags = tags;
        this.trackingConfigArn = trackingConfigArn;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * Post-pass time needed after the contact.
     * 
     */
    public Optional<Integer> getContactPostPassDurationSeconds() {
        return Optional.ofNullable(this.contactPostPassDurationSeconds);
    }
    /**
     * Pre-pass time needed before the contact.
     * 
     */
    public Optional<Integer> getContactPrePassDurationSeconds() {
        return Optional.ofNullable(this.contactPrePassDurationSeconds);
    }
    public List<MissionProfileDataflowEdge> getDataflowEdges() {
        return this.dataflowEdges == null ? List.of() : this.dataflowEdges;
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Visibilities with shorter duration than the specified minimum viable contact duration will be ignored when searching for available contacts.
     * 
     */
    public Optional<Integer> getMinimumViableContactDurationSeconds() {
        return Optional.ofNullable(this.minimumViableContactDurationSeconds);
    }
    /**
     * A name used to identify a mission profile.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> getRegion() {
        return Optional.ofNullable(this.region);
    }
    public List<MissionProfileTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    public Optional<String> getTrackingConfigArn() {
        return Optional.ofNullable(this.trackingConfigArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMissionProfileResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable Integer contactPostPassDurationSeconds;
        private @Nullable Integer contactPrePassDurationSeconds;
        private @Nullable List<MissionProfileDataflowEdge> dataflowEdges;
        private @Nullable String id;
        private @Nullable Integer minimumViableContactDurationSeconds;
        private @Nullable String name;
        private @Nullable String region;
        private @Nullable List<MissionProfileTag> tags;
        private @Nullable String trackingConfigArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMissionProfileResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.contactPostPassDurationSeconds = defaults.contactPostPassDurationSeconds;
    	      this.contactPrePassDurationSeconds = defaults.contactPrePassDurationSeconds;
    	      this.dataflowEdges = defaults.dataflowEdges;
    	      this.id = defaults.id;
    	      this.minimumViableContactDurationSeconds = defaults.minimumViableContactDurationSeconds;
    	      this.name = defaults.name;
    	      this.region = defaults.region;
    	      this.tags = defaults.tags;
    	      this.trackingConfigArn = defaults.trackingConfigArn;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setContactPostPassDurationSeconds(@Nullable Integer contactPostPassDurationSeconds) {
            this.contactPostPassDurationSeconds = contactPostPassDurationSeconds;
            return this;
        }

        public Builder setContactPrePassDurationSeconds(@Nullable Integer contactPrePassDurationSeconds) {
            this.contactPrePassDurationSeconds = contactPrePassDurationSeconds;
            return this;
        }

        public Builder setDataflowEdges(@Nullable List<MissionProfileDataflowEdge> dataflowEdges) {
            this.dataflowEdges = dataflowEdges;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setMinimumViableContactDurationSeconds(@Nullable Integer minimumViableContactDurationSeconds) {
            this.minimumViableContactDurationSeconds = minimumViableContactDurationSeconds;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = region;
            return this;
        }

        public Builder setTags(@Nullable List<MissionProfileTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTrackingConfigArn(@Nullable String trackingConfigArn) {
            this.trackingConfigArn = trackingConfigArn;
            return this;
        }

        public GetMissionProfileResult build() {
            return new GetMissionProfileResult(arn, contactPostPassDurationSeconds, contactPrePassDurationSeconds, dataflowEdges, id, minimumViableContactDurationSeconds, name, region, tags, trackingConfigArn);
        }
    }
}
