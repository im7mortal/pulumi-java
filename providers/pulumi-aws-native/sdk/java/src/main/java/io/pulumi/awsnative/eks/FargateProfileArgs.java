// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.eks;

import io.pulumi.awsnative.eks.inputs.FargateProfileSelectorArgs;
import io.pulumi.awsnative.eks.inputs.FargateProfileTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FargateProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final FargateProfileArgs Empty = new FargateProfileArgs();

    /**
     * Name of the Cluster
     * 
     */
    @InputImport(name="clusterName", required=true)
    private final Input<String> clusterName;

    public Input<String> getClusterName() {
        return this.clusterName;
    }

    /**
     * Name of FargateProfile
     * 
     */
    @InputImport(name="fargateProfileName")
    private final @Nullable Input<String> fargateProfileName;

    public Input<String> getFargateProfileName() {
        return this.fargateProfileName == null ? Input.empty() : this.fargateProfileName;
    }

    /**
     * The IAM policy arn for pods
     * 
     */
    @InputImport(name="podExecutionRoleArn", required=true)
    private final Input<String> podExecutionRoleArn;

    public Input<String> getPodExecutionRoleArn() {
        return this.podExecutionRoleArn;
    }

    @InputImport(name="selectors", required=true)
    private final Input<List<FargateProfileSelectorArgs>> selectors;

    public Input<List<FargateProfileSelectorArgs>> getSelectors() {
        return this.selectors;
    }

    @InputImport(name="subnets")
    private final @Nullable Input<List<String>> subnets;

    public Input<List<String>> getSubnets() {
        return this.subnets == null ? Input.empty() : this.subnets;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<List<FargateProfileTagArgs>> tags;

    public Input<List<FargateProfileTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public FargateProfileArgs(
        Input<String> clusterName,
        @Nullable Input<String> fargateProfileName,
        Input<String> podExecutionRoleArn,
        Input<List<FargateProfileSelectorArgs>> selectors,
        @Nullable Input<List<String>> subnets,
        @Nullable Input<List<FargateProfileTagArgs>> tags) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.fargateProfileName = fargateProfileName;
        this.podExecutionRoleArn = Objects.requireNonNull(podExecutionRoleArn, "expected parameter 'podExecutionRoleArn' to be non-null");
        this.selectors = Objects.requireNonNull(selectors, "expected parameter 'selectors' to be non-null");
        this.subnets = subnets;
        this.tags = tags;
    }

    private FargateProfileArgs() {
        this.clusterName = Input.empty();
        this.fargateProfileName = Input.empty();
        this.podExecutionRoleArn = Input.empty();
        this.selectors = Input.empty();
        this.subnets = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FargateProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> clusterName;
        private @Nullable Input<String> fargateProfileName;
        private Input<String> podExecutionRoleArn;
        private Input<List<FargateProfileSelectorArgs>> selectors;
        private @Nullable Input<List<String>> subnets;
        private @Nullable Input<List<FargateProfileTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(FargateProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.fargateProfileName = defaults.fargateProfileName;
    	      this.podExecutionRoleArn = defaults.podExecutionRoleArn;
    	      this.selectors = defaults.selectors;
    	      this.subnets = defaults.subnets;
    	      this.tags = defaults.tags;
        }

        public Builder setClusterName(Input<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder setClusterName(String clusterName) {
            this.clusterName = Input.of(Objects.requireNonNull(clusterName));
            return this;
        }

        public Builder setFargateProfileName(@Nullable Input<String> fargateProfileName) {
            this.fargateProfileName = fargateProfileName;
            return this;
        }

        public Builder setFargateProfileName(@Nullable String fargateProfileName) {
            this.fargateProfileName = Input.ofNullable(fargateProfileName);
            return this;
        }

        public Builder setPodExecutionRoleArn(Input<String> podExecutionRoleArn) {
            this.podExecutionRoleArn = Objects.requireNonNull(podExecutionRoleArn);
            return this;
        }

        public Builder setPodExecutionRoleArn(String podExecutionRoleArn) {
            this.podExecutionRoleArn = Input.of(Objects.requireNonNull(podExecutionRoleArn));
            return this;
        }

        public Builder setSelectors(Input<List<FargateProfileSelectorArgs>> selectors) {
            this.selectors = Objects.requireNonNull(selectors);
            return this;
        }

        public Builder setSelectors(List<FargateProfileSelectorArgs> selectors) {
            this.selectors = Input.of(Objects.requireNonNull(selectors));
            return this;
        }

        public Builder setSubnets(@Nullable Input<List<String>> subnets) {
            this.subnets = subnets;
            return this;
        }

        public Builder setSubnets(@Nullable List<String> subnets) {
            this.subnets = Input.ofNullable(subnets);
            return this;
        }

        public Builder setTags(@Nullable Input<List<FargateProfileTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<FargateProfileTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public FargateProfileArgs build() {
            return new FargateProfileArgs(clusterName, fargateProfileName, podExecutionRoleArn, selectors, subnets, tags);
        }
    }
}
