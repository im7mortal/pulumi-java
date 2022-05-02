// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_alpha.outputs.DistributionPolicyResponse;
import com.pulumi.googlenative.compute_alpha.outputs.InstanceGroupManagerActionsSummaryResponse;
import com.pulumi.googlenative.compute_alpha.outputs.InstanceGroupManagerAllInstancesConfigResponse;
import com.pulumi.googlenative.compute_alpha.outputs.InstanceGroupManagerAutoHealingPolicyResponse;
import com.pulumi.googlenative.compute_alpha.outputs.InstanceGroupManagerInstanceLifecyclePolicyResponse;
import com.pulumi.googlenative.compute_alpha.outputs.InstanceGroupManagerStandbyPolicyResponse;
import com.pulumi.googlenative.compute_alpha.outputs.InstanceGroupManagerStatusResponse;
import com.pulumi.googlenative.compute_alpha.outputs.InstanceGroupManagerUpdatePolicyResponse;
import com.pulumi.googlenative.compute_alpha.outputs.InstanceGroupManagerVersionResponse;
import com.pulumi.googlenative.compute_alpha.outputs.NamedPortResponse;
import com.pulumi.googlenative.compute_alpha.outputs.StatefulPolicyResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRegionInstanceGroupManagerResult {
    /**
     * @return Specifies the instances configs overrides that should be applied for all instances in the MIG.
     * 
     */
    private final InstanceGroupManagerAllInstancesConfigResponse allInstancesConfig;
    /**
     * @return The autohealing policy for this managed instance group. You can specify only one value.
     * 
     */
    private final List<InstanceGroupManagerAutoHealingPolicyResponse> autoHealingPolicies;
    /**
     * @return The base instance name to use for instances in this group. The value must be 1-58 characters long. Instances are named by appending a hyphen and a random four-character string to the base instance name. The base instance name must comply with RFC1035.
     * 
     */
    private final String baseInstanceName;
    /**
     * @return The creation timestamp for this managed instance group in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * @return The list of instance actions and the number of instances in this managed instance group that are scheduled for each of those actions.
     * 
     */
    private final InstanceGroupManagerActionsSummaryResponse currentActions;
    /**
     * @return An optional description of this resource.
     * 
     */
    private final String description;
    /**
     * @return Policy specifying the intended distribution of managed instances across zones in a regional managed instance group.
     * 
     */
    private final DistributionPolicyResponse distributionPolicy;
    /**
     * @return The action to perform in case of zone failure. Only one value is supported, NO_FAILOVER. The default is NO_FAILOVER.
     * 
     */
    private final String failoverAction;
    /**
     * @return Fingerprint of this resource. This field may be used in optimistic locking. It will be ignored when inserting an InstanceGroupManager. An up-to-date fingerprint must be provided in order to update the InstanceGroupManager, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve an InstanceGroupManager.
     * 
     */
    private final String fingerprint;
    /**
     * @return The URL of the Instance Group resource.
     * 
     */
    private final String instanceGroup;
    /**
     * @return Instance lifecycle policy for this Instance Group Manager.
     * 
     */
    private final InstanceGroupManagerInstanceLifecyclePolicyResponse instanceLifecyclePolicy;
    /**
     * @return The URL of the instance template that is specified for this managed instance group. The group uses this template to create all new instances in the managed instance group. The templates for existing instances in the group do not change unless you run recreateInstances, run applyUpdatesToInstances, or set the group&#39;s updatePolicy.type to PROACTIVE.
     * 
     */
    private final String instanceTemplate;
    /**
     * @return The resource type, which is always compute#instanceGroupManager for managed instance groups.
     * 
     */
    private final String kind;
    /**
     * @return Pagination behavior of listManagedInstances API method for this Managed Instance Group.
     * 
     */
    private final String listManagedInstancesResults;
    /**
     * @return The name of the managed instance group. The name must be 1-63 characters long, and comply with RFC1035.
     * 
     */
    private final String name;
    /**
     * @return Named ports configured for the Instance Groups complementary to this Instance Group Manager.
     * 
     */
    private final List<NamedPortResponse> namedPorts;
    /**
     * @return The URL of the region where the managed instance group resides (for regional resources).
     * 
     */
    private final String region;
    /**
     * @return The URL for this managed instance group. The server defines this URL.
     * 
     */
    private final String selfLink;
    /**
     * @return Server-defined URL for this resource with the resource id.
     * 
     */
    private final String selfLinkWithId;
    /**
     * @return The service account to be used as credentials for all operations performed by the managed instance group on instances. The service accounts needs all permissions required to create and delete instances. By default, the service account {projectNumber}@cloudservices.gserviceaccount.com is used.
     * 
     */
    private final String serviceAccount;
    /**
     * @return Standby policy for stopped and suspended instances.
     * 
     */
    private final InstanceGroupManagerStandbyPolicyResponse standbyPolicy;
    /**
     * @return Stateful configuration for this Instanced Group Manager
     * 
     */
    private final StatefulPolicyResponse statefulPolicy;
    /**
     * @return The status of this managed instance group.
     * 
     */
    private final InstanceGroupManagerStatusResponse status;
    /**
     * @return The URLs for all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the instances in the managed instance group.
     * 
     */
    private final List<String> targetPools;
    /**
     * @return The target number of running instances for this managed instance group. You can reduce this number by using the instanceGroupManager deleteInstances or abandonInstances methods. Resizing the group also changes this number.
     * 
     */
    private final Integer targetSize;
    /**
     * @return The target number of stopped instances for this managed instance group. This number changes when you: - Stop instance using the stopInstances method or start instances using the startInstances method. - Manually change the targetStoppedSize using the update method.
     * 
     */
    private final Integer targetStoppedSize;
    /**
     * @return The target number of suspended instances for this managed instance group. This number changes when you: - Suspend instance using the suspendInstances method or resume instances using the resumeInstances method. - Manually change the targetSuspendedSize using the update method.
     * 
     */
    private final Integer targetSuspendedSize;
    /**
     * @return The update policy for this managed instance group.
     * 
     */
    private final InstanceGroupManagerUpdatePolicyResponse updatePolicy;
    /**
     * @return Specifies the instance templates used by this managed instance group to create instances. Each version is defined by an instanceTemplate and a name. Every version can appear at most once per instance group. This field overrides the top-level instanceTemplate field. Read more about the relationships between these fields. Exactly one version must leave the targetSize field unset. That version will be applied to all remaining instances. For more information, read about canary updates.
     * 
     */
    private final List<InstanceGroupManagerVersionResponse> versions;
    /**
     * @return The URL of a zone where the managed instance group is located (for zonal resources).
     * 
     */
    private final String zone;

    @CustomType.Constructor
    private GetRegionInstanceGroupManagerResult(
        @CustomType.Parameter("allInstancesConfig") InstanceGroupManagerAllInstancesConfigResponse allInstancesConfig,
        @CustomType.Parameter("autoHealingPolicies") List<InstanceGroupManagerAutoHealingPolicyResponse> autoHealingPolicies,
        @CustomType.Parameter("baseInstanceName") String baseInstanceName,
        @CustomType.Parameter("creationTimestamp") String creationTimestamp,
        @CustomType.Parameter("currentActions") InstanceGroupManagerActionsSummaryResponse currentActions,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("distributionPolicy") DistributionPolicyResponse distributionPolicy,
        @CustomType.Parameter("failoverAction") String failoverAction,
        @CustomType.Parameter("fingerprint") String fingerprint,
        @CustomType.Parameter("instanceGroup") String instanceGroup,
        @CustomType.Parameter("instanceLifecyclePolicy") InstanceGroupManagerInstanceLifecyclePolicyResponse instanceLifecyclePolicy,
        @CustomType.Parameter("instanceTemplate") String instanceTemplate,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("listManagedInstancesResults") String listManagedInstancesResults,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("namedPorts") List<NamedPortResponse> namedPorts,
        @CustomType.Parameter("region") String region,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("selfLinkWithId") String selfLinkWithId,
        @CustomType.Parameter("serviceAccount") String serviceAccount,
        @CustomType.Parameter("standbyPolicy") InstanceGroupManagerStandbyPolicyResponse standbyPolicy,
        @CustomType.Parameter("statefulPolicy") StatefulPolicyResponse statefulPolicy,
        @CustomType.Parameter("status") InstanceGroupManagerStatusResponse status,
        @CustomType.Parameter("targetPools") List<String> targetPools,
        @CustomType.Parameter("targetSize") Integer targetSize,
        @CustomType.Parameter("targetStoppedSize") Integer targetStoppedSize,
        @CustomType.Parameter("targetSuspendedSize") Integer targetSuspendedSize,
        @CustomType.Parameter("updatePolicy") InstanceGroupManagerUpdatePolicyResponse updatePolicy,
        @CustomType.Parameter("versions") List<InstanceGroupManagerVersionResponse> versions,
        @CustomType.Parameter("zone") String zone) {
        this.allInstancesConfig = allInstancesConfig;
        this.autoHealingPolicies = autoHealingPolicies;
        this.baseInstanceName = baseInstanceName;
        this.creationTimestamp = creationTimestamp;
        this.currentActions = currentActions;
        this.description = description;
        this.distributionPolicy = distributionPolicy;
        this.failoverAction = failoverAction;
        this.fingerprint = fingerprint;
        this.instanceGroup = instanceGroup;
        this.instanceLifecyclePolicy = instanceLifecyclePolicy;
        this.instanceTemplate = instanceTemplate;
        this.kind = kind;
        this.listManagedInstancesResults = listManagedInstancesResults;
        this.name = name;
        this.namedPorts = namedPorts;
        this.region = region;
        this.selfLink = selfLink;
        this.selfLinkWithId = selfLinkWithId;
        this.serviceAccount = serviceAccount;
        this.standbyPolicy = standbyPolicy;
        this.statefulPolicy = statefulPolicy;
        this.status = status;
        this.targetPools = targetPools;
        this.targetSize = targetSize;
        this.targetStoppedSize = targetStoppedSize;
        this.targetSuspendedSize = targetSuspendedSize;
        this.updatePolicy = updatePolicy;
        this.versions = versions;
        this.zone = zone;
    }

    /**
     * @return Specifies the instances configs overrides that should be applied for all instances in the MIG.
     * 
     */
    public InstanceGroupManagerAllInstancesConfigResponse allInstancesConfig() {
        return this.allInstancesConfig;
    }
    /**
     * @return The autohealing policy for this managed instance group. You can specify only one value.
     * 
     */
    public List<InstanceGroupManagerAutoHealingPolicyResponse> autoHealingPolicies() {
        return this.autoHealingPolicies;
    }
    /**
     * @return The base instance name to use for instances in this group. The value must be 1-58 characters long. Instances are named by appending a hyphen and a random four-character string to the base instance name. The base instance name must comply with RFC1035.
     * 
     */
    public String baseInstanceName() {
        return this.baseInstanceName;
    }
    /**
     * @return The creation timestamp for this managed instance group in RFC3339 text format.
     * 
     */
    public String creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * @return The list of instance actions and the number of instances in this managed instance group that are scheduled for each of those actions.
     * 
     */
    public InstanceGroupManagerActionsSummaryResponse currentActions() {
        return this.currentActions;
    }
    /**
     * @return An optional description of this resource.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Policy specifying the intended distribution of managed instances across zones in a regional managed instance group.
     * 
     */
    public DistributionPolicyResponse distributionPolicy() {
        return this.distributionPolicy;
    }
    /**
     * @return The action to perform in case of zone failure. Only one value is supported, NO_FAILOVER. The default is NO_FAILOVER.
     * 
     */
    public String failoverAction() {
        return this.failoverAction;
    }
    /**
     * @return Fingerprint of this resource. This field may be used in optimistic locking. It will be ignored when inserting an InstanceGroupManager. An up-to-date fingerprint must be provided in order to update the InstanceGroupManager, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve an InstanceGroupManager.
     * 
     */
    public String fingerprint() {
        return this.fingerprint;
    }
    /**
     * @return The URL of the Instance Group resource.
     * 
     */
    public String instanceGroup() {
        return this.instanceGroup;
    }
    /**
     * @return Instance lifecycle policy for this Instance Group Manager.
     * 
     */
    public InstanceGroupManagerInstanceLifecyclePolicyResponse instanceLifecyclePolicy() {
        return this.instanceLifecyclePolicy;
    }
    /**
     * @return The URL of the instance template that is specified for this managed instance group. The group uses this template to create all new instances in the managed instance group. The templates for existing instances in the group do not change unless you run recreateInstances, run applyUpdatesToInstances, or set the group&#39;s updatePolicy.type to PROACTIVE.
     * 
     */
    public String instanceTemplate() {
        return this.instanceTemplate;
    }
    /**
     * @return The resource type, which is always compute#instanceGroupManager for managed instance groups.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return Pagination behavior of listManagedInstances API method for this Managed Instance Group.
     * 
     */
    public String listManagedInstancesResults() {
        return this.listManagedInstancesResults;
    }
    /**
     * @return The name of the managed instance group. The name must be 1-63 characters long, and comply with RFC1035.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Named ports configured for the Instance Groups complementary to this Instance Group Manager.
     * 
     */
    public List<NamedPortResponse> namedPorts() {
        return this.namedPorts;
    }
    /**
     * @return The URL of the region where the managed instance group resides (for regional resources).
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return The URL for this managed instance group. The server defines this URL.
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * @return Server-defined URL for this resource with the resource id.
     * 
     */
    public String selfLinkWithId() {
        return this.selfLinkWithId;
    }
    /**
     * @return The service account to be used as credentials for all operations performed by the managed instance group on instances. The service accounts needs all permissions required to create and delete instances. By default, the service account {projectNumber}@cloudservices.gserviceaccount.com is used.
     * 
     */
    public String serviceAccount() {
        return this.serviceAccount;
    }
    /**
     * @return Standby policy for stopped and suspended instances.
     * 
     */
    public InstanceGroupManagerStandbyPolicyResponse standbyPolicy() {
        return this.standbyPolicy;
    }
    /**
     * @return Stateful configuration for this Instanced Group Manager
     * 
     */
    public StatefulPolicyResponse statefulPolicy() {
        return this.statefulPolicy;
    }
    /**
     * @return The status of this managed instance group.
     * 
     */
    public InstanceGroupManagerStatusResponse status() {
        return this.status;
    }
    /**
     * @return The URLs for all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the instances in the managed instance group.
     * 
     */
    public List<String> targetPools() {
        return this.targetPools;
    }
    /**
     * @return The target number of running instances for this managed instance group. You can reduce this number by using the instanceGroupManager deleteInstances or abandonInstances methods. Resizing the group also changes this number.
     * 
     */
    public Integer targetSize() {
        return this.targetSize;
    }
    /**
     * @return The target number of stopped instances for this managed instance group. This number changes when you: - Stop instance using the stopInstances method or start instances using the startInstances method. - Manually change the targetStoppedSize using the update method.
     * 
     */
    public Integer targetStoppedSize() {
        return this.targetStoppedSize;
    }
    /**
     * @return The target number of suspended instances for this managed instance group. This number changes when you: - Suspend instance using the suspendInstances method or resume instances using the resumeInstances method. - Manually change the targetSuspendedSize using the update method.
     * 
     */
    public Integer targetSuspendedSize() {
        return this.targetSuspendedSize;
    }
    /**
     * @return The update policy for this managed instance group.
     * 
     */
    public InstanceGroupManagerUpdatePolicyResponse updatePolicy() {
        return this.updatePolicy;
    }
    /**
     * @return Specifies the instance templates used by this managed instance group to create instances. Each version is defined by an instanceTemplate and a name. Every version can appear at most once per instance group. This field overrides the top-level instanceTemplate field. Read more about the relationships between these fields. Exactly one version must leave the targetSize field unset. That version will be applied to all remaining instances. For more information, read about canary updates.
     * 
     */
    public List<InstanceGroupManagerVersionResponse> versions() {
        return this.versions;
    }
    /**
     * @return The URL of a zone where the managed instance group is located (for zonal resources).
     * 
     */
    public String zone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionInstanceGroupManagerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceGroupManagerAllInstancesConfigResponse allInstancesConfig;
        private List<InstanceGroupManagerAutoHealingPolicyResponse> autoHealingPolicies;
        private String baseInstanceName;
        private String creationTimestamp;
        private InstanceGroupManagerActionsSummaryResponse currentActions;
        private String description;
        private DistributionPolicyResponse distributionPolicy;
        private String failoverAction;
        private String fingerprint;
        private String instanceGroup;
        private InstanceGroupManagerInstanceLifecyclePolicyResponse instanceLifecyclePolicy;
        private String instanceTemplate;
        private String kind;
        private String listManagedInstancesResults;
        private String name;
        private List<NamedPortResponse> namedPorts;
        private String region;
        private String selfLink;
        private String selfLinkWithId;
        private String serviceAccount;
        private InstanceGroupManagerStandbyPolicyResponse standbyPolicy;
        private StatefulPolicyResponse statefulPolicy;
        private InstanceGroupManagerStatusResponse status;
        private List<String> targetPools;
        private Integer targetSize;
        private Integer targetStoppedSize;
        private Integer targetSuspendedSize;
        private InstanceGroupManagerUpdatePolicyResponse updatePolicy;
        private List<InstanceGroupManagerVersionResponse> versions;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegionInstanceGroupManagerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allInstancesConfig = defaults.allInstancesConfig;
    	      this.autoHealingPolicies = defaults.autoHealingPolicies;
    	      this.baseInstanceName = defaults.baseInstanceName;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.currentActions = defaults.currentActions;
    	      this.description = defaults.description;
    	      this.distributionPolicy = defaults.distributionPolicy;
    	      this.failoverAction = defaults.failoverAction;
    	      this.fingerprint = defaults.fingerprint;
    	      this.instanceGroup = defaults.instanceGroup;
    	      this.instanceLifecyclePolicy = defaults.instanceLifecyclePolicy;
    	      this.instanceTemplate = defaults.instanceTemplate;
    	      this.kind = defaults.kind;
    	      this.listManagedInstancesResults = defaults.listManagedInstancesResults;
    	      this.name = defaults.name;
    	      this.namedPorts = defaults.namedPorts;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.selfLinkWithId = defaults.selfLinkWithId;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.standbyPolicy = defaults.standbyPolicy;
    	      this.statefulPolicy = defaults.statefulPolicy;
    	      this.status = defaults.status;
    	      this.targetPools = defaults.targetPools;
    	      this.targetSize = defaults.targetSize;
    	      this.targetStoppedSize = defaults.targetStoppedSize;
    	      this.targetSuspendedSize = defaults.targetSuspendedSize;
    	      this.updatePolicy = defaults.updatePolicy;
    	      this.versions = defaults.versions;
    	      this.zone = defaults.zone;
        }

        public Builder allInstancesConfig(InstanceGroupManagerAllInstancesConfigResponse allInstancesConfig) {
            this.allInstancesConfig = Objects.requireNonNull(allInstancesConfig);
            return this;
        }
        public Builder autoHealingPolicies(List<InstanceGroupManagerAutoHealingPolicyResponse> autoHealingPolicies) {
            this.autoHealingPolicies = Objects.requireNonNull(autoHealingPolicies);
            return this;
        }
        public Builder autoHealingPolicies(InstanceGroupManagerAutoHealingPolicyResponse... autoHealingPolicies) {
            return autoHealingPolicies(List.of(autoHealingPolicies));
        }
        public Builder baseInstanceName(String baseInstanceName) {
            this.baseInstanceName = Objects.requireNonNull(baseInstanceName);
            return this;
        }
        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        public Builder currentActions(InstanceGroupManagerActionsSummaryResponse currentActions) {
            this.currentActions = Objects.requireNonNull(currentActions);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder distributionPolicy(DistributionPolicyResponse distributionPolicy) {
            this.distributionPolicy = Objects.requireNonNull(distributionPolicy);
            return this;
        }
        public Builder failoverAction(String failoverAction) {
            this.failoverAction = Objects.requireNonNull(failoverAction);
            return this;
        }
        public Builder fingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }
        public Builder instanceGroup(String instanceGroup) {
            this.instanceGroup = Objects.requireNonNull(instanceGroup);
            return this;
        }
        public Builder instanceLifecyclePolicy(InstanceGroupManagerInstanceLifecyclePolicyResponse instanceLifecyclePolicy) {
            this.instanceLifecyclePolicy = Objects.requireNonNull(instanceLifecyclePolicy);
            return this;
        }
        public Builder instanceTemplate(String instanceTemplate) {
            this.instanceTemplate = Objects.requireNonNull(instanceTemplate);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder listManagedInstancesResults(String listManagedInstancesResults) {
            this.listManagedInstancesResults = Objects.requireNonNull(listManagedInstancesResults);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder namedPorts(List<NamedPortResponse> namedPorts) {
            this.namedPorts = Objects.requireNonNull(namedPorts);
            return this;
        }
        public Builder namedPorts(NamedPortResponse... namedPorts) {
            return namedPorts(List.of(namedPorts));
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder selfLinkWithId(String selfLinkWithId) {
            this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
            return this;
        }
        public Builder serviceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }
        public Builder standbyPolicy(InstanceGroupManagerStandbyPolicyResponse standbyPolicy) {
            this.standbyPolicy = Objects.requireNonNull(standbyPolicy);
            return this;
        }
        public Builder statefulPolicy(StatefulPolicyResponse statefulPolicy) {
            this.statefulPolicy = Objects.requireNonNull(statefulPolicy);
            return this;
        }
        public Builder status(InstanceGroupManagerStatusResponse status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder targetPools(List<String> targetPools) {
            this.targetPools = Objects.requireNonNull(targetPools);
            return this;
        }
        public Builder targetPools(String... targetPools) {
            return targetPools(List.of(targetPools));
        }
        public Builder targetSize(Integer targetSize) {
            this.targetSize = Objects.requireNonNull(targetSize);
            return this;
        }
        public Builder targetStoppedSize(Integer targetStoppedSize) {
            this.targetStoppedSize = Objects.requireNonNull(targetStoppedSize);
            return this;
        }
        public Builder targetSuspendedSize(Integer targetSuspendedSize) {
            this.targetSuspendedSize = Objects.requireNonNull(targetSuspendedSize);
            return this;
        }
        public Builder updatePolicy(InstanceGroupManagerUpdatePolicyResponse updatePolicy) {
            this.updatePolicy = Objects.requireNonNull(updatePolicy);
            return this;
        }
        public Builder versions(List<InstanceGroupManagerVersionResponse> versions) {
            this.versions = Objects.requireNonNull(versions);
            return this;
        }
        public Builder versions(InstanceGroupManagerVersionResponse... versions) {
            return versions(List.of(versions));
        }
        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }        public GetRegionInstanceGroupManagerResult build() {
            return new GetRegionInstanceGroupManagerResult(allInstancesConfig, autoHealingPolicies, baseInstanceName, creationTimestamp, currentActions, description, distributionPolicy, failoverAction, fingerprint, instanceGroup, instanceLifecyclePolicy, instanceTemplate, kind, listManagedInstancesResults, name, namedPorts, region, selfLink, selfLinkWithId, serviceAccount, standbyPolicy, statefulPolicy, status, targetPools, targetSize, targetStoppedSize, targetSuspendedSize, updatePolicy, versions, zone);
        }
    }
}
