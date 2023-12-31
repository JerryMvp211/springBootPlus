package io.geekidea.boot.system.service;

import io.geekidea.boot.framework.service.BaseService;
import io.geekidea.boot.system.dto.SysDeptAddDto;
import io.geekidea.boot.system.dto.SysDeptUpdateDto;
import io.geekidea.boot.system.entity.SysDept;
import io.geekidea.boot.system.query.SysDeptQuery;
import io.geekidea.boot.system.vo.SysDeptInfoVo;
import io.geekidea.boot.system.vo.SysDeptTreeVo;

import java.util.List;

/**
 * 部门 服务接口
 *
 * @author geekidea
 * @since 2022-12-26
 */
public interface SysDeptService extends BaseService<SysDept> {

    /**
     * 添加部门
     *
     * @param sysDeptAddDto
     * @return
     * @throws Exception
     */
    boolean addSysDept(SysDeptAddDto sysDeptAddDto) throws Exception;

    /**
     * 修改部门
     *
     * @param sysDeptUpdateDto
     * @return
     * @throws Exception
     */
    boolean updateSysDept(SysDeptUpdateDto sysDeptUpdateDto) throws Exception;

    /**
     * 删除部门
     *
     * @param id
     * @return
     * @throws Exception
     */
    boolean deleteSysDept(Long id) throws Exception;

    /**
     * 部门详情
     *
     * @param id
     * @return
     * @throws Exception
     */
    SysDeptInfoVo getSysDeptById(Long id) throws Exception;

    /**
     * 获取所有的部门树形列表
     *
     * @param sysDeptQuery
     * @return
     * @throws Exception
     */
    List<SysDeptTreeVo> getAllSysDeptTreeList(SysDeptQuery sysDeptQuery) throws Exception;

    /**
     * 获取启用的部门树形列表
     *
     * @return
     * @throws Exception
     */
    List<SysDeptTreeVo> getSysDeptTreeList() throws Exception;

}
