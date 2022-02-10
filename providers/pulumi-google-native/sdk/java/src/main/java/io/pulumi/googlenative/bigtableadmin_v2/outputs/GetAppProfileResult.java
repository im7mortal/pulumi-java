// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigtableadmin_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.bigtableadmin_v2.outputs.MultiClusterRoutingUseAnyResponse;
import io.pulumi.googlenative.bigtableadmin_v2.outputs.SingleClusterRoutingResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetAppProfileResult {
    private final String description;
    private final String etag;
    private final MultiClusterRoutingUseAnyResponse multiClusterRoutingUseAny;
    private final String name;
    private final SingleClusterRoutingResponse singleClusterRouting;

    @OutputCustomType.Constructor({"description","etag","multiClusterRoutingUseAny","name","singleClusterRouting"})
    private GetAppProfileResult(
        String description,
        String etag,
        MultiClusterRoutingUseAnyResponse multiClusterRoutingUseAny,
        String name,
        SingleClusterRoutingResponse singleClusterRouting) {
        this.description = Objects.requireNonNull(description);
        this.etag = Objects.requireNonNull(etag);
        this.multiClusterRoutingUseAny = Objects.requireNonNull(multiClusterRoutingUseAny);
        this.name = Objects.requireNonNull(name);
        this.singleClusterRouting = Objects.requireNonNull(singleClusterRouting);
    }

    public String getDescription() {
        return this.description;
    }
    public String getEtag() {
        return this.etag;
    }
    public MultiClusterRoutingUseAnyResponse getMultiClusterRoutingUseAny() {
        return this.multiClusterRoutingUseAny;
    }
    public String getName() {
        return this.name;
    }
    public SingleClusterRoutingResponse getSingleClusterRouting() {
        return this.singleClusterRouting;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppProfileResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String etag;
        private MultiClusterRoutingUseAnyResponse multiClusterRoutingUseAny;
        private String name;
        private SingleClusterRoutingResponse singleClusterRouting;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAppProfileResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.multiClusterRoutingUseAny = defaults.multiClusterRoutingUseAny;
    	      this.name = defaults.name;
    	      this.singleClusterRouting = defaults.singleClusterRouting;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setMultiClusterRoutingUseAny(MultiClusterRoutingUseAnyResponse multiClusterRoutingUseAny) {
            this.multiClusterRoutingUseAny = Objects.requireNonNull(multiClusterRoutingUseAny);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSingleClusterRouting(SingleClusterRoutingResponse singleClusterRouting) {
            this.singleClusterRouting = Objects.requireNonNull(singleClusterRouting);
            return this;
        }

        public GetAppProfileResult build() {
            return new GetAppProfileResult(description, etag, multiClusterRoutingUseAny, name, singleClusterRouting);
        }
    }
}