// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.licensemanager.inputs;

import com.pulumi.aws.licensemanager.inputs.GetLicenseGrantsFilter;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLicenseGrantsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLicenseGrantsPlainArgs Empty = new GetLicenseGrantsPlainArgs();

    /**
     * Custom filter block as described below.
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetLicenseGrantsFilter> filters;

    /**
     * @return Custom filter block as described below.
     * 
     */
    public Optional<List<GetLicenseGrantsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetLicenseGrantsPlainArgs() {}

    private GetLicenseGrantsPlainArgs(GetLicenseGrantsPlainArgs $) {
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLicenseGrantsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLicenseGrantsPlainArgs $;

        public Builder() {
            $ = new GetLicenseGrantsPlainArgs();
        }

        public Builder(GetLicenseGrantsPlainArgs defaults) {
            $ = new GetLicenseGrantsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters Custom filter block as described below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetLicenseGrantsFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Custom filter block as described below.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetLicenseGrantsFilter... filters) {
            return filters(List.of(filters));
        }

        public GetLicenseGrantsPlainArgs build() {
            return $;
        }
    }

}
