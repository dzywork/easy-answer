package cn.org.dzygroup.easyanswer.template;

import java.util.Map;

/**
 * @author 戴志勇
 */
public class DefaultAnswerObject extends AbstractTemplateAnswerObject {

    public DefaultAnswerObject() {
    }

    public DefaultAnswerObject(boolean coverTemplateProp) {
        super(coverTemplateProp);
    }

    public DefaultAnswerObject(Map<String, Object> templateProperties) {
        super(templateProperties);
    }

    public DefaultAnswerObject(Map<String, Object> templateProperties, Map<String, Object> customProperties) {
        super(templateProperties, customProperties);
    }

    public DefaultAnswerObject(Map<String, Object> templateProperties, Map<String, Object> customProperties, boolean coverTemplateProp) {
        super(templateProperties, customProperties, coverTemplateProp);
    }


}