// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.certificateauthority.outputs.AuthorityConfigSubjectConfigSubject;
import io.pulumi.gcp.certificateauthority.outputs.AuthorityConfigSubjectConfigSubjectAltName;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AuthorityConfigSubjectConfig {
    /**
     * Contains distinguished name fields such as the location and organization.
     * Structure is documented below.
     * 
     */
    private final AuthorityConfigSubjectConfigSubject subject;
    /**
     * The subject alternative name fields.
     * Structure is documented below.
     * 
     */
    private final @Nullable AuthorityConfigSubjectConfigSubjectAltName subjectAltName;

    @OutputCustomType.Constructor({"subject","subjectAltName"})
    private AuthorityConfigSubjectConfig(
        AuthorityConfigSubjectConfigSubject subject,
        @Nullable AuthorityConfigSubjectConfigSubjectAltName subjectAltName) {
        this.subject = Objects.requireNonNull(subject);
        this.subjectAltName = subjectAltName;
    }

    /**
     * Contains distinguished name fields such as the location and organization.
     * Structure is documented below.
     * 
    */
    public AuthorityConfigSubjectConfigSubject getSubject() {
        return this.subject;
    }
    /**
     * The subject alternative name fields.
     * Structure is documented below.
     * 
    */
    public Optional<AuthorityConfigSubjectConfigSubjectAltName> getSubjectAltName() {
        return Optional.ofNullable(this.subjectAltName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorityConfigSubjectConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthorityConfigSubjectConfigSubject subject;
        private @Nullable AuthorityConfigSubjectConfigSubjectAltName subjectAltName;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorityConfigSubjectConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subject = defaults.subject;
    	      this.subjectAltName = defaults.subjectAltName;
        }

        public Builder setSubject(AuthorityConfigSubjectConfigSubject subject) {
            this.subject = Objects.requireNonNull(subject);
            return this;
        }

        public Builder setSubjectAltName(@Nullable AuthorityConfigSubjectConfigSubjectAltName subjectAltName) {
            this.subjectAltName = subjectAltName;
            return this;
        }
        public AuthorityConfigSubjectConfig build() {
            return new AuthorityConfigSubjectConfig(subject, subjectAltName);
        }
    }
}
