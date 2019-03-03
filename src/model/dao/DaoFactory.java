package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDaoJDBC createSellerDao() {
//		Passando uma conexão como argumento
		return new SellerDaoJDBC(DB.getConnection());
	}
}
