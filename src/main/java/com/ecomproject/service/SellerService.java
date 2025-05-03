package com.ecomproject.service;

import com.ecomproject.domain.AccountStatus;
import com.ecomproject.model.Seller;

import java.util.List;

public interface SellerService {

    Seller getSellerProfile(String jwt) throws Exception;
    Seller createSeller(Seller seller) throws Exception;
    Seller getSellerById(Long id) throws Exception;
    Seller getSellerByEmail(String email) throws Exception;
    List<Seller> getAllSellers(AccountStatus status);
    Seller updateSeller(Long id,Seller seller);
    void deleteSeller(Long id);
    Seller verifySeller(String email, String otp);
    Seller updateSellerAccountStatus(Long sellerId, AccountStatus status);
}
