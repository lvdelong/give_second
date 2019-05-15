/**
 * Copyright (C), 2019, 金科教育
 * FileName: QiyeMapper
 * Author:   ls
 * Date:     2019/5/12 18:29
 * Description: a
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zp.mapper;

import com.zp.model.Qiye;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author ls
 * @create 2019/5/12
 * @since 1.0.0
 */
public interface QiyeMapper {


    public int findUserCount();

    public List<Qiye> findUserList(@Param("start") int start, @Param("rows") Integer rows);

    void saveCaiPin(@RequestBody Qiye qiye);

    void deleteOne(Integer id);


    List findPageAxy(@RequestBody Qiye qiye);
}
