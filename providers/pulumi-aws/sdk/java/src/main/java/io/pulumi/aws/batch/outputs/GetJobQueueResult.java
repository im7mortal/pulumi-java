// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.batch.outputs;

import io.pulumi.aws.batch.outputs.GetJobQueueComputeEnvironmentOrder;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetJobQueueResult {
    /**
     * The ARN of the job queue.
     * 
     */
    private final String arn;
    /**
     * The compute environments that are attached to the job queue and the order in
     * which job placement is preferred. Compute environments are selected for job placement in ascending order.
     * * `compute_environment_order.#.order` - The order of the compute environment.
     * * `compute_environment_order.#.compute_environment` - The ARN of the compute environment.
     * 
     */
    private final List<GetJobQueueComputeEnvironmentOrder> computeEnvironmentOrders;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    /**
     * The priority of the job queue. Job queues with a higher priority are evaluated first when
     * associated with the same compute environment.
     * 
     */
    private final Integer priority;
    /**
     * The ARN of the fair share scheduling policy. If this attribute has a value, the job queue uses a fair share scheduling policy. If this attribute does not have a value, the job queue uses a first in, first out (FIFO) scheduling policy.
     * 
     */
    private final String schedulingPolicyArn;
    /**
     * Describes the ability of the queue to accept new jobs (for example, `ENABLED` or `DISABLED`).
     * 
     */
    private final String state;
    /**
     * The current status of the job queue (for example, `CREATING` or `VALID`).
     * 
     */
    private final String status;
    /**
     * A short, human-readable string to provide additional details about the current status
     * of the job queue.
     * 
     */
    private final String statusReason;
    /**
     * Key-value map of resource tags
     * 
     */
    private final Map<String,String> tags;

    @OutputCustomType.Constructor({"arn","computeEnvironmentOrders","id","name","priority","schedulingPolicyArn","state","status","statusReason","tags"})
    private GetJobQueueResult(
        String arn,
        List<GetJobQueueComputeEnvironmentOrder> computeEnvironmentOrders,
        String id,
        String name,
        Integer priority,
        String schedulingPolicyArn,
        String state,
        String status,
        String statusReason,
        Map<String,String> tags) {
        this.arn = Objects.requireNonNull(arn);
        this.computeEnvironmentOrders = Objects.requireNonNull(computeEnvironmentOrders);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.priority = Objects.requireNonNull(priority);
        this.schedulingPolicyArn = Objects.requireNonNull(schedulingPolicyArn);
        this.state = Objects.requireNonNull(state);
        this.status = Objects.requireNonNull(status);
        this.statusReason = Objects.requireNonNull(statusReason);
        this.tags = Objects.requireNonNull(tags);
    }

    /**
     * The ARN of the job queue.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * The compute environments that are attached to the job queue and the order in
     * which job placement is preferred. Compute environments are selected for job placement in ascending order.
     * * `compute_environment_order.#.order` - The order of the compute environment.
     * * `compute_environment_order.#.compute_environment` - The ARN of the compute environment.
     * 
    */
    public List<GetJobQueueComputeEnvironmentOrder> getComputeEnvironmentOrders() {
        return this.computeEnvironmentOrders;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    /**
     * The priority of the job queue. Job queues with a higher priority are evaluated first when
     * associated with the same compute environment.
     * 
    */
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * The ARN of the fair share scheduling policy. If this attribute has a value, the job queue uses a fair share scheduling policy. If this attribute does not have a value, the job queue uses a first in, first out (FIFO) scheduling policy.
     * 
    */
    public String getSchedulingPolicyArn() {
        return this.schedulingPolicyArn;
    }
    /**
     * Describes the ability of the queue to accept new jobs (for example, `ENABLED` or `DISABLED`).
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * The current status of the job queue (for example, `CREATING` or `VALID`).
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * A short, human-readable string to provide additional details about the current status
     * of the job queue.
     * 
    */
    public String getStatusReason() {
        return this.statusReason;
    }
    /**
     * Key-value map of resource tags
     * 
    */
    public Map<String,String> getTags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobQueueResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private List<GetJobQueueComputeEnvironmentOrder> computeEnvironmentOrders;
        private String id;
        private String name;
        private Integer priority;
        private String schedulingPolicyArn;
        private String state;
        private String status;
        private String statusReason;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetJobQueueResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.computeEnvironmentOrders = defaults.computeEnvironmentOrders;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.schedulingPolicyArn = defaults.schedulingPolicyArn;
    	      this.state = defaults.state;
    	      this.status = defaults.status;
    	      this.statusReason = defaults.statusReason;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setComputeEnvironmentOrders(List<GetJobQueueComputeEnvironmentOrder> computeEnvironmentOrders) {
            this.computeEnvironmentOrders = Objects.requireNonNull(computeEnvironmentOrders);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setSchedulingPolicyArn(String schedulingPolicyArn) {
            this.schedulingPolicyArn = Objects.requireNonNull(schedulingPolicyArn);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStatusReason(String statusReason) {
            this.statusReason = Objects.requireNonNull(statusReason);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetJobQueueResult build() {
            return new GetJobQueueResult(arn, computeEnvironmentOrders, id, name, priority, schedulingPolicyArn, state, status, statusReason, tags);
        }
    }
}
