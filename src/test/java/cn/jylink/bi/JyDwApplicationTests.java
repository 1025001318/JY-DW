package cn.jylink.bi;

import cn.jylink.bi.dao.IStandardModelResultDao;
import cn.jylink.bi.model.StandardModelResult;
import cn.jylink.bi.model.StandardModelResultDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JyDwApplicationTests {

    @Resource
    IStandardModelResultDao ismrd;
    @Test
    public void contextLoads() {
/*        StandardModelResult smr = new StandardModelResult();
        smr.setDate(new Date());
        smr.setTaskId("1211");
        smr.setOrgCode("12555");
        smr.setBelongCode("5656");
        smr.setModelAlgorithm("lllll");
        smr.setTopTaskId("8989");
        smr.setResultType("895");
        smr.setTaskType("1");

        System.out.println(ismrd.SaveStandardModelResult(smr));*/

        StandardModelResultDetail s = new StandardModelResultDetail();
        s.setStandardCode("8989");
        s.setProportion(BigDecimal.ONE);
        s.setStandardCode("8989");
        s.setMainId(BigInteger.valueOf(759));
        List<StandardModelResultDetail> list = new ArrayList<StandardModelResultDetail>();
        System.out.println(ismrd.SaveStandardModelResultDetails(list,1));
    }

}
