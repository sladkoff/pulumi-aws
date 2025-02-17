// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OrganizationalUnitAccount {
    /**
     * @return ARN of the organizational unit
     * 
     */
    private @Nullable String arn;
    /**
     * @return Email of the account
     * 
     */
    private @Nullable String email;
    /**
     * @return Identifier of the organization unit
     * 
     */
    private @Nullable String id;
    /**
     * @return The name for the organizational unit
     * 
     */
    private @Nullable String name;

    private OrganizationalUnitAccount() {}
    /**
     * @return ARN of the organizational unit
     * 
     */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * @return Email of the account
     * 
     */
    public Optional<String> email() {
        return Optional.ofNullable(this.email);
    }
    /**
     * @return Identifier of the organization unit
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The name for the organizational unit
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationalUnitAccount defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String email;
        private @Nullable String id;
        private @Nullable String name;
        public Builder() {}
        public Builder(OrganizationalUnitAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.email = defaults.email;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        @CustomType.Setter
        public Builder email(@Nullable String email) {
            this.email = email;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public OrganizationalUnitAccount build() {
            final var o = new OrganizationalUnitAccount();
            o.arn = arn;
            o.email = email;
            o.id = id;
            o.name = name;
            return o;
        }
    }
}
