// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.ResourcePolicyGroupPlacementPolicyResponse;
import io.pulumi.googlenative.compute_alpha.outputs.ResourcePolicyInstanceSchedulePolicyResponse;
import io.pulumi.googlenative.compute_alpha.outputs.ResourcePolicyResourceStatusResponse;
import io.pulumi.googlenative.compute_alpha.outputs.ResourcePolicySnapshotSchedulePolicyResponse;
import io.pulumi.googlenative.compute_alpha.outputs.ResourcePolicyVmMaintenancePolicyResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetResourcePolicyResult {
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    private final String description;
    /**
     * Resource policy for instances for placement configuration.
     * 
     */
    private final ResourcePolicyGroupPlacementPolicyResponse groupPlacementPolicy;
    /**
     * Resource policy for scheduling instance operations.
     * 
     */
    private final ResourcePolicyInstanceSchedulePolicyResponse instanceSchedulePolicy;
    /**
     * Type of the resource. Always compute#resource_policies for resource policies.
     * 
     */
    private final String kind;
    /**
     * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    private final String region;
    /**
     * The system status of the resource policy.
     * 
     */
    private final ResourcePolicyResourceStatusResponse resourceStatus;
    /**
     * Server-defined fully-qualified URL for this resource.
     * 
     */
    private final String selfLink;
    /**
     * Server-defined URL for this resource with the resource id.
     * 
     */
    private final String selfLinkWithId;
    /**
     * Resource policy for persistent disks for creating snapshots.
     * 
     */
    private final ResourcePolicySnapshotSchedulePolicyResponse snapshotSchedulePolicy;
    /**
     * The status of resource policy creation.
     * 
     */
    private final String status;
    /**
     * Resource policy applicable to VMs for infrastructure maintenance.
     * 
     */
    private final ResourcePolicyVmMaintenancePolicyResponse vmMaintenancePolicy;

    @OutputCustomType.Constructor({"creationTimestamp","description","groupPlacementPolicy","instanceSchedulePolicy","kind","name","region","resourceStatus","selfLink","selfLinkWithId","snapshotSchedulePolicy","status","vmMaintenancePolicy"})
    private GetResourcePolicyResult(
        String creationTimestamp,
        String description,
        ResourcePolicyGroupPlacementPolicyResponse groupPlacementPolicy,
        ResourcePolicyInstanceSchedulePolicyResponse instanceSchedulePolicy,
        String kind,
        String name,
        String region,
        ResourcePolicyResourceStatusResponse resourceStatus,
        String selfLink,
        String selfLinkWithId,
        ResourcePolicySnapshotSchedulePolicyResponse snapshotSchedulePolicy,
        String status,
        ResourcePolicyVmMaintenancePolicyResponse vmMaintenancePolicy) {
        this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
        this.description = Objects.requireNonNull(description);
        this.groupPlacementPolicy = Objects.requireNonNull(groupPlacementPolicy);
        this.instanceSchedulePolicy = Objects.requireNonNull(instanceSchedulePolicy);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.region = Objects.requireNonNull(region);
        this.resourceStatus = Objects.requireNonNull(resourceStatus);
        this.selfLink = Objects.requireNonNull(selfLink);
        this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
        this.snapshotSchedulePolicy = Objects.requireNonNull(snapshotSchedulePolicy);
        this.status = Objects.requireNonNull(status);
        this.vmMaintenancePolicy = Objects.requireNonNull(vmMaintenancePolicy);
    }

    /**
     * Creation timestamp in RFC3339 text format.
     * 
    */
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    public String getDescription() {
        return this.description;
    }
    /**
     * Resource policy for instances for placement configuration.
     * 
    */
    public ResourcePolicyGroupPlacementPolicyResponse getGroupPlacementPolicy() {
        return this.groupPlacementPolicy;
    }
    /**
     * Resource policy for scheduling instance operations.
     * 
    */
    public ResourcePolicyInstanceSchedulePolicyResponse getInstanceSchedulePolicy() {
        return this.instanceSchedulePolicy;
    }
    /**
     * Type of the resource. Always compute#resource_policies for resource policies.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
    */
    public String getName() {
        return this.name;
    }
    public String getRegion() {
        return this.region;
    }
    /**
     * The system status of the resource policy.
     * 
    */
    public ResourcePolicyResourceStatusResponse getResourceStatus() {
        return this.resourceStatus;
    }
    /**
     * Server-defined fully-qualified URL for this resource.
     * 
    */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * Server-defined URL for this resource with the resource id.
     * 
    */
    public String getSelfLinkWithId() {
        return this.selfLinkWithId;
    }
    /**
     * Resource policy for persistent disks for creating snapshots.
     * 
    */
    public ResourcePolicySnapshotSchedulePolicyResponse getSnapshotSchedulePolicy() {
        return this.snapshotSchedulePolicy;
    }
    /**
     * The status of resource policy creation.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * Resource policy applicable to VMs for infrastructure maintenance.
     * 
    */
    public ResourcePolicyVmMaintenancePolicyResponse getVmMaintenancePolicy() {
        return this.vmMaintenancePolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourcePolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTimestamp;
        private String description;
        private ResourcePolicyGroupPlacementPolicyResponse groupPlacementPolicy;
        private ResourcePolicyInstanceSchedulePolicyResponse instanceSchedulePolicy;
        private String kind;
        private String name;
        private String region;
        private ResourcePolicyResourceStatusResponse resourceStatus;
        private String selfLink;
        private String selfLinkWithId;
        private ResourcePolicySnapshotSchedulePolicyResponse snapshotSchedulePolicy;
        private String status;
        private ResourcePolicyVmMaintenancePolicyResponse vmMaintenancePolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourcePolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.groupPlacementPolicy = defaults.groupPlacementPolicy;
    	      this.instanceSchedulePolicy = defaults.instanceSchedulePolicy;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.region = defaults.region;
    	      this.resourceStatus = defaults.resourceStatus;
    	      this.selfLink = defaults.selfLink;
    	      this.selfLinkWithId = defaults.selfLinkWithId;
    	      this.snapshotSchedulePolicy = defaults.snapshotSchedulePolicy;
    	      this.status = defaults.status;
    	      this.vmMaintenancePolicy = defaults.vmMaintenancePolicy;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setGroupPlacementPolicy(ResourcePolicyGroupPlacementPolicyResponse groupPlacementPolicy) {
            this.groupPlacementPolicy = Objects.requireNonNull(groupPlacementPolicy);
            return this;
        }

        public Builder setInstanceSchedulePolicy(ResourcePolicyInstanceSchedulePolicyResponse instanceSchedulePolicy) {
            this.instanceSchedulePolicy = Objects.requireNonNull(instanceSchedulePolicy);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setResourceStatus(ResourcePolicyResourceStatusResponse resourceStatus) {
            this.resourceStatus = Objects.requireNonNull(resourceStatus);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setSelfLinkWithId(String selfLinkWithId) {
            this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
            return this;
        }

        public Builder setSnapshotSchedulePolicy(ResourcePolicySnapshotSchedulePolicyResponse snapshotSchedulePolicy) {
            this.snapshotSchedulePolicy = Objects.requireNonNull(snapshotSchedulePolicy);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setVmMaintenancePolicy(ResourcePolicyVmMaintenancePolicyResponse vmMaintenancePolicy) {
            this.vmMaintenancePolicy = Objects.requireNonNull(vmMaintenancePolicy);
            return this;
        }
        public GetResourcePolicyResult build() {
            return new GetResourcePolicyResult(creationTimestamp, description, groupPlacementPolicy, instanceSchedulePolicy, kind, name, region, resourceStatus, selfLink, selfLinkWithId, snapshotSchedulePolicy, status, vmMaintenancePolicy);
        }
    }
}
