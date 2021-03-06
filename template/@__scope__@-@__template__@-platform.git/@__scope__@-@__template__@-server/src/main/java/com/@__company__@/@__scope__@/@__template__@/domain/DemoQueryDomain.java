/**
 * 
 */
package com.@__company__@.@__scope__@.@__template__@.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.github.biticcf.mountain.core.common.result.WdCallbackResult;
import com.@__company__@.@__scope__@.@__template__@.domain.support.ConstantContext;
import com.@__company__@.@__scope__@.@__template__@.model.DemoModel;
import com.@__company__@.@__scope__@.@__template__@.model.enums.ResultEnum;

/**
 * @Author: DanielCao
 * @Date:   2017年5月9日
 * @Time:   下午5:09:04
 *
 */
@Service("demoQueryDomain")
@Scope("prototype")
public class DemoQueryDomain extends AbstractBaseDomain<DemoModel> {
	private ConstantContext constantContext;
	
	private Long id;
	
	// 注意：service中的参数通过构造方法传入domain，构造方法第一参数必须是ConstantContext，之后的参数顺序与service方法中的顺序必须一致
	public DemoQueryDomain(ConstantContext constantContext, Long id) {
		super(constantContext);
		
		this.constantContext = constantContext;
		this.id = id;
	}

	@Override
	public WdCallbackResult<DemoModel> executeCheck() {
		// 检查参数
		return WdCallbackResult.success(ResultEnum.SUCCESS.getCode());
	}

	@Override
	public WdCallbackResult<DemoModel> executeAction() {
		// 查询demoModel
		DemoModel demo = constantContext.getDemoDomainRepository().queryById(id);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return WdCallbackResult.success(ResultEnum.SUCCESS.getCode(), demo);
	}

	@Override
	public void executeAfterSuccess() {
		// TODO Auto-generated method stub
	}

	@Override
	public void executeAfterFailure(Throwable e) {
		// TODO Auto-generated method stub
	}
}
