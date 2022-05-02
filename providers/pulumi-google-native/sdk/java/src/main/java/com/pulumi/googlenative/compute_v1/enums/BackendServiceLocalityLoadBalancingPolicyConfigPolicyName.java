// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The name of a locality load balancer policy to be used. The value should be one of the predefined ones as supported by localityLbPolicy, although at the moment only ROUND_ROBIN is supported. This field should only be populated when the customPolicy field is not used. Note that specifying the same policy more than once for a backend is not a valid configuration and will be rejected.
     * 
     */
    @EnumType
    public enum BackendServiceLocalityLoadBalancingPolicyConfigPolicyName {
        InvalidLbPolicy("INVALID_LB_POLICY"),
        /**
         * An O(1) algorithm which selects two random healthy hosts and picks the host which has fewer active requests.
         * 
         */
        LeastRequest("LEAST_REQUEST"),
        /**
         * This algorithm implements consistent hashing to backends. Maglev can be used as a drop in replacement for the ring hash load balancer. Maglev is not as stable as ring hash but has faster table lookup build times and host selection times. For more information about Maglev, see https://ai.google/research/pubs/pub44824
         * 
         */
        Maglev("MAGLEV"),
        /**
         * Backend host is selected based on the client connection metadata, i.e., connections are opened to the same address as the destination address of the incoming connection before the connection was redirected to the load balancer.
         * 
         */
        OriginalDestination("ORIGINAL_DESTINATION"),
        /**
         * The load balancer selects a random healthy host.
         * 
         */
        Random("RANDOM"),
        /**
         * The ring/modulo hash load balancer implements consistent hashing to backends. The algorithm has the property that the addition/removal of a host from a set of N hosts only affects 1/N of the requests.
         * 
         */
        RingHash("RING_HASH"),
        /**
         * This is a simple policy in which each healthy backend is selected in round robin order. This is the default.
         * 
         */
        RoundRobin("ROUND_ROBIN");

        private final String value;

        BackendServiceLocalityLoadBalancingPolicyConfigPolicyName(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "BackendServiceLocalityLoadBalancingPolicyConfigPolicyName[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
