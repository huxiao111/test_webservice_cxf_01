package myWebService;

import java.util.List;

import javax.jws.WebService;

import myEntity.T_MALL_USER;

@WebService
public interface DemoInf {

	public List<T_MALL_USER> SelectDemo();

}
