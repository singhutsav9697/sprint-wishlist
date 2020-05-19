package org.cap.wishlistmanagementsystem.util;

import java.util.Map;

import org.cap.wishlistmanagementsystem.entities.WishListDTO;

public class WishlistUtil {
	public static WishListDTO convertToWishlist(Map<String,Object > map) {
		WishListDTO wishlist= new WishListDTO();
		String productId=(String)map.get("productId");
		String productName=(String)map.get("productName");
		String userId=(String)map.get("userId");
		wishlist.setProductId(productId);
		wishlist.setProductName(productName);
		wishlist.setUserId(userId);
		return wishlist;
	}

}
