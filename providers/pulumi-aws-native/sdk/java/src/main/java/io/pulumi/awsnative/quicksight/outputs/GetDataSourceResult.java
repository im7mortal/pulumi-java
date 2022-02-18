// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.awsnative.quicksight.enums.DataSourceResourceStatus;
import io.pulumi.awsnative.quicksight.outputs.DataSourceErrorInfo;
import io.pulumi.awsnative.quicksight.outputs.DataSourceParameters;
import io.pulumi.awsnative.quicksight.outputs.DataSourceResourcePermission;
import io.pulumi.awsnative.quicksight.outputs.DataSourceSslProperties;
import io.pulumi.awsnative.quicksight.outputs.DataSourceTag;
import io.pulumi.awsnative.quicksight.outputs.DataSourceVpcConnectionProperties;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDataSourceResult {
    /**
     * <p>A set of alternate data source parameters that you want to share for the credentials
     *             stored with this data source. The credentials are applied in tandem with the data source
     *             parameters when you copy a data source by using a create or update request. The API
     *             operation compares the <code>DataSourceParameters</code> structure that's in the request
     *             with the structures in the <code>AlternateDataSourceParameters</code> allow list. If the
     *             structures are an exact match, the request is allowed to use the credentials from this
     *             existing data source. If the <code>AlternateDataSourceParameters</code> list is null,
     *             the <code>Credentials</code> originally used with this <code>DataSourceParameters</code>
     *             are automatically allowed.</p>
     * 
     */
    private final @Nullable List<DataSourceParameters> alternateDataSourceParameters;
    /**
     * <p>The Amazon Resource Name (ARN) of the data source.</p>
     * 
     */
    private final @Nullable String arn;
    /**
     * <p>The time that this data source was created.</p>
     * 
     */
    private final @Nullable String createdTime;
    private final @Nullable DataSourceParameters dataSourceParameters;
    private final @Nullable DataSourceErrorInfo errorInfo;
    /**
     * <p>The last time that this data source was updated.</p>
     * 
     */
    private final @Nullable String lastUpdatedTime;
    /**
     * <p>A display name for the data source.</p>
     * 
     */
    private final @Nullable String name;
    /**
     * <p>A list of resource permissions on the data source.</p>
     * 
     */
    private final @Nullable List<DataSourceResourcePermission> permissions;
    private final @Nullable DataSourceSslProperties sslProperties;
    private final @Nullable DataSourceResourceStatus status;
    /**
     * <p>Contains a map of the key-value pairs for the resource tag or tags assigned to the data source.</p>
     * 
     */
    private final @Nullable List<DataSourceTag> tags;
    private final @Nullable DataSourceVpcConnectionProperties vpcConnectionProperties;

    @OutputCustomType.Constructor({"alternateDataSourceParameters","arn","createdTime","dataSourceParameters","errorInfo","lastUpdatedTime","name","permissions","sslProperties","status","tags","vpcConnectionProperties"})
    private GetDataSourceResult(
        @Nullable List<DataSourceParameters> alternateDataSourceParameters,
        @Nullable String arn,
        @Nullable String createdTime,
        @Nullable DataSourceParameters dataSourceParameters,
        @Nullable DataSourceErrorInfo errorInfo,
        @Nullable String lastUpdatedTime,
        @Nullable String name,
        @Nullable List<DataSourceResourcePermission> permissions,
        @Nullable DataSourceSslProperties sslProperties,
        @Nullable DataSourceResourceStatus status,
        @Nullable List<DataSourceTag> tags,
        @Nullable DataSourceVpcConnectionProperties vpcConnectionProperties) {
        this.alternateDataSourceParameters = alternateDataSourceParameters;
        this.arn = arn;
        this.createdTime = createdTime;
        this.dataSourceParameters = dataSourceParameters;
        this.errorInfo = errorInfo;
        this.lastUpdatedTime = lastUpdatedTime;
        this.name = name;
        this.permissions = permissions;
        this.sslProperties = sslProperties;
        this.status = status;
        this.tags = tags;
        this.vpcConnectionProperties = vpcConnectionProperties;
    }

    /**
     * <p>A set of alternate data source parameters that you want to share for the credentials
     *             stored with this data source. The credentials are applied in tandem with the data source
     *             parameters when you copy a data source by using a create or update request. The API
     *             operation compares the <code>DataSourceParameters</code> structure that's in the request
     *             with the structures in the <code>AlternateDataSourceParameters</code> allow list. If the
     *             structures are an exact match, the request is allowed to use the credentials from this
     *             existing data source. If the <code>AlternateDataSourceParameters</code> list is null,
     *             the <code>Credentials</code> originally used with this <code>DataSourceParameters</code>
     *             are automatically allowed.</p>
     * 
     */
    public List<DataSourceParameters> getAlternateDataSourceParameters() {
        return this.alternateDataSourceParameters == null ? List.of() : this.alternateDataSourceParameters;
    }
    /**
     * <p>The Amazon Resource Name (ARN) of the data source.</p>
     * 
     */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * <p>The time that this data source was created.</p>
     * 
     */
    public Optional<String> getCreatedTime() {
        return Optional.ofNullable(this.createdTime);
    }
    public Optional<DataSourceParameters> getDataSourceParameters() {
        return Optional.ofNullable(this.dataSourceParameters);
    }
    public Optional<DataSourceErrorInfo> getErrorInfo() {
        return Optional.ofNullable(this.errorInfo);
    }
    /**
     * <p>The last time that this data source was updated.</p>
     * 
     */
    public Optional<String> getLastUpdatedTime() {
        return Optional.ofNullable(this.lastUpdatedTime);
    }
    /**
     * <p>A display name for the data source.</p>
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * <p>A list of resource permissions on the data source.</p>
     * 
     */
    public List<DataSourceResourcePermission> getPermissions() {
        return this.permissions == null ? List.of() : this.permissions;
    }
    public Optional<DataSourceSslProperties> getSslProperties() {
        return Optional.ofNullable(this.sslProperties);
    }
    public Optional<DataSourceResourceStatus> getStatus() {
        return Optional.ofNullable(this.status);
    }
    /**
     * <p>Contains a map of the key-value pairs for the resource tag or tags assigned to the data source.</p>
     * 
     */
    public List<DataSourceTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    public Optional<DataSourceVpcConnectionProperties> getVpcConnectionProperties() {
        return Optional.ofNullable(this.vpcConnectionProperties);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataSourceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DataSourceParameters> alternateDataSourceParameters;
        private @Nullable String arn;
        private @Nullable String createdTime;
        private @Nullable DataSourceParameters dataSourceParameters;
        private @Nullable DataSourceErrorInfo errorInfo;
        private @Nullable String lastUpdatedTime;
        private @Nullable String name;
        private @Nullable List<DataSourceResourcePermission> permissions;
        private @Nullable DataSourceSslProperties sslProperties;
        private @Nullable DataSourceResourceStatus status;
        private @Nullable List<DataSourceTag> tags;
        private @Nullable DataSourceVpcConnectionProperties vpcConnectionProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataSourceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alternateDataSourceParameters = defaults.alternateDataSourceParameters;
    	      this.arn = defaults.arn;
    	      this.createdTime = defaults.createdTime;
    	      this.dataSourceParameters = defaults.dataSourceParameters;
    	      this.errorInfo = defaults.errorInfo;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.name = defaults.name;
    	      this.permissions = defaults.permissions;
    	      this.sslProperties = defaults.sslProperties;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.vpcConnectionProperties = defaults.vpcConnectionProperties;
        }

        public Builder setAlternateDataSourceParameters(@Nullable List<DataSourceParameters> alternateDataSourceParameters) {
            this.alternateDataSourceParameters = alternateDataSourceParameters;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setCreatedTime(@Nullable String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        public Builder setDataSourceParameters(@Nullable DataSourceParameters dataSourceParameters) {
            this.dataSourceParameters = dataSourceParameters;
            return this;
        }

        public Builder setErrorInfo(@Nullable DataSourceErrorInfo errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }

        public Builder setLastUpdatedTime(@Nullable String lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPermissions(@Nullable List<DataSourceResourcePermission> permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder setSslProperties(@Nullable DataSourceSslProperties sslProperties) {
            this.sslProperties = sslProperties;
            return this;
        }

        public Builder setStatus(@Nullable DataSourceResourceStatus status) {
            this.status = status;
            return this;
        }

        public Builder setTags(@Nullable List<DataSourceTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setVpcConnectionProperties(@Nullable DataSourceVpcConnectionProperties vpcConnectionProperties) {
            this.vpcConnectionProperties = vpcConnectionProperties;
            return this;
        }

        public GetDataSourceResult build() {
            return new GetDataSourceResult(alternateDataSourceParameters, arn, createdTime, dataSourceParameters, errorInfo, lastUpdatedTime, name, permissions, sslProperties, status, tags, vpcConnectionProperties);
        }
    }
}
