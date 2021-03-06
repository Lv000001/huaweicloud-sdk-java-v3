package com.huaweicloud.sdk.iam.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.UpdateAgencyCustomPolicyRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateAgencyCustomPolicyRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="role_id")
    
    private String roleId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdateAgencyCustomPolicyRequestBody body = null;

    public UpdateAgencyCustomPolicyRequest withRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    


    /**
     * Get roleId
     * @return roleId
     */
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public UpdateAgencyCustomPolicyRequest withBody(UpdateAgencyCustomPolicyRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateAgencyCustomPolicyRequest withBody(Consumer<UpdateAgencyCustomPolicyRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateAgencyCustomPolicyRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateAgencyCustomPolicyRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateAgencyCustomPolicyRequestBody body) {
        this.body = body;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateAgencyCustomPolicyRequest updateAgencyCustomPolicyRequest = (UpdateAgencyCustomPolicyRequest) o;
        return Objects.equals(this.roleId, updateAgencyCustomPolicyRequest.roleId) &&
            Objects.equals(this.body, updateAgencyCustomPolicyRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(roleId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAgencyCustomPolicyRequest {\n");
        sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("}");
        return sb.toString();
    }
    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
}

