// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.auditregistration.k8s.io_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.auditregistration.k8s.io_v1alpha1.outputs.Policy;
import io.pulumi.kubernetes.auditregistration.k8s.io_v1alpha1.outputs.Webhook;
import java.util.Objects;

@OutputCustomType
public final class AuditSinkSpec {
    /**
     * Policy defines the policy for selecting which events should be sent to the webhook required
     * 
     */
    private final Policy policy;
    /**
     * Webhook to send events required
     * 
     */
    private final Webhook webhook;

    @OutputCustomType.Constructor({"policy","webhook"})
    private AuditSinkSpec(
        Policy policy,
        Webhook webhook) {
        this.policy = Objects.requireNonNull(policy);
        this.webhook = Objects.requireNonNull(webhook);
    }

    /**
     * Policy defines the policy for selecting which events should be sent to the webhook required
     * 
    */
    public Policy getPolicy() {
        return this.policy;
    }
    /**
     * Webhook to send events required
     * 
    */
    public Webhook getWebhook() {
        return this.webhook;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuditSinkSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Policy policy;
        private Webhook webhook;

        public Builder() {
    	      // Empty
        }

        public Builder(AuditSinkSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policy = defaults.policy;
    	      this.webhook = defaults.webhook;
        }

        public Builder setPolicy(Policy policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }

        public Builder setWebhook(Webhook webhook) {
            this.webhook = Objects.requireNonNull(webhook);
            return this;
        }
        public AuditSinkSpec build() {
            return new AuditSinkSpec(policy, webhook);
        }
    }
}
