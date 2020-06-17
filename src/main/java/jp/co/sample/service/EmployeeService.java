package jp.co.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.sample.domain.Employee;
import jp.co.sample.repository.EmployeeRepository;

/**
 * 従業員操作の集約.
 * 
 * @author mikuto.tabata
 *
 */
@Service
@Transactional

public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRespository;
	
	/**
	 * 従業員情報を全件取得.
	 * 
	 * @return 全従業員情報
	 */
	public List<Employee> showList(){
		return employeeRespository.findAll();
	}
}
