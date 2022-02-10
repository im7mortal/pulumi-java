// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AllowedSubjectAltNamesArgs extends io.pulumi.resources.ResourceArgs {

    public static final AllowedSubjectAltNamesArgs Empty = new AllowedSubjectAltNamesArgs();

    @InputImport(name="allowCustomSans")
    private final @Nullable Input<Boolean> allowCustomSans;

    public Input<Boolean> getAllowCustomSans() {
        return this.allowCustomSans == null ? Input.empty() : this.allowCustomSans;
    }

    @InputImport(name="allowGlobbingDnsWildcards")
    private final @Nullable Input<Boolean> allowGlobbingDnsWildcards;

    public Input<Boolean> getAllowGlobbingDnsWildcards() {
        return this.allowGlobbingDnsWildcards == null ? Input.empty() : this.allowGlobbingDnsWildcards;
    }

    @InputImport(name="allowedDnsNames")
    private final @Nullable Input<List<String>> allowedDnsNames;

    public Input<List<String>> getAllowedDnsNames() {
        return this.allowedDnsNames == null ? Input.empty() : this.allowedDnsNames;
    }

    @InputImport(name="allowedEmailAddresses")
    private final @Nullable Input<List<String>> allowedEmailAddresses;

    public Input<List<String>> getAllowedEmailAddresses() {
        return this.allowedEmailAddresses == null ? Input.empty() : this.allowedEmailAddresses;
    }

    @InputImport(name="allowedIps")
    private final @Nullable Input<List<String>> allowedIps;

    public Input<List<String>> getAllowedIps() {
        return this.allowedIps == null ? Input.empty() : this.allowedIps;
    }

    @InputImport(name="allowedUris")
    private final @Nullable Input<List<String>> allowedUris;

    public Input<List<String>> getAllowedUris() {
        return this.allowedUris == null ? Input.empty() : this.allowedUris;
    }

    public AllowedSubjectAltNamesArgs(
        @Nullable Input<Boolean> allowCustomSans,
        @Nullable Input<Boolean> allowGlobbingDnsWildcards,
        @Nullable Input<List<String>> allowedDnsNames,
        @Nullable Input<List<String>> allowedEmailAddresses,
        @Nullable Input<List<String>> allowedIps,
        @Nullable Input<List<String>> allowedUris) {
        this.allowCustomSans = allowCustomSans;
        this.allowGlobbingDnsWildcards = allowGlobbingDnsWildcards;
        this.allowedDnsNames = allowedDnsNames;
        this.allowedEmailAddresses = allowedEmailAddresses;
        this.allowedIps = allowedIps;
        this.allowedUris = allowedUris;
    }

    private AllowedSubjectAltNamesArgs() {
        this.allowCustomSans = Input.empty();
        this.allowGlobbingDnsWildcards = Input.empty();
        this.allowedDnsNames = Input.empty();
        this.allowedEmailAddresses = Input.empty();
        this.allowedIps = Input.empty();
        this.allowedUris = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AllowedSubjectAltNamesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowCustomSans;
        private @Nullable Input<Boolean> allowGlobbingDnsWildcards;
        private @Nullable Input<List<String>> allowedDnsNames;
        private @Nullable Input<List<String>> allowedEmailAddresses;
        private @Nullable Input<List<String>> allowedIps;
        private @Nullable Input<List<String>> allowedUris;

        public Builder() {
    	      // Empty
        }

        public Builder(AllowedSubjectAltNamesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowCustomSans = defaults.allowCustomSans;
    	      this.allowGlobbingDnsWildcards = defaults.allowGlobbingDnsWildcards;
    	      this.allowedDnsNames = defaults.allowedDnsNames;
    	      this.allowedEmailAddresses = defaults.allowedEmailAddresses;
    	      this.allowedIps = defaults.allowedIps;
    	      this.allowedUris = defaults.allowedUris;
        }

        public Builder setAllowCustomSans(@Nullable Input<Boolean> allowCustomSans) {
            this.allowCustomSans = allowCustomSans;
            return this;
        }

        public Builder setAllowCustomSans(@Nullable Boolean allowCustomSans) {
            this.allowCustomSans = Input.ofNullable(allowCustomSans);
            return this;
        }

        public Builder setAllowGlobbingDnsWildcards(@Nullable Input<Boolean> allowGlobbingDnsWildcards) {
            this.allowGlobbingDnsWildcards = allowGlobbingDnsWildcards;
            return this;
        }

        public Builder setAllowGlobbingDnsWildcards(@Nullable Boolean allowGlobbingDnsWildcards) {
            this.allowGlobbingDnsWildcards = Input.ofNullable(allowGlobbingDnsWildcards);
            return this;
        }

        public Builder setAllowedDnsNames(@Nullable Input<List<String>> allowedDnsNames) {
            this.allowedDnsNames = allowedDnsNames;
            return this;
        }

        public Builder setAllowedDnsNames(@Nullable List<String> allowedDnsNames) {
            this.allowedDnsNames = Input.ofNullable(allowedDnsNames);
            return this;
        }

        public Builder setAllowedEmailAddresses(@Nullable Input<List<String>> allowedEmailAddresses) {
            this.allowedEmailAddresses = allowedEmailAddresses;
            return this;
        }

        public Builder setAllowedEmailAddresses(@Nullable List<String> allowedEmailAddresses) {
            this.allowedEmailAddresses = Input.ofNullable(allowedEmailAddresses);
            return this;
        }

        public Builder setAllowedIps(@Nullable Input<List<String>> allowedIps) {
            this.allowedIps = allowedIps;
            return this;
        }

        public Builder setAllowedIps(@Nullable List<String> allowedIps) {
            this.allowedIps = Input.ofNullable(allowedIps);
            return this;
        }

        public Builder setAllowedUris(@Nullable Input<List<String>> allowedUris) {
            this.allowedUris = allowedUris;
            return this;
        }

        public Builder setAllowedUris(@Nullable List<String> allowedUris) {
            this.allowedUris = Input.ofNullable(allowedUris);
            return this;
        }

        public AllowedSubjectAltNamesArgs build() {
            return new AllowedSubjectAltNamesArgs(allowCustomSans, allowGlobbingDnsWildcards, allowedDnsNames, allowedEmailAddresses, allowedIps, allowedUris);
        }
    }
}