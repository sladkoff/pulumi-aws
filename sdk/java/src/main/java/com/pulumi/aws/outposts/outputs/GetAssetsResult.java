// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.outposts.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetAssetsResult {
    private String arn;
    /**
     * @return List of all the asset ids found. This data source will fail if none are found.
     * 
     */
    private List<String> assetIds;
    private @Nullable List<String> hostIdFilters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable List<String> statusIdFilters;

    private GetAssetsResult() {}
    public String arn() {
        return this.arn;
    }
    /**
     * @return List of all the asset ids found. This data source will fail if none are found.
     * 
     */
    public List<String> assetIds() {
        return this.assetIds;
    }
    public List<String> hostIdFilters() {
        return this.hostIdFilters == null ? List.of() : this.hostIdFilters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> statusIdFilters() {
        return this.statusIdFilters == null ? List.of() : this.statusIdFilters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAssetsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private List<String> assetIds;
        private @Nullable List<String> hostIdFilters;
        private String id;
        private @Nullable List<String> statusIdFilters;
        public Builder() {}
        public Builder(GetAssetsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.assetIds = defaults.assetIds;
    	      this.hostIdFilters = defaults.hostIdFilters;
    	      this.id = defaults.id;
    	      this.statusIdFilters = defaults.statusIdFilters;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder assetIds(List<String> assetIds) {
            this.assetIds = Objects.requireNonNull(assetIds);
            return this;
        }
        public Builder assetIds(String... assetIds) {
            return assetIds(List.of(assetIds));
        }
        @CustomType.Setter
        public Builder hostIdFilters(@Nullable List<String> hostIdFilters) {
            this.hostIdFilters = hostIdFilters;
            return this;
        }
        public Builder hostIdFilters(String... hostIdFilters) {
            return hostIdFilters(List.of(hostIdFilters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder statusIdFilters(@Nullable List<String> statusIdFilters) {
            this.statusIdFilters = statusIdFilters;
            return this;
        }
        public Builder statusIdFilters(String... statusIdFilters) {
            return statusIdFilters(List.of(statusIdFilters));
        }
        public GetAssetsResult build() {
            final var o = new GetAssetsResult();
            o.arn = arn;
            o.assetIds = assetIds;
            o.hostIdFilters = hostIdFilters;
            o.id = id;
            o.statusIdFilters = statusIdFilters;
            return o;
        }
    }
}
