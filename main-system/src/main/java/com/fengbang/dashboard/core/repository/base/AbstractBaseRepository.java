package com.fengbang.dashboard.core.repository.base;

import com.fengbang.dashboard.core.config.BaseDao;
import com.fengbang.dashboard.core.dao.JdbcDao;
import com.fengbang.dashboard.core.entity.base.FBEntity;
import com.fengbang.dashboard.core.redis.RedisRepository;
import com.fengbang.dashboard.core.util.ArrayUtil;
import com.fengbang.dashboard.core.util.PageQuery;
import com.github.pagehelper.PageHelper;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

//import org.springframework.amqp.rabbit.core.RabbitTemplate;

/**
 * @author luxin
 * @ClassName: AbstractBaseRepository
 * @Description: 抽象仓库访问基类
 * @date 2017/11/2
 */
@Data
public abstract class AbstractBaseRepository<T extends BaseDao, K extends FBEntity> {

    @Autowired
    protected RedisRepository redisRepository;

//	@Autowired
//	protected RabbitTemplate rabbitTemplate;

    @Autowired
    protected JdbcDao jdbcDao;

    @Autowired
    protected T baseDao;

    /**
     * @Fields : 分页默认显示条数
     */
//    @Value("${page.pageSize}")
    private int pageSize;

    protected K insert(K entity) {
        baseDao.insert(entity);
//		if (result != 1) {
//			throw new FBDataBaseOptException(DataBaseOptType.ADD, entity.getId(), "数据更新失败");
//		}
        return entity;
    }

    protected List<K> insertListByMapper(List<K> entityList) {
        for (K entity : entityList) {
            insert(entity);
        }
        return entityList;
    }

    protected K insertSelective(K entity) {
        baseDao.insertSelective(entity);
        return entity;
    }

//	protected List<K> insertListByMapper(List<K> entityList) {
//		int result = baseDao.insertList(entityList);
//		if (result < 1) {
//			throw new FBDataBaseOptException(DataBaseOptType.ADD, "集合数据更新失败");
//		}
//		return entityList;
//	}

    protected int insertListByJdbc(List<K> params) {
        return jdbcDao.insertListJdbc(params);
    }

    protected void updateByPrimaryKey(K entity) {
        baseDao.updateByPrimaryKey(entity);
    }

    protected void updateByPrimaryKeySelective(K entity) {
        baseDao.updateByPrimaryKeySelective(entity);

    }

    protected void updateByExample(K entity, Example example) {
        baseDao.updateByExample(entity, example);
    }

    protected void updateByExampleSelective(K entity, Example example) {
        baseDao.updateByExampleSelective(entity, example);
    }

    protected void delete(String id) {
        baseDao.deleteByPrimaryKey(id);
    }

    protected List<K> selectAll() {
        return baseDao.selectAll();
    }

    protected K selectOneByExample(Example example) {
        List params = baseDao.selectByExample(example);
        if (ArrayUtil.isNotNullAndLengthNotZero(params))
            return (K) baseDao.selectByExample(example).get(0);
        return null;
    }

    protected List<K> selectListByExample(Example example) {
        return baseDao.selectByExample(example);
    }

    protected K selectByPrimaryKey(String id) {
        return (K) baseDao.selectByPrimaryKey(id);
    }


    /**
     * @param pageQuery
     * @return void
     * @throws
     * @Title: setPageQuery
     * @Description: 设置分页
     * @author luxin
     * @date 2017/11/03 08:46:26
     */
    protected void setPageQuery(PageQuery pageQuery) {
        int size = pageSize;
        if (pageQuery.getPageSize() != null && pageQuery.getPageSize() > 0) {
            size = pageQuery.getPageSize();
        }
        PageHelper.startPage(pageQuery.getCurrenPage(), size);
    }

}
