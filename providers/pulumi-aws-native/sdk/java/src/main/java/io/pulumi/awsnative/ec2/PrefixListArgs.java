// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.ec2.enums.PrefixListAddressFamily;
import io.pulumi.awsnative.ec2.inputs.PrefixListEntryArgs;
import io.pulumi.awsnative.ec2.inputs.PrefixListTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrefixListArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrefixListArgs Empty = new PrefixListArgs();

    /**
     * Ip Version of Prefix List.
     * 
     */
    @InputImport(name="addressFamily", required=true)
    private final Input<PrefixListAddressFamily> addressFamily;

    public Input<PrefixListAddressFamily> getAddressFamily() {
        return this.addressFamily;
    }

    /**
     * Entries of Prefix List.
     * 
     */
    @InputImport(name="entries")
    private final @Nullable Input<List<PrefixListEntryArgs>> entries;

    public Input<List<PrefixListEntryArgs>> getEntries() {
        return this.entries == null ? Input.empty() : this.entries;
    }

    /**
     * Max Entries of Prefix List.
     * 
     */
    @InputImport(name="maxEntries", required=true)
    private final Input<Integer> maxEntries;

    public Input<Integer> getMaxEntries() {
        return this.maxEntries;
    }

    /**
     * Name of Prefix List.
     * 
     */
    @InputImport(name="prefixListName")
    private final @Nullable Input<String> prefixListName;

    public Input<String> getPrefixListName() {
        return this.prefixListName == null ? Input.empty() : this.prefixListName;
    }

    /**
     * Tags for Prefix List
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<List<PrefixListTagArgs>> tags;

    public Input<List<PrefixListTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public PrefixListArgs(
        Input<PrefixListAddressFamily> addressFamily,
        @Nullable Input<List<PrefixListEntryArgs>> entries,
        Input<Integer> maxEntries,
        @Nullable Input<String> prefixListName,
        @Nullable Input<List<PrefixListTagArgs>> tags) {
        this.addressFamily = Objects.requireNonNull(addressFamily, "expected parameter 'addressFamily' to be non-null");
        this.entries = entries;
        this.maxEntries = Objects.requireNonNull(maxEntries, "expected parameter 'maxEntries' to be non-null");
        this.prefixListName = prefixListName;
        this.tags = tags;
    }

    private PrefixListArgs() {
        this.addressFamily = Input.empty();
        this.entries = Input.empty();
        this.maxEntries = Input.empty();
        this.prefixListName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrefixListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<PrefixListAddressFamily> addressFamily;
        private @Nullable Input<List<PrefixListEntryArgs>> entries;
        private Input<Integer> maxEntries;
        private @Nullable Input<String> prefixListName;
        private @Nullable Input<List<PrefixListTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(PrefixListArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressFamily = defaults.addressFamily;
    	      this.entries = defaults.entries;
    	      this.maxEntries = defaults.maxEntries;
    	      this.prefixListName = defaults.prefixListName;
    	      this.tags = defaults.tags;
        }

        public Builder setAddressFamily(Input<PrefixListAddressFamily> addressFamily) {
            this.addressFamily = Objects.requireNonNull(addressFamily);
            return this;
        }

        public Builder setAddressFamily(PrefixListAddressFamily addressFamily) {
            this.addressFamily = Input.of(Objects.requireNonNull(addressFamily));
            return this;
        }

        public Builder setEntries(@Nullable Input<List<PrefixListEntryArgs>> entries) {
            this.entries = entries;
            return this;
        }

        public Builder setEntries(@Nullable List<PrefixListEntryArgs> entries) {
            this.entries = Input.ofNullable(entries);
            return this;
        }

        public Builder setMaxEntries(Input<Integer> maxEntries) {
            this.maxEntries = Objects.requireNonNull(maxEntries);
            return this;
        }

        public Builder setMaxEntries(Integer maxEntries) {
            this.maxEntries = Input.of(Objects.requireNonNull(maxEntries));
            return this;
        }

        public Builder setPrefixListName(@Nullable Input<String> prefixListName) {
            this.prefixListName = prefixListName;
            return this;
        }

        public Builder setPrefixListName(@Nullable String prefixListName) {
            this.prefixListName = Input.ofNullable(prefixListName);
            return this;
        }

        public Builder setTags(@Nullable Input<List<PrefixListTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<PrefixListTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public PrefixListArgs build() {
            return new PrefixListArgs(addressFamily, entries, maxEntries, prefixListName, tags);
        }
    }
}
