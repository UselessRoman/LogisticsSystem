package com.wjc.service.impl;

import com.wjc.dao.PackageDao;
import com.wjc.domain.Package;
import com.wjc.service.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PackageServiceImpl implements PackageService {

    @Autowired
    private PackageDao packageDao;

    @Override
    public List<Package> getBySenderId(int id) {
        return packageDao.getBySenderId(id);
    }

    @Override
    public List<Package> getByReceiverId(int id) {
        return packageDao.getByReceiverId(id);
    }

    @Override
    public boolean addPackage(Package p) {
        return packageDao.addPackage(p)>0;
    }
}
