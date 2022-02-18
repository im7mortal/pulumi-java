// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes;

import io.pulumi.core.TypeShape;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;

public final class Config {

    private static final io.pulumi.Config config = io.pulumi.Config.of("kubernetes");
/**
 * If present, the name of the kubeconfig cluster to use.
 * 
 */
    public Optional<String> cluster() {
        return config.getObject("cluster",TypeShape.<String>builder(String.class).build());
    }
/**
 * If present, the name of the kubeconfig context to use.
 * 
 */
    public Optional<String> context() {
        return config.getObject("context",TypeShape.<String>builder(String.class).build());
    }
/**
 * BETA FEATURE - If present and set to true, enable server-side diff calculations.
 * This feature is in developer preview, and is disabled by default.
 * 
 * This config can be specified in the following ways, using this precedence:
 * 1. This `enableDryRun` parameter.
 * 2. The `PULUMI_K8S_ENABLE_DRY_RUN` environment variable.
 * 
 */
    public Optional<Boolean> enableDryRun() {
        return config.getObject("enableDryRun",TypeShape.<Boolean>builder(Boolean.class).build());
    }
/**
 * BETA FEATURE - If present and set to true, replace CRDs on update rather than patching.
 * This feature is in developer preview, and is disabled by default.
 * 
 * This config can be specified in the following ways, using this precedence:
 * 1. This `enableReplaceCRD` parameter.
 * 2. The `PULUMI_K8S_ENABLE_REPLACE_CRD` environment variable.
 * 
 */
    public Optional<Boolean> enableReplaceCRD() {
        return config.getObject("enableReplaceCRD",TypeShape.<Boolean>builder(Boolean.class).build());
    }
/**
 * The contents of a kubeconfig file or the path to a kubeconfig file. If this is set, this config will be used instead of $KUBECONFIG.
 * 
 */
    public Optional<String> kubeconfig() {
        return config.getObject("kubeconfig",TypeShape.<String>builder(String.class).build());
    }
/**
 * If present, the default namespace to use. This flag is ignored for cluster-scoped resources.
 * 
 * A namespace can be specified in multiple places, and the precedence is as follows:
 * 1. `.metadata.namespace` set on the resource.
 * 2. This `namespace` parameter.
 * 3. `namespace` set for the active context in the kubeconfig.
 * 
 */
    public Optional<String> namespace() {
        return config.getObject("namespace",TypeShape.<String>builder(String.class).build());
    }
/**
 * BETA FEATURE - If present, render resource manifests to this directory. In this mode, resources will not
 * be created on a Kubernetes cluster, but the rendered manifests will be kept in sync with changes
 * to the Pulumi program. This feature is in developer preview, and is disabled by default.
 * 
 * Note that some computed Outputs such as status fields will not be populated
 * since the resources are not created on a Kubernetes cluster. These Output values will remain undefined,
 * and may result in an error if they are referenced by other resources. Also note that any secret values
 * used in these resources will be rendered in plaintext to the resulting YAML.
 * 
 */
    public Optional<String> renderYamlToDirectory() {
        return config.getObject("renderYamlToDirectory",TypeShape.<String>builder(String.class).build());
    }
/**
 * If present and set to true, suppress apiVersion deprecation warnings from the CLI.
 * 
 * This config can be specified in the following ways, using this precedence:
 * 1. This `suppressDeprecationWarnings` parameter.
 * 2. The `PULUMI_K8S_SUPPRESS_DEPRECATION_WARNINGS` environment variable.
 * 
 */
    public Optional<Boolean> suppressDeprecationWarnings() {
        return config.getObject("suppressDeprecationWarnings",TypeShape.<Boolean>builder(Boolean.class).build());
    }
/**
 * If present and set to true, suppress unsupported Helm hook warnings from the CLI.
 * 
 * This config can be specified in the following ways, using this precedence:
 * 1. This `suppressHelmHookWarnings` parameter.
 * 2. The `PULUMI_K8S_SUPPRESS_HELM_HOOK_WARNINGS` environment variable.
 * 
 */
    public Optional<Boolean> suppressHelmHookWarnings() {
        return config.getObject("suppressHelmHookWarnings",TypeShape.<Boolean>builder(Boolean.class).build());
    }
}
