// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.applicationloadbalancing.outputs;

import io.pulumi.aws.applicationloadbalancing.outputs.GetTargetGroupHealthCheck;
import io.pulumi.aws.applicationloadbalancing.outputs.GetTargetGroupStickiness;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetTargetGroupResult {
    private final String arn;
    private final String arnSuffix;
    private final Boolean connectionTermination;
    private final Integer deregistrationDelay;
    private final GetTargetGroupHealthCheck healthCheck;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final Boolean lambdaMultiValueHeadersEnabled;
    private final String loadBalancingAlgorithmType;
    private final String name;
    private final Integer port;
    private final String preserveClientIp;
    private final String protocol;
    private final String protocolVersion;
    private final Boolean proxyProtocolV2;
    private final Integer slowStart;
    private final GetTargetGroupStickiness stickiness;
    private final Map<String,String> tags;
    private final String targetType;
    private final String vpcId;

    @OutputCustomType.Constructor({"arn","arnSuffix","connectionTermination","deregistrationDelay","healthCheck","id","lambdaMultiValueHeadersEnabled","loadBalancingAlgorithmType","name","port","preserveClientIp","protocol","protocolVersion","proxyProtocolV2","slowStart","stickiness","tags","targetType","vpcId"})
    private GetTargetGroupResult(
        String arn,
        String arnSuffix,
        Boolean connectionTermination,
        Integer deregistrationDelay,
        GetTargetGroupHealthCheck healthCheck,
        String id,
        Boolean lambdaMultiValueHeadersEnabled,
        String loadBalancingAlgorithmType,
        String name,
        Integer port,
        String preserveClientIp,
        String protocol,
        String protocolVersion,
        Boolean proxyProtocolV2,
        Integer slowStart,
        GetTargetGroupStickiness stickiness,
        Map<String,String> tags,
        String targetType,
        String vpcId) {
        this.arn = Objects.requireNonNull(arn);
        this.arnSuffix = Objects.requireNonNull(arnSuffix);
        this.connectionTermination = Objects.requireNonNull(connectionTermination);
        this.deregistrationDelay = Objects.requireNonNull(deregistrationDelay);
        this.healthCheck = Objects.requireNonNull(healthCheck);
        this.id = Objects.requireNonNull(id);
        this.lambdaMultiValueHeadersEnabled = Objects.requireNonNull(lambdaMultiValueHeadersEnabled);
        this.loadBalancingAlgorithmType = Objects.requireNonNull(loadBalancingAlgorithmType);
        this.name = Objects.requireNonNull(name);
        this.port = Objects.requireNonNull(port);
        this.preserveClientIp = Objects.requireNonNull(preserveClientIp);
        this.protocol = Objects.requireNonNull(protocol);
        this.protocolVersion = Objects.requireNonNull(protocolVersion);
        this.proxyProtocolV2 = Objects.requireNonNull(proxyProtocolV2);
        this.slowStart = Objects.requireNonNull(slowStart);
        this.stickiness = Objects.requireNonNull(stickiness);
        this.tags = Objects.requireNonNull(tags);
        this.targetType = Objects.requireNonNull(targetType);
        this.vpcId = Objects.requireNonNull(vpcId);
    }

    public String getArn() {
        return this.arn;
    }
    public String getArnSuffix() {
        return this.arnSuffix;
    }
    public Boolean getConnectionTermination() {
        return this.connectionTermination;
    }
    public Integer getDeregistrationDelay() {
        return this.deregistrationDelay;
    }
    public GetTargetGroupHealthCheck getHealthCheck() {
        return this.healthCheck;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public Boolean getLambdaMultiValueHeadersEnabled() {
        return this.lambdaMultiValueHeadersEnabled;
    }
    public String getLoadBalancingAlgorithmType() {
        return this.loadBalancingAlgorithmType;
    }
    public String getName() {
        return this.name;
    }
    public Integer getPort() {
        return this.port;
    }
    public String getPreserveClientIp() {
        return this.preserveClientIp;
    }
    public String getProtocol() {
        return this.protocol;
    }
    public String getProtocolVersion() {
        return this.protocolVersion;
    }
    public Boolean getProxyProtocolV2() {
        return this.proxyProtocolV2;
    }
    public Integer getSlowStart() {
        return this.slowStart;
    }
    public GetTargetGroupStickiness getStickiness() {
        return this.stickiness;
    }
    public Map<String,String> getTags() {
        return this.tags;
    }
    public String getTargetType() {
        return this.targetType;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTargetGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String arnSuffix;
        private Boolean connectionTermination;
        private Integer deregistrationDelay;
        private GetTargetGroupHealthCheck healthCheck;
        private String id;
        private Boolean lambdaMultiValueHeadersEnabled;
        private String loadBalancingAlgorithmType;
        private String name;
        private Integer port;
        private String preserveClientIp;
        private String protocol;
        private String protocolVersion;
        private Boolean proxyProtocolV2;
        private Integer slowStart;
        private GetTargetGroupStickiness stickiness;
        private Map<String,String> tags;
        private String targetType;
        private String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTargetGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.arnSuffix = defaults.arnSuffix;
    	      this.connectionTermination = defaults.connectionTermination;
    	      this.deregistrationDelay = defaults.deregistrationDelay;
    	      this.healthCheck = defaults.healthCheck;
    	      this.id = defaults.id;
    	      this.lambdaMultiValueHeadersEnabled = defaults.lambdaMultiValueHeadersEnabled;
    	      this.loadBalancingAlgorithmType = defaults.loadBalancingAlgorithmType;
    	      this.name = defaults.name;
    	      this.port = defaults.port;
    	      this.preserveClientIp = defaults.preserveClientIp;
    	      this.protocol = defaults.protocol;
    	      this.protocolVersion = defaults.protocolVersion;
    	      this.proxyProtocolV2 = defaults.proxyProtocolV2;
    	      this.slowStart = defaults.slowStart;
    	      this.stickiness = defaults.stickiness;
    	      this.tags = defaults.tags;
    	      this.targetType = defaults.targetType;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setArnSuffix(String arnSuffix) {
            this.arnSuffix = Objects.requireNonNull(arnSuffix);
            return this;
        }

        public Builder setConnectionTermination(Boolean connectionTermination) {
            this.connectionTermination = Objects.requireNonNull(connectionTermination);
            return this;
        }

        public Builder setDeregistrationDelay(Integer deregistrationDelay) {
            this.deregistrationDelay = Objects.requireNonNull(deregistrationDelay);
            return this;
        }

        public Builder setHealthCheck(GetTargetGroupHealthCheck healthCheck) {
            this.healthCheck = Objects.requireNonNull(healthCheck);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLambdaMultiValueHeadersEnabled(Boolean lambdaMultiValueHeadersEnabled) {
            this.lambdaMultiValueHeadersEnabled = Objects.requireNonNull(lambdaMultiValueHeadersEnabled);
            return this;
        }

        public Builder setLoadBalancingAlgorithmType(String loadBalancingAlgorithmType) {
            this.loadBalancingAlgorithmType = Objects.requireNonNull(loadBalancingAlgorithmType);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setPreserveClientIp(String preserveClientIp) {
            this.preserveClientIp = Objects.requireNonNull(preserveClientIp);
            return this;
        }

        public Builder setProtocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder setProtocolVersion(String protocolVersion) {
            this.protocolVersion = Objects.requireNonNull(protocolVersion);
            return this;
        }

        public Builder setProxyProtocolV2(Boolean proxyProtocolV2) {
            this.proxyProtocolV2 = Objects.requireNonNull(proxyProtocolV2);
            return this;
        }

        public Builder setSlowStart(Integer slowStart) {
            this.slowStart = Objects.requireNonNull(slowStart);
            return this;
        }

        public Builder setStickiness(GetTargetGroupStickiness stickiness) {
            this.stickiness = Objects.requireNonNull(stickiness);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setTargetType(String targetType) {
            this.targetType = Objects.requireNonNull(targetType);
            return this;
        }

        public Builder setVpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public GetTargetGroupResult build() {
            return new GetTargetGroupResult(arn, arnSuffix, connectionTermination, deregistrationDelay, healthCheck, id, lambdaMultiValueHeadersEnabled, loadBalancingAlgorithmType, name, port, preserveClientIp, protocol, protocolVersion, proxyProtocolV2, slowStart, stickiness, tags, targetType, vpcId);
        }
    }
}
