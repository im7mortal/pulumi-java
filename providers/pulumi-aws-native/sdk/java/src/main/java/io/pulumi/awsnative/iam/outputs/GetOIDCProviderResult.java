// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iam.outputs;

import io.pulumi.awsnative.iam.outputs.OIDCProviderTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetOIDCProviderResult {
    /**
     * Amazon Resource Name (ARN) of the OIDC provider
     * 
     */
    private final @Nullable String arn;
    private final @Nullable List<String> clientIdList;
    private final @Nullable List<OIDCProviderTag> tags;
    private final @Nullable List<String> thumbprintList;

    @OutputCustomType.Constructor({"arn","clientIdList","tags","thumbprintList"})
    private GetOIDCProviderResult(
        @Nullable String arn,
        @Nullable List<String> clientIdList,
        @Nullable List<OIDCProviderTag> tags,
        @Nullable List<String> thumbprintList) {
        this.arn = arn;
        this.clientIdList = clientIdList;
        this.tags = tags;
        this.thumbprintList = thumbprintList;
    }

    /**
     * Amazon Resource Name (ARN) of the OIDC provider
     * 
     */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public List<String> getClientIdList() {
        return this.clientIdList == null ? List.of() : this.clientIdList;
    }
    public List<OIDCProviderTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    public List<String> getThumbprintList() {
        return this.thumbprintList == null ? List.of() : this.thumbprintList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOIDCProviderResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable List<String> clientIdList;
        private @Nullable List<OIDCProviderTag> tags;
        private @Nullable List<String> thumbprintList;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOIDCProviderResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.clientIdList = defaults.clientIdList;
    	      this.tags = defaults.tags;
    	      this.thumbprintList = defaults.thumbprintList;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setClientIdList(@Nullable List<String> clientIdList) {
            this.clientIdList = clientIdList;
            return this;
        }

        public Builder setTags(@Nullable List<OIDCProviderTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setThumbprintList(@Nullable List<String> thumbprintList) {
            this.thumbprintList = thumbprintList;
            return this;
        }

        public GetOIDCProviderResult build() {
            return new GetOIDCProviderResult(arn, clientIdList, tags, thumbprintList);
        }
    }
}
