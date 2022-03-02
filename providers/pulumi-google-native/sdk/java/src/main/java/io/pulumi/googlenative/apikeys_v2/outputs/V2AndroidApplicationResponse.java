// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apikeys_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class V2AndroidApplicationResponse {
    /**
     * The package name of the application.
     * 
     */
    private final String packageName;
    /**
     * The SHA1 fingerprint of the application. For example, both sha1 formats are acceptable : DA:39:A3:EE:5E:6B:4B:0D:32:55:BF:EF:95:60:18:90:AF:D8:07:09 or DA39A3EE5E6B4B0D3255BFEF95601890AFD80709. Output format is the latter.
     * 
     */
    private final String sha1Fingerprint;

    @OutputCustomType.Constructor({"packageName","sha1Fingerprint"})
    private V2AndroidApplicationResponse(
        String packageName,
        String sha1Fingerprint) {
        this.packageName = Objects.requireNonNull(packageName);
        this.sha1Fingerprint = Objects.requireNonNull(sha1Fingerprint);
    }

    /**
     * The package name of the application.
     * 
    */
    public String getPackageName() {
        return this.packageName;
    }
    /**
     * The SHA1 fingerprint of the application. For example, both sha1 formats are acceptable : DA:39:A3:EE:5E:6B:4B:0D:32:55:BF:EF:95:60:18:90:AF:D8:07:09 or DA39A3EE5E6B4B0D3255BFEF95601890AFD80709. Output format is the latter.
     * 
    */
    public String getSha1Fingerprint() {
        return this.sha1Fingerprint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(V2AndroidApplicationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String packageName;
        private String sha1Fingerprint;

        public Builder() {
    	      // Empty
        }

        public Builder(V2AndroidApplicationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.packageName = defaults.packageName;
    	      this.sha1Fingerprint = defaults.sha1Fingerprint;
        }

        public Builder setPackageName(String packageName) {
            this.packageName = Objects.requireNonNull(packageName);
            return this;
        }

        public Builder setSha1Fingerprint(String sha1Fingerprint) {
            this.sha1Fingerprint = Objects.requireNonNull(sha1Fingerprint);
            return this;
        }
        public V2AndroidApplicationResponse build() {
            return new V2AndroidApplicationResponse(packageName, sha1Fingerprint);
        }
    }
}
