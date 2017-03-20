package myWebService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import myEntity.T_MALL_USER;
import myMapper.CxfDemoMapper;

@Component
public class DemoImp implements DemoInf {

	@Autowired
	CxfDemoMapper cxfDemoMapper;

	public List<T_MALL_USER> SelectDemo() {
		List<T_MALL_USER> selectDemo = cxfDemoMapper.selectDemo();
		System.err.println("服务器，安全测试demo");
		return selectDemo;
	}

	public CxfDemoMapper getCxfDemoMapper() {
		return cxfDemoMapper;
	}

	public void setCxfDemoMapper(CxfDemoMapper cxfDemoMapper) {
		this.cxfDemoMapper = cxfDemoMapper;
	}

}
