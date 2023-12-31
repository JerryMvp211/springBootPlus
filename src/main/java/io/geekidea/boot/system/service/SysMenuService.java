package io.geekidea.boot.system.service;

import io.geekidea.boot.framework.service.BaseService;
import io.geekidea.boot.system.dto.SysMenuAddDto;
import io.geekidea.boot.system.dto.SysMenuUpdateDto;
import io.geekidea.boot.system.entity.SysMenu;
import io.geekidea.boot.system.query.SysMenuQuery;
import io.geekidea.boot.system.vo.SysMenuInfoVo;
import io.geekidea.boot.system.vo.SysMenuTreeVo;
import io.geekidea.boot.system.vo.SysNavMenuTreeVo;

import java.util.List;

/**
 * 系统菜单 服务接口
 *
 * @author geekidea
 * @since 2022-12-26
 */
public interface SysMenuService extends BaseService<SysMenu> {

    /**
     * 添加系统菜单
     *
     * @param sysMenuAddDto
     * @return
     * @throws Exception
     */
    boolean addSysMenu(SysMenuAddDto sysMenuAddDto) throws Exception;

    /**
     * 修改系统菜单
     *
     * @param sysMenuUpdateDto
     * @return
     * @throws Exception
     */
    boolean updateSysMenu(SysMenuUpdateDto sysMenuUpdateDto) throws Exception;

    /**
     * 删除系统菜单
     *
     * @param id
     * @return
     * @throws Exception
     */
    boolean deleteSysMenu(Long id) throws Exception;

    /**
     * 系统菜单详情
     *
     * @param id
     * @return
     * @throws Exception
     */
    SysMenuInfoVo getSysMenuById(Long id) throws Exception;

    /**
     * 获取所有的系统菜单树形列表
     *
     * @param sysMenuQuery
     * @return
     * @throws Exception
     */
    List<SysMenuTreeVo> getAllSysMenuTreeList(SysMenuQuery sysMenuQuery) throws Exception;

    /**
     * 获取启用的系统菜单树形列表
     *
     * @return
     * @throws Exception
     */
    List<SysMenuTreeVo> getSysMenuTreeList() throws Exception;

    /**
     * 获取当前登录用户导航菜单树形列表
     *
     * @return
     * @throws Exception
     */
    List<SysNavMenuTreeVo> getNavMenuTreeList() throws Exception;

    /**
     * 获取角色权限ID集合
     * @param roleId
     * @return
     * @throws Exception
     */
    List<Long> getMenuIdsByRoleId(Long roleId) throws Exception;

}
