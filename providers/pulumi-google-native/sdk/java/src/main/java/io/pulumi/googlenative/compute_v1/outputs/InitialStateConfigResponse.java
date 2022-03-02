// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_v1.outputs.FileContentBufferResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class InitialStateConfigResponse {
    /**
     * The Key Database (db).
     * 
     */
    private final List<FileContentBufferResponse> dbs;
    /**
     * The forbidden key database (dbx).
     * 
     */
    private final List<FileContentBufferResponse> dbxs;
    /**
     * The Key Exchange Key (KEK).
     * 
     */
    private final List<FileContentBufferResponse> keks;
    /**
     * The Platform Key (PK).
     * 
     */
    private final FileContentBufferResponse pk;

    @OutputCustomType.Constructor({"dbs","dbxs","keks","pk"})
    private InitialStateConfigResponse(
        List<FileContentBufferResponse> dbs,
        List<FileContentBufferResponse> dbxs,
        List<FileContentBufferResponse> keks,
        FileContentBufferResponse pk) {
        this.dbs = Objects.requireNonNull(dbs);
        this.dbxs = Objects.requireNonNull(dbxs);
        this.keks = Objects.requireNonNull(keks);
        this.pk = Objects.requireNonNull(pk);
    }

    /**
     * The Key Database (db).
     * 
    */
    public List<FileContentBufferResponse> getDbs() {
        return this.dbs;
    }
    /**
     * The forbidden key database (dbx).
     * 
    */
    public List<FileContentBufferResponse> getDbxs() {
        return this.dbxs;
    }
    /**
     * The Key Exchange Key (KEK).
     * 
    */
    public List<FileContentBufferResponse> getKeks() {
        return this.keks;
    }
    /**
     * The Platform Key (PK).
     * 
    */
    public FileContentBufferResponse getPk() {
        return this.pk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InitialStateConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<FileContentBufferResponse> dbs;
        private List<FileContentBufferResponse> dbxs;
        private List<FileContentBufferResponse> keks;
        private FileContentBufferResponse pk;

        public Builder() {
    	      // Empty
        }

        public Builder(InitialStateConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbs = defaults.dbs;
    	      this.dbxs = defaults.dbxs;
    	      this.keks = defaults.keks;
    	      this.pk = defaults.pk;
        }

        public Builder setDbs(List<FileContentBufferResponse> dbs) {
            this.dbs = Objects.requireNonNull(dbs);
            return this;
        }

        public Builder setDbxs(List<FileContentBufferResponse> dbxs) {
            this.dbxs = Objects.requireNonNull(dbxs);
            return this;
        }

        public Builder setKeks(List<FileContentBufferResponse> keks) {
            this.keks = Objects.requireNonNull(keks);
            return this;
        }

        public Builder setPk(FileContentBufferResponse pk) {
            this.pk = Objects.requireNonNull(pk);
            return this;
        }
        public InitialStateConfigResponse build() {
            return new InitialStateConfigResponse(dbs, dbxs, keks, pk);
        }
    }
}
