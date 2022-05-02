// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.connectors_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.connectors_v1.inputs.AuthConfigArgs;
import com.pulumi.googlenative.connectors_v1.inputs.ConfigVariableArgs;
import com.pulumi.googlenative.connectors_v1.inputs.LockConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionArgs Empty = new ConnectionArgs();

    /**
     * Optional. Configuration for establishing the connection&#39;s authentication with an external system.
     * 
     */
    @Import(name="authConfig")
    private @Nullable Output<AuthConfigArgs> authConfig;

    /**
     * @return Optional. Configuration for establishing the connection&#39;s authentication with an external system.
     * 
     */
    public Optional<Output<AuthConfigArgs>> authConfig() {
        return Optional.ofNullable(this.authConfig);
    }

    /**
     * Optional. Configuration for configuring the connection with an external system.
     * 
     */
    @Import(name="configVariables")
    private @Nullable Output<List<ConfigVariableArgs>> configVariables;

    /**
     * @return Optional. Configuration for configuring the connection with an external system.
     * 
     */
    public Optional<Output<List<ConfigVariableArgs>>> configVariables() {
        return Optional.ofNullable(this.configVariables);
    }

    /**
     * Required. Identifier to assign to the Connection. Must be unique within scope of the parent resource.
     * 
     */
    @Import(name="connectionId", required=true)
    private Output<String> connectionId;

    /**
     * @return Required. Identifier to assign to the Connection. Must be unique within scope of the parent resource.
     * 
     */
    public Output<String> connectionId() {
        return this.connectionId;
    }

    /**
     * Connector version on which the connection is created. The format is: projects/*{@literal /}locations/global/providers/*{@literal /}connectors/*{@literal /}versions/*
     * 
     */
    @Import(name="connectorVersion", required=true)
    private Output<String> connectorVersion;

    /**
     * @return Connector version on which the connection is created. The format is: projects/*{@literal /}locations/global/providers/*{@literal /}connectors/*{@literal /}versions/*
     * 
     */
    public Output<String> connectorVersion() {
        return this.connectorVersion;
    }

    /**
     * Optional. Description of the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Optional. Description of the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Optional. Configuration that indicates whether or not the Connection can be edited.
     * 
     */
    @Import(name="lockConfig")
    private @Nullable Output<LockConfigArgs> lockConfig;

    /**
     * @return Optional. Configuration that indicates whether or not the Connection can be edited.
     * 
     */
    public Optional<Output<LockConfigArgs>> lockConfig() {
        return Optional.ofNullable(this.lockConfig);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Optional. Service account needed for runtime plane to access GCP resources.
     * 
     */
    @Import(name="serviceAccount")
    private @Nullable Output<String> serviceAccount;

    /**
     * @return Optional. Service account needed for runtime plane to access GCP resources.
     * 
     */
    public Optional<Output<String>> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }

    /**
     * Optional. Suspended indicates if a user has suspended a connection or not.
     * 
     */
    @Import(name="suspended")
    private @Nullable Output<Boolean> suspended;

    /**
     * @return Optional. Suspended indicates if a user has suspended a connection or not.
     * 
     */
    public Optional<Output<Boolean>> suspended() {
        return Optional.ofNullable(this.suspended);
    }

    private ConnectionArgs() {}

    private ConnectionArgs(ConnectionArgs $) {
        this.authConfig = $.authConfig;
        this.configVariables = $.configVariables;
        this.connectionId = $.connectionId;
        this.connectorVersion = $.connectorVersion;
        this.description = $.description;
        this.labels = $.labels;
        this.location = $.location;
        this.lockConfig = $.lockConfig;
        this.project = $.project;
        this.serviceAccount = $.serviceAccount;
        this.suspended = $.suspended;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionArgs $;

        public Builder() {
            $ = new ConnectionArgs();
        }

        public Builder(ConnectionArgs defaults) {
            $ = new ConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authConfig Optional. Configuration for establishing the connection&#39;s authentication with an external system.
         * 
         * @return builder
         * 
         */
        public Builder authConfig(@Nullable Output<AuthConfigArgs> authConfig) {
            $.authConfig = authConfig;
            return this;
        }

        /**
         * @param authConfig Optional. Configuration for establishing the connection&#39;s authentication with an external system.
         * 
         * @return builder
         * 
         */
        public Builder authConfig(AuthConfigArgs authConfig) {
            return authConfig(Output.of(authConfig));
        }

        /**
         * @param configVariables Optional. Configuration for configuring the connection with an external system.
         * 
         * @return builder
         * 
         */
        public Builder configVariables(@Nullable Output<List<ConfigVariableArgs>> configVariables) {
            $.configVariables = configVariables;
            return this;
        }

        /**
         * @param configVariables Optional. Configuration for configuring the connection with an external system.
         * 
         * @return builder
         * 
         */
        public Builder configVariables(List<ConfigVariableArgs> configVariables) {
            return configVariables(Output.of(configVariables));
        }

        /**
         * @param configVariables Optional. Configuration for configuring the connection with an external system.
         * 
         * @return builder
         * 
         */
        public Builder configVariables(ConfigVariableArgs... configVariables) {
            return configVariables(List.of(configVariables));
        }

        /**
         * @param connectionId Required. Identifier to assign to the Connection. Must be unique within scope of the parent resource.
         * 
         * @return builder
         * 
         */
        public Builder connectionId(Output<String> connectionId) {
            $.connectionId = connectionId;
            return this;
        }

        /**
         * @param connectionId Required. Identifier to assign to the Connection. Must be unique within scope of the parent resource.
         * 
         * @return builder
         * 
         */
        public Builder connectionId(String connectionId) {
            return connectionId(Output.of(connectionId));
        }

        /**
         * @param connectorVersion Connector version on which the connection is created. The format is: projects/*{@literal /}locations/global/providers/*{@literal /}connectors/*{@literal /}versions/*
         * 
         * @return builder
         * 
         */
        public Builder connectorVersion(Output<String> connectorVersion) {
            $.connectorVersion = connectorVersion;
            return this;
        }

        /**
         * @param connectorVersion Connector version on which the connection is created. The format is: projects/*{@literal /}locations/global/providers/*{@literal /}connectors/*{@literal /}versions/*
         * 
         * @return builder
         * 
         */
        public Builder connectorVersion(String connectorVersion) {
            return connectorVersion(Output.of(connectorVersion));
        }

        /**
         * @param description Optional. Description of the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Optional. Description of the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param labels Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param lockConfig Optional. Configuration that indicates whether or not the Connection can be edited.
         * 
         * @return builder
         * 
         */
        public Builder lockConfig(@Nullable Output<LockConfigArgs> lockConfig) {
            $.lockConfig = lockConfig;
            return this;
        }

        /**
         * @param lockConfig Optional. Configuration that indicates whether or not the Connection can be edited.
         * 
         * @return builder
         * 
         */
        public Builder lockConfig(LockConfigArgs lockConfig) {
            return lockConfig(Output.of(lockConfig));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param serviceAccount Optional. Service account needed for runtime plane to access GCP resources.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        /**
         * @param serviceAccount Optional. Service account needed for runtime plane to access GCP resources.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(String serviceAccount) {
            return serviceAccount(Output.of(serviceAccount));
        }

        /**
         * @param suspended Optional. Suspended indicates if a user has suspended a connection or not.
         * 
         * @return builder
         * 
         */
        public Builder suspended(@Nullable Output<Boolean> suspended) {
            $.suspended = suspended;
            return this;
        }

        /**
         * @param suspended Optional. Suspended indicates if a user has suspended a connection or not.
         * 
         * @return builder
         * 
         */
        public Builder suspended(Boolean suspended) {
            return suspended(Output.of(suspended));
        }

        public ConnectionArgs build() {
            $.connectionId = Objects.requireNonNull($.connectionId, "expected parameter 'connectionId' to be non-null");
            $.connectorVersion = Objects.requireNonNull($.connectorVersion, "expected parameter 'connectorVersion' to be non-null");
            return $;
        }
    }

}
