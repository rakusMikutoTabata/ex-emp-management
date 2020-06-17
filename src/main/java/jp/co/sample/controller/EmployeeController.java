package jp.co.sample.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sample.domain.Employee;
import jp.co.sample.service.EmployeeService;

/**
 * 従業員情報を操作するコントローラ.
 * 
 * @author mikuto.tabata
 *
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	/**
	 * 全従業員情報を取得.
	 * 
	 * @param model リクエストスコープ
	 * @return 全従業員情報のリスト
	 */
	public String showList(Model model) {
		List<Employee> employeeList = new ArrayList<>();
		employeeList = employeeService.showList();
		model.addAttribute("employeeList", employeeList);
		return "employee/list";
	}
}
