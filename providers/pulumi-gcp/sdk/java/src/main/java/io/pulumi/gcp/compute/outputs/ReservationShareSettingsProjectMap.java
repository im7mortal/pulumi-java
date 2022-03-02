// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ReservationShareSettingsProjectMap {
    /**
     * The identifier for this object. Format specified above.
     * 
     */
    private final String id;
    /**
     * The project id/number, should be same as the key of this project config in the project map.
     * 
     */
    private final @Nullable String projectId;

    @OutputCustomType.Constructor({"id","projectId"})
    private ReservationShareSettingsProjectMap(
        String id,
        @Nullable String projectId) {
        this.id = Objects.requireNonNull(id);
        this.projectId = projectId;
    }

    /**
     * The identifier for this object. Format specified above.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The project id/number, should be same as the key of this project config in the project map.
     * 
    */
    public Optional<String> getProjectId() {
        return Optional.ofNullable(this.projectId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationShareSettingsProjectMap defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String projectId;

        public Builder() {
    	      // Empty
        }

        public Builder(ReservationShareSettingsProjectMap defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.projectId = defaults.projectId;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setProjectId(@Nullable String projectId) {
            this.projectId = projectId;
            return this;
        }
        public ReservationShareSettingsProjectMap build() {
            return new ReservationShareSettingsProjectMap(id, projectId);
        }
    }
}
