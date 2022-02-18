// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.awsnative.quicksight.enums.DataSetRowLevelPermissionFormatVersion;
import io.pulumi.awsnative.quicksight.enums.DataSetRowLevelPermissionPolicy;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * <p>The row-level security configuration for the dataset.</p>
 * 
 */
public final class DataSetRowLevelPermissionDataSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSetRowLevelPermissionDataSetArgs Empty = new DataSetRowLevelPermissionDataSetArgs();

    /**
     * <p>The Amazon Resource Name (ARN) of the permission dataset.</p>
     * 
     */
    @InputImport(name="arn", required=true)
    private final Input<String> arn;

    public Input<String> getArn() {
        return this.arn;
    }

    @InputImport(name="formatVersion")
    private final @Nullable Input<DataSetRowLevelPermissionFormatVersion> formatVersion;

    public Input<DataSetRowLevelPermissionFormatVersion> getFormatVersion() {
        return this.formatVersion == null ? Input.empty() : this.formatVersion;
    }

    /**
     * <p>The namespace associated with the row-level permissions dataset.</p>
     * 
     */
    @InputImport(name="namespace")
    private final @Nullable Input<String> namespace;

    public Input<String> getNamespace() {
        return this.namespace == null ? Input.empty() : this.namespace;
    }

    @InputImport(name="permissionPolicy", required=true)
    private final Input<DataSetRowLevelPermissionPolicy> permissionPolicy;

    public Input<DataSetRowLevelPermissionPolicy> getPermissionPolicy() {
        return this.permissionPolicy;
    }

    public DataSetRowLevelPermissionDataSetArgs(
        Input<String> arn,
        @Nullable Input<DataSetRowLevelPermissionFormatVersion> formatVersion,
        @Nullable Input<String> namespace,
        Input<DataSetRowLevelPermissionPolicy> permissionPolicy) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.formatVersion = formatVersion;
        this.namespace = namespace;
        this.permissionPolicy = Objects.requireNonNull(permissionPolicy, "expected parameter 'permissionPolicy' to be non-null");
    }

    private DataSetRowLevelPermissionDataSetArgs() {
        this.arn = Input.empty();
        this.formatVersion = Input.empty();
        this.namespace = Input.empty();
        this.permissionPolicy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSetRowLevelPermissionDataSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> arn;
        private @Nullable Input<DataSetRowLevelPermissionFormatVersion> formatVersion;
        private @Nullable Input<String> namespace;
        private Input<DataSetRowLevelPermissionPolicy> permissionPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSetRowLevelPermissionDataSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.formatVersion = defaults.formatVersion;
    	      this.namespace = defaults.namespace;
    	      this.permissionPolicy = defaults.permissionPolicy;
        }

        public Builder setArn(Input<String> arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setArn(String arn) {
            this.arn = Input.of(Objects.requireNonNull(arn));
            return this;
        }

        public Builder setFormatVersion(@Nullable Input<DataSetRowLevelPermissionFormatVersion> formatVersion) {
            this.formatVersion = formatVersion;
            return this;
        }

        public Builder setFormatVersion(@Nullable DataSetRowLevelPermissionFormatVersion formatVersion) {
            this.formatVersion = Input.ofNullable(formatVersion);
            return this;
        }

        public Builder setNamespace(@Nullable Input<String> namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder setNamespace(@Nullable String namespace) {
            this.namespace = Input.ofNullable(namespace);
            return this;
        }

        public Builder setPermissionPolicy(Input<DataSetRowLevelPermissionPolicy> permissionPolicy) {
            this.permissionPolicy = Objects.requireNonNull(permissionPolicy);
            return this;
        }

        public Builder setPermissionPolicy(DataSetRowLevelPermissionPolicy permissionPolicy) {
            this.permissionPolicy = Input.of(Objects.requireNonNull(permissionPolicy));
            return this;
        }

        public DataSetRowLevelPermissionDataSetArgs build() {
            return new DataSetRowLevelPermissionDataSetArgs(arn, formatVersion, namespace, permissionPolicy);
        }
    }
}
