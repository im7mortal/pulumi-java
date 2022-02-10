// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.ServiceAttachmentConnectionPreference;
import io.pulumi.googlenative.compute_alpha.inputs.ServiceAttachmentConsumerProjectLimitArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceAttachmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceAttachmentArgs Empty = new ServiceAttachmentArgs();

    @InputImport(name="connectionPreference")
    private final @Nullable Input<ServiceAttachmentConnectionPreference> connectionPreference;

    public Input<ServiceAttachmentConnectionPreference> getConnectionPreference() {
        return this.connectionPreference == null ? Input.empty() : this.connectionPreference;
    }

    @InputImport(name="consumerAcceptLists")
    private final @Nullable Input<List<ServiceAttachmentConsumerProjectLimitArgs>> consumerAcceptLists;

    public Input<List<ServiceAttachmentConsumerProjectLimitArgs>> getConsumerAcceptLists() {
        return this.consumerAcceptLists == null ? Input.empty() : this.consumerAcceptLists;
    }

    @InputImport(name="consumerRejectLists")
    private final @Nullable Input<List<String>> consumerRejectLists;

    public Input<List<String>> getConsumerRejectLists() {
        return this.consumerRejectLists == null ? Input.empty() : this.consumerRejectLists;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="domainNames")
    private final @Nullable Input<List<String>> domainNames;

    public Input<List<String>> getDomainNames() {
        return this.domainNames == null ? Input.empty() : this.domainNames;
    }

    @InputImport(name="enableProxyProtocol")
    private final @Nullable Input<Boolean> enableProxyProtocol;

    public Input<Boolean> getEnableProxyProtocol() {
        return this.enableProxyProtocol == null ? Input.empty() : this.enableProxyProtocol;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="natSubnets")
    private final @Nullable Input<List<String>> natSubnets;

    public Input<List<String>> getNatSubnets() {
        return this.natSubnets == null ? Input.empty() : this.natSubnets;
    }

    @InputImport(name="producerForwardingRule")
    private final @Nullable Input<String> producerForwardingRule;

    public Input<String> getProducerForwardingRule() {
        return this.producerForwardingRule == null ? Input.empty() : this.producerForwardingRule;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="region", required=true)
    private final Input<String> region;

    public Input<String> getRegion() {
        return this.region;
    }

    @InputImport(name="requestId")
    private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    @InputImport(name="targetService")
    private final @Nullable Input<String> targetService;

    public Input<String> getTargetService() {
        return this.targetService == null ? Input.empty() : this.targetService;
    }

    public ServiceAttachmentArgs(
        @Nullable Input<ServiceAttachmentConnectionPreference> connectionPreference,
        @Nullable Input<List<ServiceAttachmentConsumerProjectLimitArgs>> consumerAcceptLists,
        @Nullable Input<List<String>> consumerRejectLists,
        @Nullable Input<String> description,
        @Nullable Input<List<String>> domainNames,
        @Nullable Input<Boolean> enableProxyProtocol,
        @Nullable Input<String> name,
        @Nullable Input<List<String>> natSubnets,
        @Nullable Input<String> producerForwardingRule,
        @Nullable Input<String> project,
        Input<String> region,
        @Nullable Input<String> requestId,
        @Nullable Input<String> targetService) {
        this.connectionPreference = connectionPreference;
        this.consumerAcceptLists = consumerAcceptLists;
        this.consumerRejectLists = consumerRejectLists;
        this.description = description;
        this.domainNames = domainNames;
        this.enableProxyProtocol = enableProxyProtocol;
        this.name = name;
        this.natSubnets = natSubnets;
        this.producerForwardingRule = producerForwardingRule;
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.requestId = requestId;
        this.targetService = targetService;
    }

    private ServiceAttachmentArgs() {
        this.connectionPreference = Input.empty();
        this.consumerAcceptLists = Input.empty();
        this.consumerRejectLists = Input.empty();
        this.description = Input.empty();
        this.domainNames = Input.empty();
        this.enableProxyProtocol = Input.empty();
        this.name = Input.empty();
        this.natSubnets = Input.empty();
        this.producerForwardingRule = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.requestId = Input.empty();
        this.targetService = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ServiceAttachmentConnectionPreference> connectionPreference;
        private @Nullable Input<List<ServiceAttachmentConsumerProjectLimitArgs>> consumerAcceptLists;
        private @Nullable Input<List<String>> consumerRejectLists;
        private @Nullable Input<String> description;
        private @Nullable Input<List<String>> domainNames;
        private @Nullable Input<Boolean> enableProxyProtocol;
        private @Nullable Input<String> name;
        private @Nullable Input<List<String>> natSubnets;
        private @Nullable Input<String> producerForwardingRule;
        private @Nullable Input<String> project;
        private Input<String> region;
        private @Nullable Input<String> requestId;
        private @Nullable Input<String> targetService;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAttachmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionPreference = defaults.connectionPreference;
    	      this.consumerAcceptLists = defaults.consumerAcceptLists;
    	      this.consumerRejectLists = defaults.consumerRejectLists;
    	      this.description = defaults.description;
    	      this.domainNames = defaults.domainNames;
    	      this.enableProxyProtocol = defaults.enableProxyProtocol;
    	      this.name = defaults.name;
    	      this.natSubnets = defaults.natSubnets;
    	      this.producerForwardingRule = defaults.producerForwardingRule;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.requestId = defaults.requestId;
    	      this.targetService = defaults.targetService;
        }

        public Builder setConnectionPreference(@Nullable Input<ServiceAttachmentConnectionPreference> connectionPreference) {
            this.connectionPreference = connectionPreference;
            return this;
        }

        public Builder setConnectionPreference(@Nullable ServiceAttachmentConnectionPreference connectionPreference) {
            this.connectionPreference = Input.ofNullable(connectionPreference);
            return this;
        }

        public Builder setConsumerAcceptLists(@Nullable Input<List<ServiceAttachmentConsumerProjectLimitArgs>> consumerAcceptLists) {
            this.consumerAcceptLists = consumerAcceptLists;
            return this;
        }

        public Builder setConsumerAcceptLists(@Nullable List<ServiceAttachmentConsumerProjectLimitArgs> consumerAcceptLists) {
            this.consumerAcceptLists = Input.ofNullable(consumerAcceptLists);
            return this;
        }

        public Builder setConsumerRejectLists(@Nullable Input<List<String>> consumerRejectLists) {
            this.consumerRejectLists = consumerRejectLists;
            return this;
        }

        public Builder setConsumerRejectLists(@Nullable List<String> consumerRejectLists) {
            this.consumerRejectLists = Input.ofNullable(consumerRejectLists);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDomainNames(@Nullable Input<List<String>> domainNames) {
            this.domainNames = domainNames;
            return this;
        }

        public Builder setDomainNames(@Nullable List<String> domainNames) {
            this.domainNames = Input.ofNullable(domainNames);
            return this;
        }

        public Builder setEnableProxyProtocol(@Nullable Input<Boolean> enableProxyProtocol) {
            this.enableProxyProtocol = enableProxyProtocol;
            return this;
        }

        public Builder setEnableProxyProtocol(@Nullable Boolean enableProxyProtocol) {
            this.enableProxyProtocol = Input.ofNullable(enableProxyProtocol);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNatSubnets(@Nullable Input<List<String>> natSubnets) {
            this.natSubnets = natSubnets;
            return this;
        }

        public Builder setNatSubnets(@Nullable List<String> natSubnets) {
            this.natSubnets = Input.ofNullable(natSubnets);
            return this;
        }

        public Builder setProducerForwardingRule(@Nullable Input<String> producerForwardingRule) {
            this.producerForwardingRule = producerForwardingRule;
            return this;
        }

        public Builder setProducerForwardingRule(@Nullable String producerForwardingRule) {
            this.producerForwardingRule = Input.ofNullable(producerForwardingRule);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRegion(Input<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Input.of(Objects.requireNonNull(region));
            return this;
        }

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder setTargetService(@Nullable Input<String> targetService) {
            this.targetService = targetService;
            return this;
        }

        public Builder setTargetService(@Nullable String targetService) {
            this.targetService = Input.ofNullable(targetService);
            return this;
        }

        public ServiceAttachmentArgs build() {
            return new ServiceAttachmentArgs(connectionPreference, consumerAcceptLists, consumerRejectLists, description, domainNames, enableProxyProtocol, name, natSubnets, producerForwardingRule, project, region, requestId, targetService);
        }
    }
}