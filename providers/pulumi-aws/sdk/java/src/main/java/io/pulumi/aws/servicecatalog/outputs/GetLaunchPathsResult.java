// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicecatalog.outputs;

import io.pulumi.aws.servicecatalog.outputs.GetLaunchPathsSummary;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetLaunchPathsResult {
    private final @Nullable String acceptLanguage;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String productId;
    /**
     * Block with information about the launch path. See details below.
     * 
     */
    private final List<GetLaunchPathsSummary> summaries;

    @OutputCustomType.Constructor({"acceptLanguage","id","productId","summaries"})
    private GetLaunchPathsResult(
        @Nullable String acceptLanguage,
        String id,
        String productId,
        List<GetLaunchPathsSummary> summaries) {
        this.acceptLanguage = acceptLanguage;
        this.id = Objects.requireNonNull(id);
        this.productId = Objects.requireNonNull(productId);
        this.summaries = Objects.requireNonNull(summaries);
    }

    public Optional<String> getAcceptLanguage() {
        return Optional.ofNullable(this.acceptLanguage);
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getProductId() {
        return this.productId;
    }
    /**
     * Block with information about the launch path. See details below.
     * 
    */
    public List<GetLaunchPathsSummary> getSummaries() {
        return this.summaries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchPathsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String acceptLanguage;
        private String id;
        private String productId;
        private List<GetLaunchPathsSummary> summaries;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLaunchPathsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptLanguage = defaults.acceptLanguage;
    	      this.id = defaults.id;
    	      this.productId = defaults.productId;
    	      this.summaries = defaults.summaries;
        }

        public Builder setAcceptLanguage(@Nullable String acceptLanguage) {
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setProductId(String productId) {
            this.productId = Objects.requireNonNull(productId);
            return this;
        }

        public Builder setSummaries(List<GetLaunchPathsSummary> summaries) {
            this.summaries = Objects.requireNonNull(summaries);
            return this;
        }
        public GetLaunchPathsResult build() {
            return new GetLaunchPathsResult(acceptLanguage, id, productId, summaries);
        }
    }
}
