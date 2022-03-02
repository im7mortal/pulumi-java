// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.AzureActiveDirectoryAppResponse;
import io.pulumi.azurenative.datamigration.outputs.MiSqlConnectionInfoResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class ConnectToTargetSqlMISyncTaskInputResponse {
    /**
     * Azure Active Directory Application the DMS instance will use to connect to the target instance of Azure SQL Database Managed Instance and the Azure Storage Account
     * 
     */
    private final AzureActiveDirectoryAppResponse azureApp;
    /**
     * Connection information for Azure SQL Database Managed Instance
     * 
     */
    private final MiSqlConnectionInfoResponse targetConnectionInfo;

    @OutputCustomType.Constructor({"azureApp","targetConnectionInfo"})
    private ConnectToTargetSqlMISyncTaskInputResponse(
        AzureActiveDirectoryAppResponse azureApp,
        MiSqlConnectionInfoResponse targetConnectionInfo) {
        this.azureApp = Objects.requireNonNull(azureApp);
        this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
    }

    /**
     * Azure Active Directory Application the DMS instance will use to connect to the target instance of Azure SQL Database Managed Instance and the Azure Storage Account
     * 
    */
    public AzureActiveDirectoryAppResponse getAzureApp() {
        return this.azureApp;
    }
    /**
     * Connection information for Azure SQL Database Managed Instance
     * 
    */
    public MiSqlConnectionInfoResponse getTargetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToTargetSqlMISyncTaskInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureActiveDirectoryAppResponse azureApp;
        private MiSqlConnectionInfoResponse targetConnectionInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToTargetSqlMISyncTaskInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureApp = defaults.azureApp;
    	      this.targetConnectionInfo = defaults.targetConnectionInfo;
        }

        public Builder setAzureApp(AzureActiveDirectoryAppResponse azureApp) {
            this.azureApp = Objects.requireNonNull(azureApp);
            return this;
        }

        public Builder setTargetConnectionInfo(MiSqlConnectionInfoResponse targetConnectionInfo) {
            this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
            return this;
        }
        public ConnectToTargetSqlMISyncTaskInputResponse build() {
            return new ConnectToTargetSqlMISyncTaskInputResponse(azureApp, targetConnectionInfo);
        }
    }
}
