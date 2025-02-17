// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class RecordWeightedRoutingPolicy {
    /**
     * @return A numeric value indicating the relative weight of the record. See http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html#routing-policy-weighted.
     * 
     */
    private Integer weight;

    private RecordWeightedRoutingPolicy() {}
    /**
     * @return A numeric value indicating the relative weight of the record. See http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html#routing-policy-weighted.
     * 
     */
    public Integer weight() {
        return this.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecordWeightedRoutingPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer weight;
        public Builder() {}
        public Builder(RecordWeightedRoutingPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.weight = defaults.weight;
        }

        @CustomType.Setter
        public Builder weight(Integer weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }
        public RecordWeightedRoutingPolicy build() {
            final var o = new RecordWeightedRoutingPolicy();
            o.weight = weight;
            return o;
        }
    }
}
