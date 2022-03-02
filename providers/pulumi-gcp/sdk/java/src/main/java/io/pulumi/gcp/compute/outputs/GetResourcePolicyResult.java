// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.GetResourcePolicyGroupPlacementPolicy;
import io.pulumi.gcp.compute.outputs.GetResourcePolicyInstanceSchedulePolicy;
import io.pulumi.gcp.compute.outputs.GetResourcePolicySnapshotSchedulePolicy;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetResourcePolicyResult {
    /**
     * Description of this Resource Policy.
     * 
     */
    private final String description;
    private final List<GetResourcePolicyGroupPlacementPolicy> groupPlacementPolicies;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<GetResourcePolicyInstanceSchedulePolicy> instanceSchedulePolicies;
    private final String name;
    private final @Nullable String project;
    private final @Nullable String region;
    /**
     * The URI of the resource.
     * 
     */
    private final String selfLink;
    private final List<GetResourcePolicySnapshotSchedulePolicy> snapshotSchedulePolicies;

    @OutputCustomType.Constructor({"description","groupPlacementPolicies","id","instanceSchedulePolicies","name","project","region","selfLink","snapshotSchedulePolicies"})
    private GetResourcePolicyResult(
        String description,
        List<GetResourcePolicyGroupPlacementPolicy> groupPlacementPolicies,
        String id,
        List<GetResourcePolicyInstanceSchedulePolicy> instanceSchedulePolicies,
        String name,
        @Nullable String project,
        @Nullable String region,
        String selfLink,
        List<GetResourcePolicySnapshotSchedulePolicy> snapshotSchedulePolicies) {
        this.description = Objects.requireNonNull(description);
        this.groupPlacementPolicies = Objects.requireNonNull(groupPlacementPolicies);
        this.id = Objects.requireNonNull(id);
        this.instanceSchedulePolicies = Objects.requireNonNull(instanceSchedulePolicies);
        this.name = Objects.requireNonNull(name);
        this.project = project;
        this.region = region;
        this.selfLink = Objects.requireNonNull(selfLink);
        this.snapshotSchedulePolicies = Objects.requireNonNull(snapshotSchedulePolicies);
    }

    /**
     * Description of this Resource Policy.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    public List<GetResourcePolicyGroupPlacementPolicy> getGroupPlacementPolicies() {
        return this.groupPlacementPolicies;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public List<GetResourcePolicyInstanceSchedulePolicy> getInstanceSchedulePolicies() {
        return this.instanceSchedulePolicies;
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getProject() {
        return Optional.ofNullable(this.project);
    }
    public Optional<String> getRegion() {
        return Optional.ofNullable(this.region);
    }
    /**
     * The URI of the resource.
     * 
    */
    public String getSelfLink() {
        return this.selfLink;
    }
    public List<GetResourcePolicySnapshotSchedulePolicy> getSnapshotSchedulePolicies() {
        return this.snapshotSchedulePolicies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourcePolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private List<GetResourcePolicyGroupPlacementPolicy> groupPlacementPolicies;
        private String id;
        private List<GetResourcePolicyInstanceSchedulePolicy> instanceSchedulePolicies;
        private String name;
        private @Nullable String project;
        private @Nullable String region;
        private String selfLink;
        private List<GetResourcePolicySnapshotSchedulePolicy> snapshotSchedulePolicies;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourcePolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.groupPlacementPolicies = defaults.groupPlacementPolicies;
    	      this.id = defaults.id;
    	      this.instanceSchedulePolicies = defaults.instanceSchedulePolicies;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.snapshotSchedulePolicies = defaults.snapshotSchedulePolicies;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setGroupPlacementPolicies(List<GetResourcePolicyGroupPlacementPolicy> groupPlacementPolicies) {
            this.groupPlacementPolicies = Objects.requireNonNull(groupPlacementPolicies);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInstanceSchedulePolicies(List<GetResourcePolicyInstanceSchedulePolicy> instanceSchedulePolicies) {
            this.instanceSchedulePolicies = Objects.requireNonNull(instanceSchedulePolicies);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = region;
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setSnapshotSchedulePolicies(List<GetResourcePolicySnapshotSchedulePolicy> snapshotSchedulePolicies) {
            this.snapshotSchedulePolicies = Objects.requireNonNull(snapshotSchedulePolicies);
            return this;
        }
        public GetResourcePolicyResult build() {
            return new GetResourcePolicyResult(description, groupPlacementPolicies, id, instanceSchedulePolicies, name, project, region, selfLink, snapshotSchedulePolicies);
        }
    }
}
