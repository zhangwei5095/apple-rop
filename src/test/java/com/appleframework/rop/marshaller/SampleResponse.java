/**
 *  
 * 日    期：12-2-29
 */
package com.appleframework.rop.marshaller;

import javax.xml.bind.annotation.*;
import java.util.HashMap;
import java.util.List;

/**
 * <pre>
 * 功能说明：
 * </pre>
 *
 * @author 陈雄华
 * @version 1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "sampleResponse")
public class SampleResponse{

    @XmlAttribute
    private String userId;

    @XmlAttribute
    private String createTime;

    private HashMap<String,String> attaches;

    private List<HashMap<String,Object>> table;

    public SampleResponse() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public List<HashMap<String, Object>> getTable() {
        return table;
    }

    public void setTable(List<HashMap<String, Object>> table) {
        this.table = table;
    }

    public HashMap<String, String> getAttaches() {
        return attaches;
    }

    public void setAttaches(HashMap<String, String> attaches) {
        this.attaches = attaches;
    }
}

