// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecrpublic.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RepositoryCatalogData {
    /**
     * A detailed description of the contents of the repository. It is publicly visible in the Amazon ECR Public Gallery. The text must be in markdown format.
     * 
     */
    private final @Nullable String aboutText;
    /**
     * The system architecture that the images in the repository are compatible with. On the Amazon ECR Public Gallery, the following supported architectures will appear as badges on the repository and are used as search filters: `ARM`, `ARM 64`, `x86`, `x86-64`
     * 
     */
    private final @Nullable List<String> architectures;
    /**
     * A short description of the contents of the repository. This text appears in both the image details and also when searching for repositories on the Amazon ECR Public Gallery.
     * 
     */
    private final @Nullable String description;
    /**
     * The base64-encoded repository logo payload. (Only visible for verified accounts) Note that drift detection is disabled for this attribute.
     * 
     */
    private final @Nullable String logoImageBlob;
    /**
     * The operating systems that the images in the repository are compatible with. On the Amazon ECR Public Gallery, the following supported operating systems will appear as badges on the repository and are used as search filters: `Linux`, `Windows`
     * 
     */
    private final @Nullable List<String> operatingSystems;
    /**
     * Detailed information on how to use the contents of the repository. It is publicly visible in the Amazon ECR Public Gallery. The usage text provides context, support information, and additional usage details for users of the repository. The text must be in markdown format.
     * 
     */
    private final @Nullable String usageText;

    @OutputCustomType.Constructor({"aboutText","architectures","description","logoImageBlob","operatingSystems","usageText"})
    private RepositoryCatalogData(
        @Nullable String aboutText,
        @Nullable List<String> architectures,
        @Nullable String description,
        @Nullable String logoImageBlob,
        @Nullable List<String> operatingSystems,
        @Nullable String usageText) {
        this.aboutText = aboutText;
        this.architectures = architectures;
        this.description = description;
        this.logoImageBlob = logoImageBlob;
        this.operatingSystems = operatingSystems;
        this.usageText = usageText;
    }

    /**
     * A detailed description of the contents of the repository. It is publicly visible in the Amazon ECR Public Gallery. The text must be in markdown format.
     * 
    */
    public Optional<String> getAboutText() {
        return Optional.ofNullable(this.aboutText);
    }
    /**
     * The system architecture that the images in the repository are compatible with. On the Amazon ECR Public Gallery, the following supported architectures will appear as badges on the repository and are used as search filters: `ARM`, `ARM 64`, `x86`, `x86-64`
     * 
    */
    public List<String> getArchitectures() {
        return this.architectures == null ? List.of() : this.architectures;
    }
    /**
     * A short description of the contents of the repository. This text appears in both the image details and also when searching for repositories on the Amazon ECR Public Gallery.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The base64-encoded repository logo payload. (Only visible for verified accounts) Note that drift detection is disabled for this attribute.
     * 
    */
    public Optional<String> getLogoImageBlob() {
        return Optional.ofNullable(this.logoImageBlob);
    }
    /**
     * The operating systems that the images in the repository are compatible with. On the Amazon ECR Public Gallery, the following supported operating systems will appear as badges on the repository and are used as search filters: `Linux`, `Windows`
     * 
    */
    public List<String> getOperatingSystems() {
        return this.operatingSystems == null ? List.of() : this.operatingSystems;
    }
    /**
     * Detailed information on how to use the contents of the repository. It is publicly visible in the Amazon ECR Public Gallery. The usage text provides context, support information, and additional usage details for users of the repository. The text must be in markdown format.
     * 
    */
    public Optional<String> getUsageText() {
        return Optional.ofNullable(this.usageText);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryCatalogData defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String aboutText;
        private @Nullable List<String> architectures;
        private @Nullable String description;
        private @Nullable String logoImageBlob;
        private @Nullable List<String> operatingSystems;
        private @Nullable String usageText;

        public Builder() {
    	      // Empty
        }

        public Builder(RepositoryCatalogData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aboutText = defaults.aboutText;
    	      this.architectures = defaults.architectures;
    	      this.description = defaults.description;
    	      this.logoImageBlob = defaults.logoImageBlob;
    	      this.operatingSystems = defaults.operatingSystems;
    	      this.usageText = defaults.usageText;
        }

        public Builder setAboutText(@Nullable String aboutText) {
            this.aboutText = aboutText;
            return this;
        }

        public Builder setArchitectures(@Nullable List<String> architectures) {
            this.architectures = architectures;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setLogoImageBlob(@Nullable String logoImageBlob) {
            this.logoImageBlob = logoImageBlob;
            return this;
        }

        public Builder setOperatingSystems(@Nullable List<String> operatingSystems) {
            this.operatingSystems = operatingSystems;
            return this;
        }

        public Builder setUsageText(@Nullable String usageText) {
            this.usageText = usageText;
            return this;
        }
        public RepositoryCatalogData build() {
            return new RepositoryCatalogData(aboutText, architectures, description, logoImageBlob, operatingSystems, usageText);
        }
    }
}
