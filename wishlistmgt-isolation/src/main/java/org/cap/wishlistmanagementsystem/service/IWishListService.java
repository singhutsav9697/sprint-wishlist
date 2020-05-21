package org.cap.wishlistmanagementsystem.service;

import java.util.*;

import org.cap.wishlistmanagementsystem.entities.WishList;

public interface IWishListService {

	boolean addProductToWishlist(WishList dto);

	List<WishList> getViewWishlist(String userId);
}
