// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.monitoring.outputs.GetIstioCanonicalServiceTelemetry;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetIstioCanonicalServiceResult {
    private final String canonicalService;
    private final String canonicalServiceNamespace;
    private final String displayName;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String meshUid;
    private final String name;
    private final @Nullable String project;
    private final String serviceId;
    private final List<GetIstioCanonicalServiceTelemetry> telemetries;

    @OutputCustomType.Constructor({"canonicalService","canonicalServiceNamespace","displayName","id","meshUid","name","project","serviceId","telemetries"})
    private GetIstioCanonicalServiceResult(
        String canonicalService,
        String canonicalServiceNamespace,
        String displayName,
        String id,
        String meshUid,
        String name,
        @Nullable String project,
        String serviceId,
        List<GetIstioCanonicalServiceTelemetry> telemetries) {
        this.canonicalService = Objects.requireNonNull(canonicalService);
        this.canonicalServiceNamespace = Objects.requireNonNull(canonicalServiceNamespace);
        this.displayName = Objects.requireNonNull(displayName);
        this.id = Objects.requireNonNull(id);
        this.meshUid = Objects.requireNonNull(meshUid);
        this.name = Objects.requireNonNull(name);
        this.project = project;
        this.serviceId = Objects.requireNonNull(serviceId);
        this.telemetries = Objects.requireNonNull(telemetries);
    }

    public String getCanonicalService() {
        return this.canonicalService;
    }
    public String getCanonicalServiceNamespace() {
        return this.canonicalServiceNamespace;
    }
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getMeshUid() {
        return this.meshUid;
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getProject() {
        return Optional.ofNullable(this.project);
    }
    public String getServiceId() {
        return this.serviceId;
    }
    public List<GetIstioCanonicalServiceTelemetry> getTelemetries() {
        return this.telemetries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIstioCanonicalServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String canonicalService;
        private String canonicalServiceNamespace;
        private String displayName;
        private String id;
        private String meshUid;
        private String name;
        private @Nullable String project;
        private String serviceId;
        private List<GetIstioCanonicalServiceTelemetry> telemetries;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIstioCanonicalServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canonicalService = defaults.canonicalService;
    	      this.canonicalServiceNamespace = defaults.canonicalServiceNamespace;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.meshUid = defaults.meshUid;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.serviceId = defaults.serviceId;
    	      this.telemetries = defaults.telemetries;
        }

        public Builder setCanonicalService(String canonicalService) {
            this.canonicalService = Objects.requireNonNull(canonicalService);
            return this;
        }

        public Builder setCanonicalServiceNamespace(String canonicalServiceNamespace) {
            this.canonicalServiceNamespace = Objects.requireNonNull(canonicalServiceNamespace);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setMeshUid(String meshUid) {
            this.meshUid = Objects.requireNonNull(meshUid);
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

        public Builder setServiceId(String serviceId) {
            this.serviceId = Objects.requireNonNull(serviceId);
            return this;
        }

        public Builder setTelemetries(List<GetIstioCanonicalServiceTelemetry> telemetries) {
            this.telemetries = Objects.requireNonNull(telemetries);
            return this;
        }
        public GetIstioCanonicalServiceResult build() {
            return new GetIstioCanonicalServiceResult(canonicalService, canonicalServiceNamespace, displayName, id, meshUid, name, project, serviceId, telemetries);
        }
    }
}
