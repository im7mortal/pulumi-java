// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiextensions.k8s.io_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1.inputs.CustomResourceDefinitionConditionArgs;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1.inputs.CustomResourceDefinitionNamesArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * CustomResourceDefinitionStatus indicates the state of the CustomResourceDefinition
 * 
 */
public final class CustomResourceDefinitionStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomResourceDefinitionStatusArgs Empty = new CustomResourceDefinitionStatusArgs();

    /**
     * acceptedNames are the names that are actually being used to serve discovery. They may be different than the names in spec.
     * 
     */
    @InputImport(name="acceptedNames", required=true)
    private final Input<CustomResourceDefinitionNamesArgs> acceptedNames;

    public Input<CustomResourceDefinitionNamesArgs> getAcceptedNames() {
        return this.acceptedNames;
    }

    /**
     * conditions indicate state for particular aspects of a CustomResourceDefinition
     * 
     */
    @InputImport(name="conditions")
    private final @Nullable Input<List<CustomResourceDefinitionConditionArgs>> conditions;

    public Input<List<CustomResourceDefinitionConditionArgs>> getConditions() {
        return this.conditions == null ? Input.empty() : this.conditions;
    }

    /**
     * storedVersions lists all versions of CustomResources that were ever persisted. Tracking these versions allows a migration path for stored versions in etcd. The field is mutable so a migration controller can finish a migration to another version (ensuring no old objects are left in storage), and then remove the rest of the versions from this list. Versions may not be removed from `spec.versions` while they exist in this list.
     * 
     */
    @InputImport(name="storedVersions", required=true)
    private final Input<List<String>> storedVersions;

    public Input<List<String>> getStoredVersions() {
        return this.storedVersions;
    }

    public CustomResourceDefinitionStatusArgs(
        Input<CustomResourceDefinitionNamesArgs> acceptedNames,
        @Nullable Input<List<CustomResourceDefinitionConditionArgs>> conditions,
        Input<List<String>> storedVersions) {
        this.acceptedNames = Objects.requireNonNull(acceptedNames, "expected parameter 'acceptedNames' to be non-null");
        this.conditions = conditions;
        this.storedVersions = Objects.requireNonNull(storedVersions, "expected parameter 'storedVersions' to be non-null");
    }

    private CustomResourceDefinitionStatusArgs() {
        this.acceptedNames = Input.empty();
        this.conditions = Input.empty();
        this.storedVersions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceDefinitionStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<CustomResourceDefinitionNamesArgs> acceptedNames;
        private @Nullable Input<List<CustomResourceDefinitionConditionArgs>> conditions;
        private Input<List<String>> storedVersions;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomResourceDefinitionStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptedNames = defaults.acceptedNames;
    	      this.conditions = defaults.conditions;
    	      this.storedVersions = defaults.storedVersions;
        }

        public Builder setAcceptedNames(Input<CustomResourceDefinitionNamesArgs> acceptedNames) {
            this.acceptedNames = Objects.requireNonNull(acceptedNames);
            return this;
        }

        public Builder setAcceptedNames(CustomResourceDefinitionNamesArgs acceptedNames) {
            this.acceptedNames = Input.of(Objects.requireNonNull(acceptedNames));
            return this;
        }

        public Builder setConditions(@Nullable Input<List<CustomResourceDefinitionConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setConditions(@Nullable List<CustomResourceDefinitionConditionArgs> conditions) {
            this.conditions = Input.ofNullable(conditions);
            return this;
        }

        public Builder setStoredVersions(Input<List<String>> storedVersions) {
            this.storedVersions = Objects.requireNonNull(storedVersions);
            return this;
        }

        public Builder setStoredVersions(List<String> storedVersions) {
            this.storedVersions = Input.of(Objects.requireNonNull(storedVersions));
            return this;
        }

        public CustomResourceDefinitionStatusArgs build() {
            return new CustomResourceDefinitionStatusArgs(acceptedNames, conditions, storedVersions);
        }
    }
}
