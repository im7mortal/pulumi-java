// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describe JSON data format.
 * 
 */
public final class GoogleCloudDataplexV1AssetDiscoverySpecJsonOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDataplexV1AssetDiscoverySpecJsonOptionsArgs Empty = new GoogleCloudDataplexV1AssetDiscoverySpecJsonOptionsArgs();

    /**
     * Optional. Whether to disable the inference of data type for Json data. If true, all columns will be registered as their primitive types (strings, number or boolean).
     * 
     */
    @Import(name="disableTypeInference")
    private @Nullable Output<Boolean> disableTypeInference;

    /**
     * @return Optional. Whether to disable the inference of data type for Json data. If true, all columns will be registered as their primitive types (strings, number or boolean).
     * 
     */
    public Optional<Output<Boolean>> disableTypeInference() {
        return Optional.ofNullable(this.disableTypeInference);
    }

    /**
     * Optional. The character encoding of the data. The default is UTF-8.
     * 
     */
    @Import(name="encoding")
    private @Nullable Output<String> encoding;

    /**
     * @return Optional. The character encoding of the data. The default is UTF-8.
     * 
     */
    public Optional<Output<String>> encoding() {
        return Optional.ofNullable(this.encoding);
    }

    private GoogleCloudDataplexV1AssetDiscoverySpecJsonOptionsArgs() {}

    private GoogleCloudDataplexV1AssetDiscoverySpecJsonOptionsArgs(GoogleCloudDataplexV1AssetDiscoverySpecJsonOptionsArgs $) {
        this.disableTypeInference = $.disableTypeInference;
        this.encoding = $.encoding;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDataplexV1AssetDiscoverySpecJsonOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDataplexV1AssetDiscoverySpecJsonOptionsArgs $;

        public Builder() {
            $ = new GoogleCloudDataplexV1AssetDiscoverySpecJsonOptionsArgs();
        }

        public Builder(GoogleCloudDataplexV1AssetDiscoverySpecJsonOptionsArgs defaults) {
            $ = new GoogleCloudDataplexV1AssetDiscoverySpecJsonOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disableTypeInference Optional. Whether to disable the inference of data type for Json data. If true, all columns will be registered as their primitive types (strings, number or boolean).
         * 
         * @return builder
         * 
         */
        public Builder disableTypeInference(@Nullable Output<Boolean> disableTypeInference) {
            $.disableTypeInference = disableTypeInference;
            return this;
        }

        /**
         * @param disableTypeInference Optional. Whether to disable the inference of data type for Json data. If true, all columns will be registered as their primitive types (strings, number or boolean).
         * 
         * @return builder
         * 
         */
        public Builder disableTypeInference(Boolean disableTypeInference) {
            return disableTypeInference(Output.of(disableTypeInference));
        }

        /**
         * @param encoding Optional. The character encoding of the data. The default is UTF-8.
         * 
         * @return builder
         * 
         */
        public Builder encoding(@Nullable Output<String> encoding) {
            $.encoding = encoding;
            return this;
        }

        /**
         * @param encoding Optional. The character encoding of the data. The default is UTF-8.
         * 
         * @return builder
         * 
         */
        public Builder encoding(String encoding) {
            return encoding(Output.of(encoding));
        }

        public GoogleCloudDataplexV1AssetDiscoverySpecJsonOptionsArgs build() {
            return $;
        }
    }

}
