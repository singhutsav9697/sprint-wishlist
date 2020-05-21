package org.cap.wishlistmanagementsystem.service;

import java.util.List;

import javax.transaction.Transactional;

import org.cap.wishlistmanagementsystem.dao.IWishListDao;
import org.cap.wishlistmanagementsystem.entities.WishList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class WishListServiceImpl implements IWishListService {

	@Autowired
	private IWishListDao wishlistDao;

	public WishListServiceImpl(IWishListDao dao) {
		this.wishlistDao = dao;
	}

	@Override
	public boolean addProductToWishlist(WishList wishListDTO) {
		wishListDTO = wishlistDao.save(wishListDTO);
		return true;
	}

	@Override
	public List<WishList> getViewWishlist(String userId) {
		List<WishList> list = wishlistDao.findAll();
		return list;
	}

}
