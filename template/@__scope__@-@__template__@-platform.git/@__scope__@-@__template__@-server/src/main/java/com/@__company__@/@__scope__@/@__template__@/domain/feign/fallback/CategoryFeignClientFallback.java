/**
 * 
 */
package com.@__company__@.@__scope__@.@__template__@.domain.feign.fallback;

import com.@__company__@.@__scope__@.@__template__@.domain.feign.CategoryFeignClient;

/**
 * @Author: DanielCao
 * @Date:   2017年6月29日
 * @Time:   上午1:15:24
 *
 */
public class CategoryFeignClientFallback implements CategoryFeignClient {
	@Override
	public String getCategorys(String categoryIds) {
		return "{\"status\":5001}";
	}
}
