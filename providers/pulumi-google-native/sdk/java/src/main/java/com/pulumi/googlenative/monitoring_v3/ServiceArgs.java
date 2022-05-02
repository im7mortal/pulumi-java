// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v3;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.monitoring_v3.inputs.AppEngineArgs;
import com.pulumi.googlenative.monitoring_v3.inputs.CloudEndpointsArgs;
import com.pulumi.googlenative.monitoring_v3.inputs.ClusterIstioArgs;
import com.pulumi.googlenative.monitoring_v3.inputs.CustomArgs;
import com.pulumi.googlenative.monitoring_v3.inputs.IstioCanonicalServiceArgs;
import com.pulumi.googlenative.monitoring_v3.inputs.MeshIstioArgs;
import com.pulumi.googlenative.monitoring_v3.inputs.TelemetryArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceArgs Empty = new ServiceArgs();

    /**
     * Type used for App Engine services.
     * 
     */
    @Import(name="appEngine")
    private @Nullable Output<AppEngineArgs> appEngine;

    /**
     * @return Type used for App Engine services.
     * 
     */
    public Optional<Output<AppEngineArgs>> appEngine() {
        return Optional.ofNullable(this.appEngine);
    }

    /**
     * Type used for Cloud Endpoints services.
     * 
     */
    @Import(name="cloudEndpoints")
    private @Nullable Output<CloudEndpointsArgs> cloudEndpoints;

    /**
     * @return Type used for Cloud Endpoints services.
     * 
     */
    public Optional<Output<CloudEndpointsArgs>> cloudEndpoints() {
        return Optional.ofNullable(this.cloudEndpoints);
    }

    /**
     * Type used for Istio services that live in a Kubernetes cluster.
     * 
     */
    @Import(name="clusterIstio")
    private @Nullable Output<ClusterIstioArgs> clusterIstio;

    /**
     * @return Type used for Istio services that live in a Kubernetes cluster.
     * 
     */
    public Optional<Output<ClusterIstioArgs>> clusterIstio() {
        return Optional.ofNullable(this.clusterIstio);
    }

    /**
     * Custom service type.
     * 
     */
    @Import(name="custom")
    private @Nullable Output<CustomArgs> custom;

    /**
     * @return Custom service type.
     * 
     */
    public Optional<Output<CustomArgs>> custom() {
        return Optional.ofNullable(this.custom);
    }

    /**
     * Name used for UI elements listing this Service.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Name used for UI elements listing this Service.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Type used for canonical services scoped to an Istio mesh. Metrics for Istio are documented here (https://istio.io/latest/docs/reference/config/metrics/)
     * 
     */
    @Import(name="istioCanonicalService")
    private @Nullable Output<IstioCanonicalServiceArgs> istioCanonicalService;

    /**
     * @return Type used for canonical services scoped to an Istio mesh. Metrics for Istio are documented here (https://istio.io/latest/docs/reference/config/metrics/)
     * 
     */
    public Optional<Output<IstioCanonicalServiceArgs>> istioCanonicalService() {
        return Optional.ofNullable(this.istioCanonicalService);
    }

    /**
     * Type used for Istio services scoped to an Istio mesh.
     * 
     */
    @Import(name="meshIstio")
    private @Nullable Output<MeshIstioArgs> meshIstio;

    /**
     * @return Type used for Istio services scoped to an Istio mesh.
     * 
     */
    public Optional<Output<MeshIstioArgs>> meshIstio() {
        return Optional.ofNullable(this.meshIstio);
    }

    /**
     * Resource name for this Service. The format is: projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Resource name for this Service. The format is: projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Optional. The Service id to use for this Service. If omitted, an id will be generated instead. Must match the pattern [a-z0-9\-]+
     * 
     */
    @Import(name="serviceId")
    private @Nullable Output<String> serviceId;

    /**
     * @return Optional. The Service id to use for this Service. If omitted, an id will be generated instead. Must match the pattern [a-z0-9\-]+
     * 
     */
    public Optional<Output<String>> serviceId() {
        return Optional.ofNullable(this.serviceId);
    }

    /**
     * Configuration for how to query telemetry on a Service.
     * 
     */
    @Import(name="telemetry")
    private @Nullable Output<TelemetryArgs> telemetry;

    /**
     * @return Configuration for how to query telemetry on a Service.
     * 
     */
    public Optional<Output<TelemetryArgs>> telemetry() {
        return Optional.ofNullable(this.telemetry);
    }

    /**
     * Labels which have been used to annotate the service. Label keys must start with a letter. Label keys and values may contain lowercase letters, numbers, underscores, and dashes. Label keys and values have a maximum length of 63 characters, and must be less than 128 bytes in size. Up to 64 label entries may be stored. For labels which do not have a semantic value, the empty string may be supplied for the label value.
     * 
     */
    @Import(name="userLabels")
    private @Nullable Output<Map<String,String>> userLabels;

    /**
     * @return Labels which have been used to annotate the service. Label keys must start with a letter. Label keys and values may contain lowercase letters, numbers, underscores, and dashes. Label keys and values have a maximum length of 63 characters, and must be less than 128 bytes in size. Up to 64 label entries may be stored. For labels which do not have a semantic value, the empty string may be supplied for the label value.
     * 
     */
    public Optional<Output<Map<String,String>>> userLabels() {
        return Optional.ofNullable(this.userLabels);
    }

    @Import(name="v3Id", required=true)
    private Output<String> v3Id;

    public Output<String> v3Id() {
        return this.v3Id;
    }

    @Import(name="v3Id1", required=true)
    private Output<String> v3Id1;

    public Output<String> v3Id1() {
        return this.v3Id1;
    }

    private ServiceArgs() {}

    private ServiceArgs(ServiceArgs $) {
        this.appEngine = $.appEngine;
        this.cloudEndpoints = $.cloudEndpoints;
        this.clusterIstio = $.clusterIstio;
        this.custom = $.custom;
        this.displayName = $.displayName;
        this.istioCanonicalService = $.istioCanonicalService;
        this.meshIstio = $.meshIstio;
        this.name = $.name;
        this.serviceId = $.serviceId;
        this.telemetry = $.telemetry;
        this.userLabels = $.userLabels;
        this.v3Id = $.v3Id;
        this.v3Id1 = $.v3Id1;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceArgs $;

        public Builder() {
            $ = new ServiceArgs();
        }

        public Builder(ServiceArgs defaults) {
            $ = new ServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appEngine Type used for App Engine services.
         * 
         * @return builder
         * 
         */
        public Builder appEngine(@Nullable Output<AppEngineArgs> appEngine) {
            $.appEngine = appEngine;
            return this;
        }

        /**
         * @param appEngine Type used for App Engine services.
         * 
         * @return builder
         * 
         */
        public Builder appEngine(AppEngineArgs appEngine) {
            return appEngine(Output.of(appEngine));
        }

        /**
         * @param cloudEndpoints Type used for Cloud Endpoints services.
         * 
         * @return builder
         * 
         */
        public Builder cloudEndpoints(@Nullable Output<CloudEndpointsArgs> cloudEndpoints) {
            $.cloudEndpoints = cloudEndpoints;
            return this;
        }

        /**
         * @param cloudEndpoints Type used for Cloud Endpoints services.
         * 
         * @return builder
         * 
         */
        public Builder cloudEndpoints(CloudEndpointsArgs cloudEndpoints) {
            return cloudEndpoints(Output.of(cloudEndpoints));
        }

        /**
         * @param clusterIstio Type used for Istio services that live in a Kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterIstio(@Nullable Output<ClusterIstioArgs> clusterIstio) {
            $.clusterIstio = clusterIstio;
            return this;
        }

        /**
         * @param clusterIstio Type used for Istio services that live in a Kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterIstio(ClusterIstioArgs clusterIstio) {
            return clusterIstio(Output.of(clusterIstio));
        }

        /**
         * @param custom Custom service type.
         * 
         * @return builder
         * 
         */
        public Builder custom(@Nullable Output<CustomArgs> custom) {
            $.custom = custom;
            return this;
        }

        /**
         * @param custom Custom service type.
         * 
         * @return builder
         * 
         */
        public Builder custom(CustomArgs custom) {
            return custom(Output.of(custom));
        }

        /**
         * @param displayName Name used for UI elements listing this Service.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Name used for UI elements listing this Service.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param istioCanonicalService Type used for canonical services scoped to an Istio mesh. Metrics for Istio are documented here (https://istio.io/latest/docs/reference/config/metrics/)
         * 
         * @return builder
         * 
         */
        public Builder istioCanonicalService(@Nullable Output<IstioCanonicalServiceArgs> istioCanonicalService) {
            $.istioCanonicalService = istioCanonicalService;
            return this;
        }

        /**
         * @param istioCanonicalService Type used for canonical services scoped to an Istio mesh. Metrics for Istio are documented here (https://istio.io/latest/docs/reference/config/metrics/)
         * 
         * @return builder
         * 
         */
        public Builder istioCanonicalService(IstioCanonicalServiceArgs istioCanonicalService) {
            return istioCanonicalService(Output.of(istioCanonicalService));
        }

        /**
         * @param meshIstio Type used for Istio services scoped to an Istio mesh.
         * 
         * @return builder
         * 
         */
        public Builder meshIstio(@Nullable Output<MeshIstioArgs> meshIstio) {
            $.meshIstio = meshIstio;
            return this;
        }

        /**
         * @param meshIstio Type used for Istio services scoped to an Istio mesh.
         * 
         * @return builder
         * 
         */
        public Builder meshIstio(MeshIstioArgs meshIstio) {
            return meshIstio(Output.of(meshIstio));
        }

        /**
         * @param name Resource name for this Service. The format is: projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Resource name for this Service. The format is: projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param serviceId Optional. The Service id to use for this Service. If omitted, an id will be generated instead. Must match the pattern [a-z0-9\-]+
         * 
         * @return builder
         * 
         */
        public Builder serviceId(@Nullable Output<String> serviceId) {
            $.serviceId = serviceId;
            return this;
        }

        /**
         * @param serviceId Optional. The Service id to use for this Service. If omitted, an id will be generated instead. Must match the pattern [a-z0-9\-]+
         * 
         * @return builder
         * 
         */
        public Builder serviceId(String serviceId) {
            return serviceId(Output.of(serviceId));
        }

        /**
         * @param telemetry Configuration for how to query telemetry on a Service.
         * 
         * @return builder
         * 
         */
        public Builder telemetry(@Nullable Output<TelemetryArgs> telemetry) {
            $.telemetry = telemetry;
            return this;
        }

        /**
         * @param telemetry Configuration for how to query telemetry on a Service.
         * 
         * @return builder
         * 
         */
        public Builder telemetry(TelemetryArgs telemetry) {
            return telemetry(Output.of(telemetry));
        }

        /**
         * @param userLabels Labels which have been used to annotate the service. Label keys must start with a letter. Label keys and values may contain lowercase letters, numbers, underscores, and dashes. Label keys and values have a maximum length of 63 characters, and must be less than 128 bytes in size. Up to 64 label entries may be stored. For labels which do not have a semantic value, the empty string may be supplied for the label value.
         * 
         * @return builder
         * 
         */
        public Builder userLabels(@Nullable Output<Map<String,String>> userLabels) {
            $.userLabels = userLabels;
            return this;
        }

        /**
         * @param userLabels Labels which have been used to annotate the service. Label keys must start with a letter. Label keys and values may contain lowercase letters, numbers, underscores, and dashes. Label keys and values have a maximum length of 63 characters, and must be less than 128 bytes in size. Up to 64 label entries may be stored. For labels which do not have a semantic value, the empty string may be supplied for the label value.
         * 
         * @return builder
         * 
         */
        public Builder userLabels(Map<String,String> userLabels) {
            return userLabels(Output.of(userLabels));
        }

        public Builder v3Id(Output<String> v3Id) {
            $.v3Id = v3Id;
            return this;
        }

        public Builder v3Id(String v3Id) {
            return v3Id(Output.of(v3Id));
        }

        public Builder v3Id1(Output<String> v3Id1) {
            $.v3Id1 = v3Id1;
            return this;
        }

        public Builder v3Id1(String v3Id1) {
            return v3Id1(Output.of(v3Id1));
        }

        public ServiceArgs build() {
            $.v3Id = Objects.requireNonNull($.v3Id, "expected parameter 'v3Id' to be non-null");
            $.v3Id1 = Objects.requireNonNull($.v3Id1, "expected parameter 'v3Id1' to be non-null");
            return $;
        }
    }

}
