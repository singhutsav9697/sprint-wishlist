package org.cap.wishlistmanagementsystem.service;

import java.util.*;

import org.cap.wishlistmanagementsystem.entities.WishListDTO;

public interface IWishListService {

	boolean addProductToWishlist(WishListDTO dto);

	List<WishListDTO> getViewWishlist(String userId);
}
