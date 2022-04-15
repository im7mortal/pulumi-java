// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.kubernetes.apps_v1beta1.outputs.StatefulSetUpdateStrategy;
import io.pulumi.kubernetes.core_v1.outputs.PersistentVolumeClaim;
import io.pulumi.kubernetes.core_v1.outputs.PodTemplateSpec;
import io.pulumi.kubernetes.meta_v1.outputs.LabelSelector;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StatefulSetSpec {
    /**
     * podManagementPolicy controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling down. The default policy is `OrderedReady`, where pods are created in increasing order (pod-0, then pod-1, etc) and the controller will wait until each pod is ready before continuing. When scaling down, the pods are removed in the opposite order. The alternative policy is `Parallel` which will create pods in parallel to match the desired scale without waiting, and on scale down will delete all pods at once.
     * 
     */
    private final @Nullable String podManagementPolicy;
    /**
     * replicas is the desired number of replicas of the given Template. These are replicas in the sense that they are instantiations of the same Template, but individual replicas also have a consistent identity. If unspecified, defaults to 1.
     * 
     */
    private final @Nullable Integer replicas;
    /**
     * revisionHistoryLimit is the maximum number of revisions that will be maintained in the StatefulSet's revision history. The revision history consists of all revisions not represented by a currently applied StatefulSetSpec version. The default value is 10.
     * 
     */
    private final @Nullable Integer revisionHistoryLimit;
    /**
     * selector is a label query over pods that should match the replica count. If empty, defaulted to labels on the pod template. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     * 
     */
    private final @Nullable LabelSelector selector;
    /**
     * serviceName is the name of the service that governs this StatefulSet. This service must exist before the StatefulSet, and is responsible for the network identity of the set. Pods get DNS/hostnames that follow the pattern: pod-specific-string.serviceName.default.svc.cluster.local where "pod-specific-string" is managed by the StatefulSet controller.
     * 
     */
    private final String serviceName;
    /**
     * template is the object that describes the pod that will be created if insufficient replicas are detected. Each pod stamped out by the StatefulSet will fulfill this Template, but have a unique identity from the rest of the StatefulSet.
     * 
     */
    private final PodTemplateSpec template;
    /**
     * updateStrategy indicates the StatefulSetUpdateStrategy that will be employed to update Pods in the StatefulSet when a revision is made to Template.
     * 
     */
    private final @Nullable StatefulSetUpdateStrategy updateStrategy;
    /**
     * volumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence over any volumes in the template, with the same name.
     * 
     */
    private final @Nullable List<PersistentVolumeClaim> volumeClaimTemplates;

    @CustomType.Constructor
    private StatefulSetSpec(
        @CustomType.Parameter("podManagementPolicy") @Nullable String podManagementPolicy,
        @CustomType.Parameter("replicas") @Nullable Integer replicas,
        @CustomType.Parameter("revisionHistoryLimit") @Nullable Integer revisionHistoryLimit,
        @CustomType.Parameter("selector") @Nullable LabelSelector selector,
        @CustomType.Parameter("serviceName") String serviceName,
        @CustomType.Parameter("template") PodTemplateSpec template,
        @CustomType.Parameter("updateStrategy") @Nullable StatefulSetUpdateStrategy updateStrategy,
        @CustomType.Parameter("volumeClaimTemplates") @Nullable List<PersistentVolumeClaim> volumeClaimTemplates) {
        this.podManagementPolicy = podManagementPolicy;
        this.replicas = replicas;
        this.revisionHistoryLimit = revisionHistoryLimit;
        this.selector = selector;
        this.serviceName = serviceName;
        this.template = template;
        this.updateStrategy = updateStrategy;
        this.volumeClaimTemplates = volumeClaimTemplates;
    }

    /**
     * podManagementPolicy controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling down. The default policy is `OrderedReady`, where pods are created in increasing order (pod-0, then pod-1, etc) and the controller will wait until each pod is ready before continuing. When scaling down, the pods are removed in the opposite order. The alternative policy is `Parallel` which will create pods in parallel to match the desired scale without waiting, and on scale down will delete all pods at once.
     * 
    */
    public Optional<String> podManagementPolicy() {
        return Optional.ofNullable(this.podManagementPolicy);
    }
    /**
     * replicas is the desired number of replicas of the given Template. These are replicas in the sense that they are instantiations of the same Template, but individual replicas also have a consistent identity. If unspecified, defaults to 1.
     * 
    */
    public Optional<Integer> replicas() {
        return Optional.ofNullable(this.replicas);
    }
    /**
     * revisionHistoryLimit is the maximum number of revisions that will be maintained in the StatefulSet's revision history. The revision history consists of all revisions not represented by a currently applied StatefulSetSpec version. The default value is 10.
     * 
    */
    public Optional<Integer> revisionHistoryLimit() {
        return Optional.ofNullable(this.revisionHistoryLimit);
    }
    /**
     * selector is a label query over pods that should match the replica count. If empty, defaulted to labels on the pod template. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     * 
    */
    public Optional<LabelSelector> selector() {
        return Optional.ofNullable(this.selector);
    }
    /**
     * serviceName is the name of the service that governs this StatefulSet. This service must exist before the StatefulSet, and is responsible for the network identity of the set. Pods get DNS/hostnames that follow the pattern: pod-specific-string.serviceName.default.svc.cluster.local where "pod-specific-string" is managed by the StatefulSet controller.
     * 
    */
    public String serviceName() {
        return this.serviceName;
    }
    /**
     * template is the object that describes the pod that will be created if insufficient replicas are detected. Each pod stamped out by the StatefulSet will fulfill this Template, but have a unique identity from the rest of the StatefulSet.
     * 
    */
    public PodTemplateSpec template() {
        return this.template;
    }
    /**
     * updateStrategy indicates the StatefulSetUpdateStrategy that will be employed to update Pods in the StatefulSet when a revision is made to Template.
     * 
    */
    public Optional<StatefulSetUpdateStrategy> updateStrategy() {
        return Optional.ofNullable(this.updateStrategy);
    }
    /**
     * volumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence over any volumes in the template, with the same name.
     * 
    */
    public List<PersistentVolumeClaim> volumeClaimTemplates() {
        return this.volumeClaimTemplates == null ? List.of() : this.volumeClaimTemplates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulSetSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String podManagementPolicy;
        private @Nullable Integer replicas;
        private @Nullable Integer revisionHistoryLimit;
        private @Nullable LabelSelector selector;
        private String serviceName;
        private PodTemplateSpec template;
        private @Nullable StatefulSetUpdateStrategy updateStrategy;
        private @Nullable List<PersistentVolumeClaim> volumeClaimTemplates;

        public Builder() {
    	      // Empty
        }

        public Builder(StatefulSetSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.podManagementPolicy = defaults.podManagementPolicy;
    	      this.replicas = defaults.replicas;
    	      this.revisionHistoryLimit = defaults.revisionHistoryLimit;
    	      this.selector = defaults.selector;
    	      this.serviceName = defaults.serviceName;
    	      this.template = defaults.template;
    	      this.updateStrategy = defaults.updateStrategy;
    	      this.volumeClaimTemplates = defaults.volumeClaimTemplates;
        }

        public Builder podManagementPolicy(@Nullable String podManagementPolicy) {
            this.podManagementPolicy = podManagementPolicy;
            return this;
        }
        public Builder replicas(@Nullable Integer replicas) {
            this.replicas = replicas;
            return this;
        }
        public Builder revisionHistoryLimit(@Nullable Integer revisionHistoryLimit) {
            this.revisionHistoryLimit = revisionHistoryLimit;
            return this;
        }
        public Builder selector(@Nullable LabelSelector selector) {
            this.selector = selector;
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public Builder template(PodTemplateSpec template) {
            this.template = Objects.requireNonNull(template);
            return this;
        }
        public Builder updateStrategy(@Nullable StatefulSetUpdateStrategy updateStrategy) {
            this.updateStrategy = updateStrategy;
            return this;
        }
        public Builder volumeClaimTemplates(@Nullable List<PersistentVolumeClaim> volumeClaimTemplates) {
            this.volumeClaimTemplates = volumeClaimTemplates;
            return this;
        }
        public Builder volumeClaimTemplates(PersistentVolumeClaim... volumeClaimTemplates) {
            return volumeClaimTemplates(List.of(volumeClaimTemplates));
        }        public StatefulSetSpec build() {
            return new StatefulSetSpec(podManagementPolicy, replicas, revisionHistoryLimit, selector, serviceName, template, updateStrategy, volumeClaimTemplates);
        }
    }
}
