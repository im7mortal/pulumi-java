// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.outputs;

import io.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetSynapseWorkspaceSqlPoolTableDataSetMappingResult {
    private final String dataSetId;
    private final String dataSetMappingStatus;
    private final String id;
    private final String kind;
    private final String name;
    private final String provisioningState;
    private final String synapseWorkspaceSqlPoolTableResourceId;
    private final SystemDataResponse systemData;
    private final String type;

    @OutputCustomType.Constructor({"dataSetId","dataSetMappingStatus","id","kind","name","provisioningState","synapseWorkspaceSqlPoolTableResourceId","systemData","type"})
    private GetSynapseWorkspaceSqlPoolTableDataSetMappingResult(
        String dataSetId,
        String dataSetMappingStatus,
        String id,
        String kind,
        String name,
        String provisioningState,
        String synapseWorkspaceSqlPoolTableResourceId,
        SystemDataResponse systemData,
        String type) {
        this.dataSetId = Objects.requireNonNull(dataSetId);
        this.dataSetMappingStatus = Objects.requireNonNull(dataSetMappingStatus);
        this.id = Objects.requireNonNull(id);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.synapseWorkspaceSqlPoolTableResourceId = Objects.requireNonNull(synapseWorkspaceSqlPoolTableResourceId);
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    public String getDataSetId() {
        return this.dataSetId;
    }
    public String getDataSetMappingStatus() {
        return this.dataSetMappingStatus;
    }
    public String getId() {
        return this.id;
    }
    public String getKind() {
        return this.kind;
    }
    public String getName() {
        return this.name;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public String getSynapseWorkspaceSqlPoolTableResourceId() {
        return this.synapseWorkspaceSqlPoolTableResourceId;
    }
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSynapseWorkspaceSqlPoolTableDataSetMappingResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataSetId;
        private String dataSetMappingStatus;
        private String id;
        private String kind;
        private String name;
        private String provisioningState;
        private String synapseWorkspaceSqlPoolTableResourceId;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSynapseWorkspaceSqlPoolTableDataSetMappingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSetId = defaults.dataSetId;
    	      this.dataSetMappingStatus = defaults.dataSetMappingStatus;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.synapseWorkspaceSqlPoolTableResourceId = defaults.synapseWorkspaceSqlPoolTableResourceId;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setDataSetId(String dataSetId) {
            this.dataSetId = Objects.requireNonNull(dataSetId);
            return this;
        }

        public Builder setDataSetMappingStatus(String dataSetMappingStatus) {
            this.dataSetMappingStatus = Objects.requireNonNull(dataSetMappingStatus);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
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

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSynapseWorkspaceSqlPoolTableResourceId(String synapseWorkspaceSqlPoolTableResourceId) {
            this.synapseWorkspaceSqlPoolTableResourceId = Objects.requireNonNull(synapseWorkspaceSqlPoolTableResourceId);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetSynapseWorkspaceSqlPoolTableDataSetMappingResult build() {
            return new GetSynapseWorkspaceSqlPoolTableDataSetMappingResult(dataSetId, dataSetMappingStatus, id, kind, name, provisioningState, synapseWorkspaceSqlPoolTableResourceId, systemData, type);
        }
    }
}