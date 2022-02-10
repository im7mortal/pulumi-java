// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.domains_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.domains_v1.inputs.CustomDnsResponse;
import io.pulumi.googlenative.domains_v1.inputs.GlueRecordResponse;
import io.pulumi.googlenative.domains_v1.inputs.GoogleDomainsDnsResponse;
import java.util.List;
import java.util.Objects;


public final class DnsSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final DnsSettingsResponse Empty = new DnsSettingsResponse();

    @InputImport(name="customDns", required=true)
    private final CustomDnsResponse customDns;

    public CustomDnsResponse getCustomDns() {
        return this.customDns;
    }

    @InputImport(name="glueRecords", required=true)
    private final List<GlueRecordResponse> glueRecords;

    public List<GlueRecordResponse> getGlueRecords() {
        return this.glueRecords;
    }

    @InputImport(name="googleDomainsDns", required=true)
    private final GoogleDomainsDnsResponse googleDomainsDns;

    public GoogleDomainsDnsResponse getGoogleDomainsDns() {
        return this.googleDomainsDns;
    }

    public DnsSettingsResponse(
        CustomDnsResponse customDns,
        List<GlueRecordResponse> glueRecords,
        GoogleDomainsDnsResponse googleDomainsDns) {
        this.customDns = Objects.requireNonNull(customDns, "expected parameter 'customDns' to be non-null");
        this.glueRecords = Objects.requireNonNull(glueRecords, "expected parameter 'glueRecords' to be non-null");
        this.googleDomainsDns = Objects.requireNonNull(googleDomainsDns, "expected parameter 'googleDomainsDns' to be non-null");
    }

    private DnsSettingsResponse() {
        this.customDns = null;
        this.glueRecords = List.of();
        this.googleDomainsDns = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DnsSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomDnsResponse customDns;
        private List<GlueRecordResponse> glueRecords;
        private GoogleDomainsDnsResponse googleDomainsDns;

        public Builder() {
    	      // Empty
        }

        public Builder(DnsSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customDns = defaults.customDns;
    	      this.glueRecords = defaults.glueRecords;
    	      this.googleDomainsDns = defaults.googleDomainsDns;
        }

        public Builder setCustomDns(CustomDnsResponse customDns) {
            this.customDns = Objects.requireNonNull(customDns);
            return this;
        }

        public Builder setGlueRecords(List<GlueRecordResponse> glueRecords) {
            this.glueRecords = Objects.requireNonNull(glueRecords);
            return this;
        }

        public Builder setGoogleDomainsDns(GoogleDomainsDnsResponse googleDomainsDns) {
            this.googleDomainsDns = Objects.requireNonNull(googleDomainsDns);
            return this;
        }

        public DnsSettingsResponse build() {
            return new DnsSettingsResponse(customDns, glueRecords, googleDomainsDns);
        }
    }
}