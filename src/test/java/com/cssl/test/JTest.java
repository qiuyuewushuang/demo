package com.cssl.test;

import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.cssl.run.App;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
@WebAppConfiguration
public class JTest {
	
    @Autowired
    StringEncryptor encryptor;

    /**
     * 获取加密盐值
     */
    @Test
    public void getPass() {
        String url = encryptor.encrypt("jdbc:mysql:///test?serverTimezone=UTC");
        String name = encryptor.encrypt("root");
        String password = encryptor.encrypt("root");
        System.out.println(url);
        System.out.println(name);
        System.out.println(password);
    }
    
}


