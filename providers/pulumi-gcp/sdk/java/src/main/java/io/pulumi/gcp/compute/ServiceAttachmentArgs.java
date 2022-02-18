// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.ServiceAttachmentConsumerAcceptListArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceAttachmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceAttachmentArgs Empty = new ServiceAttachmentArgs();

    /**
     * The connection preference to use for this service attachment. Valid
     * values include "ACCEPT_AUTOMATIC", "ACCEPT_MANUAL".
     * 
     */
    @InputImport(name="connectionPreference", required=true)
    private final Input<String> connectionPreference;

    public Input<String> getConnectionPreference() {
        return this.connectionPreference;
    }

    /**
     * An array of projects that are allowed to connect to this service
     * attachment.
     * Structure is documented below.
     * 
     */
    @InputImport(name="consumerAcceptLists")
    private final @Nullable Input<List<ServiceAttachmentConsumerAcceptListArgs>> consumerAcceptLists;

    public Input<List<ServiceAttachmentConsumerAcceptListArgs>> getConsumerAcceptLists() {
        return this.consumerAcceptLists == null ? Input.empty() : this.consumerAcceptLists;
    }

    /**
     * An array of projects that are not allowed to connect to this service
     * attachment.
     * 
     */
    @InputImport(name="consumerRejectLists")
    private final @Nullable Input<List<String>> consumerRejectLists;

    public Input<List<String>> getConsumerRejectLists() {
        return this.consumerRejectLists == null ? Input.empty() : this.consumerRejectLists;
    }

    /**
     * An optional description of this resource.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * If true, enable the proxy protocol which is for supplying client TCP/IP
     * address data in TCP connections that traverse proxies on their way to
     * destination servers.
     * 
     */
    @InputImport(name="enableProxyProtocol", required=true)
    private final Input<Boolean> enableProxyProtocol;

    public Input<Boolean> getEnableProxyProtocol() {
        return this.enableProxyProtocol;
    }

    /**
     * Name of the resource. The name must be 1-63 characters long, and
     * comply with RFC1035. Specifically, the name must be 1-63 characters
     * long and match the regular expression `a-z?`
     * which means the first character must be a lowercase letter, and all
     * following characters must be a dash, lowercase letter, or digit,
     * except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * An array of subnets that is provided for NAT in this service attachment.
     * 
     */
    @InputImport(name="natSubnets", required=true)
    private final Input<List<String>> natSubnets;

    public Input<List<String>> getNatSubnets() {
        return this.natSubnets;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * URL of the region where the resource resides.
     * 
     */
    @InputImport(name="region")
    private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * The URL of a forwarding rule that represents the service identified by
     * this service attachment.
     * 
     */
    @InputImport(name="targetService", required=true)
    private final Input<String> targetService;

    public Input<String> getTargetService() {
        return this.targetService;
    }

    public ServiceAttachmentArgs(
        Input<String> connectionPreference,
        @Nullable Input<List<ServiceAttachmentConsumerAcceptListArgs>> consumerAcceptLists,
        @Nullable Input<List<String>> consumerRejectLists,
        @Nullable Input<String> description,
        Input<Boolean> enableProxyProtocol,
        @Nullable Input<String> name,
        Input<List<String>> natSubnets,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        Input<String> targetService) {
        this.connectionPreference = Objects.requireNonNull(connectionPreference, "expected parameter 'connectionPreference' to be non-null");
        this.consumerAcceptLists = consumerAcceptLists;
        this.consumerRejectLists = consumerRejectLists;
        this.description = description;
        this.enableProxyProtocol = Objects.requireNonNull(enableProxyProtocol, "expected parameter 'enableProxyProtocol' to be non-null");
        this.name = name;
        this.natSubnets = Objects.requireNonNull(natSubnets, "expected parameter 'natSubnets' to be non-null");
        this.project = project;
        this.region = region;
        this.targetService = Objects.requireNonNull(targetService, "expected parameter 'targetService' to be non-null");
    }

    private ServiceAttachmentArgs() {
        this.connectionPreference = Input.empty();
        this.consumerAcceptLists = Input.empty();
        this.consumerRejectLists = Input.empty();
        this.description = Input.empty();
        this.enableProxyProtocol = Input.empty();
        this.name = Input.empty();
        this.natSubnets = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.targetService = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> connectionPreference;
        private @Nullable Input<List<ServiceAttachmentConsumerAcceptListArgs>> consumerAcceptLists;
        private @Nullable Input<List<String>> consumerRejectLists;
        private @Nullable Input<String> description;
        private Input<Boolean> enableProxyProtocol;
        private @Nullable Input<String> name;
        private Input<List<String>> natSubnets;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private Input<String> targetService;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAttachmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionPreference = defaults.connectionPreference;
    	      this.consumerAcceptLists = defaults.consumerAcceptLists;
    	      this.consumerRejectLists = defaults.consumerRejectLists;
    	      this.description = defaults.description;
    	      this.enableProxyProtocol = defaults.enableProxyProtocol;
    	      this.name = defaults.name;
    	      this.natSubnets = defaults.natSubnets;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.targetService = defaults.targetService;
        }

        public Builder setConnectionPreference(Input<String> connectionPreference) {
            this.connectionPreference = Objects.requireNonNull(connectionPreference);
            return this;
        }

        public Builder setConnectionPreference(String connectionPreference) {
            this.connectionPreference = Input.of(Objects.requireNonNull(connectionPreference));
            return this;
        }

        public Builder setConsumerAcceptLists(@Nullable Input<List<ServiceAttachmentConsumerAcceptListArgs>> consumerAcceptLists) {
            this.consumerAcceptLists = consumerAcceptLists;
            return this;
        }

        public Builder setConsumerAcceptLists(@Nullable List<ServiceAttachmentConsumerAcceptListArgs> consumerAcceptLists) {
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

        public Builder setEnableProxyProtocol(Input<Boolean> enableProxyProtocol) {
            this.enableProxyProtocol = Objects.requireNonNull(enableProxyProtocol);
            return this;
        }

        public Builder setEnableProxyProtocol(Boolean enableProxyProtocol) {
            this.enableProxyProtocol = Input.of(Objects.requireNonNull(enableProxyProtocol));
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

        public Builder setNatSubnets(Input<List<String>> natSubnets) {
            this.natSubnets = Objects.requireNonNull(natSubnets);
            return this;
        }

        public Builder setNatSubnets(List<String> natSubnets) {
            this.natSubnets = Input.of(Objects.requireNonNull(natSubnets));
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

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public Builder setTargetService(Input<String> targetService) {
            this.targetService = Objects.requireNonNull(targetService);
            return this;
        }

        public Builder setTargetService(String targetService) {
            this.targetService = Input.of(Objects.requireNonNull(targetService));
            return this;
        }

        public ServiceAttachmentArgs build() {
            return new ServiceAttachmentArgs(connectionPreference, consumerAcceptLists, consumerRejectLists, description, enableProxyProtocol, name, natSubnets, project, region, targetService);
        }
    }
}