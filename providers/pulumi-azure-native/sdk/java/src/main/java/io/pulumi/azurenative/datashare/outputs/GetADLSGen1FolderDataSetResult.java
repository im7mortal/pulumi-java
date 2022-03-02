// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.outputs;

import io.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetADLSGen1FolderDataSetResult {
    /**
     * The ADLS account name.
     * 
     */
    private final String accountName;
    /**
     * Unique id for identifying a data set resource
     * 
     */
    private final String dataSetId;
    /**
     * The folder path within the ADLS account.
     * 
     */
    private final String folderPath;
    /**
     * The resource id of the azure resource
     * 
     */
    private final String id;
    /**
     * Kind of data set.
     * Expected value is 'AdlsGen1Folder'.
     * 
     */
    private final String kind;
    /**
     * Name of the azure resource
     * 
     */
    private final String name;
    /**
     * Resource group of ADLS account.
     * 
     */
    private final String resourceGroup;
    /**
     * Subscription id of ADLS account.
     * 
     */
    private final String subscriptionId;
    /**
     * System Data of the Azure resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Type of the azure resource
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"accountName","dataSetId","folderPath","id","kind","name","resourceGroup","subscriptionId","systemData","type"})
    private GetADLSGen1FolderDataSetResult(
        String accountName,
        String dataSetId,
        String folderPath,
        String id,
        String kind,
        String name,
        String resourceGroup,
        String subscriptionId,
        SystemDataResponse systemData,
        String type) {
        this.accountName = Objects.requireNonNull(accountName);
        this.dataSetId = Objects.requireNonNull(dataSetId);
        this.folderPath = Objects.requireNonNull(folderPath);
        this.id = Objects.requireNonNull(id);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.resourceGroup = Objects.requireNonNull(resourceGroup);
        this.subscriptionId = Objects.requireNonNull(subscriptionId);
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The ADLS account name.
     * 
    */
    public String getAccountName() {
        return this.accountName;
    }
    /**
     * Unique id for identifying a data set resource
     * 
    */
    public String getDataSetId() {
        return this.dataSetId;
    }
    /**
     * The folder path within the ADLS account.
     * 
    */
    public String getFolderPath() {
        return this.folderPath;
    }
    /**
     * The resource id of the azure resource
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Kind of data set.
     * Expected value is 'AdlsGen1Folder'.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Name of the azure resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Resource group of ADLS account.
     * 
    */
    public String getResourceGroup() {
        return this.resourceGroup;
    }
    /**
     * Subscription id of ADLS account.
     * 
    */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }
    /**
     * System Data of the Azure resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Type of the azure resource
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetADLSGen1FolderDataSetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String dataSetId;
        private String folderPath;
        private String id;
        private String kind;
        private String name;
        private String resourceGroup;
        private String subscriptionId;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetADLSGen1FolderDataSetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.dataSetId = defaults.dataSetId;
    	      this.folderPath = defaults.folderPath;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setDataSetId(String dataSetId) {
            this.dataSetId = Objects.requireNonNull(dataSetId);
            return this;
        }

        public Builder setFolderPath(String folderPath) {
            this.folderPath = Objects.requireNonNull(folderPath);
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

        public Builder setResourceGroup(String resourceGroup) {
            this.resourceGroup = Objects.requireNonNull(resourceGroup);
            return this;
        }

        public Builder setSubscriptionId(String subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
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
        public GetADLSGen1FolderDataSetResult build() {
            return new GetADLSGen1FolderDataSetResult(accountName, dataSetId, folderPath, id, kind, name, resourceGroup, subscriptionId, systemData, type);
        }
    }
}
