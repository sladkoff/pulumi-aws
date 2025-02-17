// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.GetPublicIpv4PoolsFilter;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPublicIpv4PoolsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPublicIpv4PoolsPlainArgs Empty = new GetPublicIpv4PoolsPlainArgs();

    /**
     * Custom filter block as described below.
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetPublicIpv4PoolsFilter> filters;

    /**
     * @return Custom filter block as described below.
     * 
     */
    public Optional<List<GetPublicIpv4PoolsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Map of tags, each pair of which must exactly match a pair on the desired pools.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return Map of tags, each pair of which must exactly match a pair on the desired pools.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetPublicIpv4PoolsPlainArgs() {}

    private GetPublicIpv4PoolsPlainArgs(GetPublicIpv4PoolsPlainArgs $) {
        this.filters = $.filters;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPublicIpv4PoolsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPublicIpv4PoolsPlainArgs $;

        public Builder() {
            $ = new GetPublicIpv4PoolsPlainArgs();
        }

        public Builder(GetPublicIpv4PoolsPlainArgs defaults) {
            $ = new GetPublicIpv4PoolsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters Custom filter block as described below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetPublicIpv4PoolsFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Custom filter block as described below.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetPublicIpv4PoolsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param tags Map of tags, each pair of which must exactly match a pair on the desired pools.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetPublicIpv4PoolsPlainArgs build() {
            return $;
        }
    }

}
