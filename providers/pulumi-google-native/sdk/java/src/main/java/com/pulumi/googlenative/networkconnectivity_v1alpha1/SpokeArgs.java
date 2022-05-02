// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkconnectivity_v1alpha1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.networkconnectivity_v1alpha1.inputs.RouterApplianceInstanceArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpokeArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpokeArgs Empty = new SpokeArgs();

    /**
     * The time when the Spoke was created.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The time when the Spoke was created.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * Short description of the spoke resource
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Short description of the spoke resource
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The resource URL of the hub resource that the spoke is attached to
     * 
     */
    @Import(name="hub")
    private @Nullable Output<String> hub;

    /**
     * @return The resource URL of the hub resource that the spoke is attached to
     * 
     */
    public Optional<Output<String>> hub() {
        return Optional.ofNullable(this.hub);
    }

    /**
     * User-defined labels.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return User-defined labels.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The URIs of linked interconnect attachment resources
     * 
     */
    @Import(name="linkedInterconnectAttachments")
    private @Nullable Output<List<String>> linkedInterconnectAttachments;

    /**
     * @return The URIs of linked interconnect attachment resources
     * 
     */
    public Optional<Output<List<String>>> linkedInterconnectAttachments() {
        return Optional.ofNullable(this.linkedInterconnectAttachments);
    }

    /**
     * The URIs of linked Router appliance resources
     * 
     */
    @Import(name="linkedRouterApplianceInstances")
    private @Nullable Output<List<RouterApplianceInstanceArgs>> linkedRouterApplianceInstances;

    /**
     * @return The URIs of linked Router appliance resources
     * 
     */
    public Optional<Output<List<RouterApplianceInstanceArgs>>> linkedRouterApplianceInstances() {
        return Optional.ofNullable(this.linkedRouterApplianceInstances);
    }

    /**
     * The URIs of linked VPN tunnel resources
     * 
     */
    @Import(name="linkedVpnTunnels")
    private @Nullable Output<List<String>> linkedVpnTunnels;

    /**
     * @return The URIs of linked VPN tunnel resources
     * 
     */
    public Optional<Output<List<String>>> linkedVpnTunnels() {
        return Optional.ofNullable(this.linkedVpnTunnels);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Immutable. The name of a Spoke resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Immutable. The name of a Spoke resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
     * 
     */
    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    /**
     * @return Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
     * 
     */
    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * Optional. Unique id for the Spoke to create.
     * 
     */
    @Import(name="spokeId")
    private @Nullable Output<String> spokeId;

    /**
     * @return Optional. Unique id for the Spoke to create.
     * 
     */
    public Optional<Output<String>> spokeId() {
        return Optional.ofNullable(this.spokeId);
    }

    /**
     * The time when the Spoke was updated.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return The time when the Spoke was updated.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    private SpokeArgs() {}

    private SpokeArgs(SpokeArgs $) {
        this.createTime = $.createTime;
        this.description = $.description;
        this.hub = $.hub;
        this.labels = $.labels;
        this.linkedInterconnectAttachments = $.linkedInterconnectAttachments;
        this.linkedRouterApplianceInstances = $.linkedRouterApplianceInstances;
        this.linkedVpnTunnels = $.linkedVpnTunnels;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.requestId = $.requestId;
        this.spokeId = $.spokeId;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpokeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpokeArgs $;

        public Builder() {
            $ = new SpokeArgs();
        }

        public Builder(SpokeArgs defaults) {
            $ = new SpokeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime The time when the Spoke was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The time when the Spoke was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param description Short description of the spoke resource
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Short description of the spoke resource
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param hub The resource URL of the hub resource that the spoke is attached to
         * 
         * @return builder
         * 
         */
        public Builder hub(@Nullable Output<String> hub) {
            $.hub = hub;
            return this;
        }

        /**
         * @param hub The resource URL of the hub resource that the spoke is attached to
         * 
         * @return builder
         * 
         */
        public Builder hub(String hub) {
            return hub(Output.of(hub));
        }

        /**
         * @param labels User-defined labels.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels User-defined labels.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param linkedInterconnectAttachments The URIs of linked interconnect attachment resources
         * 
         * @return builder
         * 
         */
        public Builder linkedInterconnectAttachments(@Nullable Output<List<String>> linkedInterconnectAttachments) {
            $.linkedInterconnectAttachments = linkedInterconnectAttachments;
            return this;
        }

        /**
         * @param linkedInterconnectAttachments The URIs of linked interconnect attachment resources
         * 
         * @return builder
         * 
         */
        public Builder linkedInterconnectAttachments(List<String> linkedInterconnectAttachments) {
            return linkedInterconnectAttachments(Output.of(linkedInterconnectAttachments));
        }

        /**
         * @param linkedInterconnectAttachments The URIs of linked interconnect attachment resources
         * 
         * @return builder
         * 
         */
        public Builder linkedInterconnectAttachments(String... linkedInterconnectAttachments) {
            return linkedInterconnectAttachments(List.of(linkedInterconnectAttachments));
        }

        /**
         * @param linkedRouterApplianceInstances The URIs of linked Router appliance resources
         * 
         * @return builder
         * 
         */
        public Builder linkedRouterApplianceInstances(@Nullable Output<List<RouterApplianceInstanceArgs>> linkedRouterApplianceInstances) {
            $.linkedRouterApplianceInstances = linkedRouterApplianceInstances;
            return this;
        }

        /**
         * @param linkedRouterApplianceInstances The URIs of linked Router appliance resources
         * 
         * @return builder
         * 
         */
        public Builder linkedRouterApplianceInstances(List<RouterApplianceInstanceArgs> linkedRouterApplianceInstances) {
            return linkedRouterApplianceInstances(Output.of(linkedRouterApplianceInstances));
        }

        /**
         * @param linkedRouterApplianceInstances The URIs of linked Router appliance resources
         * 
         * @return builder
         * 
         */
        public Builder linkedRouterApplianceInstances(RouterApplianceInstanceArgs... linkedRouterApplianceInstances) {
            return linkedRouterApplianceInstances(List.of(linkedRouterApplianceInstances));
        }

        /**
         * @param linkedVpnTunnels The URIs of linked VPN tunnel resources
         * 
         * @return builder
         * 
         */
        public Builder linkedVpnTunnels(@Nullable Output<List<String>> linkedVpnTunnels) {
            $.linkedVpnTunnels = linkedVpnTunnels;
            return this;
        }

        /**
         * @param linkedVpnTunnels The URIs of linked VPN tunnel resources
         * 
         * @return builder
         * 
         */
        public Builder linkedVpnTunnels(List<String> linkedVpnTunnels) {
            return linkedVpnTunnels(Output.of(linkedVpnTunnels));
        }

        /**
         * @param linkedVpnTunnels The URIs of linked VPN tunnel resources
         * 
         * @return builder
         * 
         */
        public Builder linkedVpnTunnels(String... linkedVpnTunnels) {
            return linkedVpnTunnels(List.of(linkedVpnTunnels));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Immutable. The name of a Spoke resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Immutable. The name of a Spoke resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param requestId Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        /**
         * @param requestId Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        /**
         * @param spokeId Optional. Unique id for the Spoke to create.
         * 
         * @return builder
         * 
         */
        public Builder spokeId(@Nullable Output<String> spokeId) {
            $.spokeId = spokeId;
            return this;
        }

        /**
         * @param spokeId Optional. Unique id for the Spoke to create.
         * 
         * @return builder
         * 
         */
        public Builder spokeId(String spokeId) {
            return spokeId(Output.of(spokeId));
        }

        /**
         * @param updateTime The time when the Spoke was updated.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime The time when the Spoke was updated.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        public SpokeArgs build() {
            return $;
        }
    }

}
