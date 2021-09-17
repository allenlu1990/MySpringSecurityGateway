package org.example.gateway.controller;

import com.alibaba.csp.sentinel.adapter.gateway.common.api.GatewayApiDefinitionManager;
import com.alibaba.csp.sentinel.adapter.gateway.common.rule.GatewayRuleManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sentinel")
public class SentinelController {

  /**
   * route 维度。这样就可以看到我们的配置信息
   * @return
   */
  @GetMapping("/gw-flow")
  public Object GetGatewayFlowConfig(){
    return GatewayRuleManager.getRules();
  }

  /**
   * 用户自定义的 API 定义分组。这样就可以看到我们的配置信息
   * @return
   */
  @GetMapping("/gw-api-group")
  public Object GetGatewayApiGroupConfig(){
    return GatewayApiDefinitionManager.getApiDefinitions();
  }
}
