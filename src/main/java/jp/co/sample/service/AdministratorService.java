package jp.co.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.sample.domain.Administrator;
import jp.co.sample.repository.AdministratorRepository;

/**
 * 管理者操作の集約.
 * 
 * @author mikuto.tabata
 *
 */
@Service
@Transactional
public class AdministratorService {
	@Autowired
	private AdministratorRepository administratorRepository;
	
	/**
	 * 管理者の追加処理.
	 * 
	 * @param administrator
	 */
	public void insert(Administrator administrator) {
		administratorRepository.insert(administrator);
	}
	
	/**
	 * ログイン処理.
	 * 
	 * @param mailAddress メールアドレス
	 * @param password パスワード
	 * @return 管理者情報
	 */
	public Administrator login(String mailAddress,String password) {
		return administratorRepository.findbyMailAddressAndPassword(mailAddress, password);
	}
}
