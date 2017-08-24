package other;

import com.sun.mail.util.MailSSLSocketFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Date;
import java.util.Properties;

/**
 * Created by ZSH
 */
public class JavaMail {
    public static void main(String[] args) throws MessagingException, GeneralSecurityException {
        Properties props = new Properties();

        // 开启debug调试
        props.setProperty("mail.debug", "true");
        // 发送服务器需要身份验证
        props.setProperty("mail.smtp.auth", "true");
        // 设置邮件服务器主机名
        props.setProperty("mail.host", "smtp.qq.com");
        // 发送邮件协议名称
        props.setProperty("mail.transport.protocol", "smtp");

        MailSSLSocketFactory sf = new MailSSLSocketFactory();
        sf.setTrustAllHosts(true);
        props.put("mail.smtp.ssl.enable", "true");
        props.put("mail.smtp.ssl.socketFactory", sf);

        Session session = Session.getInstance(props);

        Message msg = new MimeMessage(session);
        msg.setSubject("愚蠢的人类");
        msg.setSentDate(new Date());
        StringBuilder builder = new StringBuilder();
        builder.append("陈雯菌？");
        builder.append("\n愚蠢的人类啊！");
        builder.append("\n收到JavaMail请叫你的周大神");
        msg.setText(builder.toString());

        //发送人
        msg.setFrom(new InternetAddress("2513827428@qq.com"));

        Transport transport = session.getTransport();
        transport.connect("smtp.qq.com", "2513827428@qq.com", "qwfqinvzyosfebhc");

        //收件人
        transport.sendMessage(msg, new Address[] { new InternetAddress("153054918@qq.com"),new InternetAddress("384280026@qq.com") });
        transport.close();
    }
}
