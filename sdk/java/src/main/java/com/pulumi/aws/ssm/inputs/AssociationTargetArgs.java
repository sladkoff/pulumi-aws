// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class AssociationTargetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AssociationTargetArgs Empty = new AssociationTargetArgs();

    /**
     * Either `InstanceIds` or `tag:Tag Name` to specify an EC2 tag.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return Either `InstanceIds` or `tag:Tag Name` to specify an EC2 tag.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * A list of instance IDs or tag values. AWS currently limits this list size to one value.
     * 
     */
    @Import(name="values", required=true)
    private Output<List<String>> values;

    /**
     * @return A list of instance IDs or tag values. AWS currently limits this list size to one value.
     * 
     */
    public Output<List<String>> values() {
        return this.values;
    }

    private AssociationTargetArgs() {}

    private AssociationTargetArgs(AssociationTargetArgs $) {
        this.key = $.key;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AssociationTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AssociationTargetArgs $;

        public Builder() {
            $ = new AssociationTargetArgs();
        }

        public Builder(AssociationTargetArgs defaults) {
            $ = new AssociationTargetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key Either `InstanceIds` or `tag:Tag Name` to specify an EC2 tag.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Either `InstanceIds` or `tag:Tag Name` to specify an EC2 tag.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param values A list of instance IDs or tag values. AWS currently limits this list size to one value.
         * 
         * @return builder
         * 
         */
        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values A list of instance IDs or tag values. AWS currently limits this list size to one value.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values A list of instance IDs or tag values. AWS currently limits this list size to one value.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public AssociationTargetArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
