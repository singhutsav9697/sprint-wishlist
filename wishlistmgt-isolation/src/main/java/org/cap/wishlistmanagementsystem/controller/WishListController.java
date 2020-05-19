package org.cap.wishlistmanagementsystem.controller;

import java.util.*;
import javax.validation.Valid;
import org.cap.wishlistmanagementsystem.dto.ProductDTO;
import org.cap.wishlistmanagementsystem.entities.WishListDTO;
import org.cap.wishlistmanagementsystem.service.IWishListService;
import org.cap.wishlistmanagementsystem.util.WishlistUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wishedItems")
public class WishListController {

	private static final Logger log = LoggerFactory.getLogger(WishListController.class);

	@Autowired
	private IWishListService wishListService;

	@PostMapping("/addItem")
	public ResponseEntity<WishListDTO> addItem(@RequestBody @Valid Map<String, Object> requestDto) {
		WishListDTO wishlist = WishlistUtil.convertToWishlist(requestDto);
		boolean isAdded = wishListService.addProductToWishlist(wishlist);
		ResponseEntity<WishListDTO> response = new ResponseEntity<>(wishlist, HttpStatus.OK);
		return response;
	}

	@GetMapping
	public ResponseEntity<List<ProductDTO>> getViewWishlist(@PathVariable("userId") String userId) {
		List<WishListDTO> wishlistDTOS = wishListService.getViewWishlist(userId);
		List<String> productsId = productIds(wishlistDTOS);
		List<ProductDTO> products = fetchProductDtos(productsId);
		ResponseEntity<List<ProductDTO>> response = new ResponseEntity<>(products, HttpStatus.OK);
		return response;

	}

	public List<String> productIds(List<WishListDTO> wishListDTOS) {
		List<String> ids = new ArrayList<>();
		for (WishListDTO dto : wishListDTOS) {
			ids.add(dto.getProductId());
		}
		return ids;
	}

	public List<ProductDTO> fetchProductDtos(List<String> ids) {
		List<ProductDTO> list = new ArrayList<>();
		ProductDTO productDTO = fetchProductDto("P1");
		list.add(productDTO);
		return list;
	}

	public ProductDTO fetchProductDto(String productId) {
		ProductDTO productDTO = new ProductDTO();
		productDTO.setProductId("P1");
		productDTO.setProductName("Nokia");
		return productDTO;
	}

}
