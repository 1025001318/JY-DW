package cn.jylink.bi.service;

import cn.jylink.bi.model.StandardModelResult;
import cn.jylink.bi.model.StandardModelResultViewModel;

public interface IStandardModelResultService {
    /**
     * 根据任务id获取模型结果数据
     *
     * @param standardModel
     * @return
     */
    public StandardModelResult getStandardModelResult(StandardModelResult standardModel);

    /**
     * 保存模型计算结果
     *
     * @param standardModelVM
     * @return
     */
    public boolean SaveStandardModelResult(StandardModelResultViewModel standardModelVM);
}
