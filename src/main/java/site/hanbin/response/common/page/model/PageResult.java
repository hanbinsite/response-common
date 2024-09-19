package site.hanbin.response.common.page.model;

import lombok.Data;

import java.util.List;

/**
 * @author hanBinSuper
 */
@Data
public class PageResult {

    /**
     * 当前页码
     */
    private Integer pageNum;
    /**
     * 每页数量
     */
    private Integer pageSize;
    /**
     * 记录总数
     */
    private Long totalSize;
    /**
     * 页码总数
     */
    private Integer totalPages;
    /**
     * 数据模型
     */
    private List<?> list;
}
