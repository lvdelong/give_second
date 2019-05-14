package com.zp.service.person;

import com.zp.hystric.ServiceHiHystric;
import com.zp.service.PersonService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "zp-provider")
public interface PersonServicefeign  extends PersonService {
}
