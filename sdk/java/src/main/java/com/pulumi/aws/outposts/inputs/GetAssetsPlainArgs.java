// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.outposts.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAssetsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAssetsPlainArgs Empty = new GetAssetsPlainArgs();

    /**
     * Outpost ARN.
     * 
     */
    @Import(name="arn", required=true)
    private String arn;

    /**
     * @return Outpost ARN.
     * 
     */
    public String arn() {
        return this.arn;
    }

    /**
     * Filters by list of Host IDs of a Dedicated Host.
     * 
     */
    @Import(name="hostIdFilters")
    private @Nullable List<String> hostIdFilters;

    /**
     * @return Filters by list of Host IDs of a Dedicated Host.
     * 
     */
    public Optional<List<String>> hostIdFilters() {
        return Optional.ofNullable(this.hostIdFilters);
    }

    /**
     * Filters by list of state status. Valid values: &#34;ACTIVE&#34;, &#34;RETIRING&#34;.
     * 
     */
    @Import(name="statusIdFilters")
    private @Nullable List<String> statusIdFilters;

    /**
     * @return Filters by list of state status. Valid values: &#34;ACTIVE&#34;, &#34;RETIRING&#34;.
     * 
     */
    public Optional<List<String>> statusIdFilters() {
        return Optional.ofNullable(this.statusIdFilters);
    }

    private GetAssetsPlainArgs() {}

    private GetAssetsPlainArgs(GetAssetsPlainArgs $) {
        this.arn = $.arn;
        this.hostIdFilters = $.hostIdFilters;
        this.statusIdFilters = $.statusIdFilters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAssetsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAssetsPlainArgs $;

        public Builder() {
            $ = new GetAssetsPlainArgs();
        }

        public Builder(GetAssetsPlainArgs defaults) {
            $ = new GetAssetsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn Outpost ARN.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param hostIdFilters Filters by list of Host IDs of a Dedicated Host.
         * 
         * @return builder
         * 
         */
        public Builder hostIdFilters(@Nullable List<String> hostIdFilters) {
            $.hostIdFilters = hostIdFilters;
            return this;
        }

        /**
         * @param hostIdFilters Filters by list of Host IDs of a Dedicated Host.
         * 
         * @return builder
         * 
         */
        public Builder hostIdFilters(String... hostIdFilters) {
            return hostIdFilters(List.of(hostIdFilters));
        }

        /**
         * @param statusIdFilters Filters by list of state status. Valid values: &#34;ACTIVE&#34;, &#34;RETIRING&#34;.
         * 
         * @return builder
         * 
         */
        public Builder statusIdFilters(@Nullable List<String> statusIdFilters) {
            $.statusIdFilters = statusIdFilters;
            return this;
        }

        /**
         * @param statusIdFilters Filters by list of state status. Valid values: &#34;ACTIVE&#34;, &#34;RETIRING&#34;.
         * 
         * @return builder
         * 
         */
        public Builder statusIdFilters(String... statusIdFilters) {
            return statusIdFilters(List.of(statusIdFilters));
        }

        public GetAssetsPlainArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
