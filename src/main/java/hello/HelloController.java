package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hitesh.singla
 */
@RestController
public class HelloController {

  @RequestMapping("/index")
  public String index(){
  return "Greetings from Spring Boot";
  }

}
