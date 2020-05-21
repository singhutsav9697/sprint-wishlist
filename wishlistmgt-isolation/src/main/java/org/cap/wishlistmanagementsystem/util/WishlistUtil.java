package org.cap.wishlistmanagementsystem.util;

import java.util.Map;

import org.cap.wishlistmanagementsystem.entities.WishList;

public class WishlistUtil {
	public static WishList convertToWishlistDto(Map<String,Object > map) {
		WishList wishlist= new WishList();
		String productId=(String)map.get("productId");
		String productName=(String)map.get("productName");
		String userId=(String)map.get("userId");
		wishlist.setProductId(productId);
		wishlist.setProductName(productName);
		wishlist.setUserId(userId);
		return wishlist;
	}

}
