// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_alpha.outputs.TlsContextResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ClientTlsSettingsResponse {
    /**
     * @return Configures the mechanism to obtain client-side security certificates and identity information. This field is only applicable when mode is set to MUTUAL.
     * 
     */
    private final TlsContextResponse clientTlsContext;
    /**
     * @return Indicates whether connections to this port should be secured using TLS. The value of this field determines how TLS is enforced. This can be set to one of the following values: DISABLE: Do not setup a TLS connection to the backends. SIMPLE: Originate a TLS connection to the backends. MUTUAL: Secure connections to the backends using mutual TLS by presenting client certificates for authentication.
     * 
     */
    private final String mode;
    /**
     * @return SNI string to present to the server during TLS handshake. This field is applicable only when mode is SIMPLE or MUTUAL.
     * 
     */
    private final String sni;
    /**
     * @return A list of alternate names to verify the subject identity in the certificate.If specified, the proxy will verify that the server certificate&#39;s subject alt name matches one of the specified values. This field is applicable only when mode is SIMPLE or MUTUAL.
     * 
     */
    private final List<String> subjectAltNames;

    @CustomType.Constructor
    private ClientTlsSettingsResponse(
        @CustomType.Parameter("clientTlsContext") TlsContextResponse clientTlsContext,
        @CustomType.Parameter("mode") String mode,
        @CustomType.Parameter("sni") String sni,
        @CustomType.Parameter("subjectAltNames") List<String> subjectAltNames) {
        this.clientTlsContext = clientTlsContext;
        this.mode = mode;
        this.sni = sni;
        this.subjectAltNames = subjectAltNames;
    }

    /**
     * @return Configures the mechanism to obtain client-side security certificates and identity information. This field is only applicable when mode is set to MUTUAL.
     * 
     */
    public TlsContextResponse clientTlsContext() {
        return this.clientTlsContext;
    }
    /**
     * @return Indicates whether connections to this port should be secured using TLS. The value of this field determines how TLS is enforced. This can be set to one of the following values: DISABLE: Do not setup a TLS connection to the backends. SIMPLE: Originate a TLS connection to the backends. MUTUAL: Secure connections to the backends using mutual TLS by presenting client certificates for authentication.
     * 
     */
    public String mode() {
        return this.mode;
    }
    /**
     * @return SNI string to present to the server during TLS handshake. This field is applicable only when mode is SIMPLE or MUTUAL.
     * 
     */
    public String sni() {
        return this.sni;
    }
    /**
     * @return A list of alternate names to verify the subject identity in the certificate.If specified, the proxy will verify that the server certificate&#39;s subject alt name matches one of the specified values. This field is applicable only when mode is SIMPLE or MUTUAL.
     * 
     */
    public List<String> subjectAltNames() {
        return this.subjectAltNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientTlsSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TlsContextResponse clientTlsContext;
        private String mode;
        private String sni;
        private List<String> subjectAltNames;

        public Builder() {
    	      // Empty
        }

        public Builder(ClientTlsSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientTlsContext = defaults.clientTlsContext;
    	      this.mode = defaults.mode;
    	      this.sni = defaults.sni;
    	      this.subjectAltNames = defaults.subjectAltNames;
        }

        public Builder clientTlsContext(TlsContextResponse clientTlsContext) {
            this.clientTlsContext = Objects.requireNonNull(clientTlsContext);
            return this;
        }
        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        public Builder sni(String sni) {
            this.sni = Objects.requireNonNull(sni);
            return this;
        }
        public Builder subjectAltNames(List<String> subjectAltNames) {
            this.subjectAltNames = Objects.requireNonNull(subjectAltNames);
            return this;
        }
        public Builder subjectAltNames(String... subjectAltNames) {
            return subjectAltNames(List.of(subjectAltNames));
        }        public ClientTlsSettingsResponse build() {
            return new ClientTlsSettingsResponse(clientTlsContext, mode, sni, subjectAltNames);
        }
    }
}
