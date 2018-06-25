package top.haw.feign.hystrix;

import org.springframework.stereotype.Component;
import top.haw.feign.SchedualServiceHi;

/**
 * Created by haw on 18-6-25.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+ name;
    }
}
