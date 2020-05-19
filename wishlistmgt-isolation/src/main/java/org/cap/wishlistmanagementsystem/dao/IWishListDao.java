package org.cap.wishlistmanagementsystem.dao;

import org.cap.wishlistmanagementsystem.entities.WishListDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IWishListDao extends JpaRepository<WishListDTO, Integer> {

}