// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kms.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetCipherTextResult {
    /**
     * Base64 encoded ciphertext
     * 
     */
    private final String ciphertextBlob;
    private final @Nullable Map<String,String> context;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String keyId;
    private final String plaintext;

    @OutputCustomType.Constructor({"ciphertextBlob","context","id","keyId","plaintext"})
    private GetCipherTextResult(
        String ciphertextBlob,
        @Nullable Map<String,String> context,
        String id,
        String keyId,
        String plaintext) {
        this.ciphertextBlob = Objects.requireNonNull(ciphertextBlob);
        this.context = context;
        this.id = Objects.requireNonNull(id);
        this.keyId = Objects.requireNonNull(keyId);
        this.plaintext = Objects.requireNonNull(plaintext);
    }

    /**
     * Base64 encoded ciphertext
     * 
    */
    public String getCiphertextBlob() {
        return this.ciphertextBlob;
    }
    public Map<String,String> getContext() {
        return this.context == null ? Map.of() : this.context;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getKeyId() {
        return this.keyId;
    }
    public String getPlaintext() {
        return this.plaintext;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCipherTextResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ciphertextBlob;
        private @Nullable Map<String,String> context;
        private String id;
        private String keyId;
        private String plaintext;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCipherTextResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ciphertextBlob = defaults.ciphertextBlob;
    	      this.context = defaults.context;
    	      this.id = defaults.id;
    	      this.keyId = defaults.keyId;
    	      this.plaintext = defaults.plaintext;
        }

        public Builder setCiphertextBlob(String ciphertextBlob) {
            this.ciphertextBlob = Objects.requireNonNull(ciphertextBlob);
            return this;
        }

        public Builder setContext(@Nullable Map<String,String> context) {
            this.context = context;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKeyId(String keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }

        public Builder setPlaintext(String plaintext) {
            this.plaintext = Objects.requireNonNull(plaintext);
            return this;
        }
        public GetCipherTextResult build() {
            return new GetCipherTextResult(ciphertextBlob, context, id, keyId, plaintext);
        }
    }
}
