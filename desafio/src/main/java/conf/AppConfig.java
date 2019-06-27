package conf;

import org.springframework.test.context.ContextConfiguration;


@ContextConfiguration(locations = {
        "classpath:src/main/java/conf/appConfig.xml"})
//@ComponentScan(basePackages = {"br.com.senfio.desafio"})
//		"br.com.senfio.desafio.model", 
//		"br.com.senfio.desafio.service", 
//		"br.com.senfio.desafio.repository"})
public class AppConfig {

}
