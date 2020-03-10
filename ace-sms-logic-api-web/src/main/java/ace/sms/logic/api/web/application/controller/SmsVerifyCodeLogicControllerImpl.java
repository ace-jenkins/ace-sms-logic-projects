package ace.sms.logic.api.web.application.controller;

import ace.fw.model.response.GenericResponseExt;
import ace.image.verify.code.base.api.service.ImageVerifyCodeBaseService;
import ace.sms.base.api.service.SmsVerifyCodeBaseService;
import ace.sms.define.logic.model.request.SendVerifyCodeWIthImageVerifyCodeRequest;
import ace.sms.logic.api.controller.SmsVerifyCodeLogicController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author Caspar
 * @contract 279397942@qq.com
 * @create 2020/1/19 11:37
 * @description
 */
@RestController
@Validated
public class SmsVerifyCodeLogicControllerImpl implements SmsVerifyCodeLogicController {

    @Autowired
    private ImageVerifyCodeBaseService imageVerifyCodeBaseService;
    @Autowired
    private SmsVerifyCodeBaseService smsVerifyCodeBaseService;

    @Override
    public GenericResponseExt<Boolean> send(@Valid SendVerifyCodeWIthImageVerifyCodeRequest request) {
        imageVerifyCodeBaseService
                .check(request.getImageVerifyCodeParams())
                .check();

        return smsVerifyCodeBaseService.send(request.getSendVerifyCodeParams());
    }
}
