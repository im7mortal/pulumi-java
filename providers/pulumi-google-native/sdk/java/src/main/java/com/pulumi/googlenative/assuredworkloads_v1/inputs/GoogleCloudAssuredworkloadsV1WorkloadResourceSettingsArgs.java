// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.assuredworkloads_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.assuredworkloads_v1.enums.GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsResourceType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represent the custom settings for the resources to be created.
 * 
 */
public final class GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsArgs Empty = new GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsArgs();

    /**
     * User-assigned resource display name. If not empty it will be used to create a resource with the specified name.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return User-assigned resource display name. If not empty it will be used to create a resource with the specified name.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Resource identifier. For a project this represents project_id. If the project is already taken, the workload creation will fail. For KeyRing, this represents the keyring_id. For a folder, don&#39;t set this value as folder_id is assigned by Google.
     * 
     */
    @Import(name="resourceId")
    private @Nullable Output<String> resourceId;

    /**
     * @return Resource identifier. For a project this represents project_id. If the project is already taken, the workload creation will fail. For KeyRing, this represents the keyring_id. For a folder, don&#39;t set this value as folder_id is assigned by Google.
     * 
     */
    public Optional<Output<String>> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    /**
     * Indicates the type of resource. This field should be specified to correspond the id to the right project type (CONSUMER_PROJECT or ENCRYPTION_KEYS_PROJECT)
     * 
     */
    @Import(name="resourceType")
    private @Nullable Output<GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsResourceType> resourceType;

    /**
     * @return Indicates the type of resource. This field should be specified to correspond the id to the right project type (CONSUMER_PROJECT or ENCRYPTION_KEYS_PROJECT)
     * 
     */
    public Optional<Output<GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsResourceType>> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }

    private GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsArgs() {}

    private GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsArgs(GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsArgs $) {
        this.displayName = $.displayName;
        this.resourceId = $.resourceId;
        this.resourceType = $.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsArgs $;

        public Builder() {
            $ = new GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsArgs();
        }

        public Builder(GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsArgs defaults) {
            $ = new GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayName User-assigned resource display name. If not empty it will be used to create a resource with the specified name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName User-assigned resource display name. If not empty it will be used to create a resource with the specified name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param resourceId Resource identifier. For a project this represents project_id. If the project is already taken, the workload creation will fail. For KeyRing, this represents the keyring_id. For a folder, don&#39;t set this value as folder_id is assigned by Google.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(@Nullable Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        /**
         * @param resourceId Resource identifier. For a project this represents project_id. If the project is already taken, the workload creation will fail. For KeyRing, this represents the keyring_id. For a folder, don&#39;t set this value as folder_id is assigned by Google.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        /**
         * @param resourceType Indicates the type of resource. This field should be specified to correspond the id to the right project type (CONSUMER_PROJECT or ENCRYPTION_KEYS_PROJECT)
         * 
         * @return builder
         * 
         */
        public Builder resourceType(@Nullable Output<GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsResourceType> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param resourceType Indicates the type of resource. This field should be specified to correspond the id to the right project type (CONSUMER_PROJECT or ENCRYPTION_KEYS_PROJECT)
         * 
         * @return builder
         * 
         */
        public Builder resourceType(GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsResourceType resourceType) {
            return resourceType(Output.of(resourceType));
        }

        public GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsArgs build() {
            return $;
        }
    }

}
