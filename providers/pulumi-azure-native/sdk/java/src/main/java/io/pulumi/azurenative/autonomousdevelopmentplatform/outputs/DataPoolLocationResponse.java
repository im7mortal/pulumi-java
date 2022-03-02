// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.autonomousdevelopmentplatform.outputs;

import io.pulumi.azurenative.autonomousdevelopmentplatform.outputs.DataPoolEncryptionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataPoolLocationResponse {
    /**
     * Encryption properties of a Data Pool location
     * 
     */
    private final @Nullable DataPoolEncryptionResponse encryption;
    /**
     * The location name
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"encryption","name"})
    private DataPoolLocationResponse(
        @Nullable DataPoolEncryptionResponse encryption,
        String name) {
        this.encryption = encryption;
        this.name = Objects.requireNonNull(name);
    }

    /**
     * Encryption properties of a Data Pool location
     * 
    */
    public Optional<DataPoolEncryptionResponse> getEncryption() {
        return Optional.ofNullable(this.encryption);
    }
    /**
     * The location name
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataPoolLocationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DataPoolEncryptionResponse encryption;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(DataPoolLocationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryption = defaults.encryption;
    	      this.name = defaults.name;
        }

        public Builder setEncryption(@Nullable DataPoolEncryptionResponse encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public DataPoolLocationResponse build() {
            return new DataPoolLocationResponse(encryption, name);
        }
    }
}
