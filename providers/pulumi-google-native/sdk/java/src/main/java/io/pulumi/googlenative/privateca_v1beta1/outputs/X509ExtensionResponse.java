// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.privateca_v1beta1.outputs.ObjectIdResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class X509ExtensionResponse {
    /**
     * Indicates whether or not this extension is critical (i.e., if the client does not know how to handle this extension, the client should consider this to be an error).
     * 
     */
    private final Boolean critical;
    /**
     * The OID for this X.509 extension.
     * 
     */
    private final ObjectIdResponse objectId;
    /**
     * The value of this X.509 extension.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"critical","objectId","value"})
    private X509ExtensionResponse(
        Boolean critical,
        ObjectIdResponse objectId,
        String value) {
        this.critical = Objects.requireNonNull(critical);
        this.objectId = Objects.requireNonNull(objectId);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * Indicates whether or not this extension is critical (i.e., if the client does not know how to handle this extension, the client should consider this to be an error).
     * 
    */
    public Boolean getCritical() {
        return this.critical;
    }
    /**
     * The OID for this X.509 extension.
     * 
    */
    public ObjectIdResponse getObjectId() {
        return this.objectId;
    }
    /**
     * The value of this X.509 extension.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X509ExtensionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean critical;
        private ObjectIdResponse objectId;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(X509ExtensionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.critical = defaults.critical;
    	      this.objectId = defaults.objectId;
    	      this.value = defaults.value;
        }

        public Builder setCritical(Boolean critical) {
            this.critical = Objects.requireNonNull(critical);
            return this;
        }

        public Builder setObjectId(ObjectIdResponse objectId) {
            this.objectId = Objects.requireNonNull(objectId);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public X509ExtensionResponse build() {
            return new X509ExtensionResponse(critical, objectId, value);
        }
    }
}
