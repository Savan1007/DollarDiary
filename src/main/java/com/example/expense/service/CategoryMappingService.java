package com.example.expense.service;

import com.example.expense.entity.CategoryMappingEntity;
import com.example.expense.model.enums.Category;
import com.example.expense.repository.CategoryMappingRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.HashSet;

@Service
public class CategoryMappingService {
    CategoryMappingRepository categoryMappingRepository;
    HashMap<Category, HashSet<Category>> subCategoryToMainCategoryMappingMap;
    @PostConstruct
    void prepareSubCategoryToMainCategoryMappingMap(){
//        categoryMappingRepository.findAll();
    }
    HashMap<Category, HashSet<Category>> getSubCategoryToMainCategoryMappingMap(){
        return new HashMap<>();
    }
    void addCategoryMapping(CategoryMappingEntity categoryMappingEntity){
        categoryMappingRepository.save(categoryMappingEntity);
    }

}
