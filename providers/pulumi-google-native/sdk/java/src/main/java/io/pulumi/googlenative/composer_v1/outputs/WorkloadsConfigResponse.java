// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.composer_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.composer_v1.outputs.SchedulerResourceResponse;
import io.pulumi.googlenative.composer_v1.outputs.WebServerResourceResponse;
import io.pulumi.googlenative.composer_v1.outputs.WorkerResourceResponse;
import java.util.Objects;

@OutputCustomType
public final class WorkloadsConfigResponse {
    /**
     * Optional. Resources used by Airflow schedulers.
     * 
     */
    private final SchedulerResourceResponse scheduler;
    /**
     * Optional. Resources used by Airflow web server.
     * 
     */
    private final WebServerResourceResponse webServer;
    /**
     * Optional. Resources used by Airflow workers.
     * 
     */
    private final WorkerResourceResponse worker;

    @OutputCustomType.Constructor({"scheduler","webServer","worker"})
    private WorkloadsConfigResponse(
        SchedulerResourceResponse scheduler,
        WebServerResourceResponse webServer,
        WorkerResourceResponse worker) {
        this.scheduler = Objects.requireNonNull(scheduler);
        this.webServer = Objects.requireNonNull(webServer);
        this.worker = Objects.requireNonNull(worker);
    }

    /**
     * Optional. Resources used by Airflow schedulers.
     * 
    */
    public SchedulerResourceResponse getScheduler() {
        return this.scheduler;
    }
    /**
     * Optional. Resources used by Airflow web server.
     * 
    */
    public WebServerResourceResponse getWebServer() {
        return this.webServer;
    }
    /**
     * Optional. Resources used by Airflow workers.
     * 
    */
    public WorkerResourceResponse getWorker() {
        return this.worker;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadsConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchedulerResourceResponse scheduler;
        private WebServerResourceResponse webServer;
        private WorkerResourceResponse worker;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkloadsConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scheduler = defaults.scheduler;
    	      this.webServer = defaults.webServer;
    	      this.worker = defaults.worker;
        }

        public Builder setScheduler(SchedulerResourceResponse scheduler) {
            this.scheduler = Objects.requireNonNull(scheduler);
            return this;
        }

        public Builder setWebServer(WebServerResourceResponse webServer) {
            this.webServer = Objects.requireNonNull(webServer);
            return this;
        }

        public Builder setWorker(WorkerResourceResponse worker) {
            this.worker = Objects.requireNonNull(worker);
            return this;
        }
        public WorkloadsConfigResponse build() {
            return new WorkloadsConfigResponse(scheduler, webServer, worker);
        }
    }
}
