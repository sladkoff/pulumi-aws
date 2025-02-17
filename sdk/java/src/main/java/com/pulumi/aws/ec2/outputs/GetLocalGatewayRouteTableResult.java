// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.aws.ec2.outputs.GetLocalGatewayRouteTableFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetLocalGatewayRouteTableResult {
    private @Nullable List<GetLocalGatewayRouteTableFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String localGatewayId;
    private String localGatewayRouteTableId;
    private String outpostArn;
    private String state;
    private Map<String,String> tags;

    private GetLocalGatewayRouteTableResult() {}
    public List<GetLocalGatewayRouteTableFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String localGatewayId() {
        return this.localGatewayId;
    }
    public String localGatewayRouteTableId() {
        return this.localGatewayRouteTableId;
    }
    public String outpostArn() {
        return this.outpostArn;
    }
    public String state() {
        return this.state;
    }
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLocalGatewayRouteTableResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetLocalGatewayRouteTableFilter> filters;
        private String id;
        private String localGatewayId;
        private String localGatewayRouteTableId;
        private String outpostArn;
        private String state;
        private Map<String,String> tags;
        public Builder() {}
        public Builder(GetLocalGatewayRouteTableResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.localGatewayId = defaults.localGatewayId;
    	      this.localGatewayRouteTableId = defaults.localGatewayRouteTableId;
    	      this.outpostArn = defaults.outpostArn;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder filters(@Nullable List<GetLocalGatewayRouteTableFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetLocalGatewayRouteTableFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder localGatewayId(String localGatewayId) {
            this.localGatewayId = Objects.requireNonNull(localGatewayId);
            return this;
        }
        @CustomType.Setter
        public Builder localGatewayRouteTableId(String localGatewayRouteTableId) {
            this.localGatewayRouteTableId = Objects.requireNonNull(localGatewayRouteTableId);
            return this;
        }
        @CustomType.Setter
        public Builder outpostArn(String outpostArn) {
            this.outpostArn = Objects.requireNonNull(outpostArn);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetLocalGatewayRouteTableResult build() {
            final var o = new GetLocalGatewayRouteTableResult();
            o.filters = filters;
            o.id = id;
            o.localGatewayId = localGatewayId;
            o.localGatewayRouteTableId = localGatewayRouteTableId;
            o.outpostArn = outpostArn;
            o.state = state;
            o.tags = tags;
            return o;
        }
    }
}
