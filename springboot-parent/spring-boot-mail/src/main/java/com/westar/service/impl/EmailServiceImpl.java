package com.westar.service.impl;

import com.westar.conf.EmailConfig;
import com.westar.service.EmailService;
import freemarker.core.ParseException;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.Template;
import freemarker.template.TemplateNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    private EmailConfig emailConfig;

    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private FreeMarkerConfigurer freeMarkerConfigurer;

    @Override
    public void sendSimpleMail(String sendTo, String title, String content) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom(emailConfig.getEmailFrom());
        mailMessage.setTo(sendTo);
        mailMessage.setSubject(title);
        mailMessage.setText(content);

        javaMailSender.send(mailMessage);
    }

    @Override
    public void sendAttachementMail(String sendTo, String title, String content, File file) {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();

        try {
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);
            helper.setFrom(emailConfig.getEmailFrom());
            helper.setTo(sendTo);
            helper.setSubject(title);
            helper.setText(content);

            FileSystemResource r = new FileSystemResource(file);
            helper.addAttachment("附件",r);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        javaMailSender.send(mimeMessage);
    }

    /**
     *
     * @param sendTo
     * @param title
     * @param info info.html
     */
    @Override
    public void sendTemplateMail(String sendTo, String title, String info) {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);
            helper.setFrom(emailConfig.getEmailFrom());
            helper.setTo(sendTo);
            helper.setSubject(title);
            //封装模板使用的数据
            Map<String,Object> model = new HashMap<>();
            model.put("userName","李四");

            //得到模板
            Template template = freeMarkerConfigurer.getConfiguration().getTemplate(info);
            String html = FreeMarkerTemplateUtils.processTemplateIntoString(template,model);

            helper.setText(html,true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        javaMailSender.send(mimeMessage);
    }
}
