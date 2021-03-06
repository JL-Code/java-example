package org.example.annotation.dao;

import org.springframework.stereotype.Repository;

/**
 * <p>描述: [类型描述] </p>
 * <p>创建时间: 2020/7/8 </p>
 *
 * @author <a href="mailto:jiangy@highzap.com" rel="nofollow">蒋勇</a>
 * @version v1.0
 */
@Repository
public class AppDao {
    private String app;

    public AppDao() {
        this.app = "app1";
    }

    public AppDao(String app) {
        this.app = app;
    }

    @Override
    public String toString() {
        return "AppDao{" +
                "app='" + app + '\'' +
                '}';
    }
}
