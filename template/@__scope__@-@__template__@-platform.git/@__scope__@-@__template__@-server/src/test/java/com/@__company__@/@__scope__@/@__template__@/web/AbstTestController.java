/**
 * 
 */
package com.@__company__@.@__scope__@.@__template__@.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.@__company__@.@__scope__@.@__template__@.app.config.MainConfig;
import com.@__company__@.@__scope__@.@__template__@.domain.support.ConstantContext;

/**
 * @Author: DanielCao
 * @Date:   2017年12月9日
 * @Time:   下午3:24:09
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, 
                classes = {MainConfig.class})
public class AbstTestController {
	protected static Log logger = LogFactory.getLog(AbstTestController.class);
	
	@Autowired
	protected TestRestTemplate restTemplate;
	@Autowired
	protected ConstantContext constantContext;
}
