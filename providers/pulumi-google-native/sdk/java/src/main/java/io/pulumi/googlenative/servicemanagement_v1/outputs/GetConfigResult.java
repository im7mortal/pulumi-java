// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.servicemanagement_v1.outputs.ApiResponse;
import io.pulumi.googlenative.servicemanagement_v1.outputs.AuthenticationResponse;
import io.pulumi.googlenative.servicemanagement_v1.outputs.BackendResponse;
import io.pulumi.googlenative.servicemanagement_v1.outputs.BillingResponse;
import io.pulumi.googlenative.servicemanagement_v1.outputs.ContextResponse;
import io.pulumi.googlenative.servicemanagement_v1.outputs.ControlResponse;
import io.pulumi.googlenative.servicemanagement_v1.outputs.CustomErrorResponse;
import io.pulumi.googlenative.servicemanagement_v1.outputs.DocumentationResponse;
import io.pulumi.googlenative.servicemanagement_v1.outputs.EndpointResponse;
import io.pulumi.googlenative.servicemanagement_v1.outputs.EnumResponse;
import io.pulumi.googlenative.servicemanagement_v1.outputs.HttpResponse;
import io.pulumi.googlenative.servicemanagement_v1.outputs.LogDescriptorResponse;
import io.pulumi.googlenative.servicemanagement_v1.outputs.LoggingResponse;
import io.pulumi.googlenative.servicemanagement_v1.outputs.MetricDescriptorResponse;
import io.pulumi.googlenative.servicemanagement_v1.outputs.MonitoredResourceDescriptorResponse;
import io.pulumi.googlenative.servicemanagement_v1.outputs.MonitoringResponse;
import io.pulumi.googlenative.servicemanagement_v1.outputs.QuotaResponse;
import io.pulumi.googlenative.servicemanagement_v1.outputs.SourceInfoResponse;
import io.pulumi.googlenative.servicemanagement_v1.outputs.SystemParametersResponse;
import io.pulumi.googlenative.servicemanagement_v1.outputs.TypeResponse;
import io.pulumi.googlenative.servicemanagement_v1.outputs.UsageResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetConfigResult {
    /**
     * A list of API interfaces exported by this service. Only the `name` field of the google.protobuf.Api needs to be provided by the configuration author, as the remaining fields will be derived from the IDL during the normalization process. It is an error to specify an API interface here which cannot be resolved against the associated IDL files.
     * 
     */
    private final List<ApiResponse> apis;
    /**
     * Auth configuration.
     * 
     */
    private final AuthenticationResponse authentication;
    /**
     * API backend configuration.
     * 
     */
    private final BackendResponse backend;
    /**
     * Billing configuration.
     * 
     */
    private final BillingResponse billing;
    /**
     * Obsolete. Do not use. This field has no semantic meaning. The service config compiler always sets this field to `3`.
     * 
     */
    private final Integer configVersion;
    /**
     * Context configuration.
     * 
     */
    private final ContextResponse context;
    /**
     * Configuration for the service control plane.
     * 
     */
    private final ControlResponse control;
    /**
     * Custom error configuration.
     * 
     */
    private final CustomErrorResponse customError;
    /**
     * Additional API documentation.
     * 
     */
    private final DocumentationResponse documentation;
    /**
     * Configuration for network endpoints. If this is empty, then an endpoint with the same name as the service is automatically generated to service all defined APIs.
     * 
     */
    private final List<EndpointResponse> endpoints;
    /**
     * A list of all enum types included in this API service. Enums referenced directly or indirectly by the `apis` are automatically included. Enums which are not referenced but shall be included should be listed here by name by the configuration author. Example: enums: - name: google.someapi.v1.SomeEnum
     * 
     */
    private final List<EnumResponse> enums;
    /**
     * HTTP configuration.
     * 
     */
    private final HttpResponse http;
    /**
     * Logging configuration.
     * 
     */
    private final LoggingResponse logging;
    /**
     * Defines the logs used by this service.
     * 
     */
    private final List<LogDescriptorResponse> logs;
    /**
     * Defines the metrics used by this service.
     * 
     */
    private final List<MetricDescriptorResponse> metrics;
    /**
     * Defines the monitored resources used by this service. This is required by the Service.monitoring and Service.logging configurations.
     * 
     */
    private final List<MonitoredResourceDescriptorResponse> monitoredResources;
    /**
     * Monitoring configuration.
     * 
     */
    private final MonitoringResponse monitoring;
    /**
     * The service name, which is a DNS-like logical identifier for the service, such as `calendar.googleapis.com`. The service name typically goes through DNS verification to make sure the owner of the service also owns the DNS name.
     * 
     */
    private final String name;
    /**
     * The Google project that owns this service.
     * 
     */
    private final String producerProjectId;
    /**
     * Quota configuration.
     * 
     */
    private final QuotaResponse quota;
    /**
     * The source information for this configuration if available.
     * 
     */
    private final SourceInfoResponse sourceInfo;
    /**
     * System parameter configuration.
     * 
     */
    private final SystemParametersResponse systemParameters;
    /**
     * A list of all proto message types included in this API service. It serves similar purpose as [google.api.Service.types], except that these types are not needed by user-defined APIs. Therefore, they will not show up in the generated discovery doc. This field should only be used to define system APIs in ESF.
     * 
     */
    private final List<TypeResponse> systemTypes;
    /**
     * The product title for this service, it is the name displayed in Google Cloud Console.
     * 
     */
    private final String title;
    /**
     * A list of all proto message types included in this API service. Types referenced directly or indirectly by the `apis` are automatically included. Messages which are not referenced but shall be included, such as types used by the `google.protobuf.Any` type, should be listed here by name by the configuration author. Example: types: - name: google.protobuf.Int32
     * 
     */
    private final List<TypeResponse> types;
    /**
     * Configuration controlling usage of this service.
     * 
     */
    private final UsageResponse usage;

    @OutputCustomType.Constructor({"apis","authentication","backend","billing","configVersion","context","control","customError","documentation","endpoints","enums","http","logging","logs","metrics","monitoredResources","monitoring","name","producerProjectId","quota","sourceInfo","systemParameters","systemTypes","title","types","usage"})
    private GetConfigResult(
        List<ApiResponse> apis,
        AuthenticationResponse authentication,
        BackendResponse backend,
        BillingResponse billing,
        Integer configVersion,
        ContextResponse context,
        ControlResponse control,
        CustomErrorResponse customError,
        DocumentationResponse documentation,
        List<EndpointResponse> endpoints,
        List<EnumResponse> enums,
        HttpResponse http,
        LoggingResponse logging,
        List<LogDescriptorResponse> logs,
        List<MetricDescriptorResponse> metrics,
        List<MonitoredResourceDescriptorResponse> monitoredResources,
        MonitoringResponse monitoring,
        String name,
        String producerProjectId,
        QuotaResponse quota,
        SourceInfoResponse sourceInfo,
        SystemParametersResponse systemParameters,
        List<TypeResponse> systemTypes,
        String title,
        List<TypeResponse> types,
        UsageResponse usage) {
        this.apis = Objects.requireNonNull(apis);
        this.authentication = Objects.requireNonNull(authentication);
        this.backend = Objects.requireNonNull(backend);
        this.billing = Objects.requireNonNull(billing);
        this.configVersion = Objects.requireNonNull(configVersion);
        this.context = Objects.requireNonNull(context);
        this.control = Objects.requireNonNull(control);
        this.customError = Objects.requireNonNull(customError);
        this.documentation = Objects.requireNonNull(documentation);
        this.endpoints = Objects.requireNonNull(endpoints);
        this.enums = Objects.requireNonNull(enums);
        this.http = Objects.requireNonNull(http);
        this.logging = Objects.requireNonNull(logging);
        this.logs = Objects.requireNonNull(logs);
        this.metrics = Objects.requireNonNull(metrics);
        this.monitoredResources = Objects.requireNonNull(monitoredResources);
        this.monitoring = Objects.requireNonNull(monitoring);
        this.name = Objects.requireNonNull(name);
        this.producerProjectId = Objects.requireNonNull(producerProjectId);
        this.quota = Objects.requireNonNull(quota);
        this.sourceInfo = Objects.requireNonNull(sourceInfo);
        this.systemParameters = Objects.requireNonNull(systemParameters);
        this.systemTypes = Objects.requireNonNull(systemTypes);
        this.title = Objects.requireNonNull(title);
        this.types = Objects.requireNonNull(types);
        this.usage = Objects.requireNonNull(usage);
    }

    /**
     * A list of API interfaces exported by this service. Only the `name` field of the google.protobuf.Api needs to be provided by the configuration author, as the remaining fields will be derived from the IDL during the normalization process. It is an error to specify an API interface here which cannot be resolved against the associated IDL files.
     * 
    */
    public List<ApiResponse> getApis() {
        return this.apis;
    }
    /**
     * Auth configuration.
     * 
    */
    public AuthenticationResponse getAuthentication() {
        return this.authentication;
    }
    /**
     * API backend configuration.
     * 
    */
    public BackendResponse getBackend() {
        return this.backend;
    }
    /**
     * Billing configuration.
     * 
    */
    public BillingResponse getBilling() {
        return this.billing;
    }
    /**
     * Obsolete. Do not use. This field has no semantic meaning. The service config compiler always sets this field to `3`.
     * 
    */
    public Integer getConfigVersion() {
        return this.configVersion;
    }
    /**
     * Context configuration.
     * 
    */
    public ContextResponse getContext() {
        return this.context;
    }
    /**
     * Configuration for the service control plane.
     * 
    */
    public ControlResponse getControl() {
        return this.control;
    }
    /**
     * Custom error configuration.
     * 
    */
    public CustomErrorResponse getCustomError() {
        return this.customError;
    }
    /**
     * Additional API documentation.
     * 
    */
    public DocumentationResponse getDocumentation() {
        return this.documentation;
    }
    /**
     * Configuration for network endpoints. If this is empty, then an endpoint with the same name as the service is automatically generated to service all defined APIs.
     * 
    */
    public List<EndpointResponse> getEndpoints() {
        return this.endpoints;
    }
    /**
     * A list of all enum types included in this API service. Enums referenced directly or indirectly by the `apis` are automatically included. Enums which are not referenced but shall be included should be listed here by name by the configuration author. Example: enums: - name: google.someapi.v1.SomeEnum
     * 
    */
    public List<EnumResponse> getEnums() {
        return this.enums;
    }
    /**
     * HTTP configuration.
     * 
    */
    public HttpResponse getHttp() {
        return this.http;
    }
    /**
     * Logging configuration.
     * 
    */
    public LoggingResponse getLogging() {
        return this.logging;
    }
    /**
     * Defines the logs used by this service.
     * 
    */
    public List<LogDescriptorResponse> getLogs() {
        return this.logs;
    }
    /**
     * Defines the metrics used by this service.
     * 
    */
    public List<MetricDescriptorResponse> getMetrics() {
        return this.metrics;
    }
    /**
     * Defines the monitored resources used by this service. This is required by the Service.monitoring and Service.logging configurations.
     * 
    */
    public List<MonitoredResourceDescriptorResponse> getMonitoredResources() {
        return this.monitoredResources;
    }
    /**
     * Monitoring configuration.
     * 
    */
    public MonitoringResponse getMonitoring() {
        return this.monitoring;
    }
    /**
     * The service name, which is a DNS-like logical identifier for the service, such as `calendar.googleapis.com`. The service name typically goes through DNS verification to make sure the owner of the service also owns the DNS name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The Google project that owns this service.
     * 
    */
    public String getProducerProjectId() {
        return this.producerProjectId;
    }
    /**
     * Quota configuration.
     * 
    */
    public QuotaResponse getQuota() {
        return this.quota;
    }
    /**
     * The source information for this configuration if available.
     * 
    */
    public SourceInfoResponse getSourceInfo() {
        return this.sourceInfo;
    }
    /**
     * System parameter configuration.
     * 
    */
    public SystemParametersResponse getSystemParameters() {
        return this.systemParameters;
    }
    /**
     * A list of all proto message types included in this API service. It serves similar purpose as [google.api.Service.types], except that these types are not needed by user-defined APIs. Therefore, they will not show up in the generated discovery doc. This field should only be used to define system APIs in ESF.
     * 
    */
    public List<TypeResponse> getSystemTypes() {
        return this.systemTypes;
    }
    /**
     * The product title for this service, it is the name displayed in Google Cloud Console.
     * 
    */
    public String getTitle() {
        return this.title;
    }
    /**
     * A list of all proto message types included in this API service. Types referenced directly or indirectly by the `apis` are automatically included. Messages which are not referenced but shall be included, such as types used by the `google.protobuf.Any` type, should be listed here by name by the configuration author. Example: types: - name: google.protobuf.Int32
     * 
    */
    public List<TypeResponse> getTypes() {
        return this.types;
    }
    /**
     * Configuration controlling usage of this service.
     * 
    */
    public UsageResponse getUsage() {
        return this.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConfigResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ApiResponse> apis;
        private AuthenticationResponse authentication;
        private BackendResponse backend;
        private BillingResponse billing;
        private Integer configVersion;
        private ContextResponse context;
        private ControlResponse control;
        private CustomErrorResponse customError;
        private DocumentationResponse documentation;
        private List<EndpointResponse> endpoints;
        private List<EnumResponse> enums;
        private HttpResponse http;
        private LoggingResponse logging;
        private List<LogDescriptorResponse> logs;
        private List<MetricDescriptorResponse> metrics;
        private List<MonitoredResourceDescriptorResponse> monitoredResources;
        private MonitoringResponse monitoring;
        private String name;
        private String producerProjectId;
        private QuotaResponse quota;
        private SourceInfoResponse sourceInfo;
        private SystemParametersResponse systemParameters;
        private List<TypeResponse> systemTypes;
        private String title;
        private List<TypeResponse> types;
        private UsageResponse usage;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apis = defaults.apis;
    	      this.authentication = defaults.authentication;
    	      this.backend = defaults.backend;
    	      this.billing = defaults.billing;
    	      this.configVersion = defaults.configVersion;
    	      this.context = defaults.context;
    	      this.control = defaults.control;
    	      this.customError = defaults.customError;
    	      this.documentation = defaults.documentation;
    	      this.endpoints = defaults.endpoints;
    	      this.enums = defaults.enums;
    	      this.http = defaults.http;
    	      this.logging = defaults.logging;
    	      this.logs = defaults.logs;
    	      this.metrics = defaults.metrics;
    	      this.monitoredResources = defaults.monitoredResources;
    	      this.monitoring = defaults.monitoring;
    	      this.name = defaults.name;
    	      this.producerProjectId = defaults.producerProjectId;
    	      this.quota = defaults.quota;
    	      this.sourceInfo = defaults.sourceInfo;
    	      this.systemParameters = defaults.systemParameters;
    	      this.systemTypes = defaults.systemTypes;
    	      this.title = defaults.title;
    	      this.types = defaults.types;
    	      this.usage = defaults.usage;
        }

        public Builder setApis(List<ApiResponse> apis) {
            this.apis = Objects.requireNonNull(apis);
            return this;
        }

        public Builder setAuthentication(AuthenticationResponse authentication) {
            this.authentication = Objects.requireNonNull(authentication);
            return this;
        }

        public Builder setBackend(BackendResponse backend) {
            this.backend = Objects.requireNonNull(backend);
            return this;
        }

        public Builder setBilling(BillingResponse billing) {
            this.billing = Objects.requireNonNull(billing);
            return this;
        }

        public Builder setConfigVersion(Integer configVersion) {
            this.configVersion = Objects.requireNonNull(configVersion);
            return this;
        }

        public Builder setContext(ContextResponse context) {
            this.context = Objects.requireNonNull(context);
            return this;
        }

        public Builder setControl(ControlResponse control) {
            this.control = Objects.requireNonNull(control);
            return this;
        }

        public Builder setCustomError(CustomErrorResponse customError) {
            this.customError = Objects.requireNonNull(customError);
            return this;
        }

        public Builder setDocumentation(DocumentationResponse documentation) {
            this.documentation = Objects.requireNonNull(documentation);
            return this;
        }

        public Builder setEndpoints(List<EndpointResponse> endpoints) {
            this.endpoints = Objects.requireNonNull(endpoints);
            return this;
        }

        public Builder setEnums(List<EnumResponse> enums) {
            this.enums = Objects.requireNonNull(enums);
            return this;
        }

        public Builder setHttp(HttpResponse http) {
            this.http = Objects.requireNonNull(http);
            return this;
        }

        public Builder setLogging(LoggingResponse logging) {
            this.logging = Objects.requireNonNull(logging);
            return this;
        }

        public Builder setLogs(List<LogDescriptorResponse> logs) {
            this.logs = Objects.requireNonNull(logs);
            return this;
        }

        public Builder setMetrics(List<MetricDescriptorResponse> metrics) {
            this.metrics = Objects.requireNonNull(metrics);
            return this;
        }

        public Builder setMonitoredResources(List<MonitoredResourceDescriptorResponse> monitoredResources) {
            this.monitoredResources = Objects.requireNonNull(monitoredResources);
            return this;
        }

        public Builder setMonitoring(MonitoringResponse monitoring) {
            this.monitoring = Objects.requireNonNull(monitoring);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProducerProjectId(String producerProjectId) {
            this.producerProjectId = Objects.requireNonNull(producerProjectId);
            return this;
        }

        public Builder setQuota(QuotaResponse quota) {
            this.quota = Objects.requireNonNull(quota);
            return this;
        }

        public Builder setSourceInfo(SourceInfoResponse sourceInfo) {
            this.sourceInfo = Objects.requireNonNull(sourceInfo);
            return this;
        }

        public Builder setSystemParameters(SystemParametersResponse systemParameters) {
            this.systemParameters = Objects.requireNonNull(systemParameters);
            return this;
        }

        public Builder setSystemTypes(List<TypeResponse> systemTypes) {
            this.systemTypes = Objects.requireNonNull(systemTypes);
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }

        public Builder setTypes(List<TypeResponse> types) {
            this.types = Objects.requireNonNull(types);
            return this;
        }

        public Builder setUsage(UsageResponse usage) {
            this.usage = Objects.requireNonNull(usage);
            return this;
        }
        public GetConfigResult build() {
            return new GetConfigResult(apis, authentication, backend, billing, configVersion, context, control, customError, documentation, endpoints, enums, http, logging, logs, metrics, monitoredResources, monitoring, name, producerProjectId, quota, sourceInfo, systemParameters, systemTypes, title, types, usage);
        }
    }
}
