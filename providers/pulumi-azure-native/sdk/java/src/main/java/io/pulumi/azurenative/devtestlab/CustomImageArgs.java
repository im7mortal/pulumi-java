// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab;

import io.pulumi.azurenative.devtestlab.inputs.CustomImagePropertiesCustomArgs;
import io.pulumi.azurenative.devtestlab.inputs.CustomImagePropertiesFromPlanArgs;
import io.pulumi.azurenative.devtestlab.inputs.CustomImagePropertiesFromVmArgs;
import io.pulumi.azurenative.devtestlab.inputs.DataDiskStorageTypeInfoArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomImageArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomImageArgs Empty = new CustomImageArgs();

    @InputImport(name="author")
    private final @Nullable Input<String> author;

    public Input<String> getAuthor() {
        return this.author == null ? Input.empty() : this.author;
    }

    @InputImport(name="customImagePlan")
    private final @Nullable Input<CustomImagePropertiesFromPlanArgs> customImagePlan;

    public Input<CustomImagePropertiesFromPlanArgs> getCustomImagePlan() {
        return this.customImagePlan == null ? Input.empty() : this.customImagePlan;
    }

    @InputImport(name="dataDiskStorageInfo")
    private final @Nullable Input<List<DataDiskStorageTypeInfoArgs>> dataDiskStorageInfo;

    public Input<List<DataDiskStorageTypeInfoArgs>> getDataDiskStorageInfo() {
        return this.dataDiskStorageInfo == null ? Input.empty() : this.dataDiskStorageInfo;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="isPlanAuthorized")
    private final @Nullable Input<Boolean> isPlanAuthorized;

    public Input<Boolean> getIsPlanAuthorized() {
        return this.isPlanAuthorized == null ? Input.empty() : this.isPlanAuthorized;
    }

    @InputImport(name="labName", required=true)
    private final Input<String> labName;

    public Input<String> getLabName() {
        return this.labName;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="managedImageId")
    private final @Nullable Input<String> managedImageId;

    public Input<String> getManagedImageId() {
        return this.managedImageId == null ? Input.empty() : this.managedImageId;
    }

    @InputImport(name="managedSnapshotId")
    private final @Nullable Input<String> managedSnapshotId;

    public Input<String> getManagedSnapshotId() {
        return this.managedSnapshotId == null ? Input.empty() : this.managedSnapshotId;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="vhd")
    private final @Nullable Input<CustomImagePropertiesCustomArgs> vhd;

    public Input<CustomImagePropertiesCustomArgs> getVhd() {
        return this.vhd == null ? Input.empty() : this.vhd;
    }

    @InputImport(name="vm")
    private final @Nullable Input<CustomImagePropertiesFromVmArgs> vm;

    public Input<CustomImagePropertiesFromVmArgs> getVm() {
        return this.vm == null ? Input.empty() : this.vm;
    }

    public CustomImageArgs(
        @Nullable Input<String> author,
        @Nullable Input<CustomImagePropertiesFromPlanArgs> customImagePlan,
        @Nullable Input<List<DataDiskStorageTypeInfoArgs>> dataDiskStorageInfo,
        @Nullable Input<String> description,
        @Nullable Input<Boolean> isPlanAuthorized,
        Input<String> labName,
        @Nullable Input<String> location,
        @Nullable Input<String> managedImageId,
        @Nullable Input<String> managedSnapshotId,
        @Nullable Input<String> name,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<CustomImagePropertiesCustomArgs> vhd,
        @Nullable Input<CustomImagePropertiesFromVmArgs> vm) {
        this.author = author;
        this.customImagePlan = customImagePlan;
        this.dataDiskStorageInfo = dataDiskStorageInfo;
        this.description = description;
        this.isPlanAuthorized = isPlanAuthorized;
        this.labName = Objects.requireNonNull(labName, "expected parameter 'labName' to be non-null");
        this.location = location;
        this.managedImageId = managedImageId;
        this.managedSnapshotId = managedSnapshotId;
        this.name = name;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.vhd = vhd;
        this.vm = vm;
    }

    private CustomImageArgs() {
        this.author = Input.empty();
        this.customImagePlan = Input.empty();
        this.dataDiskStorageInfo = Input.empty();
        this.description = Input.empty();
        this.isPlanAuthorized = Input.empty();
        this.labName = Input.empty();
        this.location = Input.empty();
        this.managedImageId = Input.empty();
        this.managedSnapshotId = Input.empty();
        this.name = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
        this.vhd = Input.empty();
        this.vm = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> author;
        private @Nullable Input<CustomImagePropertiesFromPlanArgs> customImagePlan;
        private @Nullable Input<List<DataDiskStorageTypeInfoArgs>> dataDiskStorageInfo;
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> isPlanAuthorized;
        private Input<String> labName;
        private @Nullable Input<String> location;
        private @Nullable Input<String> managedImageId;
        private @Nullable Input<String> managedSnapshotId;
        private @Nullable Input<String> name;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<CustomImagePropertiesCustomArgs> vhd;
        private @Nullable Input<CustomImagePropertiesFromVmArgs> vm;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomImageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.author = defaults.author;
    	      this.customImagePlan = defaults.customImagePlan;
    	      this.dataDiskStorageInfo = defaults.dataDiskStorageInfo;
    	      this.description = defaults.description;
    	      this.isPlanAuthorized = defaults.isPlanAuthorized;
    	      this.labName = defaults.labName;
    	      this.location = defaults.location;
    	      this.managedImageId = defaults.managedImageId;
    	      this.managedSnapshotId = defaults.managedSnapshotId;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.vhd = defaults.vhd;
    	      this.vm = defaults.vm;
        }

        public Builder setAuthor(@Nullable Input<String> author) {
            this.author = author;
            return this;
        }

        public Builder setAuthor(@Nullable String author) {
            this.author = Input.ofNullable(author);
            return this;
        }

        public Builder setCustomImagePlan(@Nullable Input<CustomImagePropertiesFromPlanArgs> customImagePlan) {
            this.customImagePlan = customImagePlan;
            return this;
        }

        public Builder setCustomImagePlan(@Nullable CustomImagePropertiesFromPlanArgs customImagePlan) {
            this.customImagePlan = Input.ofNullable(customImagePlan);
            return this;
        }

        public Builder setDataDiskStorageInfo(@Nullable Input<List<DataDiskStorageTypeInfoArgs>> dataDiskStorageInfo) {
            this.dataDiskStorageInfo = dataDiskStorageInfo;
            return this;
        }

        public Builder setDataDiskStorageInfo(@Nullable List<DataDiskStorageTypeInfoArgs> dataDiskStorageInfo) {
            this.dataDiskStorageInfo = Input.ofNullable(dataDiskStorageInfo);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setIsPlanAuthorized(@Nullable Input<Boolean> isPlanAuthorized) {
            this.isPlanAuthorized = isPlanAuthorized;
            return this;
        }

        public Builder setIsPlanAuthorized(@Nullable Boolean isPlanAuthorized) {
            this.isPlanAuthorized = Input.ofNullable(isPlanAuthorized);
            return this;
        }

        public Builder setLabName(Input<String> labName) {
            this.labName = Objects.requireNonNull(labName);
            return this;
        }

        public Builder setLabName(String labName) {
            this.labName = Input.of(Objects.requireNonNull(labName));
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setManagedImageId(@Nullable Input<String> managedImageId) {
            this.managedImageId = managedImageId;
            return this;
        }

        public Builder setManagedImageId(@Nullable String managedImageId) {
            this.managedImageId = Input.ofNullable(managedImageId);
            return this;
        }

        public Builder setManagedSnapshotId(@Nullable Input<String> managedSnapshotId) {
            this.managedSnapshotId = managedSnapshotId;
            return this;
        }

        public Builder setManagedSnapshotId(@Nullable String managedSnapshotId) {
            this.managedSnapshotId = Input.ofNullable(managedSnapshotId);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setVhd(@Nullable Input<CustomImagePropertiesCustomArgs> vhd) {
            this.vhd = vhd;
            return this;
        }

        public Builder setVhd(@Nullable CustomImagePropertiesCustomArgs vhd) {
            this.vhd = Input.ofNullable(vhd);
            return this;
        }

        public Builder setVm(@Nullable Input<CustomImagePropertiesFromVmArgs> vm) {
            this.vm = vm;
            return this;
        }

        public Builder setVm(@Nullable CustomImagePropertiesFromVmArgs vm) {
            this.vm = Input.ofNullable(vm);
            return this;
        }

        public CustomImageArgs build() {
            return new CustomImageArgs(author, customImagePlan, dataDiskStorageInfo, description, isPlanAuthorized, labName, location, managedImageId, managedSnapshotId, name, resourceGroupName, tags, vhd, vm);
        }
    }
}