package jp.co.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sample.form.InsertAdministratorForm;
import jp.co.sample.service.AdministratorService;

/**
 * 管理者情報を操作するコントローラ.
 * 
 * @author mikuto.tabata
 *
 */
@Controller
@RequestMapping("/")
public class AdministratorController {
	/**
	 * SpringFrameworkから参照情報を注入
	 */
	@Autowired
	private AdministratorService administratorService;

	/**
	 * requestスコープにフォームオブジェクトが自動格納
	 */
	@ModelAttribute
	public InsertAdministratorForm setUpInsertAdministratorForm() {
		return new InsertAdministratorForm();
	}

	/**
	 * ユーザ情報登録画面を表示する.
	 * 
	 * @return ユーザ情報登録画面
	 */
	@RequestMapping("/toInsert")
	public String toInsert() {
		return "administrator/insert";
	}
}
