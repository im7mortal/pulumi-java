// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies how child public delegated prefix will be scoped. It could be one of following values: - `REGIONAL`: The public delegated prefix is regional only. The provisioning will take a few minutes. - `GLOBAL`: The public delegated prefix is global only. The provisioning will take ~4 weeks. - `GLOBAL_AND_REGIONAL` [output only]: The public delegated prefixes is BYOIP V1 legacy prefix. This is output only value and no longer supported in BYOIP V2.
     * 
     */
    @EnumType
    public enum PublicAdvertisedPrefixPdpScope {
        /**
         * The public delegated prefix is global only. The provisioning will take ~4 weeks.
         * 
         */
        Global("GLOBAL"),
        /**
         * The public delegated prefixes is BYOIP V1 legacy prefix. This is output only value and no longer supported in BYOIP V2.
         * 
         */
        GlobalAndRegional("GLOBAL_AND_REGIONAL"),
        /**
         * The public delegated prefix is regional only. The provisioning will take a few minutes.
         * 
         */
        Regional("REGIONAL");

        private final String value;

        PublicAdvertisedPrefixPdpScope(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "PublicAdvertisedPrefixPdpScope[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
