// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.acm.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetCertificateResult {
    /**
     * Amazon Resource Name (ARN) of the found certificate, suitable for referencing in other resources that support ACM certificates.
     * 
     */
    private final String arn;
    private final String domain;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable List<String> keyTypes;
    private final @Nullable Boolean mostRecent;
    /**
     * Status of the found certificate.
     * 
     */
    private final String status;
    private final @Nullable List<String> statuses;
    /**
     * A mapping of tags for the resource.
     * 
     */
    private final Map<String,String> tags;
    private final @Nullable List<String> types;

    @OutputCustomType.Constructor({"arn","domain","id","keyTypes","mostRecent","status","statuses","tags","types"})
    private GetCertificateResult(
        String arn,
        String domain,
        String id,
        @Nullable List<String> keyTypes,
        @Nullable Boolean mostRecent,
        String status,
        @Nullable List<String> statuses,
        Map<String,String> tags,
        @Nullable List<String> types) {
        this.arn = Objects.requireNonNull(arn);
        this.domain = Objects.requireNonNull(domain);
        this.id = Objects.requireNonNull(id);
        this.keyTypes = keyTypes;
        this.mostRecent = mostRecent;
        this.status = Objects.requireNonNull(status);
        this.statuses = statuses;
        this.tags = Objects.requireNonNull(tags);
        this.types = types;
    }

    /**
     * Amazon Resource Name (ARN) of the found certificate, suitable for referencing in other resources that support ACM certificates.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    public String getDomain() {
        return this.domain;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public List<String> getKeyTypes() {
        return this.keyTypes == null ? List.of() : this.keyTypes;
    }
    public Optional<Boolean> getMostRecent() {
        return Optional.ofNullable(this.mostRecent);
    }
    /**
     * Status of the found certificate.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    public List<String> getStatuses() {
        return this.statuses == null ? List.of() : this.statuses;
    }
    /**
     * A mapping of tags for the resource.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags;
    }
    public List<String> getTypes() {
        return this.types == null ? List.of() : this.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String domain;
        private String id;
        private @Nullable List<String> keyTypes;
        private @Nullable Boolean mostRecent;
        private String status;
        private @Nullable List<String> statuses;
        private Map<String,String> tags;
        private @Nullable List<String> types;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.domain = defaults.domain;
    	      this.id = defaults.id;
    	      this.keyTypes = defaults.keyTypes;
    	      this.mostRecent = defaults.mostRecent;
    	      this.status = defaults.status;
    	      this.statuses = defaults.statuses;
    	      this.tags = defaults.tags;
    	      this.types = defaults.types;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setDomain(String domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKeyTypes(@Nullable List<String> keyTypes) {
            this.keyTypes = keyTypes;
            return this;
        }

        public Builder setMostRecent(@Nullable Boolean mostRecent) {
            this.mostRecent = mostRecent;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStatuses(@Nullable List<String> statuses) {
            this.statuses = statuses;
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setTypes(@Nullable List<String> types) {
            this.types = types;
            return this;
        }
        public GetCertificateResult build() {
            return new GetCertificateResult(arn, domain, id, keyTypes, mostRecent, status, statuses, tags, types);
        }
    }
}
