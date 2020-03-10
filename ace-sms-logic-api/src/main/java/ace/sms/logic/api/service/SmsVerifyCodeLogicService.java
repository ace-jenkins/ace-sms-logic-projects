package ace.sms.logic.api.service;

import ace.fw.model.response.GenericResponseExt;
import ace.sms.define.base.constant.SmsConstants;
import ace.sms.define.logic.model.request.SendVerifyCodeWIthImageVerifyCodeRequest;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * @author Caspar
 * @contract 279397942@qq.com
 * @create 2020/1/19 12:50
 * @description 短信验证码服务
 */
@FeignClient(value = SmsConstants.LOGIC_FEIGN_CLIENT_NAME)
@Validated
public interface SmsVerifyCodeLogicService {
    String MODULE_RESTFUL_NAME = "sms-verify-code-logic";

    @ApiOperation(value = "发送验证码")
    @RequestMapping(path = "/send", method = RequestMethod.POST)
    GenericResponseExt<Boolean> send(@Valid @RequestBody SendVerifyCodeWIthImageVerifyCodeRequest request);


}
