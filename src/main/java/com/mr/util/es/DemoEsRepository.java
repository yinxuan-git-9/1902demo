package com.mr.util.es;

import com.mr.entity.BanksVo;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Air on 2021/3/17.
 */
@Repository
public interface DemoEsRepository extends ElasticsearchCrudRepository<BanksVo,String> {

}
