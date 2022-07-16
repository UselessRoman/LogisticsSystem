package com.wjc.service.impl;

import com.wjc.dao.PackageDao;
import com.wjc.domain.Package;
import com.wjc.service.PackageService;
import com.wjc.utils.PriceCalculator;
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
    public Package getByPackageId(int id) {
        return packageDao.getByPackageId(id);
    }

    @Override
    public boolean addPackage(Package p)
    {
        p.setPrice(PriceCalculator.calculate(p.getSend_addr(),p.getReceive_addr(),p.getWeight()));
        return packageDao.addPackage(p)>0;
    }
}
