package com.westar.service;

import java.io.File;

public interface EmailService {
    //发送简单的邮件
    void sendSimpleMail(String sendTo,String title,String content);
    //发送带有附件的邮件
    void sendAttachementMail(String sendTo, String title, String content, File file);
    //发送邮件模板
    void sendTemplateMail(String sendTo, String title,String info);

}
