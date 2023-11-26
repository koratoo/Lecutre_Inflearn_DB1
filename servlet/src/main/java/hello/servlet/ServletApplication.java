package hello.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * 서블릿은 톰캣 같은 웹 어플리케이션 서버를 직접 설치하고 그 위에 서블릿 코드를 빌드해 올린다음...
 * 이런 번거로운 과정을 스프링 부트에선 내장 톰캣 서버를 사용해 편리하게 실행할 수 있게 만들었다.
 */

@ServletComponentScan// 서블릿 자동 등록 : 스프링 부트는 서블릿을 직접 등록해서 사용할 수 있도록 @ServletComponentScan을 지원한다.
@SpringBootApplication
public class ServletApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServletApplication.class, args);
	}

}
