package com.example.expense.service;

import com.example.expense.entity.UnknownCategoryEntity;
import com.example.expense.model.enums.Category;
import com.example.expense.repository.UnknownCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnknownCategoryService {
    UnknownCategoryRepository unknownCategoryRepository;

    @Autowired
    public UnknownCategoryService(UnknownCategoryRepository unknownCategoryRepository) {
        this.unknownCategoryRepository = unknownCategoryRepository;
    }

    void addUnknownCategory(String item, Category category){
        UnknownCategoryEntity unknownCategoryEntity = new UnknownCategoryEntity();
        unknownCategoryEntity.setCategory(category);
        unknownCategoryEntity.setItem(item);
        unknownCategoryRepository.save(unknownCategoryEntity);
    }

}
