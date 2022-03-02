// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iam.outputs;

import io.pulumi.awsnative.iam.outputs.SAMLProviderTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetSAMLProviderResult {
    /**
     * Amazon Resource Name (ARN) of the SAML provider
     * 
     */
    private final @Nullable String arn;
    private final @Nullable String samlMetadataDocument;
    private final @Nullable List<SAMLProviderTag> tags;

    @OutputCustomType.Constructor({"arn","samlMetadataDocument","tags"})
    private GetSAMLProviderResult(
        @Nullable String arn,
        @Nullable String samlMetadataDocument,
        @Nullable List<SAMLProviderTag> tags) {
        this.arn = arn;
        this.samlMetadataDocument = samlMetadataDocument;
        this.tags = tags;
    }

    /**
     * Amazon Resource Name (ARN) of the SAML provider
     * 
    */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<String> getSamlMetadataDocument() {
        return Optional.ofNullable(this.samlMetadataDocument);
    }
    public List<SAMLProviderTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSAMLProviderResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String samlMetadataDocument;
        private @Nullable List<SAMLProviderTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSAMLProviderResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.samlMetadataDocument = defaults.samlMetadataDocument;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setSamlMetadataDocument(@Nullable String samlMetadataDocument) {
            this.samlMetadataDocument = samlMetadataDocument;
            return this;
        }

        public Builder setTags(@Nullable List<SAMLProviderTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetSAMLProviderResult build() {
            return new GetSAMLProviderResult(arn, samlMetadataDocument, tags);
        }
    }
}
